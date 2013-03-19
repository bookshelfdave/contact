package com.basho.contact;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ContactErrorListener extends BaseErrorListener {

	RuntimeContext runtimeCtx;
	
	public ContactErrorListener(RuntimeContext runtimeCtx) {
		this.runtimeCtx = runtimeCtx;
	}
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
			// TODO: cleanup
			super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
			throw new RuntimeException("Syntax error at line " + line + " character " + charPositionInLine);
		
	}

	
}
