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
		TEXT=40, XML=41, NODE=42, ADMIN=43, JOIN=44, LEAVE=45, FORCE=46, REMOVE=47, 
		REPLACE=48, PLAN=49, COMMIT=50, CLEAR=51, AT=52, COMMA=53, LSQUARE=54, 
		RSQUARE=55, LPAREN=56, RPAREN=57, EQUALS=58, DOT=59, SEMI=60, ID=61, INT=62, 
		FLOAT=63, STRING=64, DATA_CONTENT=65, LINE_COMMENT=66, COMMENT=67, WS=68;
	public static final String[] tokenNames = {
		"<INVALID>", "'let'", "'pb'", "'http'", "'fetch'", "'store'", "'update'", 
		"'delete'", "'value'", "'content-type'", "'connection'", "'connections'", 
		"'connect'", "'use'", "'using'", "'with'", "'and'", "'bucket'", "'options'", 
		"'query2i'", "'count'", "'from'", "'index'", "'to'", "'javascript'", "'properties'", 
		"'resolver'", "'load'", "'script'", "'list'", "'buckets'", "'keys'", "'true'", 
		"'false'", "'default'", "'set'", "'get'", "'action'", "'as'", "'json'", 
		"'text'", "'xml'", "'node'", "'admin'", "'join'", "'leave'", "'force'", 
		"'remove'", "'replace'", "'plan'", "'commit'", "'clear'", "'@'", "','", 
		"'['", "']'", "'('", "')'", "'='", "'.'", "';'", "ID", "INT", "FLOAT", 
		"STRING", "DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS"
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
		RULE_get_action = 31, RULE_admin = 32, RULE_admin_join = 33, RULE_admin_leave = 34, 
		RULE_admin_force_remove = 35, RULE_admin_replace = 36, RULE_admin_force_replace = 37, 
		RULE_admin_plan = 38, RULE_admin_commit = 39, RULE_admin_clear = 40, RULE_loadscript = 41, 
		RULE_script = 42, RULE_pair = 43, RULE_pairValue = 44, RULE_code_string = 45, 
		RULE_bool = 46;
	public static final String[] ruleNames = {
		"prog", "stat", "connection_selector", "console_op", "connections", "assignment", 
		"using", "with", "op_with_options", "options", "listbuckets", "listkeys", 
		"countkeys", "optionslist", "fetch", "store", "update", "store_indexes", 
		"content_string", "user_content", "delete", "query2i", "use", "useBucketOptions", 
		"bucketprops", "get_bucketprops", "set_bucketprops", "connect", "set", 
		"set_action", "get", "get_action", "admin", "admin_join", "admin_leave", 
		"admin_force_remove", "admin_replace", "admin_force_replace", "admin_plan", 
		"admin_commit", "admin_clear", "loadscript", "script", "pair", "pairValue", 
		"code_string", "bool"
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94); stat();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FETCH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CONNS) | (1L << CONNECT) | (1L << USE) | (1L << USING) | (1L << QUERY2I) | (1L << COUNT) | (1L << LOAD) | (1L << SCRIPT) | (1L << LIST) | (1L << SET) | (1L << GET) | (1L << ADMIN))) != 0) );
			setState(99); match(EOF);
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
		public AdminContext admin() {
			return getRuleContext(AdminContext.class,0);
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
			setState(102);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(101); assignment();
				}
			}

			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(104); connect();
				}
				break;

			case 2:
				{
				setState(105); use();
				}
				break;

			case 3:
				{
				setState(106); using();
				}
				break;

			case 4:
				{
				setState(107); op_with_options();
				}
				break;

			case 5:
				{
				setState(108); listbuckets();
				}
				break;

			case 6:
				{
				setState(109); console_op();
				}
				break;

			case 7:
				{
				setState(110); connections();
				}
				break;

			case 8:
				{
				setState(111); admin();
				}
				break;
			}
			setState(115);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(114); connection_selector();
				}
			}

			setState(117); match(SEMI);
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
		public Token connname;
		public TerminalNode AT() { return getToken(ContactParser.AT, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
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
			setState(119); match(AT);
			setState(120); ((Connection_selectorContext)_localctx).connname = match(ID);
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
			setState(126);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); get();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); set();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); loadscript();
				}
				break;
			case SCRIPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(125); script();
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
			setState(128); match(CONNS);
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
			setState(130); match(LET);
			setState(131); ((AssignmentContext)_localctx).name = match(ID);
			setState(132); match(EQUALS);
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
			setState(134); match(USING);
			setState(135); match(BUCKET);
			setState(136); ((UsingContext)_localctx).bucket = match(STRING);
			setState(137); op_with_options();
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
			setState(139);
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
			setState(149);
			switch (_input.LA(1)) {
			case FETCH:
				{
				setState(141); fetch();
				}
				break;
			case STORE:
				{
				setState(142); store();
				}
				break;
			case DELETE:
				{
				setState(143); delete();
				}
				break;
			case QUERY2I:
				{
				setState(144); query2i();
				}
				break;
			case LIST:
				{
				setState(145); listkeys();
				}
				break;
			case COUNT:
				{
				setState(146); countkeys();
				}
				break;
			case SET:
			case GET:
				{
				setState(147); bucketprops();
				}
				break;
			case UPDATE:
				{
				setState(148); update();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(151); options();
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
			setState(154); with();
			setState(155); match(OPTIONS);
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(156); optionslist();
				}
				break;

			case 2:
				{
				setState(157); match(ID);
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
			setState(160); match(LIST);
			setState(161); match(BUCKETS);
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
			setState(163); match(LIST);
			setState(164); match(KEYS);
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
			setState(166); match(COUNT);
			setState(167); match(KEYS);
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
			setState(169); ((OptionslistContext)_localctx).pair = pair();
			((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170); match(COMMA);
				setState(171); ((OptionslistContext)_localctx).pair = pair();
				((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
				}
				}
				setState(176);
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
			setState(177); match(FETCH);
			setState(178); ((FetchContext)_localctx).key = match(STRING);
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
			setState(180); match(STORE);
			setState(183);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(181); ((StoreContext)_localctx).key = match(STRING);
				}
				break;
			case ID:
				{
				setState(182); ((StoreContext)_localctx).existing_obj = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185); store_indexes();
			setState(186); with();
			setState(187); content_string();
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
			setState(189); match(UPDATE);
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
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(191); with();
					setState(192); match(INDEX);
					setState(193); pair();
					}
					} 
				}
				setState(199);
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
			setState(204);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(200); match(TEXT);
				}
				break;
			case JSON:
				{
				setState(201); match(JSON);
				}
				break;
			case XML:
				{
				setState(202); match(XML);
				}
				break;
			case CONTENTTYPE:
				{
				setState(203); user_content();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206);
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
			setState(208); match(CONTENTTYPE);
			setState(209); ((User_contentContext)_localctx).content_type = match(STRING);
			setState(210); match(AND);
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
			setState(212); match(DELETE);
			setState(213); ((DeleteContext)_localctx).key = match(STRING);
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
			setState(215); match(QUERY2I);
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(216); match(AND);
				setState(217); match(FETCH);
				}
				break;
			}
			setState(220); with();
			setState(221); match(INDEX);
			setState(222); ((Query2iContext)_localctx).index = match(STRING);
			setState(231);
			switch (_input.LA(1)) {
			case WITH:
			case AND:
				{
				setState(223); with();
				setState(224); match(VALUE);
				setState(225); ((Query2iContext)_localctx).exact = match(STRING);
				}
				break;
			case FROM:
				{
				setState(227); match(FROM);
				setState(228); ((Query2iContext)_localctx).vmin = match(STRING);
				setState(229); match(TO);
				setState(230); ((Query2iContext)_localctx).vmax = match(STRING);
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
			setState(233); match(USE);
			setState(241);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				{
				setState(234); match(BUCKET);
				setState(235); ((UseContext)_localctx).name = match(STRING);
				setState(237);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(236); useBucketOptions();
					}
					break;
				}
				}
				}
				break;
			case CONN:
				{
				{
				setState(239); match(CONN);
				setState(240); ((UseContext)_localctx).var = match(ID);
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
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(243); with();
				setState(244); match(FETCH);
				setState(245); match(OPTIONS);
				setState(246); ((UseBucketOptionsContext)_localctx).fetchOptions = optionslist();
				}
				break;
			}
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(250); with();
				setState(251); match(STORE);
				setState(252); match(OPTIONS);
				setState(253); ((UseBucketOptionsContext)_localctx).storeOptions = optionslist();
				}
				break;
			}
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(257); with();
				setState(258); match(DELETE);
				setState(259); match(OPTIONS);
				setState(260); ((UseBucketOptionsContext)_localctx).deleteOptions = optionslist();
				}
				break;
			}
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(264); with();
				setState(265); match(QUERY2I);
				setState(266); match(OPTIONS);
				setState(267); ((UseBucketOptionsContext)_localctx).query2iOptions = optionslist();
				}
				break;
			}
			setState(275);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(271); with();
				setState(272); match(RESOLVER);
				setState(273); code_string();
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
			setState(279);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(277); get_bucketprops();
				}
				break;
			case SET:
				{
				setState(278); set_bucketprops();
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
			setState(281); match(GET);
			setState(282); match(PROPERTIES);
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
			setState(284); match(SET);
			setState(285); match(PROPERTIES);
			setState(286); optionslist();
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
		public Token connname;
		public TerminalNode AS() { return getToken(ContactParser.AS, 0); }
		public List<TerminalNode> INT() { return getTokens(ContactParser.INT); }
		public TerminalNode STRING(int i) {
			return getToken(ContactParser.STRING, i);
		}
		public TerminalNode HTTP() { return getToken(ContactParser.HTTP, 0); }
		public TerminalNode NODE() { return getToken(ContactParser.NODE, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode CONNECT() { return getToken(ContactParser.CONNECT, 0); }
		public TerminalNode INT(int i) {
			return getToken(ContactParser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ContactParser.STRING); }
		public TerminalNode PB() { return getToken(ContactParser.PB, 0); }
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
			setState(288); match(CONNECT);
			setState(289); ((ConnectContext)_localctx).host = match(STRING);
			setState(290); match(PB);
			setState(291); ((ConnectContext)_localctx).pbport = match(INT);
			setState(294);
			_la = _input.LA(1);
			if (_la==HTTP) {
				{
				setState(292); match(HTTP);
				setState(293); ((ConnectContext)_localctx).httpport = match(INT);
				}
			}

			setState(298);
			_la = _input.LA(1);
			if (_la==NODE) {
				{
				setState(296); match(NODE);
				setState(297); ((ConnectContext)_localctx).erlnode = match(STRING);
				}
			}

			setState(302);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(300); match(AS);
				setState(301); ((ConnectContext)_localctx).connname = match(ID);
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
			setState(304); match(SET);
			setState(305); set_action();
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
			setState(307); match(ACTION);
			setState(308); ((Set_actionContext)_localctx).actionname = match(ID);
			setState(309); match(WITH);
			setState(310); code_string();
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
			setState(312); match(GET);
			setState(315);
			switch (_input.LA(1)) {
			case ACTION:
				{
				setState(313); get_action();
				}
				break;
			case BUCKET:
				{
				setState(314); match(BUCKET);
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
			setState(317); match(ACTION);
			setState(318); ((Get_actionContext)_localctx).actionname = match(ID);
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

	public static class AdminContext extends ParserRuleContext {
		public Token connid;
		public TerminalNode ADMIN() { return getToken(ContactParser.ADMIN, 0); }
		public Admin_commitContext admin_commit() {
			return getRuleContext(Admin_commitContext.class,0);
		}
		public Admin_leaveContext admin_leave() {
			return getRuleContext(Admin_leaveContext.class,0);
		}
		public Admin_joinContext admin_join() {
			return getRuleContext(Admin_joinContext.class,0);
		}
		public Admin_clearContext admin_clear() {
			return getRuleContext(Admin_clearContext.class,0);
		}
		public Admin_force_removeContext admin_force_remove() {
			return getRuleContext(Admin_force_removeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public Admin_planContext admin_plan() {
			return getRuleContext(Admin_planContext.class,0);
		}
		public Admin_force_replaceContext admin_force_replace() {
			return getRuleContext(Admin_force_replaceContext.class,0);
		}
		public Admin_replaceContext admin_replace() {
			return getRuleContext(Admin_replaceContext.class,0);
		}
		public AdminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin(this);
		}
	}

	public final AdminContext admin() throws RecognitionException {
		AdminContext _localctx = new AdminContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_admin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(ADMIN);
			{
			setState(321); ((AdminContext)_localctx).connid = match(ID);
			}
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(322); admin_join();
				}
				break;

			case 2:
				{
				setState(323); admin_leave();
				}
				break;

			case 3:
				{
				setState(324); admin_force_remove();
				}
				break;

			case 4:
				{
				setState(325); admin_replace();
				}
				break;

			case 5:
				{
				setState(326); admin_force_replace();
				}
				break;

			case 6:
				{
				setState(327); admin_plan();
				}
				break;

			case 7:
				{
				setState(328); admin_commit();
				}
				break;

			case 8:
				{
				setState(329); admin_clear();
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

	public static class Admin_joinContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(ContactParser.JOIN, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Admin_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_join(this);
		}
	}

	public final Admin_joinContext admin_join() throws RecognitionException {
		Admin_joinContext _localctx = new Admin_joinContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_admin_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(JOIN);
			setState(333); match(STRING);
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

	public static class Admin_leaveContext extends ParserRuleContext {
		public TerminalNode LEAVE() { return getToken(ContactParser.LEAVE, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Admin_leaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_leave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_leave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_leave(this);
		}
	}

	public final Admin_leaveContext admin_leave() throws RecognitionException {
		Admin_leaveContext _localctx = new Admin_leaveContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_admin_leave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(LEAVE);
			setState(336); match(STRING);
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

	public static class Admin_force_removeContext extends ParserRuleContext {
		public TerminalNode FORCE() { return getToken(ContactParser.FORCE, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public TerminalNode REMOVE() { return getToken(ContactParser.REMOVE, 0); }
		public Admin_force_removeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_force_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_force_remove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_force_remove(this);
		}
	}

	public final Admin_force_removeContext admin_force_remove() throws RecognitionException {
		Admin_force_removeContext _localctx = new Admin_force_removeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_admin_force_remove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(FORCE);
			setState(339); match(REMOVE);
			setState(340); match(STRING);
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

	public static class Admin_replaceContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(ContactParser.STRING, i);
		}
		public TerminalNode REPLACE() { return getToken(ContactParser.REPLACE, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
		public List<TerminalNode> STRING() { return getTokens(ContactParser.STRING); }
		public Admin_replaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_replace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_replace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_replace(this);
		}
	}

	public final Admin_replaceContext admin_replace() throws RecognitionException {
		Admin_replaceContext _localctx = new Admin_replaceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_admin_replace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(REPLACE);
			setState(343); match(STRING);
			setState(344); match(WITH);
			setState(345); match(STRING);
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

	public static class Admin_force_replaceContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(ContactParser.STRING, i);
		}
		public TerminalNode FORCE() { return getToken(ContactParser.FORCE, 0); }
		public TerminalNode REPLACE() { return getToken(ContactParser.REPLACE, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
		public List<TerminalNode> STRING() { return getTokens(ContactParser.STRING); }
		public Admin_force_replaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_force_replace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_force_replace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_force_replace(this);
		}
	}

	public final Admin_force_replaceContext admin_force_replace() throws RecognitionException {
		Admin_force_replaceContext _localctx = new Admin_force_replaceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_admin_force_replace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(FORCE);
			setState(348); match(REPLACE);
			setState(349); match(STRING);
			setState(350); match(WITH);
			setState(351); match(STRING);
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

	public static class Admin_planContext extends ParserRuleContext {
		public TerminalNode PLAN() { return getToken(ContactParser.PLAN, 0); }
		public Admin_planContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_plan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_plan(this);
		}
	}

	public final Admin_planContext admin_plan() throws RecognitionException {
		Admin_planContext _localctx = new Admin_planContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_admin_plan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(PLAN);
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

	public static class Admin_commitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(ContactParser.COMMIT, 0); }
		public Admin_commitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_commit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_commit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_commit(this);
		}
	}

	public final Admin_commitContext admin_commit() throws RecognitionException {
		Admin_commitContext _localctx = new Admin_commitContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_admin_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(COMMIT);
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

	public static class Admin_clearContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(ContactParser.CLEAR, 0); }
		public Admin_clearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_clear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_clear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_clear(this);
		}
	}

	public final Admin_clearContext admin_clear() throws RecognitionException {
		Admin_clearContext _localctx = new Admin_clearContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_admin_clear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(CLEAR);
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
		enterRule(_localctx, 82, RULE_loadscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(LOAD);
			setState(360); match(SCRIPT);
			setState(361); ((LoadscriptContext)_localctx).filename = match(STRING);
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
		enterRule(_localctx, 84, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(SCRIPT);
			setState(364);
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
		enterRule(_localctx, 86, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(366); ((PairContext)_localctx).name = match(STRING);
				}
				break;
			case ID:
				{
				setState(367); ((PairContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(370); match(EQUALS);
			setState(371); pairValue();
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
		enterRule(_localctx, 88, RULE_pairValue);
		try {
			setState(376);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PairStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373); ((PairStringValueContext)_localctx).stringValue = match(STRING);
				}
				break;
			case INT:
				_localctx = new PairIntValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(374); ((PairIntValueContext)_localctx).intValue = match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new PairBoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(375); ((PairBoolValueContext)_localctx).boolValue = bool();
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
		enterRule(_localctx, 90, RULE_code_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(JAVASCRIPT);
			setState(379);
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
		enterRule(_localctx, 92, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		"\2\3F\u0182\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2b\n\2\r\2\16"+
		"\2c\3\2\3\2\3\3\5\3i\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\3"+
		"\5\3v\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0081\n\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0098\n\n\3\n\5\n\u009b\n\n\3\13\3\13\3\13\3\13\5\13\u00a1\n"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00af\n"+
		"\17\f\17\16\17\u00b2\13\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00ba\n"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00c6\n\23"+
		"\f\23\16\23\u00c9\13\23\3\24\3\24\3\24\3\24\5\24\u00cf\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00dd\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ea\n\27\3\30"+
		"\3\30\3\30\3\30\5\30\u00f0\n\30\3\30\3\30\5\30\u00f4\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u00fb\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0102\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0109\n\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0110\n\31\3\31\3\31\3\31\3\31\5\31\u0116\n\31\3\32\3\32\5\32\u011a\n"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u0129\n\35\3\35\3\35\5\35\u012d\n\35\3\35\3\35\5\35\u0131\n\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u013e\n \3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u014d\n\"\3#\3#\3#\3$\3$\3$\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3+\3+\3,\3,\3,\3-\3-\5-\u0173\n-\3-\3-\3-\3.\3.\3.\5.\u017b\n.\3"+
		"/\3/\3/\3\60\3\60\3\60\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\7\3\21\22\3BC\3BC\3BC\3\"#\u0186"+
		"\2a\3\2\2\2\4h\3\2\2\2\6y\3\2\2\2\b\u0080\3\2\2\2\n\u0082\3\2\2\2\f\u0084"+
		"\3\2\2\2\16\u0088\3\2\2\2\20\u008d\3\2\2\2\22\u0097\3\2\2\2\24\u009c\3"+
		"\2\2\2\26\u00a2\3\2\2\2\30\u00a5\3\2\2\2\32\u00a8\3\2\2\2\34\u00ab\3\2"+
		"\2\2\36\u00b3\3\2\2\2 \u00b6\3\2\2\2\"\u00bf\3\2\2\2$\u00c7\3\2\2\2&\u00ce"+
		"\3\2\2\2(\u00d2\3\2\2\2*\u00d6\3\2\2\2,\u00d9\3\2\2\2.\u00eb\3\2\2\2\60"+
		"\u00fa\3\2\2\2\62\u0119\3\2\2\2\64\u011b\3\2\2\2\66\u011e\3\2\2\28\u0122"+
		"\3\2\2\2:\u0132\3\2\2\2<\u0135\3\2\2\2>\u013a\3\2\2\2@\u013f\3\2\2\2B"+
		"\u0142\3\2\2\2D\u014e\3\2\2\2F\u0151\3\2\2\2H\u0154\3\2\2\2J\u0158\3\2"+
		"\2\2L\u015d\3\2\2\2N\u0163\3\2\2\2P\u0165\3\2\2\2R\u0167\3\2\2\2T\u0169"+
		"\3\2\2\2V\u016d\3\2\2\2X\u0172\3\2\2\2Z\u017a\3\2\2\2\\\u017c\3\2\2\2"+
		"^\u017f\3\2\2\2`b\5\4\3\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2ef\7\1\2\2f\3\3\2\2\2gi\5\f\7\2hg\3\2\2\2hi\3\2\2\2ir\3\2\2\2js"+
		"\58\35\2ks\5.\30\2ls\5\16\b\2ms\5\22\n\2ns\5\26\f\2os\5\b\5\2ps\5\n\6"+
		"\2qs\5B\"\2rj\3\2\2\2rk\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2"+
		"\2rp\3\2\2\2rq\3\2\2\2su\3\2\2\2tv\5\6\4\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2"+
		"\2wx\7>\2\2x\5\3\2\2\2yz\7\66\2\2z{\7?\2\2{\7\3\2\2\2|\u0081\5> \2}\u0081"+
		"\5:\36\2~\u0081\5T+\2\177\u0081\5V,\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\t\3\2\2\2\u0082\u0083\7\r\2\2\u0083"+
		"\13\3\2\2\2\u0084\u0085\7\3\2\2\u0085\u0086\7?\2\2\u0086\u0087\7<\2\2"+
		"\u0087\r\3\2\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7\23\2\2\u008a\u008b"+
		"\7B\2\2\u008b\u008c\5\22\n\2\u008c\17\3\2\2\2\u008d\u008e\t\2\2\2\u008e"+
		"\21\3\2\2\2\u008f\u0098\5\36\20\2\u0090\u0098\5 \21\2\u0091\u0098\5*\26"+
		"\2\u0092\u0098\5,\27\2\u0093\u0098\5\30\r\2\u0094\u0098\5\32\16\2\u0095"+
		"\u0098\5\62\32\2\u0096\u0098\5\"\22\2\u0097\u008f\3\2\2\2\u0097\u0090"+
		"\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097"+
		"\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u009b\5\24\13\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\23\3\2\2\2\u009c\u009d\5\20\t\2\u009d\u00a0\7\24\2\2\u009e\u00a1\5\34"+
		"\17\2\u009f\u00a1\7?\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\25\3\2\2\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\7 \2\2\u00a4\27\3\2\2\2\u00a5"+
		"\u00a6\7\37\2\2\u00a6\u00a7\7!\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\26\2"+
		"\2\u00a9\u00aa\7!\2\2\u00aa\33\3\2\2\2\u00ab\u00b0\5X-\2\u00ac\u00ad\7"+
		"\67\2\2\u00ad\u00af\5X-\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b0\3\2\2"+
		"\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\7B\2\2\u00b5\37\3\2\2\2\u00b6\u00b9"+
		"\7\7\2\2\u00b7\u00ba\7B\2\2\u00b8\u00ba\7?\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5$\23\2\u00bc\u00bd\5\20"+
		"\t\2\u00bd\u00be\5&\24\2\u00be!\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0#\3\2"+
		"\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7\30\2\2\u00c3\u00c4\5X-\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8%\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cf"+
		"\7*\2\2\u00cb\u00cf\7)\2\2\u00cc\u00cf\7+\2\2\u00cd\u00cf\5(\25\2\u00ce"+
		"\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\t\3\2\2\u00d1\'\3\2\2\2\u00d2\u00d3"+
		"\7\13\2\2\u00d3\u00d4\7B\2\2\u00d4\u00d5\7\22\2\2\u00d5)\3\2\2\2\u00d6"+
		"\u00d7\7\t\2\2\u00d7\u00d8\7B\2\2\u00d8+\3\2\2\2\u00d9\u00dc\7\25\2\2"+
		"\u00da\u00db\7\22\2\2\u00db\u00dd\7\6\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5\20\t\2\u00df\u00e0\7\30\2\2"+
		"\u00e0\u00e9\7B\2\2\u00e1\u00e2\5\20\t\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4"+
		"\7B\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\7\27\2\2\u00e6\u00e7\7B\2\2\u00e7"+
		"\u00e8\7\31\2\2\u00e8\u00ea\7B\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2"+
		"\2\2\u00ea-\3\2\2\2\u00eb\u00f3\7\17\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00ef"+
		"\7B\2\2\u00ee\u00f0\5\60\31\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0\u00f4\3\2\2\2\u00f1\u00f2\7\f\2\2\u00f2\u00f4\7?\2\2\u00f3\u00ec"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4/\3\2\2\2\u00f5\u00f6\5\20\t\2\u00f6"+
		"\u00f7\7\6\2\2\u00f7\u00f8\7\24\2\2\u00f8\u00f9\5\34\17\2\u00f9\u00fb"+
		"\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0101\3\2\2\2\u00fc"+
		"\u00fd\5\20\t\2\u00fd\u00fe\7\7\2\2\u00fe\u00ff\7\24\2\2\u00ff\u0100\5"+
		"\34\17\2\u0100\u0102\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0108\3\2\2\2\u0103\u0104\5\20\t\2\u0104\u0105\7\t\2\2\u0105\u0106\7"+
		"\24\2\2\u0106\u0107\5\34\17\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u010f\3\2\2\2\u010a\u010b\5\20\t\2\u010b\u010c"+
		"\7\25\2\2\u010c\u010d\7\24\2\2\u010d\u010e\5\34\17\2\u010e\u0110\3\2\2"+
		"\2\u010f\u010a\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0115\3\2\2\2\u0111\u0112"+
		"\5\20\t\2\u0112\u0113\7\34\2\2\u0113\u0114\5\\/\2\u0114\u0116\3\2\2\2"+
		"\u0115\u0111\3\2\2\2\u0115\u0116\3\2\2\2\u0116\61\3\2\2\2\u0117\u011a"+
		"\5\64\33\2\u0118\u011a\5\66\34\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2"+
		"\2\u011a\63\3\2\2\2\u011b\u011c\7&\2\2\u011c\u011d\7\33\2\2\u011d\65\3"+
		"\2\2\2\u011e\u011f\7%\2\2\u011f\u0120\7\33\2\2\u0120\u0121\5\34\17\2\u0121"+
		"\67\3\2\2\2\u0122\u0123\7\16\2\2\u0123\u0124\7B\2\2\u0124\u0125\7\4\2"+
		"\2\u0125\u0128\7@\2\2\u0126\u0127\7\5\2\2\u0127\u0129\7@\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\7,\2\2\u012b"+
		"\u012d\7B\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012f\7(\2\2\u012f\u0131\7?\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u01319\3\2\2\2\u0132\u0133\7%\2\2\u0133\u0134\5<\37\2\u0134;"+
		"\3\2\2\2\u0135\u0136\7\'\2\2\u0136\u0137\7?\2\2\u0137\u0138\7\21\2\2\u0138"+
		"\u0139\5\\/\2\u0139=\3\2\2\2\u013a\u013d\7&\2\2\u013b\u013e\5@!\2\u013c"+
		"\u013e\7\23\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e?\3\2\2\2"+
		"\u013f\u0140\7\'\2\2\u0140\u0141\7?\2\2\u0141A\3\2\2\2\u0142\u0143\7-"+
		"\2\2\u0143\u014c\7?\2\2\u0144\u014d\5D#\2\u0145\u014d\5F$\2\u0146\u014d"+
		"\5H%\2\u0147\u014d\5J&\2\u0148\u014d\5L\'\2\u0149\u014d\5N(\2\u014a\u014d"+
		"\5P)\2\u014b\u014d\5R*\2\u014c\u0144\3\2\2\2\u014c\u0145\3\2\2\2\u014c"+
		"\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014dC\3\2\2\2\u014e\u014f"+
		"\7.\2\2\u014f\u0150\7B\2\2\u0150E\3\2\2\2\u0151\u0152\7/\2\2\u0152\u0153"+
		"\7B\2\2\u0153G\3\2\2\2\u0154\u0155\7\60\2\2\u0155\u0156\7\61\2\2\u0156"+
		"\u0157\7B\2\2\u0157I\3\2\2\2\u0158\u0159\7\62\2\2\u0159\u015a\7B\2\2\u015a"+
		"\u015b\7\21\2\2\u015b\u015c\7B\2\2\u015cK\3\2\2\2\u015d\u015e\7\60\2\2"+
		"\u015e\u015f\7\62\2\2\u015f\u0160\7B\2\2\u0160\u0161\7\21\2\2\u0161\u0162"+
		"\7B\2\2\u0162M\3\2\2\2\u0163\u0164\7\63\2\2\u0164O\3\2\2\2\u0165\u0166"+
		"\7\64\2\2\u0166Q\3\2\2\2\u0167\u0168\7\65\2\2\u0168S\3\2\2\2\u0169\u016a"+
		"\7\35\2\2\u016a\u016b\7\36\2\2\u016b\u016c\7B\2\2\u016cU\3\2\2\2\u016d"+
		"\u016e\7\36\2\2\u016e\u016f\t\4\2\2\u016fW\3\2\2\2\u0170\u0173\7B\2\2"+
		"\u0171\u0173\7?\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0175\7<\2\2\u0175\u0176\5Z.\2\u0176Y\3\2\2\2\u0177\u017b"+
		"\7B\2\2\u0178\u017b\7@\2\2\u0179\u017b\5^\60\2\u017a\u0177\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b[\3\2\2\2\u017c\u017d\7\32\2\2"+
		"\u017d\u017e\t\5\2\2\u017e]\3\2\2\2\u017f\u0180\t\6\2\2\u0180_\3\2\2\2"+
		"\37chru\u0080\u0097\u009a\u00a0\u00b0\u00b9\u00c7\u00ce\u00dc\u00e9\u00ef"+
		"\u00f3\u00fa\u0101\u0108\u010f\u0115\u0119\u0128\u012c\u0130\u013d\u014c"+
		"\u0172\u017a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}