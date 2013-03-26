/*
 * -------------------------------------------------------------------
 * Contact: a language and interactive shell for Riak
 *
 * Copyright (c) 2013 Dave Parfitt
 *
 * This file is provided to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * -------------------------------------------------------------------
 */

// Generated from ./src/main/java/com/basho/contact/Contact.g4 by ANTLR 4.0
package com.basho.contact;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ContactLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, PB=2, HTTP=3, FETCH=4, STORE=5, DELETE=6, VALUE=7, CONN=8, CONNECT=9, 
		USE=10, USING=11, WITH=12, BUCKET=13, AND=14, OR=15, NOT=16, OPTIONS=17, 
		QUERY2I=18, MAP=19, REDUCE=20, LINK=21, MAPRED=22, FROM=23, INDEX=24, 
		TO=25, INPUTS=26, FILTERS=27, KEEP=28, JAVASCRIPT=29, ERLANG=30, JAVA=31, 
		PHASE=32, DETAIL=33, PROPERTIES=34, LIST=35, BUCKETS=36, KEYS=37, TRUE=38, 
		FALSE=39, DEFAULT=40, SET=41, GET=42, ACTION=43, JSON=44, TEXT=45, XML=46, 
		COMMA=47, LSQUARE=48, RSQUARE=49, LPAREN=50, RPAREN=51, EQUALS=52, SEMI=53, 
		ID=54, INT=55, STRING=56, DATA_CONTENT=57, LINE_COMMENT=58, COMMENT=59, 
		WS=60;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'let'", "'pb'", "'http'", "'fetch'", "'store'", "'delete'", "'value'", 
		"'connection'", "'connect'", "'use'", "'using'", "'with'", "'bucket'", 
		"'and'", "'or'", "'not'", "'options'", "'query2i'", "'map'", "'reduce'", 
		"'link'", "'mapred'", "'from'", "'index'", "'to'", "'inputs'", "'filters'", 
		"'keep'", "'javascript'", "'erlang'", "'java'", "'phase'", "'detail'", 
		"'properties'", "'list'", "'buckets'", "'keys'", "'true'", "'false'", 
		"'default'", "'set'", "'get'", "'action'", "'json'", "'text'", "'xml'", 
		"','", "'['", "']'", "'('", "')'", "'='", "';'", "ID", "INT", "STRING", 
		"DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"LET", "PB", "HTTP", "FETCH", "STORE", "DELETE", "VALUE", "CONN", "CONNECT", 
		"USE", "USING", "WITH", "BUCKET", "AND", "OR", "NOT", "OPTIONS", "QUERY2I", 
		"MAP", "REDUCE", "LINK", "MAPRED", "FROM", "INDEX", "TO", "INPUTS", "FILTERS", 
		"KEEP", "JAVASCRIPT", "ERLANG", "JAVA", "PHASE", "DETAIL", "PROPERTIES", 
		"LIST", "BUCKETS", "KEYS", "TRUE", "FALSE", "DEFAULT", "SET", "GET", "ACTION", 
		"JSON", "TEXT", "XML", "COMMA", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", 
		"EQUALS", "SEMI", "ID", "INT", "STRING", "ESC", "DATA_CONTENT", "DATA_ESC", 
		"LINE_COMMENT", "COMMENT", "WS"
	};


	public ContactLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Contact.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 59: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 60: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 61: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4>\u01fa\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\7\67\u01a3"+
		"\n\67\f\67\16\67\u01a6\13\67\38\68\u01a9\n8\r8\168\u01aa\39\39\39\79\u01b0"+
		"\n9\f9\169\u01b3\139\39\39\3:\3:\3:\3:\5:\u01bb\n:\3;\3;\3;\3;\3;\3;\7"+
		";\u01c3\n;\f;\16;\u01c6\13;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01d4"+
		"\n<\3=\3=\3=\3=\7=\u01da\n=\f=\16=\u01dd\13=\3=\5=\u01e0\n=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\7>\u01ea\n>\f>\16>\u01ed\13>\3>\3>\3>\3>\3>\3?\6?\u01f5"+
		"\n?\r?\16?\u01f6\3?\3?\6\u01b1\u01c4\u01db\u01eb@\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32"+
		"\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'"+
		"\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1"+
		"i\66\1k\67\1m8\1o9\1q:\1s\2\1u;\1w\2\1y<\2{=\3}>\4\3\2\6\3c|\5C\\aac|"+
		"\3\62;\5\13\f\17\17\"\"\u0203\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2u\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0083\3\2\2\2\7\u0086\3\2"+
		"\2\2\t\u008b\3\2\2\2\13\u0091\3\2\2\2\r\u0097\3\2\2\2\17\u009e\3\2\2\2"+
		"\21\u00a4\3\2\2\2\23\u00af\3\2\2\2\25\u00b7\3\2\2\2\27\u00bb\3\2\2\2\31"+
		"\u00c1\3\2\2\2\33\u00c6\3\2\2\2\35\u00cd\3\2\2\2\37\u00d1\3\2\2\2!\u00d4"+
		"\3\2\2\2#\u00d8\3\2\2\2%\u00e0\3\2\2\2\'\u00e8\3\2\2\2)\u00ec\3\2\2\2"+
		"+\u00f3\3\2\2\2-\u00f8\3\2\2\2/\u00ff\3\2\2\2\61\u0104\3\2\2\2\63\u010a"+
		"\3\2\2\2\65\u010d\3\2\2\2\67\u0114\3\2\2\29\u011c\3\2\2\2;\u0121\3\2\2"+
		"\2=\u012c\3\2\2\2?\u0133\3\2\2\2A\u0138\3\2\2\2C\u013e\3\2\2\2E\u0145"+
		"\3\2\2\2G\u0150\3\2\2\2I\u0155\3\2\2\2K\u015d\3\2\2\2M\u0162\3\2\2\2O"+
		"\u0167\3\2\2\2Q\u016d\3\2\2\2S\u0175\3\2\2\2U\u0179\3\2\2\2W\u017d\3\2"+
		"\2\2Y\u0184\3\2\2\2[\u0189\3\2\2\2]\u018e\3\2\2\2_\u0192\3\2\2\2a\u0194"+
		"\3\2\2\2c\u0196\3\2\2\2e\u0198\3\2\2\2g\u019a\3\2\2\2i\u019c\3\2\2\2k"+
		"\u019e\3\2\2\2m\u01a0\3\2\2\2o\u01a8\3\2\2\2q\u01ac\3\2\2\2s\u01ba\3\2"+
		"\2\2u\u01bc\3\2\2\2w\u01d3\3\2\2\2y\u01d5\3\2\2\2{\u01e5\3\2\2\2}\u01f4"+
		"\3\2\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082"+
		"\4\3\2\2\2\u0083\u0084\7r\2\2\u0084\u0085\7d\2\2\u0085\6\3\2\2\2\u0086"+
		"\u0087\7j\2\2\u0087\u0088\7v\2\2\u0088\u0089\7v\2\2\u0089\u008a\7r\2\2"+
		"\u008a\b\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7g\2\2\u008d\u008e\7v"+
		"\2\2\u008e\u008f\7e\2\2\u008f\u0090\7j\2\2\u0090\n\3\2\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u0093\7v\2\2\u0093\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095"+
		"\u0096\7g\2\2\u0096\f\3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2"+
		"\u009d\16\3\2\2\2\u009e\u009f\7x\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7"+
		"n\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7g\2\2\u00a3\20\3\2\2\2\u00a4\u00a5"+
		"\7e\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7k\2\2"+
		"\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7"+
		"e\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7v\2\2\u00b6\24\3\2\2\2\u00b7\u00b8"+
		"\7w\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba\26\3\2\2\2\u00bb\u00bc"+
		"\7w\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7i\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7v\2\2\u00c4\u00c5\7j\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7"+
		"\u00c8\7w\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7m\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb\u00cc\7v\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7"+
		"p\2\2\u00cf\u00d0\7f\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3 \3\2\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7"+
		"\7v\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7r\2\2\u00da\u00db"+
		"\7v\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7u\2\2\u00df$\3\2\2\2\u00e0\u00e1\7s\2\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7{\2\2\u00e5\u00e6\7\64\2"+
		"\2\u00e6\u00e7\7k\2\2\u00e7&\3\2\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7"+
		"c\2\2\u00ea\u00eb\7r\2\2\u00eb(\3\2\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee"+
		"\7g\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7e\2\2\u00f1"+
		"\u00f2\7g\2\2\u00f2*\3\2\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7k\2\2\u00f5"+
		"\u00f6\7p\2\2\u00f6\u00f7\7m\2\2\u00f7,\3\2\2\2\u00f8\u00f9\7o\2\2\u00f9"+
		"\u00fa\7c\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7g\2\2"+
		"\u00fd\u00fe\7f\2\2\u00fe.\3\2\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7t\2"+
		"\2\u0101\u0102\7q\2\2\u0102\u0103\7o\2\2\u0103\60\3\2\2\2\u0104\u0105"+
		"\7k\2\2\u0105\u0106\7p\2\2\u0106\u0107\7f\2\2\u0107\u0108\7g\2\2\u0108"+
		"\u0109\7z\2\2\u0109\62\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c\7q\2\2\u010c"+
		"\64\3\2\2\2\u010d\u010e\7k\2\2\u010e\u010f\7p\2\2\u010f\u0110\7r\2\2\u0110"+
		"\u0111\7w\2\2\u0111\u0112\7v\2\2\u0112\u0113\7u\2\2\u0113\66\3\2\2\2\u0114"+
		"\u0115\7h\2\2\u0115\u0116\7k\2\2\u0116\u0117\7n\2\2\u0117\u0118\7v\2\2"+
		"\u0118\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a\u011b\7u\2\2\u011b8\3\2\2"+
		"\2\u011c\u011d\7m\2\2\u011d\u011e\7g\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7r\2\2\u0120:\3\2\2\2\u0121\u0122\7l\2\2\u0122\u0123\7c\2\2\u0123\u0124"+
		"\7x\2\2\u0124\u0125\7c\2\2\u0125\u0126\7u\2\2\u0126\u0127\7e\2\2\u0127"+
		"\u0128\7t\2\2\u0128\u0129\7k\2\2\u0129\u012a\7r\2\2\u012a\u012b\7v\2\2"+
		"\u012b<\3\2\2\2\u012c\u012d\7g\2\2\u012d\u012e\7t\2\2\u012e\u012f\7n\2"+
		"\2\u012f\u0130\7c\2\2\u0130\u0131\7p\2\2\u0131\u0132\7i\2\2\u0132>\3\2"+
		"\2\2\u0133\u0134\7l\2\2\u0134\u0135\7c\2\2\u0135\u0136\7x\2\2\u0136\u0137"+
		"\7c\2\2\u0137@\3\2\2\2\u0138\u0139\7r\2\2\u0139\u013a\7j\2\2\u013a\u013b"+
		"\7c\2\2\u013b\u013c\7u\2\2\u013c\u013d\7g\2\2\u013dB\3\2\2\2\u013e\u013f"+
		"\7f\2\2\u013f\u0140\7g\2\2\u0140\u0141\7v\2\2\u0141\u0142\7c\2\2\u0142"+
		"\u0143\7k\2\2\u0143\u0144\7n\2\2\u0144D\3\2\2\2\u0145\u0146\7r\2\2\u0146"+
		"\u0147\7t\2\2\u0147\u0148\7q\2\2\u0148\u0149\7r\2\2\u0149\u014a\7g\2\2"+
		"\u014a\u014b\7t\2\2\u014b\u014c\7v\2\2\u014c\u014d\7k\2\2\u014d\u014e"+
		"\7g\2\2\u014e\u014f\7u\2\2\u014fF\3\2\2\2\u0150\u0151\7n\2\2\u0151\u0152"+
		"\7k\2\2\u0152\u0153\7u\2\2\u0153\u0154\7v\2\2\u0154H\3\2\2\2\u0155\u0156"+
		"\7d\2\2\u0156\u0157\7w\2\2\u0157\u0158\7e\2\2\u0158\u0159\7m\2\2\u0159"+
		"\u015a\7g\2\2\u015a\u015b\7v\2\2\u015b\u015c\7u\2\2\u015cJ\3\2\2\2\u015d"+
		"\u015e\7m\2\2\u015e\u015f\7g\2\2\u015f\u0160\7{\2\2\u0160\u0161\7u\2\2"+
		"\u0161L\3\2\2\2\u0162\u0163\7v\2\2\u0163\u0164\7t\2\2\u0164\u0165\7w\2"+
		"\2\u0165\u0166\7g\2\2\u0166N\3\2\2\2\u0167\u0168\7h\2\2\u0168\u0169\7"+
		"c\2\2\u0169\u016a\7n\2\2\u016a\u016b\7u\2\2\u016b\u016c\7g\2\2\u016cP"+
		"\3\2\2\2\u016d\u016e\7f\2\2\u016e\u016f\7g\2\2\u016f\u0170\7h\2\2\u0170"+
		"\u0171\7c\2\2\u0171\u0172\7w\2\2\u0172\u0173\7n\2\2\u0173\u0174\7v\2\2"+
		"\u0174R\3\2\2\2\u0175\u0176\7u\2\2\u0176\u0177\7g\2\2\u0177\u0178\7v\2"+
		"\2\u0178T\3\2\2\2\u0179\u017a\7i\2\2\u017a\u017b\7g\2\2\u017b\u017c\7"+
		"v\2\2\u017cV\3\2\2\2\u017d\u017e\7c\2\2\u017e\u017f\7e\2\2\u017f\u0180"+
		"\7v\2\2\u0180\u0181\7k\2\2\u0181\u0182\7q\2\2\u0182\u0183\7p\2\2\u0183"+
		"X\3\2\2\2\u0184\u0185\7l\2\2\u0185\u0186\7u\2\2\u0186\u0187\7q\2\2\u0187"+
		"\u0188\7p\2\2\u0188Z\3\2\2\2\u0189\u018a\7v\2\2\u018a\u018b\7g\2\2\u018b"+
		"\u018c\7z\2\2\u018c\u018d\7v\2\2\u018d\\\3\2\2\2\u018e\u018f\7z\2\2\u018f"+
		"\u0190\7o\2\2\u0190\u0191\7n\2\2\u0191^\3\2\2\2\u0192\u0193\7.\2\2\u0193"+
		"`\3\2\2\2\u0194\u0195\7]\2\2\u0195b\3\2\2\2\u0196\u0197\7_\2\2\u0197d"+
		"\3\2\2\2\u0198\u0199\7*\2\2\u0199f\3\2\2\2\u019a\u019b\7+\2\2\u019bh\3"+
		"\2\2\2\u019c\u019d\7?\2\2\u019dj\3\2\2\2\u019e\u019f\7=\2\2\u019fl\3\2"+
		"\2\2\u01a0\u01a4\t\2\2\2\u01a1\u01a3\t\3\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5n\3\2\2\2"+
		"\u01a6\u01a4\3\2\2\2\u01a7\u01a9\t\4\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abp\3\2\2\2\u01ac"+
		"\u01b1\7$\2\2\u01ad\u01b0\5s:\2\u01ae\u01b0\13\2\2\2\u01af\u01ad\3\2\2"+
		"\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7$\2\2\u01b5"+
		"r\3\2\2\2\u01b6\u01b7\7^\2\2\u01b7\u01bb\7$\2\2\u01b8\u01b9\7^\2\2\u01b9"+
		"\u01bb\7^\2\2\u01ba\u01b6\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bbt\3\2\2\2\u01bc"+
		"\u01bd\7\u0080\2\2\u01bd\u01be\7\'\2\2\u01be\u01bf\7\u0080\2\2\u01bf\u01c4"+
		"\3\2\2\2\u01c0\u01c3\5w<\2\u01c1\u01c3\13\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7\u0080\2\2\u01c8"+
		"\u01c9\7\'\2\2\u01c9\u01ca\7\u0080\2\2\u01cav\3\2\2\2\u01cb\u01cc\7^\2"+
		"\2\u01cc\u01cd\7\u0080\2\2\u01cd\u01ce\7\'\2\2\u01ce\u01d4\7\u0080\2\2"+
		"\u01cf\u01d0\7^\2\2\u01d0\u01d1\7\u0080\2\2\u01d1\u01d2\7\'\2\2\u01d2"+
		"\u01d4\7\u0080\2\2\u01d3\u01cb\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d4x\3\2"+
		"\2\2\u01d5\u01d6\7\61\2\2\u01d6\u01d7\7\61\2\2\u01d7\u01db\3\2\2\2\u01d8"+
		"\u01da\13\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01dc\3"+
		"\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01e0\7\17\2\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3"+
		"\2\2\2\u01e1\u01e2\7\f\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\b=\2\2\u01e4"+
		"z\3\2\2\2\u01e5\u01e6\7\61\2\2\u01e6\u01e7\7,\2\2\u01e7\u01eb\3\2\2\2"+
		"\u01e8\u01ea\13\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01ef\7,\2\2\u01ef\u01f0\7\61\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\b>"+
		"\3\2\u01f2|\3\2\2\2\u01f3\u01f5\t\5\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\b?\4\2\u01f9~\3\2\2\2\17\2\u01a4\u01aa\u01af\u01b1\u01ba\u01c2"+
		"\u01c4\u01d3\u01db\u01df\u01eb\u01f6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}