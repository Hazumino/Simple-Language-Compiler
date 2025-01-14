// Generated from /Users/zenodeangeli/Desktop/Compilers/Assignments/FinalHandIn/215872/task1/src/AlgorithmANTLR.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgorithmANTLRLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntType=1, BoolType=2, UnitType=3, Assign=4, LessEq=5, Eq=6, GtrEq=7, 
		Less=8, Plus=9, Minus=10, And=11, Xor=12, Gtr=13, Times=14, Div=15, Or=16, 
		While=17, Do=18, Repeat=19, Until=20, If=21, Then=22, Else=23, LParen=24, 
		Comma=25, RParen=26, LBrace=27, Semicolon=28, RBrace=29, Skip=30, Idfr=31, 
		IntLit=32, Ignore=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IntType", "BoolType", "UnitType", "Assign", "LessEq", "Eq", "GtrEq", 
			"Less", "Plus", "Minus", "And", "Xor", "Gtr", "Times", "Div", "Or", "While", 
			"Do", "Repeat", "Until", "If", "Then", "Else", "LParen", "Comma", "RParen", 
			"LBrace", "Semicolon", "RBrace", "Skip", "Idfr", "IntLit", "Ignore"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'unit'", "':='", "'<='", "'=='", "'>='", "'<'", 
			"'+'", "'-'", "'&&'", "'^^'", "'>'", "'*'", "'/'", "'||'", "'while'", 
			"'do'", "'repeat'", "'until'", "'if'", "'then'", "'else'", "'('", "','", 
			"')'", "'{'", "';'", "'}'", "'skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntType", "BoolType", "UnitType", "Assign", "LessEq", "Eq", "GtrEq", 
			"Less", "Plus", "Minus", "And", "Xor", "Gtr", "Times", "Div", "Or", "While", 
			"Do", "Repeat", "Until", "If", "Then", "Else", "LParen", "Comma", "RParen", 
			"LBrace", "Semicolon", "RBrace", "Skip", "Idfr", "IntLit", "Ignore"
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


	public AlgorithmANTLRLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgorithmANTLR.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00c0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u00ab\n"+
		" \f \16 \u00ae\13 \3!\3!\3!\7!\u00b3\n!\f!\16!\u00b6\13!\5!\u00b8\n!\3"+
		"\"\6\"\u00bb\n\"\r\"\16\"\u00bc\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\7\3\2c|\6\2"+
		"\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2\u00c3\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5I\3\2\2\2\7N\3\2\2\2\tS"+
		"\3\2\2\2\13V\3\2\2\2\rY\3\2\2\2\17\\\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25"+
		"c\3\2\2\2\27e\3\2\2\2\31h\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2"+
		"!q\3\2\2\2#t\3\2\2\2%z\3\2\2\2\'}\3\2\2\2)\u0084\3\2\2\2+\u008a\3\2\2"+
		"\2-\u008d\3\2\2\2/\u0092\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2\2\65"+
		"\u009b\3\2\2\2\67\u009d\3\2\2\29\u009f\3\2\2\2;\u00a1\3\2\2\2=\u00a3\3"+
		"\2\2\2?\u00a8\3\2\2\2A\u00b7\3\2\2\2C\u00ba\3\2\2\2EF\7k\2\2FG\7p\2\2"+
		"GH\7v\2\2H\4\3\2\2\2IJ\7d\2\2JK\7q\2\2KL\7q\2\2LM\7n\2\2M\6\3\2\2\2NO"+
		"\7w\2\2OP\7p\2\2PQ\7k\2\2QR\7v\2\2R\b\3\2\2\2ST\7<\2\2TU\7?\2\2U\n\3\2"+
		"\2\2VW\7>\2\2WX\7?\2\2X\f\3\2\2\2YZ\7?\2\2Z[\7?\2\2[\16\3\2\2\2\\]\7@"+
		"\2\2]^\7?\2\2^\20\3\2\2\2_`\7>\2\2`\22\3\2\2\2ab\7-\2\2b\24\3\2\2\2cd"+
		"\7/\2\2d\26\3\2\2\2ef\7(\2\2fg\7(\2\2g\30\3\2\2\2hi\7`\2\2ij\7`\2\2j\32"+
		"\3\2\2\2kl\7@\2\2l\34\3\2\2\2mn\7,\2\2n\36\3\2\2\2op\7\61\2\2p \3\2\2"+
		"\2qr\7~\2\2rs\7~\2\2s\"\3\2\2\2tu\7y\2\2uv\7j\2\2vw\7k\2\2wx\7n\2\2xy"+
		"\7g\2\2y$\3\2\2\2z{\7f\2\2{|\7q\2\2|&\3\2\2\2}~\7t\2\2~\177\7g\2\2\177"+
		"\u0080\7r\2\2\u0080\u0081\7g\2\2\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2"+
		"\u0083(\3\2\2\2\u0084\u0085\7w\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v\2"+
		"\2\u0087\u0088\7k\2\2\u0088\u0089\7n\2\2\u0089*\3\2\2\2\u008a\u008b\7"+
		"k\2\2\u008b\u008c\7h\2\2\u008c,\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f"+
		"\7j\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091.\3\2\2\2\u0092\u0093"+
		"\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096"+
		"\60\3\2\2\2\u0097\u0098\7*\2\2\u0098\62\3\2\2\2\u0099\u009a\7.\2\2\u009a"+
		"\64\3\2\2\2\u009b\u009c\7+\2\2\u009c\66\3\2\2\2\u009d\u009e\7}\2\2\u009e"+
		"8\3\2\2\2\u009f\u00a0\7=\2\2\u00a0:\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2"+
		"<\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7m\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7r\2\2\u00a7>\3\2\2\2\u00a8\u00ac\t\2\2\2\u00a9\u00ab\t\3\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad@\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b8\7\62\2\2\u00b0\u00b4"+
		"\t\4\2\2\u00b1\u00b3\t\5\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b8B\3\2\2\2\u00b9\u00bb"+
		"\t\6\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\"\2\2\u00bfD\3\2\2\2"+
		"\7\2\u00ac\u00b4\u00b7\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}