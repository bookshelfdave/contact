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
		RULE_countkeys = 12, RULE_optionslist = 13, RULE_fetch = 14, RULE_fetch_select = 15, 
		RULE_id_list = 16, RULE_store = 17, RULE_update = 18, RULE_store_indexes = 19, 
		RULE_content_string = 20, RULE_user_content = 21, RULE_delete = 22, RULE_query2i = 23, 
		RULE_use = 24, RULE_useBucketOptions = 25, RULE_bucketprops = 26, RULE_get_bucketprops = 27, 
		RULE_set_bucketprops = 28, RULE_connect = 29, RULE_set = 30, RULE_set_action = 31, 
		RULE_get = 32, RULE_get_action = 33, RULE_node_name = 34, RULE_clusterid = 35, 
		RULE_noderef = 36, RULE_loadscript = 37, RULE_script = 38, RULE_pair = 39, 
		RULE_pairValue = 40, RULE_code_string = 41, RULE_bool = 42;
	public static final String[] ruleNames = {
		"prog", "stat", "connection_selector", "console_op", "connections", "assignment", 
		"using", "with", "op_with_options", "options", "listbuckets", "listkeys", 
		"countkeys", "optionslist", "fetch", "fetch_select", "id_list", "store", 
		"update", "store_indexes", "content_string", "user_content", "delete", 
		"query2i", "use", "useBucketOptions", "bucketprops", "get_bucketprops", 
		"set_bucketprops", "connect", "set", "set_action", "get", "get_action", 
		"node_name", "clusterid", "noderef", "loadscript", "script", "pair", "pairValue", 
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FETCH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CONNS) | (1L << CONNECT) | (1L << USE) | (1L << USING) | (1L << QUERY2I) | (1L << COUNT) | (1L << LOAD) | (1L << SCRIPT) | (1L << LIST) | (1L << SET) | (1L << GET))) != 0)) {
				{
				{
				setState(86); stat();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); match(EOF);
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
			setState(95);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(94); assignment();
				}
			}

			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(97); connect();
				}
				break;

			case 2:
				{
				setState(98); use();
				}
				break;

			case 3:
				{
				setState(99); using();
				}
				break;

			case 4:
				{
				setState(100); op_with_options();
				}
				break;

			case 5:
				{
				setState(101); listbuckets();
				}
				break;

			case 6:
				{
				setState(102); console_op();
				}
				break;

			case 7:
				{
				setState(103); connections();
				}
				break;
			}
			setState(107);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(106); connection_selector();
				}
			}

			setState(109); match(SEMI);
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
			setState(111); match(AT);
			setState(112); ((Connection_selectorContext)_localctx).connname = node_name();
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
			setState(118);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); get();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); set();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); loadscript();
				}
				break;
			case SCRIPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(117); script();
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
			setState(120); match(CONNS);
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
			setState(122); match(LET);
			setState(123); ((AssignmentContext)_localctx).name = match(ID);
			setState(124); match(EQUALS);
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
			setState(126); match(USING);
			setState(127); match(BUCKET);
			setState(128); ((UsingContext)_localctx).bucket = match(STRING);
			setState(129); op_with_options();
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
			setState(131);
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
			setState(141);
			switch (_input.LA(1)) {
			case FETCH:
				{
				setState(133); fetch();
				}
				break;
			case STORE:
				{
				setState(134); store();
				}
				break;
			case DELETE:
				{
				setState(135); delete();
				}
				break;
			case QUERY2I:
				{
				setState(136); query2i();
				}
				break;
			case LIST:
				{
				setState(137); listkeys();
				}
				break;
			case COUNT:
				{
				setState(138); countkeys();
				}
				break;
			case SET:
			case GET:
				{
				setState(139); bucketprops();
				}
				break;
			case UPDATE:
				{
				setState(140); update();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(144);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(143); options();
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
			setState(146); with();
			setState(147); match(OPTIONS);
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(148); optionslist();
				}
				break;

			case 2:
				{
				setState(149); match(ID);
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
			setState(152); match(LIST);
			setState(153); match(BUCKETS);
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
			setState(155); match(LIST);
			setState(156); match(KEYS);
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
			setState(158); match(COUNT);
			setState(159); match(KEYS);
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
			setState(161); ((OptionslistContext)_localctx).pair = pair();
			((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162); match(COMMA);
				setState(163); ((OptionslistContext)_localctx).pair = pair();
				((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
				}
				}
				setState(168);
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
		public Fetch_selectContext fetch_select() {
			return getRuleContext(Fetch_selectContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(FETCH);
			setState(171);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(170); fetch_select();
				}
			}

			setState(173); ((FetchContext)_localctx).key = match(STRING);
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

	public static class Fetch_selectContext extends ParserRuleContext {
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Fetch_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterFetch_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitFetch_select(this);
		}
	}

	public final Fetch_selectContext fetch_select() throws RecognitionException {
		Fetch_selectContext _localctx = new Fetch_selectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fetch_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); id_list();
			setState(176); with();
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

	public static class Id_listContext extends ParserRuleContext {
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public TerminalNode ID(int i) {
			return getToken(ContactParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ContactParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(ContactParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(ContactParser.COMMA); }
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); ((Id_listContext)_localctx).ID = match(ID);
			((Id_listContext)_localctx).ids.add(((Id_listContext)_localctx).ID);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179); match(COMMA);
				setState(180); ((Id_listContext)_localctx).ID = match(ID);
				((Id_listContext)_localctx).ids.add(((Id_listContext)_localctx).ID);
				}
				}
				setState(185);
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
		enterRule(_localctx, 34, RULE_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(STORE);
			setState(189);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(187); ((StoreContext)_localctx).key = match(STRING);
				}
				break;
			case ID:
				{
				setState(188); ((StoreContext)_localctx).existing_obj = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191); store_indexes();
			setState(192); with();
			setState(193); content_string();
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
		enterRule(_localctx, 36, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(UPDATE);
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
		enterRule(_localctx, 38, RULE_store_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); with();
					setState(198); match(INDEX);
					setState(199); pair();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 40, RULE_content_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(206); match(TEXT);
				}
				break;
			case JSON:
				{
				setState(207); match(JSON);
				}
				break;
			case XML:
				{
				setState(208); match(XML);
				}
				break;
			case CONTENTTYPE:
				{
				setState(209); user_content();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
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
		enterRule(_localctx, 42, RULE_user_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(CONTENTTYPE);
			setState(215); ((User_contentContext)_localctx).content_type = match(STRING);
			setState(216); match(AND);
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
		enterRule(_localctx, 44, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(DELETE);
			setState(219); ((DeleteContext)_localctx).key = match(STRING);
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
		enterRule(_localctx, 46, RULE_query2i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(QUERY2I);
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(222); match(AND);
				setState(223); match(FETCH);
				}
				break;
			}
			setState(226); with();
			setState(227); match(INDEX);
			setState(228); ((Query2iContext)_localctx).index = match(STRING);
			setState(237);
			switch (_input.LA(1)) {
			case WITH:
			case AND:
				{
				setState(229); with();
				setState(230); match(VALUE);
				setState(231); ((Query2iContext)_localctx).exact = match(STRING);
				}
				break;
			case FROM:
				{
				setState(233); match(FROM);
				setState(234); ((Query2iContext)_localctx).vmin = match(STRING);
				setState(235); match(TO);
				setState(236); ((Query2iContext)_localctx).vmax = match(STRING);
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
		enterRule(_localctx, 48, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(USE);
			setState(247);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				{
				setState(240); match(BUCKET);
				setState(241); ((UseContext)_localctx).name = match(STRING);
				setState(243);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(242); useBucketOptions();
					}
					break;
				}
				}
				}
				break;
			case CONN:
				{
				{
				setState(245); match(CONN);
				setState(246); ((UseContext)_localctx).var = match(ID);
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
		enterRule(_localctx, 50, RULE_useBucketOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(249); with();
				setState(250); match(FETCH);
				setState(251); match(OPTIONS);
				setState(252); ((UseBucketOptionsContext)_localctx).fetchOptions = optionslist();
				}
				break;
			}
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(256); with();
				setState(257); match(STORE);
				setState(258); match(OPTIONS);
				setState(259); ((UseBucketOptionsContext)_localctx).storeOptions = optionslist();
				}
				break;
			}
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(263); with();
				setState(264); match(DELETE);
				setState(265); match(OPTIONS);
				setState(266); ((UseBucketOptionsContext)_localctx).deleteOptions = optionslist();
				}
				break;
			}
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(270); with();
				setState(271); match(QUERY2I);
				setState(272); match(OPTIONS);
				setState(273); ((UseBucketOptionsContext)_localctx).query2iOptions = optionslist();
				}
				break;
			}
			setState(281);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(277); with();
				setState(278); match(RESOLVER);
				setState(279); code_string();
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
		enterRule(_localctx, 52, RULE_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(283); get_bucketprops();
				}
				break;
			case SET:
				{
				setState(284); set_bucketprops();
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
		enterRule(_localctx, 54, RULE_get_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(GET);
			setState(288); match(PROPERTIES);
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
		enterRule(_localctx, 56, RULE_set_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(SET);
			setState(291); match(PROPERTIES);
			setState(292); optionslist();
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
		enterRule(_localctx, 58, RULE_connect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(CONNECT);
			setState(295); ((ConnectContext)_localctx).host = match(STRING);
			setState(298);
			_la = _input.LA(1);
			if (_la==PB) {
				{
				setState(296); match(PB);
				setState(297); ((ConnectContext)_localctx).pbport = match(INT);
				}
			}

			setState(302);
			_la = _input.LA(1);
			if (_la==HTTP) {
				{
				setState(300); match(HTTP);
				setState(301); ((ConnectContext)_localctx).httpport = match(INT);
				}
			}

			setState(306);
			_la = _input.LA(1);
			if (_la==NODE) {
				{
				setState(304); match(NODE);
				setState(305); ((ConnectContext)_localctx).erlnode = match(STRING);
				}
			}

			setState(310);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(308); match(AS);
				setState(309); ((ConnectContext)_localctx).connname = node_name();
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
		enterRule(_localctx, 60, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(SET);
			setState(313); set_action();
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
		enterRule(_localctx, 62, RULE_set_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(ACTION);
			setState(316); ((Set_actionContext)_localctx).actionname = match(ID);
			setState(317); match(WITH);
			setState(318); code_string();
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
		enterRule(_localctx, 64, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(GET);
			setState(323);
			switch (_input.LA(1)) {
			case ACTION:
				{
				setState(321); get_action();
				}
				break;
			case BUCKET:
				{
				setState(322); match(BUCKET);
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
		enterRule(_localctx, 66, RULE_get_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(ACTION);
			setState(326); ((Get_actionContext)_localctx).actionname = match(ID);
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
		enterRule(_localctx, 68, RULE_node_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(DOLLAR);
			setState(329); match(ID);
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
		enterRule(_localctx, 70, RULE_clusterid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(SPLAT);
			setState(332); match(ID);
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
		enterRule(_localctx, 72, RULE_noderef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(334); ((NoderefContext)_localctx).nodename = match(STRING);
				}
				break;
			case ID:
				{
				setState(335); ((NoderefContext)_localctx).nodeid = match(ID);
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
		enterRule(_localctx, 74, RULE_loadscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(LOAD);
			setState(339); match(SCRIPT);
			setState(340); ((LoadscriptContext)_localctx).filename = match(STRING);
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
		enterRule(_localctx, 76, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(SCRIPT);
			setState(343);
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
		enterRule(_localctx, 78, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(345); ((PairContext)_localctx).name = match(STRING);
				}
				break;
			case ID:
				{
				setState(346); ((PairContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(349); match(EQUALS);
			setState(350); pairValue();
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
		enterRule(_localctx, 80, RULE_pairValue);
		try {
			setState(355);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PairStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352); ((PairStringValueContext)_localctx).stringValue = match(STRING);
				}
				break;
			case INT:
				_localctx = new PairIntValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353); ((PairIntValueContext)_localctx).intValue = match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new PairBoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354); ((PairBoolValueContext)_localctx).boolValue = bool();
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
		enterRule(_localctx, 82, RULE_code_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(JAVASCRIPT);
			setState(358);
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
		enterRule(_localctx, 84, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		"\2\3L\u016d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\3\5\3b\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3k\n\3\3\3\5\3n\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\5\5y\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\n\5\n\u0093"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\7\17\u00a7\n\17\f\17\16\17\u00aa\13\17\3\20"+
		"\3\20\5\20\u00ae\n\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00b8"+
		"\n\22\f\22\16\22\u00bb\13\22\3\23\3\23\3\23\5\23\u00c0\n\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00cc\n\25\f\25\16\25\u00cf"+
		"\13\25\3\26\3\26\3\26\3\26\5\26\u00d5\n\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u00e3\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f0\n\31\3\32\3\32\3\32\3\32"+
		"\5\32\u00f6\n\32\3\32\3\32\5\32\u00fa\n\32\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0101\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0108\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u010f\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0116\n\33\3"+
		"\33\3\33\3\33\3\33\5\33\u011c\n\33\3\34\3\34\5\34\u0120\n\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u012d\n\37\3\37\3\37"+
		"\5\37\u0131\n\37\3\37\3\37\5\37\u0135\n\37\3\37\3\37\5\37\u0139\n\37\3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u0146\n\"\3#\3#\3#\3$\3$\3$\3%"+
		"\3%\3%\3&\3&\5&\u0153\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\5)\u015e\n)\3"+
		")\3)\3)\3*\3*\3*\5*\u0166\n*\3+\3+\3+\3,\3,\3,\2-\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\7\3\21\22\3"+
		"HI\3HI\3HI\3\"#\u0171\2[\3\2\2\2\4a\3\2\2\2\6q\3\2\2\2\bx\3\2\2\2\nz\3"+
		"\2\2\2\f|\3\2\2\2\16\u0080\3\2\2\2\20\u0085\3\2\2\2\22\u008f\3\2\2\2\24"+
		"\u0094\3\2\2\2\26\u009a\3\2\2\2\30\u009d\3\2\2\2\32\u00a0\3\2\2\2\34\u00a3"+
		"\3\2\2\2\36\u00ab\3\2\2\2 \u00b1\3\2\2\2\"\u00b4\3\2\2\2$\u00bc\3\2\2"+
		"\2&\u00c5\3\2\2\2(\u00cd\3\2\2\2*\u00d4\3\2\2\2,\u00d8\3\2\2\2.\u00dc"+
		"\3\2\2\2\60\u00df\3\2\2\2\62\u00f1\3\2\2\2\64\u0100\3\2\2\2\66\u011f\3"+
		"\2\2\28\u0121\3\2\2\2:\u0124\3\2\2\2<\u0128\3\2\2\2>\u013a\3\2\2\2@\u013d"+
		"\3\2\2\2B\u0142\3\2\2\2D\u0147\3\2\2\2F\u014a\3\2\2\2H\u014d\3\2\2\2J"+
		"\u0152\3\2\2\2L\u0154\3\2\2\2N\u0158\3\2\2\2P\u015d\3\2\2\2R\u0165\3\2"+
		"\2\2T\u0167\3\2\2\2V\u016a\3\2\2\2XZ\5\4\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\1\2\2_\3\3\2\2\2`b\5\f\7\2a`"+
		"\3\2\2\2ab\3\2\2\2bj\3\2\2\2ck\5<\37\2dk\5\62\32\2ek\5\16\b\2fk\5\22\n"+
		"\2gk\5\26\f\2hk\5\b\5\2ik\5\n\6\2jc\3\2\2\2jd\3\2\2\2je\3\2\2\2jf\3\2"+
		"\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2km\3\2\2\2ln\5\6\4\2ml\3\2\2\2mn\3\2"+
		"\2\2no\3\2\2\2op\7D\2\2p\5\3\2\2\2qr\7:\2\2rs\5F$\2s\7\3\2\2\2ty\5B\""+
		"\2uy\5> \2vy\5L\'\2wy\5N(\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\t"+
		"\3\2\2\2z{\7\r\2\2{\13\3\2\2\2|}\7\3\2\2}~\7E\2\2~\177\7B\2\2\177\r\3"+
		"\2\2\2\u0080\u0081\7\20\2\2\u0081\u0082\7\23\2\2\u0082\u0083\7H\2\2\u0083"+
		"\u0084\5\22\n\2\u0084\17\3\2\2\2\u0085\u0086\t\2\2\2\u0086\21\3\2\2\2"+
		"\u0087\u0090\5\36\20\2\u0088\u0090\5$\23\2\u0089\u0090\5.\30\2\u008a\u0090"+
		"\5\60\31\2\u008b\u0090\5\30\r\2\u008c\u0090\5\32\16\2\u008d\u0090\5\66"+
		"\34\2\u008e\u0090\5&\24\2\u008f\u0087\3\2\2\2\u008f\u0088\3\2\2\2\u008f"+
		"\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u0093\5\24\13\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2"+
		"\2\2\u0094\u0095\5\20\t\2\u0095\u0098\7\24\2\2\u0096\u0099\5\34\17\2\u0097"+
		"\u0099\7E\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\25\3\2\2\2"+
		"\u009a\u009b\7\37\2\2\u009b\u009c\7 \2\2\u009c\27\3\2\2\2\u009d\u009e"+
		"\7\37\2\2\u009e\u009f\7!\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\26\2\2\u00a1"+
		"\u00a2\7!\2\2\u00a2\33\3\2\2\2\u00a3\u00a8\5P)\2\u00a4\u00a5\7=\2\2\u00a5"+
		"\u00a7\5P)\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2"+
		"\2\u00a8\u00a9\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad"+
		"\7\6\2\2\u00ac\u00ae\5 \21\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\7H\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\5\"\22"+
		"\2\u00b2\u00b3\5\20\t\2\u00b3!\3\2\2\2\u00b4\u00b9\7E\2\2\u00b5\u00b6"+
		"\7=\2\2\u00b6\u00b8\7E\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba#\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\u00bf\7\7\2\2\u00bd\u00c0\7H\2\2\u00be\u00c0\7E\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5(\25\2\u00c2"+
		"\u00c3\5\20\t\2\u00c3\u00c4\5*\26\2\u00c4%\3\2\2\2\u00c5\u00c6\7\b\2\2"+
		"\u00c6\'\3\2\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00c9\7\30\2\2\u00c9\u00ca"+
		"\5P)\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00cd\3\2\2\2"+
		"\u00d0\u00d5\7*\2\2\u00d1\u00d5\7)\2\2\u00d2\u00d5\7+\2\2\u00d3\u00d5"+
		"\5,\27\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7+\3\2\2\2"+
		"\u00d8\u00d9\7\13\2\2\u00d9\u00da\7H\2\2\u00da\u00db\7\22\2\2\u00db-\3"+
		"\2\2\2\u00dc\u00dd\7\t\2\2\u00dd\u00de\7H\2\2\u00de/\3\2\2\2\u00df\u00e2"+
		"\7\25\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e3\7\6\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5\20\t\2\u00e5\u00e6"+
		"\7\30\2\2\u00e6\u00ef\7H\2\2\u00e7\u00e8\5\20\t\2\u00e8\u00e9\7\n\2\2"+
		"\u00e9\u00ea\7H\2\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00ed"+
		"\7H\2\2\u00ed\u00ee\7\31\2\2\u00ee\u00f0\7H\2\2\u00ef\u00e7\3\2\2\2\u00ef"+
		"\u00eb\3\2\2\2\u00f0\61\3\2\2\2\u00f1\u00f9\7\17\2\2\u00f2\u00f3\7\23"+
		"\2\2\u00f3\u00f5\7H\2\2\u00f4\u00f6\5\64\33\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f8\7\f\2\2\u00f8\u00fa\7E"+
		"\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\63\3\2\2\2\u00fb\u00fc"+
		"\5\20\t\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7\24\2\2\u00fe\u00ff\5\34\17"+
		"\2\u00ff\u0101\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0107"+
		"\3\2\2\2\u0102\u0103\5\20\t\2\u0103\u0104\7\7\2\2\u0104\u0105\7\24\2\2"+
		"\u0105\u0106\5\34\17\2\u0106\u0108\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u010e\3\2\2\2\u0109\u010a\5\20\t\2\u010a\u010b\7\t\2\2"+
		"\u010b\u010c\7\24\2\2\u010c\u010d\5\34\17\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0115\3\2\2\2\u0110\u0111\5\20"+
		"\t\2\u0111\u0112\7\25\2\2\u0112\u0113\7\24\2\2\u0113\u0114\5\34\17\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011b\3\2"+
		"\2\2\u0117\u0118\5\20\t\2\u0118\u0119\7\34\2\2\u0119\u011a\5T+\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u011c\3\2\2\2\u011c\65\3\2\2"+
		"\2\u011d\u0120\58\35\2\u011e\u0120\5:\36\2\u011f\u011d\3\2\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\67\3\2\2\2\u0121\u0122\7&\2\2\u0122\u0123\7\33\2\2\u0123"+
		"9\3\2\2\2\u0124\u0125\7%\2\2\u0125\u0126\7\33\2\2\u0126\u0127\5\34\17"+
		"\2\u0127;\3\2\2\2\u0128\u0129\7\16\2\2\u0129\u012c\7H\2\2\u012a\u012b"+
		"\7\4\2\2\u012b\u012d\7F\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012f\7\5\2\2\u012f\u0131\7F\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0133\7,\2\2\u0133"+
		"\u0135\7H\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0137\7(\2\2\u0137\u0139\5F$\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139=\3\2\2\2\u013a\u013b\7%\2\2\u013b\u013c\5@!\2\u013c?\3"+
		"\2\2\2\u013d\u013e\7\'\2\2\u013e\u013f\7E\2\2\u013f\u0140\7\21\2\2\u0140"+
		"\u0141\5T+\2\u0141A\3\2\2\2\u0142\u0145\7&\2\2\u0143\u0146\5D#\2\u0144"+
		"\u0146\7\23\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146C\3\2\2\2"+
		"\u0147\u0148\7\'\2\2\u0148\u0149\7E\2\2\u0149E\3\2\2\2\u014a\u014b\7;"+
		"\2\2\u014b\u014c\7E\2\2\u014cG\3\2\2\2\u014d\u014e\7<\2\2\u014e\u014f"+
		"\7E\2\2\u014fI\3\2\2\2\u0150\u0153\7H\2\2\u0151\u0153\7E\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0151\3\2\2\2\u0153K\3\2\2\2\u0154\u0155\7\35\2\2\u0155"+
		"\u0156\7\36\2\2\u0156\u0157\7H\2\2\u0157M\3\2\2\2\u0158\u0159\7\36\2\2"+
		"\u0159\u015a\t\4\2\2\u015aO\3\2\2\2\u015b\u015e\7H\2\2\u015c\u015e\7E"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\7B\2\2\u0160\u0161\5R*\2\u0161Q\3\2\2\2\u0162\u0166\7H\2\2\u0163"+
		"\u0166\7F\2\2\u0164\u0166\5V,\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2"+
		"\2\u0165\u0164\3\2\2\2\u0166S\3\2\2\2\u0167\u0168\7\32\2\2\u0168\u0169"+
		"\t\5\2\2\u0169U\3\2\2\2\u016a\u016b\t\6\2\2\u016bW\3\2\2\2\"[ajmx\u008f"+
		"\u0092\u0098\u00a8\u00ad\u00b9\u00bf\u00cd\u00d4\u00e2\u00ef\u00f5\u00f9"+
		"\u0100\u0107\u010e\u0115\u011b\u011f\u012c\u0130\u0134\u0138\u0145\u0152"+
		"\u015d\u0165";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}