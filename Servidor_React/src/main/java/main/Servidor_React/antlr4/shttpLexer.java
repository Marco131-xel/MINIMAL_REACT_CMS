// Generated from shttp.g4 by ANTLR 4.13.2

package main.Servidor_React.antlr4;

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
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, TREPTS=2, GET=3, POST=4, PATCH=5, DELETE=6, SITIO=7, PAGINA=8, 
		MSITIO=9, MPAGINA=10, ABRIR=11, CREAR=12, AGREGAR=13, ELIMINAR=14, MODIFICAR=15, 
		IDENTIFICADOR=16, BLANCOS=17, CONTENIDO=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMA", "TREPTS", "GET", "POST", "PATCH", "DELETE", "SITIO", "PAGINA", 
			"MSITIO", "MPAGINA", "ABRIR", "CREAR", "AGREGAR", "ELIMINAR", "MODIFICAR", 
			"IDENTIFICADOR", "BLANCOS", "CONTENIDO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'...'", "'GET'", "'POST'", "'PATCH'", "'DELETE'", "'SITIO'", 
			"'PAGINA'", "'sitio'", "'pagina'", "'abrir'", "'crear'", "'agregar'", 
			"'eliminar'", "'modificar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMA", "TREPTS", "GET", "POST", "PATCH", "DELETE", "SITIO", "PAGINA", 
			"MSITIO", "MPAGINA", "ABRIR", "CREAR", "AGREGAR", "ELIMINAR", "MODIFICAR", 
			"IDENTIFICADOR", "BLANCOS", "CONTENIDO"
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
		"\u0004\u0000\u0012\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0085\b\u000f\n\u000f\f\u000f\u0088\t\u000f\u0001\u0010\u0004\u0010\u008b"+
		"\b\u0010\u000b\u0010\f\u0010\u008c\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0099\b\u0011\n\u0011\f\u0011\u009c\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u009a\u0000\u0012\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012\u0001\u0000\u0003\u0002\u0000AZaz\u0005\u0000--09AZ__az\u0003"+
		"\u0000\t\n\r\r  \u00a7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005"+
		"+\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t4\u0001\u0000"+
		"\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000"+
		"\u000fG\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000\u0000\u0013T"+
		"\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017a\u0001\u0000"+
		"\u0000\u0000\u0019g\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000"+
		"\u001dx\u0001\u0000\u0000\u0000\u001f\u0082\u0001\u0000\u0000\u0000!\u008a"+
		"\u0001\u0000\u0000\u0000#\u0090\u0001\u0000\u0000\u0000%&\u0005,\u0000"+
		"\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005.\u0000\u0000()\u0005.\u0000"+
		"\u0000)*\u0005.\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005G\u0000"+
		"\u0000,-\u0005E\u0000\u0000-.\u0005T\u0000\u0000.\u0006\u0001\u0000\u0000"+
		"\u0000/0\u0005P\u0000\u000001\u0005O\u0000\u000012\u0005S\u0000\u0000"+
		"23\u0005T\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005P\u0000\u0000"+
		"56\u0005A\u0000\u000067\u0005T\u0000\u000078\u0005C\u0000\u000089\u0005"+
		"H\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005D\u0000\u0000;<\u0005"+
		"E\u0000\u0000<=\u0005L\u0000\u0000=>\u0005E\u0000\u0000>?\u0005T\u0000"+
		"\u0000?@\u0005E\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005S\u0000"+
		"\u0000BC\u0005I\u0000\u0000CD\u0005T\u0000\u0000DE\u0005I\u0000\u0000"+
		"EF\u0005O\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005P\u0000\u0000"+
		"HI\u0005A\u0000\u0000IJ\u0005G\u0000\u0000JK\u0005I\u0000\u0000KL\u0005"+
		"N\u0000\u0000LM\u0005A\u0000\u0000M\u0010\u0001\u0000\u0000\u0000NO\u0005"+
		"s\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005t\u0000\u0000QR\u0005i\u0000"+
		"\u0000RS\u0005o\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TU\u0005p\u0000"+
		"\u0000UV\u0005a\u0000\u0000VW\u0005g\u0000\u0000WX\u0005i\u0000\u0000"+
		"XY\u0005n\u0000\u0000YZ\u0005a\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000"+
		"[\\\u0005a\u0000\u0000\\]\u0005b\u0000\u0000]^\u0005r\u0000\u0000^_\u0005"+
		"i\u0000\u0000_`\u0005r\u0000\u0000`\u0016\u0001\u0000\u0000\u0000ab\u0005"+
		"c\u0000\u0000bc\u0005r\u0000\u0000cd\u0005e\u0000\u0000de\u0005a\u0000"+
		"\u0000ef\u0005r\u0000\u0000f\u0018\u0001\u0000\u0000\u0000gh\u0005a\u0000"+
		"\u0000hi\u0005g\u0000\u0000ij\u0005r\u0000\u0000jk\u0005e\u0000\u0000"+
		"kl\u0005g\u0000\u0000lm\u0005a\u0000\u0000mn\u0005r\u0000\u0000n\u001a"+
		"\u0001\u0000\u0000\u0000op\u0005e\u0000\u0000pq\u0005l\u0000\u0000qr\u0005"+
		"i\u0000\u0000rs\u0005m\u0000\u0000st\u0005i\u0000\u0000tu\u0005n\u0000"+
		"\u0000uv\u0005a\u0000\u0000vw\u0005r\u0000\u0000w\u001c\u0001\u0000\u0000"+
		"\u0000xy\u0005m\u0000\u0000yz\u0005o\u0000\u0000z{\u0005d\u0000\u0000"+
		"{|\u0005i\u0000\u0000|}\u0005f\u0000\u0000}~\u0005i\u0000\u0000~\u007f"+
		"\u0005c\u0000\u0000\u007f\u0080\u0005a\u0000\u0000\u0080\u0081\u0005r"+
		"\u0000\u0000\u0081\u001e\u0001\u0000\u0000\u0000\u0082\u0086\u0007\u0000"+
		"\u0000\u0000\u0083\u0085\u0007\u0001\u0000\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087 \u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u0007\u0002\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0010\u0000"+
		"\u0000\u008f\"\u0001\u0000\u0000\u0000\u0090\u0091\u0005<\u0000\u0000"+
		"\u0091\u0092\u0005m\u0000\u0000\u0092\u0093\u0005a\u0000\u0000\u0093\u0094"+
		"\u0005i\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095\u0096\u0005>"+
		"\u0000\u0000\u0096\u009a\u0001\u0000\u0000\u0000\u0097\u0099\t\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005<\u0000\u0000\u009e\u009f\u0005/\u0000\u0000\u009f"+
		"\u00a0\u0005m\u0000\u0000\u00a0\u00a1\u0005a\u0000\u0000\u00a1\u00a2\u0005"+
		"i\u0000\u0000\u00a2\u00a3\u0005n\u0000\u0000\u00a3\u00a4\u0005>\u0000"+
		"\u0000\u00a4$\u0001\u0000\u0000\u0000\u0004\u0000\u0086\u008c\u009a\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}