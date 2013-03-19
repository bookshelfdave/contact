// Generated from /Users/dparfitt/src/contact/src/com/basho/contact/Contact.g4 by ANTLR 4.0
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
		RULE_delete = 16, RULE_query2i = 17, RULE_mapred = 18, RULE_mapred_bucket = 19, 
		RULE_mapred_phase = 20, RULE_mapred_phase_type = 21, RULE_mapred_phase_keep = 22, 
		RULE_mapred_inputs = 23, RULE_mapred_input_join = 24, RULE_mapred_lang = 25, 
		RULE_mapred_keyfilters = 26, RULE_mapred_keyfilter = 27, RULE_mapred_keyfilter_args = 28, 
		RULE_mapred_keyfilter_arg = 29, RULE_use = 30, RULE_connect = 31, RULE_set = 32, 
		RULE_set_action = 33, RULE_get = 34, RULE_get_action = 35, RULE_get_bucketprops = 36, 
		RULE_pair = 37, RULE_pairValue = 38, RULE_code_string = 39, RULE_bool = 40;
	public static final String[] ruleNames = {
		"prog", "stat", "console_op", "assignment", "using", "with", "op_with_options", 
		"options", "listbuckets", "listkeys", "optionslist", "fetch", "store", 
		"show", "store_indexes", "content_string", "delete", "query2i", "mapred", 
		"mapred_bucket", "mapred_phase", "mapred_phase_type", "mapred_phase_keep", 
		"mapred_inputs", "mapred_input_join", "mapred_lang", "mapred_keyfilters", 
		"mapred_keyfilter", "mapred_keyfilter_args", "mapred_keyfilter_arg", "use", 
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FETCH) | (1L << STORE) | (1L << DELETE) | (1L << CONNECT) | (1L << USE) | (1L << USING) | (1L << QUERY2I) | (1L << MAPRED) | (1L << SHOW) | (1L << LIST) | (1L << SET) | (1L << GET))) != 0) );
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
			setState(90);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(89); assignment();
				}
			}

			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(92); connect();
				}
				break;

			case 2:
				{
				setState(93); using();
				}
				break;

			case 3:
				{
				setState(94); op_with_options();
				}
				break;

			case 4:
				{
				setState(95); use();
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
			}
			setState(100); match(SEMI);
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
			setState(105);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); get();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); set();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); show();
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
			setState(107); match(LET);
			setState(108); ((AssignmentContext)_localctx).name = match(ID);
			setState(109); match(EQUALS);
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
			setState(111); match(USING);
			setState(112); match(BUCKET);
			setState(113); ((UsingContext)_localctx).bucket = match(STRING);
			setState(114); op_with_options();
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
			setState(116);
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
		public MapredContext mapred() {
			return getRuleContext(MapredContext.class,0);
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
			setState(124);
			switch (_input.LA(1)) {
			case FETCH:
				{
				setState(118); fetch();
				}
				break;
			case STORE:
				{
				setState(119); store();
				}
				break;
			case DELETE:
				{
				setState(120); delete();
				}
				break;
			case QUERY2I:
				{
				setState(121); query2i();
				}
				break;
			case MAPRED:
				{
				setState(122); mapred();
				}
				break;
			case LIST:
				{
				setState(123); listkeys();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(126); options();
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
			setState(129); with();
			setState(130); match(OPTIONS);
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(131); optionslist();
				}
				break;

			case 2:
				{
				setState(132); match(ID);
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
			setState(135); match(LIST);
			setState(136); match(BUCKETS);
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
			setState(138); match(LIST);
			setState(139); match(KEYS);
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
			setState(141); ((OptionslistContext)_localctx).pair = pair();
			((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142); match(COMMA);
				setState(143); ((OptionslistContext)_localctx).pair = pair();
				((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
				}
				}
				setState(148);
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
			setState(149); match(FETCH);
			setState(150); ((FetchContext)_localctx).key = match(STRING);
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
			setState(152); match(STORE);
			setState(155);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(153); ((StoreContext)_localctx).key = match(STRING);
				}
				break;
			case ID:
				{
				setState(154); ((StoreContext)_localctx).existing_obj = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157); store_indexes();
			setState(158); with();
			setState(159); content_string();
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
			setState(161); match(SHOW);
			setState(163);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(162); match(ID);
				}
			}

			setState(168);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(165); with();
				setState(166); match(DETAIL);
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
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(170); with();
					setState(171); match(INDEX);
					setState(172); pair();
					}
					} 
				}
				setState(178);
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
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JSON) | (1L << TEXT) | (1L << XML))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(180);
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
			setState(182); match(DELETE);
			setState(183); ((DeleteContext)_localctx).key = match(STRING);
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
			setState(185); match(QUERY2I);
			setState(186); with();
			setState(187); match(INDEX);
			setState(188); ((Query2iContext)_localctx).index = match(STRING);
			setState(197);
			switch (_input.LA(1)) {
			case WITH:
			case AND:
				{
				setState(189); with();
				setState(190); match(VALUE);
				setState(191); ((Query2iContext)_localctx).exact = match(STRING);
				}
				break;
			case FROM:
				{
				setState(193); match(FROM);
				setState(194); ((Query2iContext)_localctx).vmin = match(STRING);
				setState(195); match(TO);
				setState(196); ((Query2iContext)_localctx).vmax = match(STRING);
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

	public static class MapredContext extends ParserRuleContext {
		public List<Mapred_phaseContext> mapred_phase() {
			return getRuleContexts(Mapred_phaseContext.class);
		}
		public Mapred_inputsContext mapred_inputs() {
			return getRuleContext(Mapred_inputsContext.class,0);
		}
		public Mapred_bucketContext mapred_bucket() {
			return getRuleContext(Mapred_bucketContext.class,0);
		}
		public Mapred_phaseContext mapred_phase(int i) {
			return getRuleContext(Mapred_phaseContext.class,i);
		}
		public TerminalNode MAPRED() { return getToken(ContactParser.MAPRED, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
		public MapredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred(this);
		}
	}

	public final MapredContext mapred() throws RecognitionException {
		MapredContext _localctx = new MapredContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mapred);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(MAPRED);
			setState(200); match(WITH);
			setState(203);
			switch (_input.LA(1)) {
			case INPUTS:
				{
				setState(201); mapred_inputs();
				}
				break;
			case BUCKET:
				{
				setState(202); mapred_bucket();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(205); mapred_phase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(208); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class Mapred_bucketContext extends ParserRuleContext {
		public Token name;
		public TerminalNode BUCKET() { return getToken(ContactParser.BUCKET, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Mapred_bucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_bucket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_bucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_bucket(this);
		}
	}

	public final Mapred_bucketContext mapred_bucket() throws RecognitionException {
		Mapred_bucketContext _localctx = new Mapred_bucketContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mapred_bucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(BUCKET);
			setState(211); ((Mapred_bucketContext)_localctx).name = match(STRING);
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

	public static class Mapred_phaseContext extends ParserRuleContext {
		public Mapred_keyfiltersContext mapred_keyfilters() {
			return getRuleContext(Mapred_keyfiltersContext.class,0);
		}
		public List<WithContext> with() {
			return getRuleContexts(WithContext.class);
		}
		public Mapred_langContext mapred_lang() {
			return getRuleContext(Mapred_langContext.class,0);
		}
		public WithContext with(int i) {
			return getRuleContext(WithContext.class,i);
		}
		public TerminalNode FILTERS() { return getToken(ContactParser.FILTERS, 0); }
		public TerminalNode PHASE() { return getToken(ContactParser.PHASE, 0); }
		public Mapred_phase_keepContext mapred_phase_keep() {
			return getRuleContext(Mapred_phase_keepContext.class,0);
		}
		public Mapred_phase_typeContext mapred_phase_type() {
			return getRuleContext(Mapred_phase_typeContext.class,0);
		}
		public TerminalNode DATA_CONTENT() { return getToken(ContactParser.DATA_CONTENT, 0); }
		public Mapred_phaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_phase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_phase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_phase(this);
		}
	}

	public final Mapred_phaseContext mapred_phase() throws RecognitionException {
		Mapred_phaseContext _localctx = new Mapred_phaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mapred_phase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); with();
			setState(214); match(PHASE);
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(215); with();
				setState(216); match(FILTERS);
				setState(217); mapred_keyfilters();
				}
				break;
			}
			setState(221); with();
			setState(222); mapred_lang();
			setState(223); mapred_phase_type();
			setState(225);
			_la = _input.LA(1);
			if (_la==KEEP) {
				{
				setState(224); mapred_phase_keep();
				}
			}

			setState(227); match(DATA_CONTENT);
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

	public static class Mapred_phase_typeContext extends ParserRuleContext {
		public Mapred_phase_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_phase_type; }
	 
		public Mapred_phase_typeContext() { }
		public void copyFrom(Mapred_phase_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapRedPhaseTypeLinkContext extends Mapred_phase_typeContext {
		public TerminalNode LINK() { return getToken(ContactParser.LINK, 0); }
		public MapRedPhaseTypeLinkContext(Mapred_phase_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapRedPhaseTypeLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapRedPhaseTypeLink(this);
		}
	}
	public static class MapRedPhaseTypeReduceContext extends Mapred_phase_typeContext {
		public TerminalNode REDUCE() { return getToken(ContactParser.REDUCE, 0); }
		public MapRedPhaseTypeReduceContext(Mapred_phase_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapRedPhaseTypeReduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapRedPhaseTypeReduce(this);
		}
	}
	public static class MapRedPhaseTypeMapContext extends Mapred_phase_typeContext {
		public TerminalNode MAP() { return getToken(ContactParser.MAP, 0); }
		public MapRedPhaseTypeMapContext(Mapred_phase_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapRedPhaseTypeMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapRedPhaseTypeMap(this);
		}
	}

	public final Mapred_phase_typeContext mapred_phase_type() throws RecognitionException {
		Mapred_phase_typeContext _localctx = new Mapred_phase_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mapred_phase_type);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case MAP:
				_localctx = new MapRedPhaseTypeMapContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(MAP);
				}
				break;
			case REDUCE:
				_localctx = new MapRedPhaseTypeReduceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230); match(REDUCE);
				}
				break;
			case LINK:
				_localctx = new MapRedPhaseTypeLinkContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231); match(LINK);
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

	public static class Mapred_phase_keepContext extends ParserRuleContext {
		public TerminalNode KEEP() { return getToken(ContactParser.KEEP, 0); }
		public Mapred_phase_keepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_phase_keep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_phase_keep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_phase_keep(this);
		}
	}

	public final Mapred_phase_keepContext mapred_phase_keep() throws RecognitionException {
		Mapred_phase_keepContext _localctx = new Mapred_phase_keepContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mapred_phase_keep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(KEEP);
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

	public static class Mapred_inputsContext extends ParserRuleContext {
		public PairContext pair;
		public List<PairContext> ins = new ArrayList<PairContext>();
		public TerminalNode COMMA(int i) {
			return getToken(ContactParser.COMMA, i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public TerminalNode INPUTS() { return getToken(ContactParser.INPUTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ContactParser.COMMA); }
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public Mapred_inputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_inputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_inputs(this);
		}
	}

	public final Mapred_inputsContext mapred_inputs() throws RecognitionException {
		Mapred_inputsContext _localctx = new Mapred_inputsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mapred_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(INPUTS);
			setState(237); ((Mapred_inputsContext)_localctx).pair = pair();
			((Mapred_inputsContext)_localctx).ins.add(((Mapred_inputsContext)_localctx).pair);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238); match(COMMA);
				setState(239); ((Mapred_inputsContext)_localctx).pair = pair();
				((Mapred_inputsContext)_localctx).ins.add(((Mapred_inputsContext)_localctx).pair);
				}
				}
				setState(244);
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

	public static class Mapred_input_joinContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ContactParser.NOT, 0); }
		public TerminalNode AND() { return getToken(ContactParser.AND, 0); }
		public TerminalNode OR() { return getToken(ContactParser.OR, 0); }
		public Mapred_input_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_input_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_input_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_input_join(this);
		}
	}

	public final Mapred_input_joinContext mapred_input_join() throws RecognitionException {
		Mapred_input_joinContext _localctx = new Mapred_input_joinContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mapred_input_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
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

	public static class Mapred_langContext extends ParserRuleContext {
		public Mapred_langContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_lang; }
	 
		public Mapred_langContext() { }
		public void copyFrom(Mapred_langContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapRedLangErlangContext extends Mapred_langContext {
		public TerminalNode ERLANG() { return getToken(ContactParser.ERLANG, 0); }
		public MapRedLangErlangContext(Mapred_langContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapRedLangErlang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapRedLangErlang(this);
		}
	}
	public static class MapRedLangJavascriptContext extends Mapred_langContext {
		public TerminalNode JAVASCRIPT() { return getToken(ContactParser.JAVASCRIPT, 0); }
		public MapRedLangJavascriptContext(Mapred_langContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapRedLangJavascript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapRedLangJavascript(this);
		}
	}

	public final Mapred_langContext mapred_lang() throws RecognitionException {
		Mapred_langContext _localctx = new Mapred_langContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mapred_lang);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case JAVASCRIPT:
				_localctx = new MapRedLangJavascriptContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247); match(JAVASCRIPT);
				}
				break;
			case ERLANG:
				_localctx = new MapRedLangErlangContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248); match(ERLANG);
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

	public static class Mapred_keyfiltersContext extends ParserRuleContext {
		public TerminalNode COMMA(int i) {
			return getToken(ContactParser.COMMA, i);
		}
		public Mapred_keyfilterContext mapred_keyfilter(int i) {
			return getRuleContext(Mapred_keyfilterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ContactParser.COMMA); }
		public Mapred_input_joinContext mapred_input_join(int i) {
			return getRuleContext(Mapred_input_joinContext.class,i);
		}
		public List<Mapred_input_joinContext> mapred_input_join() {
			return getRuleContexts(Mapred_input_joinContext.class);
		}
		public List<Mapred_keyfilterContext> mapred_keyfilter() {
			return getRuleContexts(Mapred_keyfilterContext.class);
		}
		public Mapred_keyfiltersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_keyfilters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_keyfilters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_keyfilters(this);
		}
	}

	public final Mapred_keyfiltersContext mapred_keyfilters() throws RecognitionException {
		Mapred_keyfiltersContext _localctx = new Mapred_keyfiltersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mapred_keyfilters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251); mapred_keyfilter();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(252); mapred_input_join();
					setState(253); mapred_keyfilter();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260); match(COMMA);
				setState(261); mapred_keyfilter();
				}
				}
				setState(266);
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

	public static class Mapred_keyfilterContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(ContactParser.RPAREN, 0); }
		public Mapred_keyfilter_argsContext mapred_keyfilter_args() {
			return getRuleContext(Mapred_keyfilter_argsContext.class,0);
		}
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ContactParser.LPAREN, 0); }
		public Mapred_keyfilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_keyfilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_keyfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_keyfilter(this);
		}
	}

	public final Mapred_keyfilterContext mapred_keyfilter() throws RecognitionException {
		Mapred_keyfilterContext _localctx = new Mapred_keyfilterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mapred_keyfilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(ID);
			setState(268); match(LPAREN);
			setState(270);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(269); mapred_keyfilter_args();
				}
			}

			setState(272); match(RPAREN);
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

	public static class Mapred_keyfilter_argsContext extends ParserRuleContext {
		public TerminalNode COMMA(int i) {
			return getToken(ContactParser.COMMA, i);
		}
		public List<Mapred_keyfilter_argContext> mapred_keyfilter_arg() {
			return getRuleContexts(Mapred_keyfilter_argContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(ContactParser.COMMA); }
		public Mapred_keyfilter_argContext mapred_keyfilter_arg(int i) {
			return getRuleContext(Mapred_keyfilter_argContext.class,i);
		}
		public Mapred_keyfilter_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_keyfilter_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_keyfilter_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_keyfilter_args(this);
		}
	}

	public final Mapred_keyfilter_argsContext mapred_keyfilter_args() throws RecognitionException {
		Mapred_keyfilter_argsContext _localctx = new Mapred_keyfilter_argsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mapred_keyfilter_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); mapred_keyfilter_arg();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(275); match(COMMA);
				setState(276); mapred_keyfilter_arg();
				}
				}
				setState(281);
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

	public static class Mapred_keyfilter_argContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ContactParser.INT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Mapred_keyfilter_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapred_keyfilter_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterMapred_keyfilter_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitMapred_keyfilter_arg(this);
		}
	}

	public final Mapred_keyfilter_argContext mapred_keyfilter_arg() throws RecognitionException {
		Mapred_keyfilter_argContext _localctx = new Mapred_keyfilter_argContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mapred_keyfilter_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(282); match(STRING);
				}
				break;
			case INT:
				{
				setState(283); match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(284); bool();
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
		enterRule(_localctx, 60, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(USE);
			setState(292);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				{
				setState(288); match(BUCKET);
				setState(289); ((UseContext)_localctx).name = match(STRING);
				}
				}
				break;
			case CONN:
				{
				{
				setState(290); match(CONN);
				setState(291); ((UseContext)_localctx).var = match(ID);
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
		enterRule(_localctx, 62, RULE_connect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(CONNECT);
			setState(303);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(295); match(DEFAULT);
				}
				break;
			case STRING:
				{
				setState(296); ((ConnectContext)_localctx).host = match(STRING);
				setState(297); match(PB);
				setState(298); ((ConnectContext)_localctx).pbport = match(INT);
				setState(301);
				_la = _input.LA(1);
				if (_la==HTTP) {
					{
					setState(299); match(HTTP);
					setState(300); ((ConnectContext)_localctx).httpport = match(INT);
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
		enterRule(_localctx, 64, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(SET);
			setState(306); set_action();
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
		enterRule(_localctx, 66, RULE_set_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); match(ACTION);
			setState(309); ((Set_actionContext)_localctx).actionname = match(ID);
			setState(310); match(WITH);
			setState(311); code_string();
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
		enterRule(_localctx, 68, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(GET);
			setState(316);
			switch (_input.LA(1)) {
			case ACTION:
				{
				setState(314); get_action();
				}
				break;
			case BUCKET:
				{
				setState(315); get_bucketprops();
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
		enterRule(_localctx, 70, RULE_get_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(ACTION);
			setState(319); ((Get_actionContext)_localctx).actionname = match(ID);
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
		enterRule(_localctx, 72, RULE_get_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(BUCKET);
			setState(322); match(PROPERTIES);
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
			setState(326);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(324); ((PairContext)_localctx).name = match(STRING);
				}
				break;
			case ID:
				{
				setState(325); ((PairContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(328); match(EQUALS);
			setState(329); pairValue();
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
			setState(334);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PairStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(331); ((PairStringValueContext)_localctx).stringValue = match(STRING);
				}
				break;
			case INT:
				_localctx = new PairIntValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(332); ((PairIntValueContext)_localctx).intValue = match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new PairBoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(333); ((PairBoolValueContext)_localctx).boolValue = bool();
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
			setState(336); match(JAVASCRIPT);
			setState(337);
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
			setState(339);
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
		"\2\3?\u0158\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\3\2\6\2V\n\2\r\2\16\2W\3\2\3\2\3\3\5\3]\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3e\n\3\3\3\3\3\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\b\5\b\u0082"+
		"\n\b\3\t\3\t\3\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16"+
		"\u009e\n\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00a6\n\17\3\17\3\17\3"+
		"\17\5\17\u00ab\n\17\3\20\3\20\3\20\3\20\7\20\u00b1\n\20\f\20\16\20\u00b4"+
		"\13\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00c8\n\23\3\24\3\24\3\24\3\24\5\24\u00ce"+
		"\n\24\3\24\6\24\u00d1\n\24\r\24\16\24\u00d2\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00de\n\26\3\26\3\26\3\26\3\26\5\26\u00e4\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u00eb\n\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\7\31\u00f3\n\31\f\31\16\31\u00f6\13\31\3\32\3\32\3\33\3\33\5\33\u00fc"+
		"\n\33\3\34\3\34\3\34\3\34\7\34\u0102\n\34\f\34\16\34\u0105\13\34\3\34"+
		"\3\34\7\34\u0109\n\34\f\34\16\34\u010c\13\34\3\35\3\35\3\35\5\35\u0111"+
		"\n\35\3\35\3\35\3\36\3\36\3\36\7\36\u0118\n\36\f\36\16\36\u011b\13\36"+
		"\3\37\3\37\3\37\5\37\u0120\n\37\3 \3 \3 \3 \3 \5 \u0127\n \3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u0130\n!\5!\u0132\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\5$\u013f\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\5\'\u0149\n\'\3\'\3\'\3\'\3(\3"+
		"(\3(\5(\u0151\n(\3)\3)\3)\3*\3*\3*\2+\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\b\4\16\16\20\20\3/\61\3;<"+
		"\3\20\22\3;<\3)*\u0159\2U\3\2\2\2\4\\\3\2\2\2\6k\3\2\2\2\bm\3\2\2\2\n"+
		"q\3\2\2\2\fv\3\2\2\2\16~\3\2\2\2\20\u0083\3\2\2\2\22\u0089\3\2\2\2\24"+
		"\u008c\3\2\2\2\26\u008f\3\2\2\2\30\u0097\3\2\2\2\32\u009a\3\2\2\2\34\u00a3"+
		"\3\2\2\2\36\u00b2\3\2\2\2 \u00b5\3\2\2\2\"\u00b8\3\2\2\2$\u00bb\3\2\2"+
		"\2&\u00c9\3\2\2\2(\u00d4\3\2\2\2*\u00d7\3\2\2\2,\u00ea\3\2\2\2.\u00ec"+
		"\3\2\2\2\60\u00ee\3\2\2\2\62\u00f7\3\2\2\2\64\u00fb\3\2\2\2\66\u00fd\3"+
		"\2\2\28\u010d\3\2\2\2:\u0114\3\2\2\2<\u011f\3\2\2\2>\u0121\3\2\2\2@\u0128"+
		"\3\2\2\2B\u0133\3\2\2\2D\u0136\3\2\2\2F\u013b\3\2\2\2H\u0140\3\2\2\2J"+
		"\u0143\3\2\2\2L\u0148\3\2\2\2N\u0150\3\2\2\2P\u0152\3\2\2\2R\u0155\3\2"+
		"\2\2TV\5\4\3\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\1"+
		"\2\2Z\3\3\2\2\2[]\5\b\5\2\\[\3\2\2\2\\]\3\2\2\2]d\3\2\2\2^e\5@!\2_e\5"+
		"\n\6\2`e\5\16\b\2ae\5> \2be\5\22\n\2ce\5\6\4\2d^\3\2\2\2d_\3\2\2\2d`\3"+
		"\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fg\78\2\2g\5\3\2\2\2hl\5"+
		"F$\2il\5B\"\2jl\5\34\17\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\7\3\2\2\2mn\7"+
		"\3\2\2no\79\2\2op\7\67\2\2p\t\3\2\2\2qr\7\r\2\2rs\7\17\2\2st\7;\2\2tu"+
		"\5\16\b\2u\13\3\2\2\2vw\t\2\2\2w\r\3\2\2\2x\177\5\30\r\2y\177\5\32\16"+
		"\2z\177\5\"\22\2{\177\5$\23\2|\177\5&\24\2}\177\5\24\13\2~x\3\2\2\2~y"+
		"\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"\u0082\5\20\t\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\17\3\2\2"+
		"\2\u0083\u0084\5\f\7\2\u0084\u0087\7\23\2\2\u0085\u0088\5\26\f\2\u0086"+
		"\u0088\79\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\21\3\2\2\2"+
		"\u0089\u008a\7&\2\2\u008a\u008b\7\'\2\2\u008b\23\3\2\2\2\u008c\u008d\7"+
		"&\2\2\u008d\u008e\7(\2\2\u008e\25\3\2\2\2\u008f\u0094\5L\'\2\u0090\u0091"+
		"\7\62\2\2\u0091\u0093\5L\'\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\27\3\2\2\2\u0096\u0094\3\2\2"+
		"\2\u0097\u0098\7\6\2\2\u0098\u0099\7;\2\2\u0099\31\3\2\2\2\u009a\u009d"+
		"\7\7\2\2\u009b\u009e\7;\2\2\u009c\u009e\79\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\5"+
		"\f\7\2\u00a1\u00a2\5 \21\2\u00a2\33\3\2\2\2\u00a3\u00a5\7#\2\2\u00a4\u00a6"+
		"\79\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7"+
		"\u00a8\5\f\7\2\u00a8\u00a9\7$\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae"+
		"\7\32\2\2\u00ae\u00af\5L\'\2\u00af\u00b1\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\37\3\2\2"+
		"\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\t\3\2\2\u00b6\u00b7\t\4\2\2\u00b7!"+
		"\3\2\2\2\u00b8\u00b9\7\b\2\2\u00b9\u00ba\7;\2\2\u00ba#\3\2\2\2\u00bb\u00bc"+
		"\7\24\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7\32\2\2\u00be\u00c7\7;\2\2"+
		"\u00bf\u00c0\5\f\7\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\7;\2\2\u00c2\u00c8"+
		"\3\2\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c5\7;\2\2\u00c5\u00c6\7\33\2\2"+
		"\u00c6\u00c8\7;\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8%\3\2"+
		"\2\2\u00c9\u00ca\7\30\2\2\u00ca\u00cd\7\16\2\2\u00cb\u00ce\5\60\31\2\u00cc"+
		"\u00ce\5(\25\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00d1\5*\26\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00d5\7\17\2"+
		"\2\u00d5\u00d6\7;\2\2\u00d6)\3\2\2\2\u00d7\u00d8\5\f\7\2\u00d8\u00dd\7"+
		"\"\2\2\u00d9\u00da\5\f\7\2\u00da\u00db\7\35\2\2\u00db\u00dc\5\66\34\2"+
		"\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\5\f\7\2\u00e0\u00e1\5\64\33\2\u00e1\u00e3\5,\27\2"+
		"\u00e2\u00e4\5.\30\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\7<\2\2\u00e6+\3\2\2\2\u00e7\u00eb\7\25\2\2\u00e8"+
		"\u00eb\7\26\2\2\u00e9\u00eb\7\27\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00e9\3\2\2\2\u00eb-\3\2\2\2\u00ec\u00ed\7\36\2\2\u00ed/"+
		"\3\2\2\2\u00ee\u00ef\7\34\2\2\u00ef\u00f4\5L\'\2\u00f0\u00f1\7\62\2\2"+
		"\u00f1\u00f3\5L\'\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\61\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\t\5\2\2\u00f8\63\3\2\2\2\u00f9\u00fc\7\37\2\2\u00fa\u00fc\7 \2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\65\3\2\2\2\u00fd\u0103"+
		"\58\35\2\u00fe\u00ff\5\62\32\2\u00ff\u0100\58\35\2\u0100\u0102\3\2\2\2"+
		"\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u010a\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\62\2\2"+
		"\u0107\u0109\58\35\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\67\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010e\79\2\2\u010e\u0110\7\65\2\2\u010f\u0111\5:\36\2\u0110\u010f\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\66\2\2\u0113"+
		"9\3\2\2\2\u0114\u0119\5<\37\2\u0115\u0116\7\62\2\2\u0116\u0118\5<\37\2"+
		"\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a;\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0120\7;\2\2\u011d\u0120"+
		"\7:\2\2\u011e\u0120\5R*\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120=\3\2\2\2\u0121\u0126\7\f\2\2\u0122\u0123\7\17\2\2"+
		"\u0123\u0127\7;\2\2\u0124\u0125\7\n\2\2\u0125\u0127\79\2\2\u0126\u0122"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0127?\3\2\2\2\u0128\u0131\7\13\2\2\u0129"+
		"\u0132\7+\2\2\u012a\u012b\7;\2\2\u012b\u012c\7\4\2\2\u012c\u012f\7:\2"+
		"\2\u012d\u012e\7\5\2\2\u012e\u0130\7:\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012a\3\2\2\2\u0132"+
		"A\3\2\2\2\u0133\u0134\7,\2\2\u0134\u0135\5D#\2\u0135C\3\2\2\2\u0136\u0137"+
		"\7.\2\2\u0137\u0138\79\2\2\u0138\u0139\7\16\2\2\u0139\u013a\5P)\2\u013a"+
		"E\3\2\2\2\u013b\u013e\7-\2\2\u013c\u013f\5H%\2\u013d\u013f\5J&\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013fG\3\2\2\2\u0140\u0141\7.\2\2\u0141"+
		"\u0142\79\2\2\u0142I\3\2\2\2\u0143\u0144\7\17\2\2\u0144\u0145\7%\2\2\u0145"+
		"K\3\2\2\2\u0146\u0149\7;\2\2\u0147\u0149\79\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7\67\2\2\u014b\u014c\5"+
		"N(\2\u014cM\3\2\2\2\u014d\u0151\7;\2\2\u014e\u0151\7:\2\2\u014f\u0151"+
		"\5R*\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"O\3\2\2\2\u0152\u0153\7\37\2\2\u0153\u0154\t\6\2\2\u0154Q\3\2\2\2\u0155"+
		"\u0156\t\7\2\2\u0156S\3\2\2\2!W\\dk~\u0081\u0087\u0094\u009d\u00a5\u00aa"+
		"\u00b2\u00c7\u00cd\u00d2\u00dd\u00e3\u00ea\u00f4\u00fb\u0103\u010a\u0110"+
		"\u0119\u011f\u0126\u012f\u0131\u013e\u0148\u0150";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}