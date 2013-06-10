// Generated from ./src/main/java/com/basho/contact/parser/Contact.g4 by ANTLR 4.0
package com.basho.contact.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ContactParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, PB=2, HTTP=3, FETCH=4, STORE=5, UPDATE=6, DELETE=7, VALUE=8, CONTENTTYPE=9, 
		CONN=10, CONNS=11, CONNECT=12, USE=13, USING=14, WITH=15, AND=16, BUCKET=17, 
		OPTIONS=18, QUERY2I=19, COUNT=20, FROM=21, INDEX=22, TO=23, JAVASCRIPT=24, 
		PROPERTIES=25, RESOLVER=26, LOAD=27, SCRIPT=28, LIST=29, BUCKETS=30, KEYS=31, 
		TRUE=32, FALSE=33, DEFAULT=34, SET=35, GET=36, ACTION=37, AS=38, JSON=39, 
		TEXT=40, XML=41, NODE=42, VERSIONS=43, DISCOVER=44, CLUSTER=45, ADMIN=46, 
		JOIN=47, LEAVE=48, FORCE=49, REMOVE=50, REPLACE=51, PLAN=52, COMMIT=53, 
		CLEAR=54, STATUS=55, AT=56, DOLLAR=57, SPLAT=58, COMMA=59, LSQUARE=60, 
		RSQUARE=61, LPAREN=62, RPAREN=63, EQUALS=64, DOT=65, SEMI=66, ID=67, INT=68, 
		FLOAT=69, STRING=70, DATA_CONTENT=71, LINE_COMMENT=72, COMMENT=73, WS=74;
	public static final String[] tokenNames = {
		"<INVALID>", "'let'", "'pb'", "'http'", "'fetch'", "'store'", "'update'", 
		"'delete'", "'value'", "'content-type'", "'connection'", "'connections'", 
		"'connect'", "'use'", "'using'", "'with'", "'and'", "'bucket'", "'options'", 
		"'query2i'", "'count'", "'from'", "'index'", "'to'", "'javascript'", "'properties'", 
		"'resolver'", "'load'", "'script'", "'list'", "'buckets'", "'keys'", "'true'", 
		"'false'", "'default'", "'set'", "'get'", "'action'", "'as'", "'json'", 
		"'text'", "'xml'", "'node'", "'versions'", "'discover'", "'cluster'", 
		"'admin'", "'join'", "'leave'", "'force'", "'remove'", "'replace'", "'plan'", 
		"'commit'", "'clear'", "'status'", "'@'", "'$'", "'*'", "','", "'['", 
		"']'", "'('", "')'", "'='", "'.'", "';'", "ID", "INT", "FLOAT", "STRING", 
		"DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_connection_selector = 2, RULE_console_op = 3, 
		RULE_connections = 4, RULE_assignment = 5, RULE_using = 6, RULE_with = 7, 
		RULE_op_with_options = 8, RULE_options = 9, RULE_listbuckets = 10, RULE_listkeys = 11, 
		RULE_countkeys = 12, RULE_optionslist = 13, RULE_fetch = 14, RULE_store = 15, 
		RULE_update = 16, RULE_store_indexes = 17, RULE_content_string = 18, RULE_user_content = 19, 
		RULE_delete = 20, RULE_query2i = 21, RULE_use = 22, RULE_useBucketOptions = 23, 
		RULE_bucketprops = 24, RULE_get_bucketprops = 25, RULE_set_bucketprops = 26, 
		RULE_connect = 27, RULE_set = 28, RULE_set_action = 29, RULE_get = 30, 
		RULE_get_action = 31, RULE_node_name = 32, RULE_clusterid = 33, RULE_noderef = 34, 
		RULE_loadscript = 35, RULE_script = 36, RULE_pair = 37, RULE_pairValue = 38, 
		RULE_code_string = 39, RULE_bool = 40;
	public static final String[] ruleNames = {
		"prog", "stat", "connection_selector", "console_op", "connections", "assignment", 
		"using", "with", "op_with_options", "options", "listbuckets", "listkeys", 
		"countkeys", "optionslist", "fetch", "store", "update", "store_indexes", 
		"content_string", "user_content", "delete", "query2i", "use", "useBucketOptions", 
		"bucketprops", "get_bucketprops", "set_bucketprops", "connect", "set", 
		"set_action", "get", "get_action", "node_name", "clusterid", "noderef", 
		"loadscript", "script", "pair", "pairValue", "code_string", "bool"
	};

	@Override
	public String getGrammarFileName() { return "Contact.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ContactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ContactParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82); stat();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FETCH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CONNS) | (1L << CONNECT) | (1L << USE) | (1L << USING) | (1L << QUERY2I) | (1L << COUNT) | (1L << LOAD) | (1L << SCRIPT) | (1L << LIST) | (1L << SET) | (1L << GET))) != 0) );
			setState(87); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Console_opContext console_op() {
			return getRuleContext(Console_opContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public Connection_selectorContext connection_selector() {
			return getRuleContext(Connection_selectorContext.class,0);
		}
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public ListbucketsContext listbuckets() {
			return getRuleContext(ListbucketsContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ContactParser.SEMI, 0); }
		public ConnectionsContext connections() {
			return getRuleContext(ConnectionsContext.class,0);
		}
		public Op_with_optionsContext op_with_options() {
			return getRuleContext(Op_with_optionsContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(89); assignment();
				}
			}

			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(92); connect();
				}
				break;

			case 2:
				{
				setState(93); use();
				}
				break;

			case 3:
				{
				setState(94); using();
				}
				break;

			case 4:
				{
				setState(95); op_with_options();
				}
				break;

			case 5:
				{
				setState(96); listbuckets();
				}
				break;

			case 6:
				{
				setState(97); console_op();
				}
				break;

			case 7:
				{
				setState(98); connections();
				}
				break;
			}
			setState(102);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(101); connection_selector();
				}
			}

			setState(104); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Connection_selectorContext extends ParserRuleContext {
		public Node_nameContext connname;
		public TerminalNode AT() { return getToken(ContactParser.AT, 0); }
		public Node_nameContext node_name() {
			return getRuleContext(Node_nameContext.class,0);
		}
		public Connection_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterConnection_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitConnection_selector(this);
		}
	}

	public final Connection_selectorContext connection_selector() throws RecognitionException {
		Connection_selectorContext _localctx = new Connection_selectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_connection_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(AT);
			setState(107); ((Connection_selectorContext)_localctx).connname = node_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Console_opContext extends ParserRuleContext {
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public LoadscriptContext loadscript() {
			return getRuleContext(LoadscriptContext.class,0);
		}
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public Console_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterConsole_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitConsole_op(this);
		}
	}

	public final Console_opContext console_op() throws RecognitionException {
		Console_opContext _localctx = new Console_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_console_op);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); get();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); set();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); loadscript();
				}
				break;
			case SCRIPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(112); script();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectionsContext extends ParserRuleContext {
		public TerminalNode CONNS() { return getToken(ContactParser.CONNS, 0); }
		public ConnectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterConnections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitConnections(this);
		}
	}

	public final ConnectionsContext connections() throws RecognitionException {
		ConnectionsContext _localctx = new ConnectionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(CONNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Token name;
		public TerminalNode EQUALS() { return getToken(ContactParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode LET() { return getToken(ContactParser.LET, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(LET);
			setState(118); ((AssignmentContext)_localctx).name = match(ID);
			setState(119); match(EQUALS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingContext extends ParserRuleContext {
		public Token bucket;
		public TerminalNode BUCKET() { return getToken(ContactParser.BUCKET, 0); }
		public TerminalNode USING() { return getToken(ContactParser.USING, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Op_with_optionsContext op_with_options() {
			return getRuleContext(Op_with_optionsContext.class,0);
		}
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitUsing(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_using);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(USING);
			setState(122); match(BUCKET);
			setState(123); ((UsingContext)_localctx).bucket = match(STRING);
			setState(124); op_with_options();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ContactParser.AND, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitWith(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==WITH || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_with_optionsContext extends ParserRuleContext {
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public ListkeysContext listkeys() {
			return getRuleContext(ListkeysContext.class,0);
		}
		public FetchContext fetch() {
			return getRuleContext(FetchContext.class,0);
		}
		public StoreContext store() {
			return getRuleContext(StoreContext.class,0);
		}
		public BucketpropsContext bucketprops() {
			return getRuleContext(BucketpropsContext.class,0);
		}
		public Query2iContext query2i() {
			return getRuleContext(Query2iContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CountkeysContext countkeys() {
			return getRuleContext(CountkeysContext.class,0);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public Op_with_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_with_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterOp_with_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitOp_with_options(this);
		}
	}

	public final Op_with_optionsContext op_with_options() throws RecognitionException {
		Op_with_optionsContext _localctx = new Op_with_optionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_with_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			switch (_input.LA(1)) {
			case FETCH:
				{
				setState(128); fetch();
				}
				break;
			case STORE:
				{
				setState(129); store();
				}
				break;
			case DELETE:
				{
				setState(130); delete();
				}
				break;
			case QUERY2I:
				{
				setState(131); query2i();
				}
				break;
			case LIST:
				{
				setState(132); listkeys();
				}
				break;
			case COUNT:
				{
				setState(133); countkeys();
				}
				break;
			case SET:
			case GET:
				{
				setState(134); bucketprops();
				}
				break;
			case UPDATE:
				{
				setState(135); update();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(138); options();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsContext extends ParserRuleContext {
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public OptionslistContext optionslist() {
			return getRuleContext(OptionslistContext.class,0);
		}
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode OPTIONS() { return getToken(ContactParser.OPTIONS, 0); }
		public OptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitOptions(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); with();
			setState(142); match(OPTIONS);
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(143); optionslist();
				}
				break;

			case 2:
				{
				setState(144); match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListbucketsContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(ContactParser.LIST, 0); }
		public TerminalNode BUCKETS() { return getToken(ContactParser.BUCKETS, 0); }
		public ListbucketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listbuckets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterListbuckets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitListbuckets(this);
		}
	}

	public final ListbucketsContext listbuckets() throws RecognitionException {
		ListbucketsContext _localctx = new ListbucketsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listbuckets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(LIST);
			setState(148); match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListkeysContext extends ParserRuleContext {
		public TerminalNode KEYS() { return getToken(ContactParser.KEYS, 0); }
		public TerminalNode LIST() { return getToken(ContactParser.LIST, 0); }
		public ListkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listkeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterListkeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitListkeys(this);
		}
	}

	public final ListkeysContext listkeys() throws RecognitionException {
		ListkeysContext _localctx = new ListkeysContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listkeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(LIST);
			setState(151); match(KEYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountkeysContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(ContactParser.COUNT, 0); }
		public TerminalNode KEYS() { return getToken(ContactParser.KEYS, 0); }
		public CountkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countkeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterCountkeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitCountkeys(this);
		}
	}

	public final CountkeysContext countkeys() throws RecognitionException {
		CountkeysContext _localctx = new CountkeysContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_countkeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(COUNT);
			setState(154); match(KEYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionslistContext extends ParserRuleContext {
		public PairContext pair;
		public List<PairContext> opts = new ArrayList<PairContext>();
		public TerminalNode COMMA(int i) {
			return getToken(ContactParser.COMMA, i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(ContactParser.COMMA); }
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public OptionslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterOptionslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitOptionslist(this);
		}
	}

	public final OptionslistContext optionslist() throws RecognitionException {
		OptionslistContext _localctx = new OptionslistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optionslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); ((OptionslistContext)_localctx).pair = pair();
			((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157); match(COMMA);
				setState(158); ((OptionslistContext)_localctx).pair = pair();
				((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FetchContext extends ParserRuleContext {
		public Token key;
		public TerminalNode FETCH() { return getToken(ContactParser.FETCH, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public FetchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterFetch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitFetch(this);
		}
	}

	public final FetchContext fetch() throws RecognitionException {
		FetchContext _localctx = new FetchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fetch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(FETCH);
			setState(165); ((FetchContext)_localctx).key = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StoreContext extends ParserRuleContext {
		public Token key;
		public Token existing_obj;
		public Store_indexesContext store_indexes() {
			return getRuleContext(Store_indexesContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode STORE() { return getToken(ContactParser.STORE, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Content_stringContext content_string() {
			return getRuleContext(Content_stringContext.class,0);
		}
		public StoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitStore(this);
		}
	}

	public final StoreContext store() throws RecognitionException {
		StoreContext _localctx = new StoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(STORE);
			setState(170);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(168); ((StoreContext)_localctx).key = match(STRING);
				}
				break;
			case ID:
				{
				setState(169); ((StoreContext)_localctx).existing_obj = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172); store_indexes();
			setState(173); with();
			setState(174); content_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ContactParser.UPDATE, 0); }
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(UPDATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Store_indexesContext extends ParserRuleContext {
		public List<TerminalNode> INDEX() { return getTokens(ContactParser.INDEX); }
		public List<WithContext> with() {
			return getRuleContexts(WithContext.class);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public WithContext with(int i) {
			return getRuleContext(WithContext.class,i);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode INDEX(int i) {
			return getToken(ContactParser.INDEX, i);
		}
		public Store_indexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterStore_indexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitStore_indexes(this);
		}
	}

	public final Store_indexesContext store_indexes() throws RecognitionException {
		Store_indexesContext _localctx = new Store_indexesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_store_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(178); with();
					setState(179); match(INDEX);
					setState(180); pair();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Content_stringContext extends ParserRuleContext {
		public TerminalNode JSON() { return getToken(ContactParser.JSON, 0); }
		public TerminalNode TEXT() { return getToken(ContactParser.TEXT, 0); }
		public User_contentContext user_content() {
			return getRuleContext(User_contentContext.class,0);
		}
		public TerminalNode XML() { return getToken(ContactParser.XML, 0); }
		public TerminalNode DATA_CONTENT() { return getToken(ContactParser.DATA_CONTENT, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Content_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterContent_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitContent_string(this);
		}
	}

	public final Content_stringContext content_string() throws RecognitionException {
		Content_stringContext _localctx = new Content_stringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_content_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(187); match(TEXT);
				}
				break;
			case JSON:
				{
				setState(188); match(JSON);
				}
				break;
			case XML:
				{
				setState(189); match(XML);
				}
				break;
			case CONTENTTYPE:
				{
				setState(190); user_content();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==DATA_CONTENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_contentContext extends ParserRuleContext {
		public Token content_type;
		public TerminalNode CONTENTTYPE() { return getToken(ContactParser.CONTENTTYPE, 0); }
		public TerminalNode AND() { return getToken(ContactParser.AND, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public User_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterUser_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitUser_content(this);
		}
	}

	public final User_contentContext user_content() throws RecognitionException {
		User_contentContext _localctx = new User_contentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_user_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(CONTENTTYPE);
			setState(196); ((User_contentContext)_localctx).content_type = match(STRING);
			setState(197); match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public Token key;
		public TerminalNode DELETE() { return getToken(ContactParser.DELETE, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(DELETE);
			setState(200); ((DeleteContext)_localctx).key = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query2iContext extends ParserRuleContext {
		public Token index;
		public Token exact;
		public Token vmin;
		public Token vmax;
		public TerminalNode INDEX() { return getToken(ContactParser.INDEX, 0); }
		public List<WithContext> with() {
			return getRuleContexts(WithContext.class);
		}
		public TerminalNode STRING(int i) {
			return getToken(ContactParser.STRING, i);
		}
		public TerminalNode FETCH() { return getToken(ContactParser.FETCH, 0); }
		public WithContext with(int i) {
			return getRuleContext(WithContext.class,i);
		}
		public TerminalNode VALUE() { return getToken(ContactParser.VALUE, 0); }
		public TerminalNode AND() { return getToken(ContactParser.AND, 0); }
		public TerminalNode TO() { return getToken(ContactParser.TO, 0); }
		public TerminalNode FROM() { return getToken(ContactParser.FROM, 0); }
		public TerminalNode QUERY2I() { return getToken(ContactParser.QUERY2I, 0); }
		public List<TerminalNode> STRING() { return getTokens(ContactParser.STRING); }
		public Query2iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query2i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterQuery2i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitQuery2i(this);
		}
	}

	public final Query2iContext query2i() throws RecognitionException {
		Query2iContext _localctx = new Query2iContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_query2i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(QUERY2I);
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(203); match(AND);
				setState(204); match(FETCH);
				}
				break;
			}
			setState(207); with();
			setState(208); match(INDEX);
			setState(209); ((Query2iContext)_localctx).index = match(STRING);
			setState(218);
			switch (_input.LA(1)) {
			case WITH:
			case AND:
				{
				setState(210); with();
				setState(211); match(VALUE);
				setState(212); ((Query2iContext)_localctx).exact = match(STRING);
				}
				break;
			case FROM:
				{
				setState(214); match(FROM);
				setState(215); ((Query2iContext)_localctx).vmin = match(STRING);
				setState(216); match(TO);
				setState(217); ((Query2iContext)_localctx).vmax = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseContext extends ParserRuleContext {
		public Token name;
		public Token var;
		public TerminalNode BUCKET() { return getToken(ContactParser.BUCKET, 0); }
		public TerminalNode USE() { return getToken(ContactParser.USE, 0); }
		public TerminalNode CONN() { return getToken(ContactParser.CONN, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public UseBucketOptionsContext useBucketOptions() {
			return getRuleContext(UseBucketOptionsContext.class,0);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitUse(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(USE);
			setState(228);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				{
				setState(221); match(BUCKET);
				setState(222); ((UseContext)_localctx).name = match(STRING);
				setState(224);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(223); useBucketOptions();
					}
					break;
				}
				}
				}
				break;
			case CONN:
				{
				{
				setState(226); match(CONN);
				setState(227); ((UseContext)_localctx).var = match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseBucketOptionsContext extends ParserRuleContext {
		public OptionslistContext fetchOptions;
		public OptionslistContext storeOptions;
		public OptionslistContext deleteOptions;
		public OptionslistContext query2iOptions;
		public List<WithContext> with() {
			return getRuleContexts(WithContext.class);
		}
		public TerminalNode DELETE() { return getToken(ContactParser.DELETE, 0); }
		public TerminalNode OPTIONS(int i) {
			return getToken(ContactParser.OPTIONS, i);
		}
		public List<OptionslistContext> optionslist() {
			return getRuleContexts(OptionslistContext.class);
		}
		public TerminalNode FETCH() { return getToken(ContactParser.FETCH, 0); }
		public WithContext with(int i) {
			return getRuleContext(WithContext.class,i);
		}
		public Code_stringContext code_string() {
			return getRuleContext(Code_stringContext.class,0);
		}
		public TerminalNode QUERY2I() { return getToken(ContactParser.QUERY2I, 0); }
		public OptionslistContext optionslist(int i) {
			return getRuleContext(OptionslistContext.class,i);
		}
		public TerminalNode RESOLVER() { return getToken(ContactParser.RESOLVER, 0); }
		public TerminalNode STORE() { return getToken(ContactParser.STORE, 0); }
		public List<TerminalNode> OPTIONS() { return getTokens(ContactParser.OPTIONS); }
		public UseBucketOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useBucketOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterUseBucketOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitUseBucketOptions(this);
		}
	}

	public final UseBucketOptionsContext useBucketOptions() throws RecognitionException {
		UseBucketOptionsContext _localctx = new UseBucketOptionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_useBucketOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(230); with();
				setState(231); match(FETCH);
				setState(232); match(OPTIONS);
				setState(233); ((UseBucketOptionsContext)_localctx).fetchOptions = optionslist();
				}
				break;
			}
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(237); with();
				setState(238); match(STORE);
				setState(239); match(OPTIONS);
				setState(240); ((UseBucketOptionsContext)_localctx).storeOptions = optionslist();
				}
				break;
			}
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(244); with();
				setState(245); match(DELETE);
				setState(246); match(OPTIONS);
				setState(247); ((UseBucketOptionsContext)_localctx).deleteOptions = optionslist();
				}
				break;
			}
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(251); with();
				setState(252); match(QUERY2I);
				setState(253); match(OPTIONS);
				setState(254); ((UseBucketOptionsContext)_localctx).query2iOptions = optionslist();
				}
				break;
			}
			setState(262);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(258); with();
				setState(259); match(RESOLVER);
				setState(260); code_string();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketpropsContext extends ParserRuleContext {
		public Set_bucketpropsContext set_bucketprops() {
			return getRuleContext(Set_bucketpropsContext.class,0);
		}
		public Get_bucketpropsContext get_bucketprops() {
			return getRuleContext(Get_bucketpropsContext.class,0);
		}
		public BucketpropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketprops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterBucketprops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitBucketprops(this);
		}
	}

	public final BucketpropsContext bucketprops() throws RecognitionException {
		BucketpropsContext _localctx = new BucketpropsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(264); get_bucketprops();
				}
				break;
			case SET:
				{
				setState(265); set_bucketprops();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_bucketpropsContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(ContactParser.GET, 0); }
		public TerminalNode PROPERTIES() { return getToken(ContactParser.PROPERTIES, 0); }
		public Get_bucketpropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_bucketprops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterGet_bucketprops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitGet_bucketprops(this);
		}
	}

	public final Get_bucketpropsContext get_bucketprops() throws RecognitionException {
		Get_bucketpropsContext _localctx = new Get_bucketpropsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_get_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(GET);
			setState(269); match(PROPERTIES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_bucketpropsContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ContactParser.SET, 0); }
		public OptionslistContext optionslist() {
			return getRuleContext(OptionslistContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(ContactParser.PROPERTIES, 0); }
		public Set_bucketpropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_bucketprops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterSet_bucketprops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitSet_bucketprops(this);
		}
	}

	public final Set_bucketpropsContext set_bucketprops() throws RecognitionException {
		Set_bucketpropsContext _localctx = new Set_bucketpropsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_set_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(SET);
			setState(272); match(PROPERTIES);
			setState(273); optionslist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectContext extends ParserRuleContext {
		public Token host;
		public Token pbport;
		public Token httpport;
		public Token erlnode;
		public Node_nameContext connname;
		public TerminalNode AS() { return getToken(ContactParser.AS, 0); }
		public List<TerminalNode> INT() { return getTokens(ContactParser.INT); }
		public TerminalNode STRING(int i) {
			return getToken(ContactParser.STRING, i);
		}
		public TerminalNode HTTP() { return getToken(ContactParser.HTTP, 0); }
		public TerminalNode NODE() { return getToken(ContactParser.NODE, 0); }
		public TerminalNode CONNECT() { return getToken(ContactParser.CONNECT, 0); }
		public TerminalNode INT(int i) {
			return getToken(ContactParser.INT, i);
		}
		public Node_nameContext node_name() {
			return getRuleContext(Node_nameContext.class,0);
		}
		public TerminalNode PB() { return getToken(ContactParser.PB, 0); }
		public List<TerminalNode> STRING() { return getTokens(ContactParser.STRING); }
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterConnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitConnect(this);
		}
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_connect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(CONNECT);
			setState(276); ((ConnectContext)_localctx).host = match(STRING);
			setState(279);
			_la = _input.LA(1);
			if (_la==PB) {
				{
				setState(277); match(PB);
				setState(278); ((ConnectContext)_localctx).pbport = match(INT);
				}
			}

			setState(283);
			_la = _input.LA(1);
			if (_la==HTTP) {
				{
				setState(281); match(HTTP);
				setState(282); ((ConnectContext)_localctx).httpport = match(INT);
				}
			}

			setState(287);
			_la = _input.LA(1);
			if (_la==NODE) {
				{
				setState(285); match(NODE);
				setState(286); ((ConnectContext)_localctx).erlnode = match(STRING);
				}
			}

			setState(291);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(289); match(AS);
				setState(290); ((ConnectContext)_localctx).connname = node_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ContactParser.SET, 0); }
		public Set_actionContext set_action() {
			return getRuleContext(Set_actionContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(SET);
			setState(294); set_action();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_actionContext extends ParserRuleContext {
		public Token actionname;
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public Code_stringContext code_string() {
			return getRuleContext(Code_stringContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ContactParser.ACTION, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
		public Set_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterSet_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitSet_action(this);
		}
	}

	public final Set_actionContext set_action() throws RecognitionException {
		Set_actionContext _localctx = new Set_actionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_set_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(ACTION);
			setState(297); ((Set_actionContext)_localctx).actionname = match(ID);
			setState(298); match(WITH);
			setState(299); code_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetContext extends ParserRuleContext {
		public TerminalNode BUCKET() { return getToken(ContactParser.BUCKET, 0); }
		public Get_actionContext get_action() {
			return getRuleContext(Get_actionContext.class,0);
		}
		public TerminalNode GET() { return getToken(ContactParser.GET, 0); }
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitGet(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(GET);
			setState(304);
			switch (_input.LA(1)) {
			case ACTION:
				{
				setState(302); get_action();
				}
				break;
			case BUCKET:
				{
				setState(303); match(BUCKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_actionContext extends ParserRuleContext {
		public Token actionname;
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode ACTION() { return getToken(ContactParser.ACTION, 0); }
		public Get_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterGet_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitGet_action(this);
		}
	}

	public final Get_actionContext get_action() throws RecognitionException {
		Get_actionContext _localctx = new Get_actionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_get_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(ACTION);
			setState(307); ((Get_actionContext)_localctx).actionname = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_nameContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(ContactParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public Node_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterNode_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitNode_name(this);
		}
	}

	public final Node_nameContext node_name() throws RecognitionException {
		Node_nameContext _localctx = new Node_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_node_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(DOLLAR);
			setState(310); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteridContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode SPLAT() { return getToken(ContactParser.SPLAT, 0); }
		public ClusteridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterClusterid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitClusterid(this);
		}
	}

	public final ClusteridContext clusterid() throws RecognitionException {
		ClusteridContext _localctx = new ClusteridContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_clusterid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(SPLAT);
			setState(313); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoderefContext extends ParserRuleContext {
		public Token nodename;
		public Token nodeid;
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public NoderefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noderef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterNoderef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitNoderef(this);
		}
	}

	public final NoderefContext noderef() throws RecognitionException {
		NoderefContext _localctx = new NoderefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_noderef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(315); ((NoderefContext)_localctx).nodename = match(STRING);
				}
				break;
			case ID:
				{
				setState(316); ((NoderefContext)_localctx).nodeid = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadscriptContext extends ParserRuleContext {
		public Token filename;
		public TerminalNode SCRIPT() { return getToken(ContactParser.SCRIPT, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public TerminalNode LOAD() { return getToken(ContactParser.LOAD, 0); }
		public LoadscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterLoadscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitLoadscript(this);
		}
	}

	public final LoadscriptContext loadscript() throws RecognitionException {
		LoadscriptContext _localctx = new LoadscriptContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loadscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(LOAD);
			setState(320); match(SCRIPT);
			setState(321); ((LoadscriptContext)_localctx).filename = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public Token content;
		public TerminalNode SCRIPT() { return getToken(ContactParser.SCRIPT, 0); }
		public TerminalNode DATA_CONTENT() { return getToken(ContactParser.DATA_CONTENT, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(SCRIPT);
			setState(324);
			((ScriptContext)_localctx).content = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==DATA_CONTENT) ) {
				((ScriptContext)_localctx).content = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public Token name;
		public Token id;
		public TerminalNode EQUALS() { return getToken(ContactParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public PairValueContext pairValue() {
			return getRuleContext(PairValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(326); ((PairContext)_localctx).name = match(STRING);
				}
				break;
			case ID:
				{
				setState(327); ((PairContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(330); match(EQUALS);
			setState(331); pairValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairValueContext extends ParserRuleContext {
		public PairValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairValue; }
	 
		public PairValueContext() { }
		public void copyFrom(PairValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PairStringValueContext extends PairValueContext {
		public Token stringValue;
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public PairStringValueContext(PairValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterPairStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitPairStringValue(this);
		}
	}
	public static class PairIntValueContext extends PairValueContext {
		public Token intValue;
		public TerminalNode INT() { return getToken(ContactParser.INT, 0); }
		public PairIntValueContext(PairValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterPairIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitPairIntValue(this);
		}
	}
	public static class PairBoolValueContext extends PairValueContext {
		public BoolContext boolValue;
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PairBoolValueContext(PairValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterPairBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitPairBoolValue(this);
		}
	}

	public final PairValueContext pairValue() throws RecognitionException {
		PairValueContext _localctx = new PairValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_pairValue);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PairStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333); ((PairStringValueContext)_localctx).stringValue = match(STRING);
				}
				break;
			case INT:
				_localctx = new PairIntValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334); ((PairIntValueContext)_localctx).intValue = match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new PairBoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(335); ((PairBoolValueContext)_localctx).boolValue = bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_stringContext extends ParserRuleContext {
		public TerminalNode JAVASCRIPT() { return getToken(ContactParser.JAVASCRIPT, 0); }
		public TerminalNode DATA_CONTENT() { return getToken(ContactParser.DATA_CONTENT, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Code_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterCode_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitCode_string(this);
		}
	}

	public final Code_stringContext code_string() throws RecognitionException {
		Code_stringContext _localctx = new Code_stringContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_code_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(JAVASCRIPT);
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==DATA_CONTENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(ContactParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(ContactParser.TRUE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3L\u015a\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\3\2\6\2V\n\2\r\2\16\2W\3\2\3\2\3\3\5\3]\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3f\n\3\3\3\5\3i\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5t\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\7\17\u00a2\n\17\f\17\16\17\u00a5\13\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\5\21\u00ad\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23\u00b9\n\23\f\23\16\23\u00bc\13\23\3\24\3\24\3\24\3\24\5\24\u00c2"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27"+
		"\u00d0\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00dd\n\27\3\30\3\30\3\30\3\30\5\30\u00e3\n\30\3\30\3\30\5\30\u00e7\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\5\31\u00ee\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00f5\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u00fc\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u0103\n\31\3\31\3\31\3\31\3\31\5\31\u0109\n\31\3\32"+
		"\3\32\5\32\u010d\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\5\35\u011a\n\35\3\35\3\35\5\35\u011e\n\35\3\35\3\35\5\35\u0122\n"+
		"\35\3\35\3\35\5\35\u0126\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \5 \u0133\n \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\5$\u0140\n$"+
		"\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\5\'\u014b\n\'\3\'\3\'\3\'\3(\3(\3(\5(\u0153"+
		"\n(\3)\3)\3)\3*\3*\3*\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPR\2\7\3\21\22\3HI\3HI\3HI\3\"#\u015e\2U\3"+
		"\2\2\2\4\\\3\2\2\2\6l\3\2\2\2\bs\3\2\2\2\nu\3\2\2\2\fw\3\2\2\2\16{\3\2"+
		"\2\2\20\u0080\3\2\2\2\22\u008a\3\2\2\2\24\u008f\3\2\2\2\26\u0095\3\2\2"+
		"\2\30\u0098\3\2\2\2\32\u009b\3\2\2\2\34\u009e\3\2\2\2\36\u00a6\3\2\2\2"+
		" \u00a9\3\2\2\2\"\u00b2\3\2\2\2$\u00ba\3\2\2\2&\u00c1\3\2\2\2(\u00c5\3"+
		"\2\2\2*\u00c9\3\2\2\2,\u00cc\3\2\2\2.\u00de\3\2\2\2\60\u00ed\3\2\2\2\62"+
		"\u010c\3\2\2\2\64\u010e\3\2\2\2\66\u0111\3\2\2\28\u0115\3\2\2\2:\u0127"+
		"\3\2\2\2<\u012a\3\2\2\2>\u012f\3\2\2\2@\u0134\3\2\2\2B\u0137\3\2\2\2D"+
		"\u013a\3\2\2\2F\u013f\3\2\2\2H\u0141\3\2\2\2J\u0145\3\2\2\2L\u014a\3\2"+
		"\2\2N\u0152\3\2\2\2P\u0154\3\2\2\2R\u0157\3\2\2\2TV\5\4\3\2UT\3\2\2\2"+
		"VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\1\2\2Z\3\3\2\2\2[]\5\f\7"+
		"\2\\[\3\2\2\2\\]\3\2\2\2]e\3\2\2\2^f\58\35\2_f\5.\30\2`f\5\16\b\2af\5"+
		"\22\n\2bf\5\26\f\2cf\5\b\5\2df\5\n\6\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2e"+
		"a\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fh\3\2\2\2gi\5\6\4\2hg\3\2\2\2"+
		"hi\3\2\2\2ij\3\2\2\2jk\7D\2\2k\5\3\2\2\2lm\7:\2\2mn\5B\"\2n\7\3\2\2\2"+
		"ot\5> \2pt\5:\36\2qt\5H%\2rt\5J&\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2"+
		"\2\2t\t\3\2\2\2uv\7\r\2\2v\13\3\2\2\2wx\7\3\2\2xy\7E\2\2yz\7B\2\2z\r\3"+
		"\2\2\2{|\7\20\2\2|}\7\23\2\2}~\7H\2\2~\177\5\22\n\2\177\17\3\2\2\2\u0080"+
		"\u0081\t\2\2\2\u0081\21\3\2\2\2\u0082\u008b\5\36\20\2\u0083\u008b\5 \21"+
		"\2\u0084\u008b\5*\26\2\u0085\u008b\5,\27\2\u0086\u008b\5\30\r\2\u0087"+
		"\u008b\5\32\16\2\u0088\u008b\5\62\32\2\u0089\u008b\5\"\22\2\u008a\u0082"+
		"\3\2\2\2\u008a\u0083\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a"+
		"\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008e\5\24\13\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090\5\20\t\2\u0090\u0093\7\24"+
		"\2\2\u0091\u0094\5\34\17\2\u0092\u0094\7E\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\7\37\2\2\u0096\u0097\7 \2"+
		"\2\u0097\27\3\2\2\2\u0098\u0099\7\37\2\2\u0099\u009a\7!\2\2\u009a\31\3"+
		"\2\2\2\u009b\u009c\7\26\2\2\u009c\u009d\7!\2\2\u009d\33\3\2\2\2\u009e"+
		"\u00a3\5L\'\2\u009f\u00a0\7=\2\2\u00a0\u00a2\5L\'\2\u00a1\u009f\3\2\2"+
		"\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\35"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\7H\2\2\u00a8"+
		"\37\3\2\2\2\u00a9\u00ac\7\7\2\2\u00aa\u00ad\7H\2\2\u00ab\u00ad\7E\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\5$\23\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\5&\24\2\u00b1!\3\2\2\2\u00b2"+
		"\u00b3\7\b\2\2\u00b3#\3\2\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6\7\30\2"+
		"\2\u00b6\u00b7\5L\'\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb%\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c2\7*\2\2\u00be\u00c2\7)\2\2\u00bf\u00c2\7+\2"+
		"\2\u00c0\u00c2\5(\25\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\t\3\2\2\u00c4"+
		"\'\3\2\2\2\u00c5\u00c6\7\13\2\2\u00c6\u00c7\7H\2\2\u00c7\u00c8\7\22\2"+
		"\2\u00c8)\3\2\2\2\u00c9\u00ca\7\t\2\2\u00ca\u00cb\7H\2\2\u00cb+\3\2\2"+
		"\2\u00cc\u00cf\7\25\2\2\u00cd\u00ce\7\22\2\2\u00ce\u00d0\7\6\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5\20"+
		"\t\2\u00d2\u00d3\7\30\2\2\u00d3\u00dc\7H\2\2\u00d4\u00d5\5\20\t\2\u00d5"+
		"\u00d6\7\n\2\2\u00d6\u00d7\7H\2\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9\7\27"+
		"\2\2\u00d9\u00da\7H\2\2\u00da\u00db\7\31\2\2\u00db\u00dd\7H\2\2\u00dc"+
		"\u00d4\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd-\3\2\2\2\u00de\u00e6\7\17\2\2"+
		"\u00df\u00e0\7\23\2\2\u00e0\u00e2\7H\2\2\u00e1\u00e3\5\60\31\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e5\7\f\2\2\u00e5"+
		"\u00e7\7E\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7/\3\2\2\2\u00e8"+
		"\u00e9\5\20\t\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb\7\24\2\2\u00eb\u00ec\5"+
		"\34\17\2\u00ec\u00ee\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f4\3\2\2\2\u00ef\u00f0\5\20\t\2\u00f0\u00f1\7\7\2\2\u00f1\u00f2\7"+
		"\24\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00f5\3\2\2\2\u00f4\u00ef\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00fb\3\2\2\2\u00f6\u00f7\5\20\t\2\u00f7\u00f8"+
		"\7\t\2\2\u00f8\u00f9\7\24\2\2\u00f9\u00fa\5\34\17\2\u00fa\u00fc\3\2\2"+
		"\2\u00fb\u00f6\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0102\3\2\2\2\u00fd\u00fe"+
		"\5\20\t\2\u00fe\u00ff\7\25\2\2\u00ff\u0100\7\24\2\2\u0100\u0101\5\34\17"+
		"\2\u0101\u0103\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0108"+
		"\3\2\2\2\u0104\u0105\5\20\t\2\u0105\u0106\7\34\2\2\u0106\u0107\5P)\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0109\3\2\2\2\u0109\61\3\2\2"+
		"\2\u010a\u010d\5\64\33\2\u010b\u010d\5\66\34\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\63\3\2\2\2\u010e\u010f\7&\2\2\u010f\u0110\7\33\2"+
		"\2\u0110\65\3\2\2\2\u0111\u0112\7%\2\2\u0112\u0113\7\33\2\2\u0113\u0114"+
		"\5\34\17\2\u0114\67\3\2\2\2\u0115\u0116\7\16\2\2\u0116\u0119\7H\2\2\u0117"+
		"\u0118\7\4\2\2\u0118\u011a\7F\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u011c\7\5\2\2\u011c\u011e\7F\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u0120\7,"+
		"\2\2\u0120\u0122\7H\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0124\7(\2\2\u0124\u0126\5B\"\2\u0125\u0123\3\2\2"+
		"\2\u0125\u0126\3\2\2\2\u01269\3\2\2\2\u0127\u0128\7%\2\2\u0128\u0129\5"+
		"<\37\2\u0129;\3\2\2\2\u012a\u012b\7\'\2\2\u012b\u012c\7E\2\2\u012c\u012d"+
		"\7\21\2\2\u012d\u012e\5P)\2\u012e=\3\2\2\2\u012f\u0132\7&\2\2\u0130\u0133"+
		"\5@!\2\u0131\u0133\7\23\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"?\3\2\2\2\u0134\u0135\7\'\2\2\u0135\u0136\7E\2\2\u0136A\3\2\2\2\u0137"+
		"\u0138\7;\2\2\u0138\u0139\7E\2\2\u0139C\3\2\2\2\u013a\u013b\7<\2\2\u013b"+
		"\u013c\7E\2\2\u013cE\3\2\2\2\u013d\u0140\7H\2\2\u013e\u0140\7E\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140G\3\2\2\2\u0141\u0142\7\35\2\2"+
		"\u0142\u0143\7\36\2\2\u0143\u0144\7H\2\2\u0144I\3\2\2\2\u0145\u0146\7"+
		"\36\2\2\u0146\u0147\t\4\2\2\u0147K\3\2\2\2\u0148\u014b\7H\2\2\u0149\u014b"+
		"\7E\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\7B\2\2\u014d\u014e\5N(\2\u014eM\3\2\2\2\u014f\u0153\7H\2\2\u0150"+
		"\u0153\7F\2\2\u0151\u0153\5R*\2\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2"+
		"\2\u0152\u0151\3\2\2\2\u0153O\3\2\2\2\u0154\u0155\7\32\2\2\u0155\u0156"+
		"\t\5\2\2\u0156Q\3\2\2\2\u0157\u0158\t\6\2\2\u0158S\3\2\2\2 W\\ehs\u008a"+
		"\u008d\u0093\u00a3\u00ac\u00ba\u00c1\u00cf\u00dc\u00e2\u00e6\u00ed\u00f4"+
		"\u00fb\u0102\u0108\u010c\u0119\u011d\u0121\u0125\u0132\u013f\u014a\u0152";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}