// Generated from C:/Work/antlr/src/main/antlr4\Turing.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, L=7, R=8, PASKA=9, ACCEPT=10, 
		REJECT=11, STATE=12, ASSIGN=13, OPEN_BRACKET=14, CLOSE_BRACKET=15, COMMA=16, 
		TURING_FUNCTION=17, STRING=18, ReadingValue=19, Identifier=20, COMMENT=21, 
		LINE_COMMENT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "L", "R", "PASKA", "ACCEPT", 
			"REJECT", "STATE", "ASSIGN", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", 
			"TURING_FUNCTION", "STRING", "ReadingValue", "Identifier", "TurringLetter", 
			"COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'|'", "'}'", "'('", "')'", "'->'", "'L'", "'R'", "'Paska'", 
			"'Accept'", "'Reject'", "'State'", "'='", "'['", "']'", "','", "'Turing'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "L", "R", "PASKA", "ACCEPT", 
			"REJECT", "STATE", "ASSIGN", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", 
			"TURING_FUNCTION", "STRING", "ReadingValue", "Identifier", "COMMENT", 
			"LINE_COMMENT", "WS"
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


	public TuringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Turing.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23p\n\23"+
		"\f\23\16\23s\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\7\25}\n\25"+
		"\f\25\16\25\u0080\13\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0088\n\27"+
		"\f\27\16\27\u008b\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7"+
		"\30\u0096\n\30\f\30\16\30\u0099\13\30\3\30\3\30\3\31\6\31\u009e\n\31\r"+
		"\31\16\31\u009f\3\31\3\31\3\u0089\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\27"+
		"/\30\61\31\3\2\5\7\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\2\u00a6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r="+
		"\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25J\3\2\2\2\27Q\3\2\2\2\31"+
		"X\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37b\3\2\2\2!d\3\2\2\2#f\3\2\2\2%m\3"+
		"\2\2\2\'v\3\2\2\2)z\3\2\2\2+\u0081\3\2\2\2-\u0083\3\2\2\2/\u0091\3\2\2"+
		"\2\61\u009d\3\2\2\2\63\64\7}\2\2\64\4\3\2\2\2\65\66\7~\2\2\66\6\3\2\2"+
		"\2\678\7\177\2\28\b\3\2\2\29:\7*\2\2:\n\3\2\2\2;<\7+\2\2<\f\3\2\2\2=>"+
		"\7/\2\2>?\7@\2\2?\16\3\2\2\2@A\7N\2\2A\20\3\2\2\2BC\7T\2\2C\22\3\2\2\2"+
		"DE\7R\2\2EF\7c\2\2FG\7u\2\2GH\7m\2\2HI\7c\2\2I\24\3\2\2\2JK\7C\2\2KL\7"+
		"e\2\2LM\7e\2\2MN\7g\2\2NO\7r\2\2OP\7v\2\2P\26\3\2\2\2QR\7T\2\2RS\7g\2"+
		"\2ST\7l\2\2TU\7g\2\2UV\7e\2\2VW\7v\2\2W\30\3\2\2\2XY\7U\2\2YZ\7v\2\2Z"+
		"[\7c\2\2[\\\7v\2\2\\]\7g\2\2]\32\3\2\2\2^_\7?\2\2_\34\3\2\2\2`a\7]\2\2"+
		"a\36\3\2\2\2bc\7_\2\2c \3\2\2\2de\7.\2\2e\"\3\2\2\2fg\7V\2\2gh\7w\2\2"+
		"hi\7t\2\2ij\7k\2\2jk\7p\2\2kl\7i\2\2l$\3\2\2\2mq\7$\2\2np\5+\26\2on\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7$\2\2u&\3"+
		"\2\2\2vw\7)\2\2wx\5+\26\2xy\7)\2\2y(\3\2\2\2z~\5+\26\2{}\5+\26\2|{\3\2"+
		"\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177*\3\2\2\2\u0080~\3\2\2\2"+
		"\u0081\u0082\t\2\2\2\u0082,\3\2\2\2\u0083\u0084\7\61\2\2\u0084\u0085\7"+
		",\2\2\u0085\u0089\3\2\2\2\u0086\u0088\13\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7,\2\2\u008d\u008e\7\61\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\b\27\2\2\u0090.\3\2\2\2\u0091\u0092\7\61\2"+
		"\2\u0092\u0093\7\61\2\2\u0093\u0097\3\2\2\2\u0094\u0096\n\3\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\b\30\2\2\u009b"+
		"\60\3\2\2\2\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\b\31\2\2\u00a2\62\3\2\2\2\b\2q~\u0089\u0097\u009f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}