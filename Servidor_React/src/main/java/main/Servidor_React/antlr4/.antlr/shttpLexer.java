// Generated from /home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/Servidor_React/src/main/java/main/Servidor_React/antlr4/shttp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class shttpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, GET=2, POST=3, PATCH=4, DELETE=5, SITIO=6, PAGINA=7, CREAR=8, 
		AGREGAR=9, ELIMINAR=10, MODIFICAR=11, PARAMETRO=12, BLANCOS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMA", "GET", "POST", "PATCH", "DELETE", "SITIO", "PAGINA", "CREAR", 
			"AGREGAR", "ELIMINAR", "MODIFICAR", "PARAMETRO", "BLANCOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'get'", "'post'", "'patch'", "'delete'", "'sitio'", "'pagina'", 
			"'crear'", "'agregar'", "'eliminar'", "'modificar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMA", "GET", "POST", "PATCH", "DELETE", "SITIO", "PAGINA", "CREAR", 
			"AGREGAR", "ELIMINAR", "MODIFICAR", "PARAMETRO", "BLANCOS"
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


	public shttpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "shttp.g4"; }

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
		"\u0004\u0000\ro\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000bd\b\u000b\n\u000b\f\u000bg\t\u000b\u0001\f\u0004\fj\b\f\u000b\f"+
		"\f\fk\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u0001\u0000\u0003\u0002\u0000AZaz\u0004\u00000"+
		"9AZ__az\u0003\u0000\t\n\r\r  p\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001"+
		"\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005!\u0001\u0000"+
		"\u0000\u0000\u0007&\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000"+
		"\u000b3\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f@\u0001"+
		"\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000"+
		"\u0000\u0015W\u0001\u0000\u0000\u0000\u0017a\u0001\u0000\u0000\u0000\u0019"+
		"i\u0001\u0000\u0000\u0000\u001b\u001c\u0005,\u0000\u0000\u001c\u0002\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005g\u0000\u0000\u001e\u001f\u0005e\u0000"+
		"\u0000\u001f \u0005t\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005"+
		"p\u0000\u0000\"#\u0005o\u0000\u0000#$\u0005s\u0000\u0000$%\u0005t\u0000"+
		"\u0000%\u0006\u0001\u0000\u0000\u0000&\'\u0005p\u0000\u0000\'(\u0005a"+
		"\u0000\u0000()\u0005t\u0000\u0000)*\u0005c\u0000\u0000*+\u0005h\u0000"+
		"\u0000+\b\u0001\u0000\u0000\u0000,-\u0005d\u0000\u0000-.\u0005e\u0000"+
		"\u0000./\u0005l\u0000\u0000/0\u0005e\u0000\u000001\u0005t\u0000\u0000"+
		"12\u0005e\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005s\u0000\u0000"+
		"45\u0005i\u0000\u000056\u0005t\u0000\u000067\u0005i\u0000\u000078\u0005"+
		"o\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005p\u0000\u0000:;\u0005"+
		"a\u0000\u0000;<\u0005g\u0000\u0000<=\u0005i\u0000\u0000=>\u0005n\u0000"+
		"\u0000>?\u0005a\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@A\u0005c\u0000"+
		"\u0000AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000CD\u0005a\u0000\u0000"+
		"DE\u0005r\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005a\u0000\u0000"+
		"GH\u0005g\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005"+
		"g\u0000\u0000KL\u0005a\u0000\u0000LM\u0005r\u0000\u0000M\u0012\u0001\u0000"+
		"\u0000\u0000NO\u0005e\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005i\u0000"+
		"\u0000QR\u0005m\u0000\u0000RS\u0005i\u0000\u0000ST\u0005n\u0000\u0000"+
		"TU\u0005a\u0000\u0000UV\u0005r\u0000\u0000V\u0014\u0001\u0000\u0000\u0000"+
		"WX\u0005m\u0000\u0000XY\u0005o\u0000\u0000YZ\u0005d\u0000\u0000Z[\u0005"+
		"i\u0000\u0000[\\\u0005f\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005c\u0000"+
		"\u0000^_\u0005a\u0000\u0000_`\u0005r\u0000\u0000`\u0016\u0001\u0000\u0000"+
		"\u0000ae\u0007\u0000\u0000\u0000bd\u0007\u0001\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f\u0018\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hj\u0007\u0002\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0006\f\u0000\u0000n\u001a\u0001\u0000\u0000\u0000"+
		"\u0003\u0000ek\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}