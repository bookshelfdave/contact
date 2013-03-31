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
		LET=1, PB=2, HTTP=3, FETCH=4, STORE=5, DELETE=6, VALUE=7, CONN=8, CONNS=9, 
		CONNECT=10, USE=11, USING=12, WITH=13, BUCKET=14, AND=15, OR=16, NOT=17, 
		OPTIONS=18, QUERY2I=19, MAP=20, REDUCE=21, LINK=22, MAPRED=23, FROM=24, 
		INDEX=25, TO=26, INPUTS=27, FILTERS=28, KEEP=29, JAVASCRIPT=30, ERLANG=31, 
		JAVA=32, PHASE=33, DETAIL=34, PROPERTIES=35, LOAD=36, SCRIPT=37, LIST=38, 
		BUCKETS=39, KEYS=40, TRUE=41, FALSE=42, DEFAULT=43, SET=44, GET=45, ACTION=46, 
		AS=47, JSON=48, TEXT=49, XML=50, AT=51, COMMA=52, LSQUARE=53, RSQUARE=54, 
		LPAREN=55, RPAREN=56, EQUALS=57, SEMI=58, ID=59, INT=60, STRING=61, DATA_CONTENT=62, 
		LINE_COMMENT=63, COMMENT=64, WS=65;
	public static final String[] tokenNames = {
		"<INVALID>", "'let'", "'pb'", "'http'", "'fetch'", "'store'", "'delete'", 
		"'value'", "'connection'", "'connections'", "'connect'", "'use'", "'using'", 
		"'with'", "'bucket'", "'and'", "'or'", "'not'", "'options'", "'query2i'", 
		"'map'", "'reduce'", "'link'", "'mapred'", "'from'", "'index'", "'to'", 
		"'inputs'", "'filters'", "'keep'", "'javascript'", "'erlang'", "'java'", 
		"'phase'", "'detail'", "'properties'", "'load'", "'script'", "'list'", 
		"'buckets'", "'keys'", "'true'", "'false'", "'default'", "'set'", "'get'", 
		"'action'", "'as'", "'json'", "'text'", "'xml'", "'@'", "','", "'['", 
		"']'", "'('", "')'", "'='", "';'", "ID", "INT", "STRING", "DATA_CONTENT", 
		"LINE_COMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_connection_selector = 2, RULE_console_op = 3, 
		RULE_connections = 4, RULE_assignment = 5, RULE_using = 6, RULE_with = 7, 
		RULE_op_with_options = 8, RULE_options = 9, RULE_listbuckets = 10, RULE_listkeys = 11, 
		RULE_optionslist = 12, RULE_fetch = 13, RULE_store = 14, RULE_store_indexes = 15, 
		RULE_content_string = 16, RULE_delete = 17, RULE_query2i = 18, RULE_use = 19, 
		RULE_useBucketOptions = 20, RULE_connect = 21, RULE_set = 22, RULE_set_action = 23, 
		RULE_get = 24, RULE_get_action = 25, RULE_get_bucketprops = 26, RULE_loadscript = 27, 
		RULE_script = 28, RULE_pair = 29, RULE_pairValue = 30, RULE_code_string = 31, 
		RULE_bool = 32;
	public static final String[] ruleNames = {
		"prog", "stat", "connection_selector", "console_op", "connections", "assignment", 
		"using", "with", "op_with_options", "options", "listbuckets", "listkeys", 
		"optionslist", "fetch", "store", "store_indexes", "content_string", "delete", 
		"query2i", "use", "useBucketOptions", "connect", "set", "set_action", 
		"get", "get_action", "get_bucketprops", "loadscript", "script", "pair", 
		"pairValue", "code_string", "bool"
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
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); stat();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FETCH) | (1L << STORE) | (1L << DELETE) | (1L << CONNS) | (1L << CONNECT) | (1L << USE) | (1L << USING) | (1L << QUERY2I) | (1L << LOAD) | (1L << SCRIPT) | (1L << LIST) | (1L << SET) | (1L << GET))) != 0) );
			setState(71); match(EOF);
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
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public ListbucketsContext listbuckets() {
			return getRuleContext(ListbucketsContext.class,0);
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
			setState(74);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(73); assignment();
				}
			}

			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(76); connect();
				}
				break;

			case 2:
				{
				setState(77); using();
				}
				break;

			case 3:
				{
				setState(78); op_with_options();
				}
				break;

			case 4:
				{
				setState(79); listbuckets();
				}
				break;

			case 5:
				{
				setState(80); console_op();
				}
				break;

			case 6:
				{
				setState(81); use();
				}
				break;

			case 7:
				{
				setState(82); connections();
				}
				break;
			}
			setState(86);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(85); connection_selector();
				}
			}

			setState(88); match(SEMI);
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
			setState(90); match(AT);
			setState(91); ((Connection_selectorContext)_localctx).connname = match(ID);
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
			setState(97);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); get();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); set();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); loadscript();
				}
				break;
			case SCRIPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(96); script();
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
			setState(99); match(CONNS);
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
			setState(101); match(LET);
			setState(102); ((AssignmentContext)_localctx).name = match(ID);
			setState(103); match(EQUALS);
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
			setState(105); match(USING);
			setState(106); match(BUCKET);
			setState(107); ((UsingContext)_localctx).bucket = match(STRING);
			setState(108); op_with_options();
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
			setState(110);
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
		public ListkeysContext listkeys() {
			return getRuleContext(ListkeysContext.class,0);
		}
		public FetchContext fetch() {
			return getRuleContext(FetchContext.class,0);
		}
		public StoreContext store() {
			return getRuleContext(StoreContext.class,0);
		}
		public Query2iContext query2i() {
			return getRuleContext(Query2iContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
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
			setState(117);
			switch (_input.LA(1)) {
			case FETCH:
				{
				setState(112); fetch();
				}
				break;
			case STORE:
				{
				setState(113); store();
				}
				break;
			case DELETE:
				{
				setState(114); delete();
				}
				break;
			case QUERY2I:
				{
				setState(115); query2i();
				}
				break;
			case LIST:
				{
				setState(116); listkeys();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(119); options();
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
			setState(122); with();
			setState(123); match(OPTIONS);
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(124); optionslist();
				}
				break;

			case 2:
				{
				setState(125); match(ID);
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
			setState(128); match(LIST);
			setState(129); match(BUCKETS);
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
			setState(131); match(LIST);
			setState(132); match(KEYS);
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
		enterRule(_localctx, 24, RULE_optionslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); ((OptionslistContext)_localctx).pair = pair();
			((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135); match(COMMA);
				setState(136); ((OptionslistContext)_localctx).pair = pair();
				((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
				}
				}
				setState(141);
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
		enterRule(_localctx, 26, RULE_fetch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(FETCH);
			setState(143); ((FetchContext)_localctx).key = match(STRING);
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
		enterRule(_localctx, 28, RULE_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(STORE);
			setState(148);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(146); ((StoreContext)_localctx).key = match(STRING);
				}
				break;
			case ID:
				{
				setState(147); ((StoreContext)_localctx).existing_obj = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150); store_indexes();
			setState(151); with();
			setState(152); content_string();
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
		enterRule(_localctx, 30, RULE_store_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(154); with();
					setState(155); match(INDEX);
					setState(156); pair();
					}
					} 
				}
				setState(162);
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
		enterRule(_localctx, 32, RULE_content_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JSON) | (1L << TEXT) | (1L << XML))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(164);
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
		enterRule(_localctx, 34, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(DELETE);
			setState(167); ((DeleteContext)_localctx).key = match(STRING);
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
		enterRule(_localctx, 36, RULE_query2i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(QUERY2I);
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(170); match(AND);
				setState(171); match(FETCH);
				}
				break;
			}
			setState(174); with();
			setState(175); match(INDEX);
			setState(176); ((Query2iContext)_localctx).index = match(STRING);
			setState(185);
			switch (_input.LA(1)) {
			case WITH:
			case AND:
				{
				setState(177); with();
				setState(178); match(VALUE);
				setState(179); ((Query2iContext)_localctx).exact = match(STRING);
				}
				break;
			case FROM:
				{
				setState(181); match(FROM);
				setState(182); ((Query2iContext)_localctx).vmin = match(STRING);
				setState(183); match(TO);
				setState(184); ((Query2iContext)_localctx).vmax = match(STRING);
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
		enterRule(_localctx, 38, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(USE);
			setState(195);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				{
				setState(188); match(BUCKET);
				setState(189); ((UseContext)_localctx).name = match(STRING);
				setState(191);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(190); useBucketOptions();
					}
					break;
				}
				}
				}
				break;
			case CONN:
				{
				{
				setState(193); match(CONN);
				setState(194); ((UseContext)_localctx).var = match(ID);
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
		public TerminalNode QUERY2I() { return getToken(ContactParser.QUERY2I, 0); }
		public OptionslistContext optionslist(int i) {
			return getRuleContext(OptionslistContext.class,i);
		}
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
		enterRule(_localctx, 40, RULE_useBucketOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(197); with();
				setState(198); match(FETCH);
				setState(199); match(OPTIONS);
				setState(200); ((UseBucketOptionsContext)_localctx).fetchOptions = optionslist();
				}
				break;
			}
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(204); with();
				setState(205); match(STORE);
				setState(206); match(OPTIONS);
				setState(207); ((UseBucketOptionsContext)_localctx).storeOptions = optionslist();
				}
				break;
			}
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(211); with();
				setState(212); match(DELETE);
				setState(213); match(OPTIONS);
				setState(214); ((UseBucketOptionsContext)_localctx).deleteOptions = optionslist();
				}
				break;
			}
			setState(223);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(218); with();
				setState(219); match(QUERY2I);
				setState(220); match(OPTIONS);
				setState(221); ((UseBucketOptionsContext)_localctx).query2iOptions = optionslist();
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

	public static class ConnectContext extends ParserRuleContext {
		public Token host;
		public Token pbport;
		public Token httpport;
		public Token connname;
		public TerminalNode AS() { return getToken(ContactParser.AS, 0); }
		public List<TerminalNode> INT() { return getTokens(ContactParser.INT); }
		public TerminalNode HTTP() { return getToken(ContactParser.HTTP, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode CONNECT() { return getToken(ContactParser.CONNECT, 0); }
		public TerminalNode INT(int i) {
			return getToken(ContactParser.INT, i);
		}
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public TerminalNode PB() { return getToken(ContactParser.PB, 0); }
		public TerminalNode DEFAULT() { return getToken(ContactParser.DEFAULT, 0); }
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
		enterRule(_localctx, 42, RULE_connect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(CONNECT);
			setState(234);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(226); match(DEFAULT);
				}
				break;
			case STRING:
				{
				setState(227); ((ConnectContext)_localctx).host = match(STRING);
				setState(228); match(PB);
				setState(229); ((ConnectContext)_localctx).pbport = match(INT);
				setState(232);
				_la = _input.LA(1);
				if (_la==HTTP) {
					{
					setState(230); match(HTTP);
					setState(231); ((ConnectContext)_localctx).httpport = match(INT);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(238);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(236); match(AS);
				setState(237); ((ConnectContext)_localctx).connname = match(ID);
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
		enterRule(_localctx, 44, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(SET);
			setState(241); set_action();
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
		enterRule(_localctx, 46, RULE_set_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(ACTION);
			setState(244); ((Set_actionContext)_localctx).actionname = match(ID);
			setState(245); match(WITH);
			setState(246); code_string();
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
		public Get_bucketpropsContext get_bucketprops() {
			return getRuleContext(Get_bucketpropsContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(GET);
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(249); get_action();
				}
				break;

			case 2:
				{
				setState(250); get_bucketprops();
				}
				break;

			case 3:
				{
				setState(251); match(BUCKET);
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
		enterRule(_localctx, 50, RULE_get_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(ACTION);
			setState(255); ((Get_actionContext)_localctx).actionname = match(ID);
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
		public TerminalNode BUCKET() { return getToken(ContactParser.BUCKET, 0); }
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
		enterRule(_localctx, 52, RULE_get_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(BUCKET);
			setState(258); match(PROPERTIES);
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
		enterRule(_localctx, 54, RULE_loadscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(LOAD);
			setState(261); match(SCRIPT);
			setState(262); ((LoadscriptContext)_localctx).filename = match(STRING);
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
		enterRule(_localctx, 56, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(SCRIPT);
			setState(265);
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
		enterRule(_localctx, 58, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(267); ((PairContext)_localctx).name = match(STRING);
				}
				break;
			case ID:
				{
				setState(268); ((PairContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271); match(EQUALS);
			setState(272); pairValue();
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
		enterRule(_localctx, 60, RULE_pairValue);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PairStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274); ((PairStringValueContext)_localctx).stringValue = match(STRING);
				}
				break;
			case INT:
				_localctx = new PairIntValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275); ((PairIntValueContext)_localctx).intValue = match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new PairBoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(276); ((PairBoolValueContext)_localctx).boolValue = bool();
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
		enterRule(_localctx, 62, RULE_code_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(JAVASCRIPT);
			setState(280);
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
		enterRule(_localctx, 64, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		"\2\3C\u011f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\3\2\6\2F\n\2\r\2\16\2G\3\2\3\2\3\3\5\3"+
		"M\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3V\n\3\3\3\5\3Y\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5d\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nx\n\n\3\n\5\n{\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0081\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u008c"+
		"\n\16\f\16\16\16\u008f\13\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u0097"+
		"\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00a1\n\21\f\21\16"+
		"\21\u00a4\13\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00af"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bc"+
		"\n\24\3\25\3\25\3\25\3\25\5\25\u00c2\n\25\3\25\3\25\5\25\u00c6\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u00cd\n\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00d4\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u00db\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u00e2\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00eb"+
		"\n\27\5\27\u00ed\n\27\3\27\3\27\5\27\u00f1\n\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00ff\n\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\5\37\u0110"+
		"\n\37\3\37\3\37\3\37\3 \3 \3 \5 \u0118\n \3!\3!\3!\3\"\3\"\3\"\2#\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\b\4\17"+
		"\17\21\21\3\62\64\3?@\3?@\3?@\3+,\u0122\2E\3\2\2\2\4L\3\2\2\2\6\\\3\2"+
		"\2\2\bc\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16k\3\2\2\2\20p\3\2\2\2\22w\3\2"+
		"\2\2\24|\3\2\2\2\26\u0082\3\2\2\2\30\u0085\3\2\2\2\32\u0088\3\2\2\2\34"+
		"\u0090\3\2\2\2\36\u0093\3\2\2\2 \u00a2\3\2\2\2\"\u00a5\3\2\2\2$\u00a8"+
		"\3\2\2\2&\u00ab\3\2\2\2(\u00bd\3\2\2\2*\u00cc\3\2\2\2,\u00e3\3\2\2\2."+
		"\u00f2\3\2\2\2\60\u00f5\3\2\2\2\62\u00fa\3\2\2\2\64\u0100\3\2\2\2\66\u0103"+
		"\3\2\2\28\u0106\3\2\2\2:\u010a\3\2\2\2<\u010f\3\2\2\2>\u0117\3\2\2\2@"+
		"\u0119\3\2\2\2B\u011c\3\2\2\2DF\5\4\3\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2HI\3\2\2\2IJ\7\1\2\2J\3\3\2\2\2KM\5\f\7\2LK\3\2\2\2LM\3\2\2"+
		"\2MU\3\2\2\2NV\5,\27\2OV\5\16\b\2PV\5\22\n\2QV\5\26\f\2RV\5\b\5\2SV\5"+
		"(\25\2TV\5\n\6\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3"+
		"\2\2\2UT\3\2\2\2VX\3\2\2\2WY\5\6\4\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7"+
		"<\2\2[\5\3\2\2\2\\]\7\65\2\2]^\7=\2\2^\7\3\2\2\2_d\5\62\32\2`d\5.\30\2"+
		"ad\58\35\2bd\5:\36\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\t\3\2\2"+
		"\2ef\7\13\2\2f\13\3\2\2\2gh\7\3\2\2hi\7=\2\2ij\7;\2\2j\r\3\2\2\2kl\7\16"+
		"\2\2lm\7\20\2\2mn\7?\2\2no\5\22\n\2o\17\3\2\2\2pq\t\2\2\2q\21\3\2\2\2"+
		"rx\5\34\17\2sx\5\36\20\2tx\5$\23\2ux\5&\24\2vx\5\30\r\2wr\3\2\2\2ws\3"+
		"\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2y{\5\24\13\2zy\3\2\2\2z"+
		"{\3\2\2\2{\23\3\2\2\2|}\5\20\t\2}\u0080\7\24\2\2~\u0081\5\32\16\2\177"+
		"\u0081\7=\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\25\3\2\2\2\u0082"+
		"\u0083\7(\2\2\u0083\u0084\7)\2\2\u0084\27\3\2\2\2\u0085\u0086\7(\2\2\u0086"+
		"\u0087\7*\2\2\u0087\31\3\2\2\2\u0088\u008d\5<\37\2\u0089\u008a\7\66\2"+
		"\2\u008a\u008c\5<\37\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\33\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\6\2\2\u0091\u0092\7?\2\2\u0092\35\3\2\2\2\u0093\u0096\7\7\2\2"+
		"\u0094\u0097\7?\2\2\u0095\u0097\7=\2\2\u0096\u0094\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5 \21\2\u0099\u009a\5\20\t\2"+
		"\u009a\u009b\5\"\22\2\u009b\37\3\2\2\2\u009c\u009d\5\20\t\2\u009d\u009e"+
		"\7\33\2\2\u009e\u009f\5<\37\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2"+
		"\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3!\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\t\3\2\2\u00a6\u00a7\t\4\2\2\u00a7"+
		"#\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\7?\2\2\u00aa%\3\2\2\2\u00ab"+
		"\u00ae\7\25\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00af\7\6\2\2\u00ae\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\20\t\2\u00b1"+
		"\u00b2\7\33\2\2\u00b2\u00bb\7?\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7"+
		"\t\2\2\u00b5\u00b6\7?\2\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8\7\32\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\u00ba\7\34\2\2\u00ba\u00bc\7?\2\2\u00bb\u00b3\3\2"+
		"\2\2\u00bb\u00b7\3\2\2\2\u00bc\'\3\2\2\2\u00bd\u00c5\7\r\2\2\u00be\u00bf"+
		"\7\20\2\2\u00bf\u00c1\7?\2\2\u00c0\u00c2\5*\26\2\u00c1\u00c0\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c6\7="+
		"\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6)\3\2\2\2\u00c7\u00c8"+
		"\5\20\t\2\u00c8\u00c9\7\6\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00cb\5\32\16"+
		"\2\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d3"+
		"\3\2\2\2\u00ce\u00cf\5\20\t\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\7\24\2\2"+
		"\u00d1\u00d2\5\32\16\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7\b\2\2"+
		"\u00d7\u00d8\7\24\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e1\3\2\2\2\u00dc\u00dd\5\20"+
		"\t\2\u00dd\u00de\7\25\2\2\u00de\u00df\7\24\2\2\u00df\u00e0\5\32\16\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2+\3\2\2\2"+
		"\u00e3\u00ec\7\f\2\2\u00e4\u00ed\7-\2\2\u00e5\u00e6\7?\2\2\u00e6\u00e7"+
		"\7\4\2\2\u00e7\u00ea\7>\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00eb\7>\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e4\3\2"+
		"\2\2\u00ec\u00e5\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef"+
		"\u00f1\7=\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1-\3\2\2\2\u00f2"+
		"\u00f3\7.\2\2\u00f3\u00f4\5\60\31\2\u00f4/\3\2\2\2\u00f5\u00f6\7\60\2"+
		"\2\u00f6\u00f7\7=\2\2\u00f7\u00f8\7\17\2\2\u00f8\u00f9\5@!\2\u00f9\61"+
		"\3\2\2\2\u00fa\u00fe\7/\2\2\u00fb\u00ff\5\64\33\2\u00fc\u00ff\5\66\34"+
		"\2\u00fd\u00ff\7\20\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\63\3\2\2\2\u0100\u0101\7\60\2\2\u0101\u0102\7=\2"+
		"\2\u0102\65\3\2\2\2\u0103\u0104\7\20\2\2\u0104\u0105\7%\2\2\u0105\67\3"+
		"\2\2\2\u0106\u0107\7&\2\2\u0107\u0108\7\'\2\2\u0108\u0109\7?\2\2\u0109"+
		"9\3\2\2\2\u010a\u010b\7\'\2\2\u010b\u010c\t\5\2\2\u010c;\3\2\2\2\u010d"+
		"\u0110\7?\2\2\u010e\u0110\7=\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2"+
		"\2\u0110\u0111\3\2\2\2\u0111\u0112\7;\2\2\u0112\u0113\5> \2\u0113=\3\2"+
		"\2\2\u0114\u0118\7?\2\2\u0115\u0118\7>\2\2\u0116\u0118\5B\"\2\u0117\u0114"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118?\3\2\2\2\u0119"+
		"\u011a\7 \2\2\u011a\u011b\t\6\2\2\u011bA\3\2\2\2\u011c\u011d\t\7\2\2\u011d"+
		"C\3\2\2\2\33GLUXcwz\u0080\u008d\u0096\u00a2\u00ae\u00bb\u00c1\u00c5\u00cc"+
		"\u00d3\u00da\u00e1\u00ea\u00ec\u00f0\u00fe\u010f\u0117";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}