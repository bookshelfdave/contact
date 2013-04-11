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
		LET=1, HTTP=2, FETCH=3, STORE=4, UPDATE=5, DELETE=6, VALUE=7, CONTENTTYPE=8, 
		CONN=9, CONNS=10, CONNECT=11, USE=12, USING=13, WITH=14, AND=15, BUCKET=16, 
		OPTIONS=17, QUERY2I=18, COUNT=19, FROM=20, INDEX=21, TO=22, JAVASCRIPT=23, 
		PROPERTIES=24, RESOLVER=25, LOAD=26, SCRIPT=27, LIST=28, BUCKETS=29, KEYS=30, 
		TRUE=31, FALSE=32, DEFAULT=33, SET=34, GET=35, ACTION=36, AS=37, JSON=38, 
		TEXT=39, XML=40, NODE=41, VERSIONS=42, DISCOVER=43, CLUSTER=44, ADMIN=45, 
		JOIN=46, LEAVE=47, FORCE=48, REMOVE=49, REPLACE=50, PLAN=51, COMMIT=52, 
		CLEAR=53, STATUS=54, AT=55, SPLAT=56, COMMA=57, LSQUARE=58, RSQUARE=59, 
		LPAREN=60, RPAREN=61, EQUALS=62, DOT=63, SEMI=64, ID=65, INT=66, FLOAT=67, 
		STRING=68, DATA_CONTENT=69, LINE_COMMENT=70, COMMENT=71, WS=72;
	public static final String[] tokenNames = {
		"<INVALID>", "'let'", "'http'", "'fetch'", "'store'", "'update'", "'delete'", 
		"'value'", "'content-type'", "'connection'", "'connections'", "'connect'", 
		"'use'", "'using'", "'with'", "'and'", "'bucket'", "'options'", "'query2i'", 
		"'count'", "'from'", "'index'", "'to'", "'javascript'", "'properties'", 
		"'resolver'", "'load'", "'script'", "'list'", "'buckets'", "'keys'", "'true'", 
		"'false'", "'default'", "'set'", "'get'", "'action'", "'as'", "'json'", 
		"'text'", "'xml'", "'node'", "'versions'", "'discover'", "'cluster'", 
		"'admin'", "'join'", "'leave'", "'force'", "'remove'", "'replace'", "'plan'", 
		"'commit'", "'clear'", "'status'", "'@'", "'*'", "','", "'['", "']'", 
		"'('", "')'", "'='", "'.'", "';'", "ID", "INT", "FLOAT", "STRING", "DATA_CONTENT", 
		"LINE_COMMENT", "COMMENT", "WS"
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
		RULE_get_action = 31, RULE_admin = 32, RULE_admin_status = 33, RULE_admin_join = 34, 
		RULE_admin_leave = 35, RULE_admin_force_remove = 36, RULE_admin_replace = 37, 
		RULE_admin_force_replace = 38, RULE_admin_plan = 39, RULE_admin_commit = 40, 
		RULE_admin_clear = 41, RULE_admin_versions = 42, RULE_admin_set = 43, 
		RULE_admin_get = 44, RULE_admin_discover = 45, RULE_clusterid = 46, RULE_noderef = 47, 
		RULE_loadscript = 48, RULE_script = 49, RULE_pair = 50, RULE_pairValue = 51, 
		RULE_code_string = 52, RULE_bool = 53;
	public static final String[] ruleNames = {
		"prog", "stat", "connection_selector", "console_op", "connections", "assignment", 
		"using", "with", "op_with_options", "options", "listbuckets", "listkeys", 
		"countkeys", "optionslist", "fetch", "store", "update", "store_indexes", 
		"content_string", "user_content", "delete", "query2i", "use", "useBucketOptions", 
		"bucketprops", "get_bucketprops", "set_bucketprops", "connect", "set", 
		"set_action", "get", "get_action", "admin", "admin_status", "admin_join", 
		"admin_leave", "admin_force_remove", "admin_replace", "admin_force_replace", 
		"admin_plan", "admin_commit", "admin_clear", "admin_versions", "admin_set", 
		"admin_get", "admin_discover", "clusterid", "noderef", "loadscript", "script", 
		"pair", "pairValue", "code_string", "bool"
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
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108); stat();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FETCH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CONNS) | (1L << CONNECT) | (1L << USE) | (1L << USING) | (1L << QUERY2I) | (1L << COUNT) | (1L << LOAD) | (1L << SCRIPT) | (1L << LIST) | (1L << SET) | (1L << GET) | (1L << ADMIN))) != 0) );
			setState(113); match(EOF);
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
			setState(116);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(115); assignment();
				}
			}

			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(118); connect();
				}
				break;

			case 2:
				{
				setState(119); use();
				}
				break;

			case 3:
				{
				setState(120); using();
				}
				break;

			case 4:
				{
				setState(121); op_with_options();
				}
				break;

			case 5:
				{
				setState(122); listbuckets();
				}
				break;

			case 6:
				{
				setState(123); console_op();
				}
				break;

			case 7:
				{
				setState(124); connections();
				}
				break;

			case 8:
				{
				setState(125); admin();
				}
				break;
			}
			setState(129);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(128); connection_selector();
				}
			}

			setState(131); match(SEMI);
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
			setState(133); match(AT);
			setState(134); ((Connection_selectorContext)_localctx).connname = match(ID);
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
			setState(140);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); get();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); set();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(138); loadscript();
				}
				break;
			case SCRIPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); script();
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
			setState(142); match(CONNS);
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
			setState(144); match(LET);
			setState(145); ((AssignmentContext)_localctx).name = match(ID);
			setState(146); match(EQUALS);
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
			setState(148); match(USING);
			setState(149); match(BUCKET);
			setState(150); ((UsingContext)_localctx).bucket = match(STRING);
			setState(151); op_with_options();
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
			setState(153);
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
			setState(163);
			switch (_input.LA(1)) {
			case FETCH:
				{
				setState(155); fetch();
				}
				break;
			case STORE:
				{
				setState(156); store();
				}
				break;
			case DELETE:
				{
				setState(157); delete();
				}
				break;
			case QUERY2I:
				{
				setState(158); query2i();
				}
				break;
			case LIST:
				{
				setState(159); listkeys();
				}
				break;
			case COUNT:
				{
				setState(160); countkeys();
				}
				break;
			case SET:
			case GET:
				{
				setState(161); bucketprops();
				}
				break;
			case UPDATE:
				{
				setState(162); update();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(166);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(165); options();
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
			setState(168); with();
			setState(169); match(OPTIONS);
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(170); optionslist();
				}
				break;

			case 2:
				{
				setState(171); match(ID);
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
			setState(174); match(LIST);
			setState(175); match(BUCKETS);
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
			setState(177); match(LIST);
			setState(178); match(KEYS);
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
			setState(180); match(COUNT);
			setState(181); match(KEYS);
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
			setState(183); ((OptionslistContext)_localctx).pair = pair();
			((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(184); match(COMMA);
				setState(185); ((OptionslistContext)_localctx).pair = pair();
				((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
				}
				}
				setState(190);
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
			setState(191); match(FETCH);
			setState(192); ((FetchContext)_localctx).key = match(STRING);
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
			setState(194); match(STORE);
			setState(197);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(195); ((StoreContext)_localctx).key = match(STRING);
				}
				break;
			case ID:
				{
				setState(196); ((StoreContext)_localctx).existing_obj = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199); store_indexes();
			setState(200); with();
			setState(201); content_string();
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
			setState(203); match(UPDATE);
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
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(205); with();
					setState(206); match(INDEX);
					setState(207); pair();
					}
					} 
				}
				setState(213);
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
			setState(218);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(214); match(TEXT);
				}
				break;
			case JSON:
				{
				setState(215); match(JSON);
				}
				break;
			case XML:
				{
				setState(216); match(XML);
				}
				break;
			case CONTENTTYPE:
				{
				setState(217); user_content();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
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
			setState(222); match(CONTENTTYPE);
			setState(223); ((User_contentContext)_localctx).content_type = match(STRING);
			setState(224); match(AND);
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
			setState(226); match(DELETE);
			setState(227); ((DeleteContext)_localctx).key = match(STRING);
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
			setState(229); match(QUERY2I);
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(230); match(AND);
				setState(231); match(FETCH);
				}
				break;
			}
			setState(234); with();
			setState(235); match(INDEX);
			setState(236); ((Query2iContext)_localctx).index = match(STRING);
			setState(245);
			switch (_input.LA(1)) {
			case WITH:
			case AND:
				{
				setState(237); with();
				setState(238); match(VALUE);
				setState(239); ((Query2iContext)_localctx).exact = match(STRING);
				}
				break;
			case FROM:
				{
				setState(241); match(FROM);
				setState(242); ((Query2iContext)_localctx).vmin = match(STRING);
				setState(243); match(TO);
				setState(244); ((Query2iContext)_localctx).vmax = match(STRING);
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
			setState(247); match(USE);
			setState(255);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				{
				setState(248); match(BUCKET);
				setState(249); ((UseContext)_localctx).name = match(STRING);
				setState(251);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(250); useBucketOptions();
					}
					break;
				}
				}
				}
				break;
			case CONN:
				{
				{
				setState(253); match(CONN);
				setState(254); ((UseContext)_localctx).var = match(ID);
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
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(257); with();
				setState(258); match(FETCH);
				setState(259); match(OPTIONS);
				setState(260); ((UseBucketOptionsContext)_localctx).fetchOptions = optionslist();
				}
				break;
			}
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(264); with();
				setState(265); match(STORE);
				setState(266); match(OPTIONS);
				setState(267); ((UseBucketOptionsContext)_localctx).storeOptions = optionslist();
				}
				break;
			}
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(271); with();
				setState(272); match(DELETE);
				setState(273); match(OPTIONS);
				setState(274); ((UseBucketOptionsContext)_localctx).deleteOptions = optionslist();
				}
				break;
			}
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(278); with();
				setState(279); match(QUERY2I);
				setState(280); match(OPTIONS);
				setState(281); ((UseBucketOptionsContext)_localctx).query2iOptions = optionslist();
				}
				break;
			}
			setState(289);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(285); with();
				setState(286); match(RESOLVER);
				setState(287); code_string();
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
			setState(293);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(291); get_bucketprops();
				}
				break;
			case SET:
				{
				setState(292); set_bucketprops();
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
			setState(295); match(GET);
			setState(296); match(PROPERTIES);
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
			setState(298); match(SET);
			setState(299); match(PROPERTIES);
			setState(300); optionslist();
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
		public Token httpport;
		public Token erlnode;
		public Token connname;
		public TerminalNode AS() { return getToken(ContactParser.AS, 0); }
		public TerminalNode INT() { return getToken(ContactParser.INT, 0); }
		public TerminalNode STRING(int i) {
			return getToken(ContactParser.STRING, i);
		}
		public TerminalNode HTTP() { return getToken(ContactParser.HTTP, 0); }
		public TerminalNode NODE() { return getToken(ContactParser.NODE, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode CONNECT() { return getToken(ContactParser.CONNECT, 0); }
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
			setState(302); match(CONNECT);
			setState(303); ((ConnectContext)_localctx).host = match(STRING);
			setState(306);
			_la = _input.LA(1);
			if (_la==HTTP) {
				{
				setState(304); match(HTTP);
				setState(305); ((ConnectContext)_localctx).httpport = match(INT);
				}
			}

			setState(310);
			_la = _input.LA(1);
			if (_la==NODE) {
				{
				setState(308); match(NODE);
				setState(309); ((ConnectContext)_localctx).erlnode = match(STRING);
				}
			}

			setState(314);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(312); match(AS);
				setState(313); ((ConnectContext)_localctx).connname = match(ID);
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
			setState(316); match(SET);
			setState(317); set_action();
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
			setState(319); match(ACTION);
			setState(320); ((Set_actionContext)_localctx).actionname = match(ID);
			setState(321); match(WITH);
			setState(322); code_string();
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
			setState(324); match(GET);
			setState(327);
			switch (_input.LA(1)) {
			case ACTION:
				{
				setState(325); get_action();
				}
				break;
			case BUCKET:
				{
				setState(326); match(BUCKET);
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
			setState(329); match(ACTION);
			setState(330); ((Get_actionContext)_localctx).actionname = match(ID);
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
		public Admin_discoverContext admin_discover() {
			return getRuleContext(Admin_discoverContext.class,0);
		}
		public Admin_getContext admin_get() {
			return getRuleContext(Admin_getContext.class,0);
		}
		public Admin_leaveContext admin_leave() {
			return getRuleContext(Admin_leaveContext.class,0);
		}
		public ClusteridContext clusterid() {
			return getRuleContext(ClusteridContext.class,0);
		}
		public Admin_force_removeContext admin_force_remove() {
			return getRuleContext(Admin_force_removeContext.class,0);
		}
		public Admin_versionsContext admin_versions() {
			return getRuleContext(Admin_versionsContext.class,0);
		}
		public Admin_statusContext admin_status() {
			return getRuleContext(Admin_statusContext.class,0);
		}
		public Admin_force_replaceContext admin_force_replace() {
			return getRuleContext(Admin_force_replaceContext.class,0);
		}
		public Admin_planContext admin_plan() {
			return getRuleContext(Admin_planContext.class,0);
		}
		public TerminalNode ADMIN() { return getToken(ContactParser.ADMIN, 0); }
		public Admin_commitContext admin_commit() {
			return getRuleContext(Admin_commitContext.class,0);
		}
		public Admin_joinContext admin_join() {
			return getRuleContext(Admin_joinContext.class,0);
		}
		public Admin_clearContext admin_clear() {
			return getRuleContext(Admin_clearContext.class,0);
		}
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public Admin_setContext admin_set() {
			return getRuleContext(Admin_setContext.class,0);
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
			setState(332); match(ADMIN);
			setState(335);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(333); ((AdminContext)_localctx).connid = match(ID);
				}
				break;
			case SPLAT:
				{
				setState(334); clusterid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(337); admin_join();
				}
				break;

			case 2:
				{
				setState(338); admin_leave();
				}
				break;

			case 3:
				{
				setState(339); admin_force_remove();
				}
				break;

			case 4:
				{
				setState(340); admin_replace();
				}
				break;

			case 5:
				{
				setState(341); admin_force_replace();
				}
				break;

			case 6:
				{
				setState(342); admin_plan();
				}
				break;

			case 7:
				{
				setState(343); admin_commit();
				}
				break;

			case 8:
				{
				setState(344); admin_clear();
				}
				break;

			case 9:
				{
				setState(345); admin_status();
				}
				break;

			case 10:
				{
				setState(346); admin_versions();
				}
				break;

			case 11:
				{
				setState(347); admin_set();
				}
				break;

			case 12:
				{
				setState(348); admin_get();
				}
				break;

			case 13:
				{
				setState(349); admin_discover();
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

	public static class Admin_statusContext extends ParserRuleContext {
		public TerminalNode STATUS() { return getToken(ContactParser.STATUS, 0); }
		public Admin_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_status(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_status(this);
		}
	}

	public final Admin_statusContext admin_status() throws RecognitionException {
		Admin_statusContext _localctx = new Admin_statusContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_admin_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(STATUS);
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
		public NoderefContext noderef() {
			return getRuleContext(NoderefContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(ContactParser.JOIN, 0); }
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
		enterRule(_localctx, 68, RULE_admin_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(JOIN);
			setState(355); noderef();
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
		public NoderefContext noderef() {
			return getRuleContext(NoderefContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_admin_leave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(LEAVE);
			setState(358); noderef();
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
		public NoderefContext noderef() {
			return getRuleContext(NoderefContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_admin_force_remove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(FORCE);
			setState(361); match(REMOVE);
			setState(362); noderef();
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
		public NoderefContext nodea;
		public NoderefContext nodeb;
		public NoderefContext noderef(int i) {
			return getRuleContext(NoderefContext.class,i);
		}
		public List<NoderefContext> noderef() {
			return getRuleContexts(NoderefContext.class);
		}
		public TerminalNode REPLACE() { return getToken(ContactParser.REPLACE, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
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
		enterRule(_localctx, 74, RULE_admin_replace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(REPLACE);
			setState(365); ((Admin_replaceContext)_localctx).nodea = noderef();
			setState(366); match(WITH);
			setState(367); ((Admin_replaceContext)_localctx).nodeb = noderef();
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
		public NoderefContext nodea;
		public NoderefContext nodeb;
		public NoderefContext noderef(int i) {
			return getRuleContext(NoderefContext.class,i);
		}
		public TerminalNode FORCE() { return getToken(ContactParser.FORCE, 0); }
		public List<NoderefContext> noderef() {
			return getRuleContexts(NoderefContext.class);
		}
		public TerminalNode REPLACE() { return getToken(ContactParser.REPLACE, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
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
		enterRule(_localctx, 76, RULE_admin_force_replace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); match(FORCE);
			setState(370); match(REPLACE);
			setState(371); ((Admin_force_replaceContext)_localctx).nodea = noderef();
			setState(372); match(WITH);
			setState(373); ((Admin_force_replaceContext)_localctx).nodeb = noderef();
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
		enterRule(_localctx, 78, RULE_admin_plan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(PLAN);
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
		enterRule(_localctx, 80, RULE_admin_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(COMMIT);
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
		enterRule(_localctx, 82, RULE_admin_clear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(CLEAR);
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

	public static class Admin_versionsContext extends ParserRuleContext {
		public TerminalNode VERSIONS() { return getToken(ContactParser.VERSIONS, 0); }
		public Admin_versionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_versions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_versions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_versions(this);
		}
	}

	public final Admin_versionsContext admin_versions() throws RecognitionException {
		Admin_versionsContext _localctx = new Admin_versionsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_admin_versions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(VERSIONS);
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

	public static class Admin_setContext extends ParserRuleContext {
		public Token app;
		public Token param;
		public TerminalNode ID(int i) {
			return getToken(ContactParser.ID, i);
		}
		public TerminalNode SET() { return getToken(ContactParser.SET, 0); }
		public TerminalNode INT() { return getToken(ContactParser.INT, 0); }
		public TerminalNode EQUALS() { return getToken(ContactParser.EQUALS, 0); }
		public List<TerminalNode> ID() { return getTokens(ContactParser.ID); }
		public TerminalNode DOT() { return getToken(ContactParser.DOT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Admin_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_set(this);
		}
	}

	public final Admin_setContext admin_set() throws RecognitionException {
		Admin_setContext _localctx = new Admin_setContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_admin_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(SET);
			setState(384); ((Admin_setContext)_localctx).app = match(ID);
			setState(385); match(DOT);
			setState(386); ((Admin_setContext)_localctx).param = match(ID);
			setState(387); match(EQUALS);
			setState(391);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				{
				setState(388); bool();
				}
				break;
			case STRING:
				{
				setState(389); match(STRING);
				}
				break;
			case INT:
				{
				setState(390); match(INT);
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

	public static class Admin_getContext extends ParserRuleContext {
		public Token app;
		public Token param;
		public TerminalNode ID(int i) {
			return getToken(ContactParser.ID, i);
		}
		public TerminalNode GET() { return getToken(ContactParser.GET, 0); }
		public List<TerminalNode> ID() { return getTokens(ContactParser.ID); }
		public TerminalNode DOT() { return getToken(ContactParser.DOT, 0); }
		public Admin_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_get(this);
		}
	}

	public final Admin_getContext admin_get() throws RecognitionException {
		Admin_getContext _localctx = new Admin_getContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_admin_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(GET);
			setState(394); ((Admin_getContext)_localctx).app = match(ID);
			setState(395); match(DOT);
			setState(396); ((Admin_getContext)_localctx).param = match(ID);
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

	public static class Admin_discoverContext extends ParserRuleContext {
		public TerminalNode CLUSTER() { return getToken(ContactParser.CLUSTER, 0); }
		public ClusteridContext clusterid() {
			return getRuleContext(ClusteridContext.class,0);
		}
		public TerminalNode DISCOVER() { return getToken(ContactParser.DISCOVER, 0); }
		public Admin_discoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_discover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAdmin_discover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAdmin_discover(this);
		}
	}

	public final Admin_discoverContext admin_discover() throws RecognitionException {
		Admin_discoverContext _localctx = new Admin_discoverContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_admin_discover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); match(DISCOVER);
			setState(399); match(CLUSTER);
			setState(400); clusterid();
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
		enterRule(_localctx, 92, RULE_clusterid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(SPLAT);
			setState(403); match(ID);
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
		enterRule(_localctx, 94, RULE_noderef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(405); ((NoderefContext)_localctx).nodename = match(STRING);
				}
				break;
			case ID:
				{
				setState(406); ((NoderefContext)_localctx).nodeid = match(ID);
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
		enterRule(_localctx, 96, RULE_loadscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(LOAD);
			setState(410); match(SCRIPT);
			setState(411); ((LoadscriptContext)_localctx).filename = match(STRING);
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
		enterRule(_localctx, 98, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(SCRIPT);
			setState(414);
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
		enterRule(_localctx, 100, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(416); ((PairContext)_localctx).name = match(STRING);
				}
				break;
			case ID:
				{
				setState(417); ((PairContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(420); match(EQUALS);
			setState(421); pairValue();
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
		enterRule(_localctx, 102, RULE_pairValue);
		try {
			setState(426);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PairStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(423); ((PairStringValueContext)_localctx).stringValue = match(STRING);
				}
				break;
			case INT:
				_localctx = new PairIntValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(424); ((PairIntValueContext)_localctx).intValue = match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new PairBoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(425); ((PairBoolValueContext)_localctx).boolValue = bool();
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
		enterRule(_localctx, 104, RULE_code_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(JAVASCRIPT);
			setState(429);
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
		enterRule(_localctx, 106, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		"\2\3J\u01b4\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\6\2p\n\2\r\2\16"+
		"\2q\3\2\3\2\3\3\5\3w\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0081\n\3"+
		"\3\3\5\3\u0084\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u008f\n\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00a6\n\n\3\n\5\n\u00a9\n\n\3\13\3\13\3\13\3\13\5\13"+
		"\u00af\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17"+
		"\u00bd\n\17\f\17\16\17\u00c0\13\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u00c8\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00d4"+
		"\n\23\f\23\16\23\u00d7\13\23\3\24\3\24\3\24\3\24\5\24\u00dd\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00eb\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f8\n\27"+
		"\3\30\3\30\3\30\3\30\5\30\u00fe\n\30\3\30\3\30\5\30\u0102\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u0109\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0110"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0117\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u011e\n\31\3\31\3\31\3\31\3\31\5\31\u0124\n\31\3\32\3\32\5\32\u0128"+
		"\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0135"+
		"\n\35\3\35\3\35\5\35\u0139\n\35\3\35\3\35\5\35\u013d\n\35\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u014a\n \3!\3!\3!\3\"\3\"\3\""+
		"\5\"\u0152\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0161\n\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u018a"+
		"\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\5\61\u019a\n\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\5\64\u01a5\n\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\5\65\u01ad\n\65\3\66\3\66\3\66\3\67\3\67\3\67\28"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjl\2\7\3\20\21\3FG\3FG\3FG\3!\"\u01ba\2o\3\2\2\2\4v\3"+
		"\2\2\2\6\u0087\3\2\2\2\b\u008e\3\2\2\2\n\u0090\3\2\2\2\f\u0092\3\2\2\2"+
		"\16\u0096\3\2\2\2\20\u009b\3\2\2\2\22\u00a5\3\2\2\2\24\u00aa\3\2\2\2\26"+
		"\u00b0\3\2\2\2\30\u00b3\3\2\2\2\32\u00b6\3\2\2\2\34\u00b9\3\2\2\2\36\u00c1"+
		"\3\2\2\2 \u00c4\3\2\2\2\"\u00cd\3\2\2\2$\u00d5\3\2\2\2&\u00dc\3\2\2\2"+
		"(\u00e0\3\2\2\2*\u00e4\3\2\2\2,\u00e7\3\2\2\2.\u00f9\3\2\2\2\60\u0108"+
		"\3\2\2\2\62\u0127\3\2\2\2\64\u0129\3\2\2\2\66\u012c\3\2\2\28\u0130\3\2"+
		"\2\2:\u013e\3\2\2\2<\u0141\3\2\2\2>\u0146\3\2\2\2@\u014b\3\2\2\2B\u014e"+
		"\3\2\2\2D\u0162\3\2\2\2F\u0164\3\2\2\2H\u0167\3\2\2\2J\u016a\3\2\2\2L"+
		"\u016e\3\2\2\2N\u0173\3\2\2\2P\u0179\3\2\2\2R\u017b\3\2\2\2T\u017d\3\2"+
		"\2\2V\u017f\3\2\2\2X\u0181\3\2\2\2Z\u018b\3\2\2\2\\\u0190\3\2\2\2^\u0194"+
		"\3\2\2\2`\u0199\3\2\2\2b\u019b\3\2\2\2d\u019f\3\2\2\2f\u01a4\3\2\2\2h"+
		"\u01ac\3\2\2\2j\u01ae\3\2\2\2l\u01b1\3\2\2\2np\5\4\3\2on\3\2\2\2pq\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\1\2\2t\3\3\2\2\2uw\5\f\7\2vu\3"+
		"\2\2\2vw\3\2\2\2w\u0080\3\2\2\2x\u0081\58\35\2y\u0081\5.\30\2z\u0081\5"+
		"\16\b\2{\u0081\5\22\n\2|\u0081\5\26\f\2}\u0081\5\b\5\2~\u0081\5\n\6\2"+
		"\177\u0081\5B\"\2\u0080x\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080{"+
		"\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2"+
		"\2\u0081\u0083\3\2\2\2\u0082\u0084\5\6\4\2\u0083\u0082\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7B\2\2\u0086\5\3\2\2\2\u0087"+
		"\u0088\79\2\2\u0088\u0089\7C\2\2\u0089\7\3\2\2\2\u008a\u008f\5> \2\u008b"+
		"\u008f\5:\36\2\u008c\u008f\5b\62\2\u008d\u008f\5d\63\2\u008e\u008a\3\2"+
		"\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\t\3\2\2\2\u0090\u0091\7\f\2\2\u0091\13\3\2\2\2\u0092\u0093\7\3\2\2\u0093"+
		"\u0094\7C\2\2\u0094\u0095\7@\2\2\u0095\r\3\2\2\2\u0096\u0097\7\17\2\2"+
		"\u0097\u0098\7\22\2\2\u0098\u0099\7F\2\2\u0099\u009a\5\22\n\2\u009a\17"+
		"\3\2\2\2\u009b\u009c\t\2\2\2\u009c\21\3\2\2\2\u009d\u00a6\5\36\20\2\u009e"+
		"\u00a6\5 \21\2\u009f\u00a6\5*\26\2\u00a0\u00a6\5,\27\2\u00a1\u00a6\5\30"+
		"\r\2\u00a2\u00a6\5\32\16\2\u00a3\u00a6\5\62\32\2\u00a4\u00a6\5\"\22\2"+
		"\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0"+
		"\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a7\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00ab\5\20\t\2\u00ab"+
		"\u00ae\7\23\2\2\u00ac\u00af\5\34\17\2\u00ad\u00af\7C\2\2\u00ae\u00ac\3"+
		"\2\2\2\u00ae\u00ad\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00b1\7\36\2\2\u00b1"+
		"\u00b2\7\37\2\2\u00b2\27\3\2\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00b5\7 \2"+
		"\2\u00b5\31\3\2\2\2\u00b6\u00b7\7\25\2\2\u00b7\u00b8\7 \2\2\u00b8\33\3"+
		"\2\2\2\u00b9\u00be\5f\64\2\u00ba\u00bb\7;\2\2\u00bb\u00bd\5f\64\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\35\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\5\2\2\u00c2\u00c3"+
		"\7F\2\2\u00c3\37\3\2\2\2\u00c4\u00c7\7\6\2\2\u00c5\u00c8\7F\2\2\u00c6"+
		"\u00c8\7C\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\5\20\t\2\u00cb\u00cc\5&\24\2\u00cc"+
		"!\3\2\2\2\u00cd\u00ce\7\7\2\2\u00ce#\3\2\2\2\u00cf\u00d0\5\20\t\2\u00d0"+
		"\u00d1\7\27\2\2\u00d1\u00d2\5f\64\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3"+
		"\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"%\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dd\7)\2\2\u00d9\u00dd\7(\2\2\u00da"+
		"\u00dd\7*\2\2\u00db\u00dd\5(\25\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\t\3\2\2\u00df\'\3\2\2\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\7F\2\2"+
		"\u00e2\u00e3\7\21\2\2\u00e3)\3\2\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\7"+
		"F\2\2\u00e6+\3\2\2\2\u00e7\u00ea\7\24\2\2\u00e8\u00e9\7\21\2\2\u00e9\u00eb"+
		"\7\5\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\5\20\t\2\u00ed\u00ee\7\27\2\2\u00ee\u00f7\7F\2\2\u00ef\u00f0\5"+
		"\20\t\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2\7F\2\2\u00f2\u00f8\3\2\2\2\u00f3"+
		"\u00f4\7\26\2\2\u00f4\u00f5\7F\2\2\u00f5\u00f6\7\30\2\2\u00f6\u00f8\7"+
		"F\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8-\3\2\2\2\u00f9\u0101"+
		"\7\16\2\2\u00fa\u00fb\7\22\2\2\u00fb\u00fd\7F\2\2\u00fc\u00fe\5\60\31"+
		"\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u0100"+
		"\7\13\2\2\u0100\u0102\7C\2\2\u0101\u00fa\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"/\3\2\2\2\u0103\u0104\5\20\t\2\u0104\u0105\7\5\2\2\u0105\u0106\7\23\2"+
		"\2\u0106\u0107\5\34\17\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010f\3\2\2\2\u010a\u010b\5\20\t\2\u010b\u010c\7"+
		"\6\2\2\u010c\u010d\7\23\2\2\u010d\u010e\5\34\17\2\u010e\u0110\3\2\2\2"+
		"\u010f\u010a\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0116\3\2\2\2\u0111\u0112"+
		"\5\20\t\2\u0112\u0113\7\b\2\2\u0113\u0114\7\23\2\2\u0114\u0115\5\34\17"+
		"\2\u0115\u0117\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011d"+
		"\3\2\2\2\u0118\u0119\5\20\t\2\u0119\u011a\7\24\2\2\u011a\u011b\7\23\2"+
		"\2\u011b\u011c\5\34\17\2\u011c\u011e\3\2\2\2\u011d\u0118\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0123\3\2\2\2\u011f\u0120\5\20\t\2\u0120\u0121\7"+
		"\33\2\2\u0121\u0122\5j\66\2\u0122\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\61\3\2\2\2\u0125\u0128\5\64\33\2\u0126\u0128\5\66"+
		"\34\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\63\3\2\2\2\u0129\u012a"+
		"\7%\2\2\u012a\u012b\7\32\2\2\u012b\65\3\2\2\2\u012c\u012d\7$\2\2\u012d"+
		"\u012e\7\32\2\2\u012e\u012f\5\34\17\2\u012f\67\3\2\2\2\u0130\u0131\7\r"+
		"\2\2\u0131\u0134\7F\2\2\u0132\u0133\7\4\2\2\u0133\u0135\7D\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0137\7+\2\2\u0137"+
		"\u0139\7F\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2"+
		"\2\2\u013a\u013b\7\'\2\2\u013b\u013d\7C\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d9\3\2\2\2\u013e\u013f\7$\2\2\u013f\u0140\5<\37\2\u0140"+
		";\3\2\2\2\u0141\u0142\7&\2\2\u0142\u0143\7C\2\2\u0143\u0144\7\20\2\2\u0144"+
		"\u0145\5j\66\2\u0145=\3\2\2\2\u0146\u0149\7%\2\2\u0147\u014a\5@!\2\u0148"+
		"\u014a\7\22\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a?\3\2\2\2"+
		"\u014b\u014c\7&\2\2\u014c\u014d\7C\2\2\u014dA\3\2\2\2\u014e\u0151\7/\2"+
		"\2\u014f\u0152\7C\2\2\u0150\u0152\5^\60\2\u0151\u014f\3\2\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0160\3\2\2\2\u0153\u0161\5F$\2\u0154\u0161\5H%\2\u0155"+
		"\u0161\5J&\2\u0156\u0161\5L\'\2\u0157\u0161\5N(\2\u0158\u0161\5P)\2\u0159"+
		"\u0161\5R*\2\u015a\u0161\5T+\2\u015b\u0161\5D#\2\u015c\u0161\5V,\2\u015d"+
		"\u0161\5X-\2\u015e\u0161\5Z.\2\u015f\u0161\5\\/\2\u0160\u0153\3\2\2\2"+
		"\u0160\u0154\3\2\2\2\u0160\u0155\3\2\2\2\u0160\u0156\3\2\2\2\u0160\u0157"+
		"\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a\3\2\2\2\u0160"+
		"\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u015f\3\2\2\2\u0161C\3\2\2\2\u0162\u0163\78\2\2\u0163E\3\2"+
		"\2\2\u0164\u0165\7\60\2\2\u0165\u0166\5`\61\2\u0166G\3\2\2\2\u0167\u0168"+
		"\7\61\2\2\u0168\u0169\5`\61\2\u0169I\3\2\2\2\u016a\u016b\7\62\2\2\u016b"+
		"\u016c\7\63\2\2\u016c\u016d\5`\61\2\u016dK\3\2\2\2\u016e\u016f\7\64\2"+
		"\2\u016f\u0170\5`\61\2\u0170\u0171\7\20\2\2\u0171\u0172\5`\61\2\u0172"+
		"M\3\2\2\2\u0173\u0174\7\62\2\2\u0174\u0175\7\64\2\2\u0175\u0176\5`\61"+
		"\2\u0176\u0177\7\20\2\2\u0177\u0178\5`\61\2\u0178O\3\2\2\2\u0179\u017a"+
		"\7\65\2\2\u017aQ\3\2\2\2\u017b\u017c\7\66\2\2\u017cS\3\2\2\2\u017d\u017e"+
		"\7\67\2\2\u017eU\3\2\2\2\u017f\u0180\7,\2\2\u0180W\3\2\2\2\u0181\u0182"+
		"\7$\2\2\u0182\u0183\7C\2\2\u0183\u0184\7A\2\2\u0184\u0185\7C\2\2\u0185"+
		"\u0189\7@\2\2\u0186\u018a\5l\67\2\u0187\u018a\7F\2\2\u0188\u018a\7D\2"+
		"\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aY"+
		"\3\2\2\2\u018b\u018c\7%\2\2\u018c\u018d\7C\2\2\u018d\u018e\7A\2\2\u018e"+
		"\u018f\7C\2\2\u018f[\3\2\2\2\u0190\u0191\7-\2\2\u0191\u0192\7.\2\2\u0192"+
		"\u0193\5^\60\2\u0193]\3\2\2\2\u0194\u0195\7:\2\2\u0195\u0196\7C\2\2\u0196"+
		"_\3\2\2\2\u0197\u019a\7F\2\2\u0198\u019a\7C\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u0198\3\2\2\2\u019aa\3\2\2\2\u019b\u019c\7\34\2\2\u019c\u019d\7\35\2"+
		"\2\u019d\u019e\7F\2\2\u019ec\3\2\2\2\u019f\u01a0\7\35\2\2\u01a0\u01a1"+
		"\t\4\2\2\u01a1e\3\2\2\2\u01a2\u01a5\7F\2\2\u01a3\u01a5\7C\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7@\2\2\u01a7"+
		"\u01a8\5h\65\2\u01a8g\3\2\2\2\u01a9\u01ad\7F\2\2\u01aa\u01ad\7D\2\2\u01ab"+
		"\u01ad\5l\67\2\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2"+
		"\2\2\u01adi\3\2\2\2\u01ae\u01af\7\31\2\2\u01af\u01b0\t\5\2\2\u01b0k\3"+
		"\2\2\2\u01b1\u01b2\t\6\2\2\u01b2m\3\2\2\2\"qv\u0080\u0083\u008e\u00a5"+
		"\u00a8\u00ae\u00be\u00c7\u00d5\u00dc\u00ea\u00f7\u00fd\u0101\u0108\u010f"+
		"\u0116\u011d\u0123\u0127\u0134\u0138\u013c\u0149\u0151\u0160\u0189\u0199"+
		"\u01a4\u01ac";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}