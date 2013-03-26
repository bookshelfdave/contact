// Generated from /Users/dparfitt/src/contact/src/main/java/com/basho/contact/Contact.g4 by ANTLR 4.0
package com.basho.contact;
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
		LET=1, PB=2, HTTP=3, FETCH=4, STORE=5, DELETE=6, VALUE=7, CONN=8, CONNECT=9, 
		USE=10, USING=11, WITH=12, BUCKET=13, AND=14, OR=15, NOT=16, OPTIONS=17, 
		QUERY2I=18, MAP=19, REDUCE=20, LINK=21, MAPRED=22, FROM=23, INDEX=24, 
		TO=25, INPUTS=26, FILTERS=27, KEEP=28, JAVASCRIPT=29, ERLANG=30, JAVA=31, 
		PHASE=32, SHOW=33, DETAIL=34, PROPERTIES=35, LIST=36, BUCKETS=37, KEYS=38, 
		TRUE=39, FALSE=40, DEFAULT=41, SET=42, GET=43, ACTION=44, JSON=45, TEXT=46, 
		XML=47, COMMA=48, LSQUARE=49, RSQUARE=50, LPAREN=51, RPAREN=52, EQUALS=53, 
		SEMI=54, ID=55, INT=56, STRING=57, DATA_CONTENT=58, LINE_COMMENT=59, COMMENT=60, 
		WS=61;
	public static final String[] tokenNames = {
		"<INVALID>", "'let'", "'pb'", "'http'", "'fetch'", "'store'", "'delete'", 
		"'value'", "'connection'", "'connect'", "'use'", "'using'", "'with'", 
		"'bucket'", "'and'", "'or'", "'not'", "'options'", "'query2i'", "'map'", 
		"'reduce'", "'link'", "'mapred'", "'from'", "'index'", "'to'", "'inputs'", 
		"'filters'", "'keep'", "'javascript'", "'erlang'", "'java'", "'phase'", 
		"'show'", "'detail'", "'properties'", "'list'", "'buckets'", "'keys'", 
		"'true'", "'false'", "'default'", "'set'", "'get'", "'action'", "'json'", 
		"'text'", "'xml'", "','", "'['", "']'", "'('", "')'", "'='", "';'", "ID", 
		"INT", "STRING", "DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_console_op = 2, RULE_assignment = 3, 
		RULE_using = 4, RULE_with = 5, RULE_op_with_options = 6, RULE_options = 7, 
		RULE_listbuckets = 8, RULE_listkeys = 9, RULE_optionslist = 10, RULE_fetch = 11, 
		RULE_store = 12, RULE_show = 13, RULE_store_indexes = 14, RULE_content_string = 15, 
		RULE_delete = 16, RULE_query2i = 17, RULE_use = 18, RULE_connect = 19, 
		RULE_set = 20, RULE_set_action = 21, RULE_get = 22, RULE_get_action = 23, 
		RULE_get_bucketprops = 24, RULE_pair = 25, RULE_pairValue = 26, RULE_code_string = 27, 
		RULE_bool = 28;
	public static final String[] ruleNames = {
		"prog", "stat", "console_op", "assignment", "using", "with", "op_with_options", 
		"options", "listbuckets", "listkeys", "optionslist", "fetch", "store", 
		"show", "store_indexes", "content_string", "delete", "query2i", "use", 
		"connect", "set", "set_action", "get", "get_action", "get_bucketprops", 
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
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58); stat();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FETCH) | (1L << STORE) | (1L << DELETE) | (1L << CONNECT) | (1L << USE) | (1L << USING) | (1L << QUERY2I) | (1L << SHOW) | (1L << LIST) | (1L << SET) | (1L << GET))) != 0) );
			setState(63); match(EOF);
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
			setState(66);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(65); assignment();
				}
			}

			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(68); connect();
				}
				break;

			case 2:
				{
				setState(69); using();
				}
				break;

			case 3:
				{
				setState(70); op_with_options();
				}
				break;

			case 4:
				{
				setState(71); use();
				}
				break;

			case 5:
				{
				setState(72); listbuckets();
				}
				break;

			case 6:
				{
				setState(73); console_op();
				}
				break;
			}
			setState(76); match(SEMI);
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
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
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
		enterRule(_localctx, 4, RULE_console_op);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); get();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); set();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); show();
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
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(LET);
			setState(84); ((AssignmentContext)_localctx).name = match(ID);
			setState(85); match(EQUALS);
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
		enterRule(_localctx, 8, RULE_using);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(USING);
			setState(88); match(BUCKET);
			setState(89); ((UsingContext)_localctx).bucket = match(STRING);
			setState(90); op_with_options();
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
		enterRule(_localctx, 10, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 12, RULE_op_with_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch (_input.LA(1)) {
			case FETCH:
				{
				setState(94); fetch();
				}
				break;
			case STORE:
				{
				setState(95); store();
				}
				break;
			case DELETE:
				{
				setState(96); delete();
				}
				break;
			case QUERY2I:
				{
				setState(97); query2i();
				}
				break;
			case LIST:
				{
				setState(98); listkeys();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(101); options();
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
		enterRule(_localctx, 14, RULE_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); with();
			setState(105); match(OPTIONS);
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(106); optionslist();
				}
				break;

			case 2:
				{
				setState(107); match(ID);
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
		enterRule(_localctx, 16, RULE_listbuckets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(LIST);
			setState(111); match(BUCKETS);
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
		enterRule(_localctx, 18, RULE_listkeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(LIST);
			setState(114); match(KEYS);
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
		enterRule(_localctx, 20, RULE_optionslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); ((OptionslistContext)_localctx).pair = pair();
			((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117); match(COMMA);
				setState(118); ((OptionslistContext)_localctx).pair = pair();
				((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
				}
				}
				setState(123);
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
		enterRule(_localctx, 22, RULE_fetch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(FETCH);
			setState(125); ((FetchContext)_localctx).key = match(STRING);
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
		enterRule(_localctx, 24, RULE_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(STORE);
			setState(130);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(128); ((StoreContext)_localctx).key = match(STRING);
				}
				break;
			case ID:
				{
				setState(129); ((StoreContext)_localctx).existing_obj = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132); store_indexes();
			setState(133); with();
			setState(134); content_string();
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

	public static class ShowContext extends ParserRuleContext {
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public TerminalNode DETAIL() { return getToken(ContactParser.DETAIL, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode SHOW() { return getToken(ContactParser.SHOW, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitShow(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(SHOW);
			setState(138);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(137); match(ID);
				}
			}

			setState(143);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(140); with();
				setState(141); match(DETAIL);
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
		enterRule(_localctx, 28, RULE_store_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(145); with();
					setState(146); match(INDEX);
					setState(147); pair();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 30, RULE_content_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JSON) | (1L << TEXT) | (1L << XML))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(155);
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
		enterRule(_localctx, 32, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(DELETE);
			setState(158); ((DeleteContext)_localctx).key = match(STRING);
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
		public WithContext with(int i) {
			return getRuleContext(WithContext.class,i);
		}
		public TerminalNode VALUE() { return getToken(ContactParser.VALUE, 0); }
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
		enterRule(_localctx, 34, RULE_query2i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(QUERY2I);
			setState(161); with();
			setState(162); match(INDEX);
			setState(163); ((Query2iContext)_localctx).index = match(STRING);
			setState(172);
			switch (_input.LA(1)) {
			case WITH:
			case AND:
				{
				setState(164); with();
				setState(165); match(VALUE);
				setState(166); ((Query2iContext)_localctx).exact = match(STRING);
				}
				break;
			case FROM:
				{
				setState(168); match(FROM);
				setState(169); ((Query2iContext)_localctx).vmin = match(STRING);
				setState(170); match(TO);
				setState(171); ((Query2iContext)_localctx).vmax = match(STRING);
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
		enterRule(_localctx, 36, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(USE);
			setState(179);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				{
				setState(175); match(BUCKET);
				setState(176); ((UseContext)_localctx).name = match(STRING);
				}
				}
				break;
			case CONN:
				{
				{
				setState(177); match(CONN);
				setState(178); ((UseContext)_localctx).var = match(ID);
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

	public static class ConnectContext extends ParserRuleContext {
		public Token host;
		public Token pbport;
		public Token httpport;
		public List<TerminalNode> INT() { return getTokens(ContactParser.INT); }
		public TerminalNode HTTP() { return getToken(ContactParser.HTTP, 0); }
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
		enterRule(_localctx, 38, RULE_connect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(CONNECT);
			setState(190);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(182); match(DEFAULT);
				}
				break;
			case STRING:
				{
				setState(183); ((ConnectContext)_localctx).host = match(STRING);
				setState(184); match(PB);
				setState(185); ((ConnectContext)_localctx).pbport = match(INT);
				setState(188);
				_la = _input.LA(1);
				if (_la==HTTP) {
					{
					setState(186); match(HTTP);
					setState(187); ((ConnectContext)_localctx).httpport = match(INT);
					}
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
		enterRule(_localctx, 40, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(SET);
			setState(193); set_action();
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
		enterRule(_localctx, 42, RULE_set_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(ACTION);
			setState(196); ((Set_actionContext)_localctx).actionname = match(ID);
			setState(197); match(WITH);
			setState(198); code_string();
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
		enterRule(_localctx, 44, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(GET);
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(201); get_action();
				}
				break;

			case 2:
				{
				setState(202); get_bucketprops();
				}
				break;

			case 3:
				{
				setState(203); match(BUCKET);
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
		enterRule(_localctx, 46, RULE_get_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(ACTION);
			setState(207); ((Get_actionContext)_localctx).actionname = match(ID);
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
		enterRule(_localctx, 48, RULE_get_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(BUCKET);
			setState(210); match(PROPERTIES);
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
		enterRule(_localctx, 50, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(212); ((PairContext)_localctx).name = match(STRING);
				}
				break;
			case ID:
				{
				setState(213); ((PairContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216); match(EQUALS);
			setState(217); pairValue();
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
		enterRule(_localctx, 52, RULE_pairValue);
		try {
			setState(222);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PairStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219); ((PairStringValueContext)_localctx).stringValue = match(STRING);
				}
				break;
			case INT:
				_localctx = new PairIntValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220); ((PairIntValueContext)_localctx).intValue = match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new PairBoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221); ((PairBoolValueContext)_localctx).boolValue = bool();
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
		enterRule(_localctx, 54, RULE_code_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(JAVASCRIPT);
			setState(225);
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
		enterRule(_localctx, 56, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		"\2\3?\u00e8\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\3\2\6\2>\n\2\r\2\16\2?\3\2\3\2\3\3\5\3E\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3M\n\3\3\3\3\3\3\4\3\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bf\n\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\5"+
		"\to\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0085\n\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\5\17\u008d\n\17\3\17\3\17\3\17\5\17\u0092\n\17\3\20\3\20\3\20\3\20"+
		"\7\20\u0098\n\20\f\20\16\20\u009b\13\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00af"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00b6\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00bf\n\25\5\25\u00c1\n\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u00cf\n\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\5\33\u00d9\n\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34"+
		"\u00e1\n\34\3\35\3\35\3\35\3\36\3\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7\4\16\16\20\20\3/\61\3;<\3;"+
		"<\3)*\u00e7\2=\3\2\2\2\4D\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\nY\3\2\2\2\f^"+
		"\3\2\2\2\16e\3\2\2\2\20j\3\2\2\2\22p\3\2\2\2\24s\3\2\2\2\26v\3\2\2\2\30"+
		"~\3\2\2\2\32\u0081\3\2\2\2\34\u008a\3\2\2\2\36\u0099\3\2\2\2 \u009c\3"+
		"\2\2\2\"\u009f\3\2\2\2$\u00a2\3\2\2\2&\u00b0\3\2\2\2(\u00b7\3\2\2\2*\u00c2"+
		"\3\2\2\2,\u00c5\3\2\2\2.\u00ca\3\2\2\2\60\u00d0\3\2\2\2\62\u00d3\3\2\2"+
		"\2\64\u00d8\3\2\2\2\66\u00e0\3\2\2\28\u00e2\3\2\2\2:\u00e5\3\2\2\2<>\5"+
		"\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\1\2\2B\3"+
		"\3\2\2\2CE\5\b\5\2DC\3\2\2\2DE\3\2\2\2EL\3\2\2\2FM\5(\25\2GM\5\n\6\2H"+
		"M\5\16\b\2IM\5&\24\2JM\5\22\n\2KM\5\6\4\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2"+
		"\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2NO\78\2\2O\5\3\2\2\2PT\5.\30"+
		"\2QT\5*\26\2RT\5\34\17\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\7\3\2\2\2UV\7"+
		"\3\2\2VW\79\2\2WX\7\67\2\2X\t\3\2\2\2YZ\7\r\2\2Z[\7\17\2\2[\\\7;\2\2\\"+
		"]\5\16\b\2]\13\3\2\2\2^_\t\2\2\2_\r\3\2\2\2`f\5\30\r\2af\5\32\16\2bf\5"+
		"\"\22\2cf\5$\23\2df\5\24\13\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2"+
		"ed\3\2\2\2fh\3\2\2\2gi\5\20\t\2hg\3\2\2\2hi\3\2\2\2i\17\3\2\2\2jk\5\f"+
		"\7\2kn\7\23\2\2lo\5\26\f\2mo\79\2\2nl\3\2\2\2nm\3\2\2\2o\21\3\2\2\2pq"+
		"\7&\2\2qr\7\'\2\2r\23\3\2\2\2st\7&\2\2tu\7(\2\2u\25\3\2\2\2v{\5\64\33"+
		"\2wx\7\62\2\2xz\5\64\33\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\27"+
		"\3\2\2\2}{\3\2\2\2~\177\7\6\2\2\177\u0080\7;\2\2\u0080\31\3\2\2\2\u0081"+
		"\u0084\7\7\2\2\u0082\u0085\7;\2\2\u0083\u0085\79\2\2\u0084\u0082\3\2\2"+
		"\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\36\20\2\u0087"+
		"\u0088\5\f\7\2\u0088\u0089\5 \21\2\u0089\33\3\2\2\2\u008a\u008c\7#\2\2"+
		"\u008b\u008d\79\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091"+
		"\3\2\2\2\u008e\u008f\5\f\7\2\u008f\u0090\7$\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092\35\3\2\2\2\u0093\u0094\5\f\7"+
		"\2\u0094\u0095\7\32\2\2\u0095\u0096\5\64\33\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\37\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\t\3\2\2\u009d\u009e"+
		"\t\4\2\2\u009e!\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\7;\2\2\u00a1#"+
		"\3\2\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\32\2\2"+
		"\u00a5\u00ae\7;\2\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9"+
		"\7;\2\2\u00a9\u00af\3\2\2\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\7;\2\2\u00ac"+
		"\u00ad\7\33\2\2\u00ad\u00af\7;\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00aa\3\2"+
		"\2\2\u00af%\3\2\2\2\u00b0\u00b5\7\f\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b6"+
		"\7;\2\2\u00b3\u00b4\7\n\2\2\u00b4\u00b6\79\2\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\'\3\2\2\2\u00b7\u00c0\7\13\2\2\u00b8\u00c1\7+\2\2"+
		"\u00b9\u00ba\7;\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00be\7:\2\2\u00bc\u00bd"+
		"\7\5\2\2\u00bd\u00bf\7:\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c1)\3\2\2\2"+
		"\u00c2\u00c3\7,\2\2\u00c3\u00c4\5,\27\2\u00c4+\3\2\2\2\u00c5\u00c6\7."+
		"\2\2\u00c6\u00c7\79\2\2\u00c7\u00c8\7\16\2\2\u00c8\u00c9\58\35\2\u00c9"+
		"-\3\2\2\2\u00ca\u00ce\7-\2\2\u00cb\u00cf\5\60\31\2\u00cc\u00cf\5\62\32"+
		"\2\u00cd\u00cf\7\17\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf/\3\2\2\2\u00d0\u00d1\7.\2\2\u00d1\u00d2\79\2\2\u00d2"+
		"\61\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\7%\2\2\u00d5\63\3\2\2\2\u00d6"+
		"\u00d9\7;\2\2\u00d7\u00d9\79\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\67\2\2\u00db\u00dc\5\66\34\2\u00dc"+
		"\65\3\2\2\2\u00dd\u00e1\7;\2\2\u00de\u00e1\7:\2\2\u00df\u00e1\5:\36\2"+
		"\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\67"+
		"\3\2\2\2\u00e2\u00e3\7\37\2\2\u00e3\u00e4\t\5\2\2\u00e49\3\2\2\2\u00e5"+
		"\u00e6\t\6\2\2\u00e6;\3\2\2\2\25?DLSehn{\u0084\u008c\u0091\u0099\u00ae"+
		"\u00b5\u00be\u00c0\u00ce\u00d8\u00e0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}