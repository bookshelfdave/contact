package com.basho.contact;

// NOTE: source for the JLine v1 ANSIBuffer is in this project
import jline.ANSIBuffer;
import jline.console.ConsoleReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.*;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactConsole {

	static String[] keywords = {
			"let",
			"pb",
			"http",
			"fetch",
			"store",
			"delete",
			"value",
			"connection",
			"connect",
			"use",
			"using",
			"with",
			"bucket",
			"and",
			"options",
			"query2i",
			"mapred",
			"from",
			"index",
			"to",
			"instores",
			"jsquery",
			"erlquery",
			"for",
			"in",
			"print",
			"default"
	};
		
	static Map<String, ConsoleCommand> consoleOnlyCommands = new HashMap<String, ConsoleCommand>();
	static {
		consoleOnlyCommands.put("help", new ConsoleCommand() {
			public void run(String line) {
				new ContactConsoleHelp(System.out).help(line);
			}
		});
		
		ConsoleCommand exit = new ConsoleCommand() {
			public void run(String line) {
				System.out.println("Goodbye");
				System.exit(0);
			}
		};
		consoleOnlyCommands.put("exit", exit);
		consoleOnlyCommands.put("quit", exit);	
	}
	
	// TODO: this is a waste... reuse objects!
	private static void processInput(String line, ContactWalker cw, RuntimeContext runtimeCtx) {
		ANTLRInputStream input = new ANTLRInputStream(line);
        ContactLexer lexer = new ContactLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ContactParser parser = new ContactParser(tokens);		
		parser.addErrorListener(new ContactErrorListener(runtimeCtx));
		ParseTreeWalker walker = new ParseTreeWalker();
		try {
			walker.walk(cw, parser.prog());
		} catch (Throwable t) {
			// catch parse errors. ANTLR will display a message for me.
		}
	
	}
	
	private static void processOutput(RuntimeContext runtimeCtx, PrintWriter out, boolean ansi) {
		List<Throwable> errors = runtimeCtx.getErrors();
		for(Throwable t: errors) {

			ANSIBuffer buf = new ANSIBuffer();
	        buf.setAnsiEnabled(ansi);
	        buf.red(t.getMessage());
	        if(t.getCause() != null) {
	        	buf.red(":" + t.getCause().getMessage());
	        }
	        buf.append("\n");
	        System.out.print(buf.toString());
		}
		runtimeCtx.reset();
	}
	
	private static String readConfig() throws IOException {
		String file = System.getProperty("user.home") + "/.contact.config";
		File config = new File(file);
		if (config.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(config));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {
					sb.append(line);
					sb.append("\n");
					line = br.readLine();
				}
                return sb.toString();
			} finally {
				br.close();
			}
		} else {
			return null;
		}
	}

    @SuppressWarnings("static-access")
    public static CommandLine processArgs(String[] args) {
		Options options = new Options();
		
		Option help = OptionBuilder
                            .withLongOpt("help")
                            .withDescription("Print this list of commands").create();

        Option nocolor = OptionBuilder
                            .withLongOpt("nocolor")
                            .withDescription("Don't use color output").create();

		Option noconfig = OptionBuilder
                             .withLongOpt("noconfig")
                             .withDescription("Don't read ~/.contact.config").create();

		Option infile = OptionBuilder.withLongOpt( "infile" )
							.withDescription( "Read input from file and exit" )
				        	.hasArg()
				        	.withArgName("filename")
				        	.create();
		
		options.addOption(help);
		options.addOption(nocolor);
		options.addOption(noconfig);
		options.addOption(infile);
		
		CommandLineParser parser = new org.apache.commons.cli.GnuParser();
		try {
			CommandLine line = parser.parse(options, args);
			if(line.hasOption("help")) {
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp( "contact", options );
				System.exit(0);
			}
			return line;
		} catch (ParseException exp) {
			System.err.println("Error processing command line args: " + exp.getMessage());
			System.exit(-1);
		}
		return null;
	}
	
	private static void readInputFile(String filename, ContactWalker walker, RuntimeContext runtimeCtx) {
		String input = null;
        try {
        	File f = new File(filename);
        	input = org.apache.commons.io.FileUtils.readFileToString(f);
        } catch (Exception e) {
        	e.printStackTrace();
        	System.exit(-1);
        }
        if(input != null && !input.trim().isEmpty()) {
        	processInput(input, walker, runtimeCtx);
        }
	}
	
	// somewhat of a mess
	public static void main(String[] args) throws IOException {
        CommandLine commandLine = processArgs(args);
		ConsoleReader reader = new ConsoleReader();
        reader.setBellEnabled(false);
        reader.setExpandEvents(false); // TODO: look into this
        reader.addCompleter(new jline.console.completer.StringsCompleter(keywords));

        String line;
        PrintWriter out = new PrintWriter(System.out);
        DefaultConnectionProvider connections = new DefaultConnectionProvider();
        RuntimeContext ctx = new RuntimeContext(connections, System.out, System.err);
        ContactWalker walker = new ContactWalker(ctx);
       
		boolean nextLinePrompt = false;

        ANSIBuffer buf = new ANSIBuffer();
        buf.setAnsiEnabled(!commandLine.hasOption("nocolor"));
        buf.blue("Welcome to Riak Contact\n");
        buf.blue("(c) 2013 Dave Parfitt\n");
        System.out.println(buf.toString());     

        if(!commandLine.hasOption("noconfig")) {
	        String config = null;
	        try {
	        	config = readConfig();
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	        if(config != null && !config.trim().isEmpty()) {
	        	processInput(config, walker, ctx);
	        }
        }
        
        if(commandLine.hasOption("infile")) {
	        String filename = commandLine.getOptionValue("infile");
        	readInputFile(filename, walker, ctx);
            ctx.getActionListener().term();
            System.exit(0);
        }

        
        StringBuffer lines = new StringBuffer();
        ANSIBuffer ansiprompt = new ANSIBuffer();
        ansiprompt.setAnsiEnabled(true);
        ansiprompt.green("> ");
        String prompt = ansiprompt.toString(!commandLine.hasOption("nocolor"));
        boolean inHereDoc = false;
        
        while ((line = reader.readLine(nextLinePrompt ? "" : prompt)) != null) {
            out.flush();
            String chunks[] = line.split(" ");
            String consoleCommandCheck = chunks[0].toLowerCase().trim();
            if (consoleOnlyCommands.containsKey(consoleCommandCheck)) {
                consoleOnlyCommands.get(consoleCommandCheck).run(line);
                continue;
            }
        
            if(line.contains("~%~") && !line.contains("\\~%~")) {
            	inHereDoc = !inHereDoc;
            }
            
            if(!line.trim().endsWith(";")) {
            	nextLinePrompt = true;
            	lines.append(line);
            	lines.append("\n");
            } else if(line.trim().endsWith(";") && !inHereDoc){
            	lines.append(line);
            	String input = lines.toString();
            	nextLinePrompt = false;
            	processInput(input, walker, ctx);
            	processOutput(ctx, out, !commandLine.hasOption("nocolor"));
            	lines = new StringBuffer();
            } else if(inHereDoc) {
            	lines.append(line);
            	lines.append("\n");
            }
            
        }
        ctx.getActionListener().term();
    }

}
