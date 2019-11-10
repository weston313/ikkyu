// Generated from /Users/wozipa/ProductCode/ikkyu/ikkyu-dsl/src/main/antlr/DslLine.g4 by ANTLR 4.7.2

    package org.ikkyu.dsl.antlr.line;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DslLineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEMPLATE=7, ADD=8, STRING=9, 
		BIGINT_LITERAL=10, SMALLINT_LITERAL=11, TINYINT_LITERAL=12, INTEGER_VALUE=13, 
		DECIMAL_VALUE=14, DOUBLE_LITERAL=15, BIGDECIMAL_LITERAL=16, IDENTIFIER=17, 
		BACKQUOTED_IDENTIFIER=18, SIMPLE_COMMENT=19, BRACKETED_EMPTY_COMMENT=20, 
		BRACKETED_COMMENT=21, WS=22, UNRECOGNIZED=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TEMPLATE", "ADD", "STRING", 
			"BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "DECIMAL_DIGITS", "EXPONENT", "DIGIT", "LETTER", 
			"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'{'", "'}'", "'TEMPLATE'", "'ADD'", 
			null, null, null, null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TEMPLATE", "ADD", "STRING", 
			"BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	  /**
	   * When true, ANSI SQL parsing mode is enabled.
	   */
	  public boolean ansi = false;


	public DslLineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DslLine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return DECIMAL_VALUE_sempred((RuleContext)_localctx, predIndex);
		case 14:
			return DOUBLE_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 15:
			return BIGDECIMAL_LITERAL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean DECIMAL_VALUE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isValidDecimal();
		}
		return true;
	}
	private boolean DOUBLE_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return isValidDecimal();
		}
		return true;
	}
	private boolean BIGDECIMAL_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return isValidDecimal();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u011d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\7\nW\n\n\f\n\16\nZ\13\n\3\n\3\n\3\n\3\n\3\n\7\na\n\n\f\n"+
		"\16\nd\13\n\3\n\5\ng\n\n\3\13\6\13j\n\13\r\13\16\13k\3\13\3\13\3\f\6\f"+
		"q\n\f\r\f\16\fr\3\f\3\f\3\r\6\rx\n\r\r\r\16\ry\3\r\3\r\3\16\6\16\177\n"+
		"\16\r\16\16\16\u0080\3\17\6\17\u0084\n\17\r\17\16\17\u0085\3\17\3\17\3"+
		"\17\3\17\5\17\u008c\n\17\3\17\3\17\5\17\u0090\n\17\3\20\6\20\u0093\n\20"+
		"\r\20\16\20\u0094\3\20\5\20\u0098\n\20\3\20\3\20\3\20\3\20\5\20\u009e"+
		"\n\20\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\6\21\u00a6\n\21\r\21\16\21\u00a7"+
		"\3\21\5\21\u00ab\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b2\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00b9\n\21\3\22\3\22\3\22\6\22\u00be\n\22\r\22"+
		"\16\22\u00bf\3\23\3\23\3\23\3\23\7\23\u00c6\n\23\f\23\16\23\u00c9\13\23"+
		"\3\23\3\23\3\24\6\24\u00ce\n\24\r\24\16\24\u00cf\3\24\3\24\7\24\u00d4"+
		"\n\24\f\24\16\24\u00d7\13\24\3\24\3\24\6\24\u00db\n\24\r\24\16\24\u00dc"+
		"\5\24\u00df\n\24\3\25\3\25\5\25\u00e3\n\25\3\25\6\25\u00e6\n\25\r\25\16"+
		"\25\u00e7\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00f2\n\30\f\30"+
		"\16\30\u00f5\13\30\3\30\5\30\u00f8\n\30\3\30\5\30\u00fb\n\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u010b"+
		"\n\32\f\32\16\32\u010e\13\32\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u0116"+
		"\n\33\r\33\16\33\u0117\3\33\3\33\3\34\3\34\3\u010c\2\35\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\2)\2+\2-\2/\25\61\26\63\27\65\30\67\31\3\2\13\4\2))^^\4\2$$^^\3"+
		"\2bb\4\2--//\3\2\62;\3\2C\\\4\2\f\f\17\17\3\2--\5\2\13\f\17\17\"\"\2\u013c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3"+
		"\2\2\2\17E\3\2\2\2\21N\3\2\2\2\23f\3\2\2\2\25i\3\2\2\2\27p\3\2\2\2\31"+
		"w\3\2\2\2\33~\3\2\2\2\35\u008f\3\2\2\2\37\u00a2\3\2\2\2!\u00b8\3\2\2\2"+
		"#\u00bd\3\2\2\2%\u00c1\3\2\2\2\'\u00de\3\2\2\2)\u00e0\3\2\2\2+\u00e9\3"+
		"\2\2\2-\u00eb\3\2\2\2/\u00ed\3\2\2\2\61\u00fe\3\2\2\2\63\u0105\3\2\2\2"+
		"\65\u0115\3\2\2\2\67\u011b\3\2\2\29:\7=\2\2:\4\3\2\2\2;<\7*\2\2<\6\3\2"+
		"\2\2=>\7.\2\2>\b\3\2\2\2?@\7+\2\2@\n\3\2\2\2AB\7}\2\2B\f\3\2\2\2CD\7\177"+
		"\2\2D\16\3\2\2\2EF\7V\2\2FG\7G\2\2GH\7O\2\2HI\7R\2\2IJ\7N\2\2JK\7C\2\2"+
		"KL\7V\2\2LM\7G\2\2M\20\3\2\2\2NO\7C\2\2OP\7F\2\2PQ\7F\2\2Q\22\3\2\2\2"+
		"RX\7)\2\2SW\n\2\2\2TU\7^\2\2UW\13\2\2\2VS\3\2\2\2VT\3\2\2\2WZ\3\2\2\2"+
		"XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[g\7)\2\2\\b\7$\2\2]a\n\3\2\2"+
		"^_\7^\2\2_a\13\2\2\2`]\3\2\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2"+
		"ce\3\2\2\2db\3\2\2\2eg\7$\2\2fR\3\2\2\2f\\\3\2\2\2g\24\3\2\2\2hj\5+\26"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7N\2\2n\26\3\2"+
		"\2\2oq\5+\26\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7U"+
		"\2\2u\30\3\2\2\2vx\5+\26\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3"+
		"\2\2\2{|\7[\2\2|\32\3\2\2\2}\177\5+\26\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\34\3\2\2\2\u0082\u0084\5+\26\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\5)\25\2\u0088\u0090\3\2\2\2\u0089"+
		"\u008b\5\'\24\2\u008a\u008c\5)\25\2\u008b\u008a\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\6\17\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u0083\3\2\2\2\u008f\u0089\3\2\2\2\u0090\36\3\2\2\2\u0091\u0093\5+\26"+
		"\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5)\25\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7F\2\2\u009a\u00a3\3\2"+
		"\2\2\u009b\u009d\5\'\24\2\u009c\u009e\5)\25\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7F\2\2\u00a0\u00a1\6\20"+
		"\3\2\u00a1\u00a3\3\2\2\2\u00a2\u0092\3\2\2\2\u00a2\u009b\3\2\2\2\u00a3"+
		" \3\2\2\2\u00a4\u00a6\5+\26\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab"+
		"\5)\25\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\7D\2\2\u00ad\u00ae\7F\2\2\u00ae\u00b9\3\2\2\2\u00af\u00b1\5\'\24"+
		"\2\u00b0\u00b2\5)\25\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\7D\2\2\u00b4\u00b5\7F\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\6\21\4\2\u00b7\u00b9\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00af\3"+
		"\2\2\2\u00b9\"\3\2\2\2\u00ba\u00be\5-\27\2\u00bb\u00be\5+\26\2\u00bc\u00be"+
		"\7a\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0$\3\2\2\2"+
		"\u00c1\u00c7\7b\2\2\u00c2\u00c6\n\4\2\2\u00c3\u00c4\7b\2\2\u00c4\u00c6"+
		"\7b\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cb\7b\2\2\u00cb&\3\2\2\2\u00cc\u00ce\5+\26\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d5\7\60\2\2\u00d2\u00d4\5+\26\2\u00d3\u00d2\3"+
		"\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00df\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\7\60\2\2\u00d9\u00db\5"+
		"+\26\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00cd\3\2\2\2\u00de\u00d8\3\2"+
		"\2\2\u00df(\3\2\2\2\u00e0\u00e2\7G\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6\5+\26\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8*\3\2\2\2\u00e9\u00ea\t\6\2\2\u00ea,\3\2\2\2\u00eb\u00ec\t\7"+
		"\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee\u00ef\7/\2\2\u00ef\u00f3"+
		"\3\2\2\2\u00f0\u00f2\n\b\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f8\7\17\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00fb\7\f\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b\30\2\2\u00fd\60\3\2\2\2\u00fe\u00ff"+
		"\7\61\2\2\u00ff\u0100\7,\2\2\u0100\u0101\7,\2\2\u0101\u0102\7\61\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\b\31\2\2\u0104\62\3\2\2\2\u0105\u0106\7\61"+
		"\2\2\u0106\u0107\7,\2\2\u0107\u0108\3\2\2\2\u0108\u010c\n\t\2\2\u0109"+
		"\u010b\13\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0110\7,\2\2\u0110\u0111\7\61\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b\32"+
		"\2\2\u0113\64\3\2\2\2\u0114\u0116\t\n\2\2\u0115\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\b\33\2\2\u011a\66\3\2\2\2\u011b\u011c\13\2\2\2\u011c8\3\2\2\2&"+
		"\2VX`bfkry\u0080\u0085\u008b\u008f\u0094\u0097\u009d\u00a2\u00a7\u00aa"+
		"\u00b1\u00b8\u00bd\u00bf\u00c5\u00c7\u00cf\u00d5\u00dc\u00de\u00e2\u00e7"+
		"\u00f3\u00f7\u00fa\u010c\u0117\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}