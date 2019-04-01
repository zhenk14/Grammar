// Generated from frameQLLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class frameQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, SELECT=4, FROM=5, WHERE=6, 
		AND=7, GROUP=8, HAVING=9, DISTINCT=10, ALL=11, EQUAL_SYMBOL=12, GREATER_SYMBOL=13, 
		LESS_SYMBOL=14, EXCLAMATION_SYMBOL=15, DOT=16, LR_BRACKET=17, RR_BRACKET=18, 
		COMMA=19, SEMI=20, AT_SIGN=21, ZERO_DECIMAL=22, ONE_DECIMAL=23, TWO_DECIMAL=24, 
		SINGLE_QUOTE_SYMB=25, DOUBLE_QUOTE_SYMB=26, REVERSE_QUOTE_SYMB=27, COLON_SYMB=28, 
		ID=29;
	public static final int
		MYSQLCOMMENT=2, ERRORCHANNEL=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "MYSQLCOMMENT", "ERRORCHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "SELECT", "FROM", "WHERE", 
		"AND", "GROUP", "HAVING", "DISTINCT", "ALL", "EQUAL_SYMBOL", "GREATER_SYMBOL", 
		"LESS_SYMBOL", "EXCLAMATION_SYMBOL", "DOT", "LR_BRACKET", "RR_BRACKET", 
		"COMMA", "SEMI", "AT_SIGN", "ZERO_DECIMAL", "ONE_DECIMAL", "TWO_DECIMAL", 
		"SINGLE_QUOTE_SYMB", "DOUBLE_QUOTE_SYMB", "REVERSE_QUOTE_SYMB", "COLON_SYMB", 
		"ID", "ID_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'SELECT'", "'FROM'", "'WHERE'", "'AND'", "'GROUP'", 
		"'HAVING'", "'DISTINCT'", "'ALL'", "'='", "'>'", "'<'", "'!'", "'.'", 
		"'('", "')'", "','", "';'", "'@'", "'0'", "'1'", "'2'", "'''", "'\"'", 
		"'`'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "SELECT", "FROM", 
		"WHERE", "AND", "GROUP", "HAVING", "DISTINCT", "ALL", "EQUAL_SYMBOL", 
		"GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", "DOT", "LR_BRACKET", 
		"RR_BRACKET", "COMMA", "SEMI", "AT_SIGN", "ZERO_DECIMAL", "ONE_DECIMAL", 
		"TWO_DECIMAL", "SINGLE_QUOTE_SYMB", "DOUBLE_QUOTE_SYMB", "REVERSE_QUOTE_SYMB", 
		"COLON_SYMB", "ID"
	};
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


	public frameQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "frameQLLexer.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\6\2A\n\2\r\2\16\2B\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3L\n\3\r\3\16\3M\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\7\37\u00b8\n\37\f\37\16\37"+
		"\u00bb\13\37\3\37\6\37\u00be\n\37\r\37\16\37\u00bf\3\37\7\37\u00c3\n\37"+
		"\f\37\16\37\u00c6\13\37\6MZ\u00b9\u00bf\2 \3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2\3\2\5\5\2\13\f\17\17\""+
		"\"\6\2&&\62;C\\aa\5\2&&C\\aa\2\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3@\3\2\2\2\5F\3\2\2\2\7T\3\2"+
		"\2\2\tb\3\2\2\2\13i\3\2\2\2\rn\3\2\2\2\17t\3\2\2\2\21x\3\2\2\2\23~\3\2"+
		"\2\2\25\u0085\3\2\2\2\27\u008e\3\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2"+
		"\2\35\u0096\3\2\2\2\37\u0098\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u009e"+
		"\3\2\2\2\'\u00a0\3\2\2\2)\u00a2\3\2\2\2+\u00a4\3\2\2\2-\u00a6\3\2\2\2"+
		"/\u00a8\3\2\2\2\61\u00aa\3\2\2\2\63\u00ac\3\2\2\2\65\u00ae\3\2\2\2\67"+
		"\u00b0\3\2\2\29\u00b2\3\2\2\2;\u00b4\3\2\2\2=\u00b9\3\2\2\2?A\t\2\2\2"+
		"@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\2\2\2E\4\3\2\2"+
		"\2FG\7\61\2\2GH\7,\2\2HI\7#\2\2IK\3\2\2\2JL\13\2\2\2KJ\3\2\2\2LM\3\2\2"+
		"\2MN\3\2\2\2MK\3\2\2\2NO\3\2\2\2OP\7,\2\2PQ\7\61\2\2QR\3\2\2\2RS\b\3\3"+
		"\2S\6\3\2\2\2TU\7\61\2\2UV\7,\2\2VZ\3\2\2\2WY\13\2\2\2XW\3\2\2\2Y\\\3"+
		"\2\2\2Z[\3\2\2\2ZX\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7,\2\2^_\7\61\2\2_`"+
		"\3\2\2\2`a\b\4\2\2a\b\3\2\2\2bc\7U\2\2cd\7G\2\2de\7N\2\2ef\7G\2\2fg\7"+
		"E\2\2gh\7V\2\2h\n\3\2\2\2ij\7H\2\2jk\7T\2\2kl\7Q\2\2lm\7O\2\2m\f\3\2\2"+
		"\2no\7Y\2\2op\7J\2\2pq\7G\2\2qr\7T\2\2rs\7G\2\2s\16\3\2\2\2tu\7C\2\2u"+
		"v\7P\2\2vw\7F\2\2w\20\3\2\2\2xy\7I\2\2yz\7T\2\2z{\7Q\2\2{|\7W\2\2|}\7"+
		"R\2\2}\22\3\2\2\2~\177\7J\2\2\177\u0080\7C\2\2\u0080\u0081\7X\2\2\u0081"+
		"\u0082\7K\2\2\u0082\u0083\7P\2\2\u0083\u0084\7I\2\2\u0084\24\3\2\2\2\u0085"+
		"\u0086\7F\2\2\u0086\u0087\7K\2\2\u0087\u0088\7U\2\2\u0088\u0089\7V\2\2"+
		"\u0089\u008a\7K\2\2\u008a\u008b\7P\2\2\u008b\u008c\7E\2\2\u008c\u008d"+
		"\7V\2\2\u008d\26\3\2\2\2\u008e\u008f\7C\2\2\u008f\u0090\7N\2\2\u0090\u0091"+
		"\7N\2\2\u0091\30\3\2\2\2\u0092\u0093\7?\2\2\u0093\32\3\2\2\2\u0094\u0095"+
		"\7@\2\2\u0095\34\3\2\2\2\u0096\u0097\7>\2\2\u0097\36\3\2\2\2\u0098\u0099"+
		"\7#\2\2\u0099 \3\2\2\2\u009a\u009b\7\60\2\2\u009b\"\3\2\2\2\u009c\u009d"+
		"\7*\2\2\u009d$\3\2\2\2\u009e\u009f\7+\2\2\u009f&\3\2\2\2\u00a0\u00a1\7"+
		".\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7=\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7B"+
		"\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7\62\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7"+
		"\63\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7\64\2\2\u00ab\62\3\2\2\2\u00ac\u00ad"+
		"\7)\2\2\u00ad\64\3\2\2\2\u00ae\u00af\7$\2\2\u00af\66\3\2\2\2\u00b0\u00b1"+
		"\7b\2\2\u00b18\3\2\2\2\u00b2\u00b3\7<\2\2\u00b3:\3\2\2\2\u00b4\u00b5\5"+
		"=\37\2\u00b5<\3\2\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1"+
		"\u00c3\t\3\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5>\3\2\2\2\u00c6\u00c4\3\2\2\2\t\2BMZ\u00b9"+
		"\u00bf\u00c4\4\2\3\2\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}