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
		COMA=1, GET=2, POST=3, PATCH=4, DELETE=5, SITIO=6, PAGINA=7, MSITIO=8, 
		MPAGINA=9, ABRIR=10, CREAR=11, AGREGAR=12, ELIMINAR=13, MODIFICAR=14, 
		IDENTIFICADOR=15, BLANCOS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMA", "GET", "POST", "PATCH", "DELETE", "SITIO", "PAGINA", "MSITIO", 
			"MPAGINA", "ABRIR", "CREAR", "AGREGAR", "ELIMINAR", "MODIFICAR", "IDENTIFICADOR", 
			"BLANCOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'GET'", "'POST'", "'PATCH'", "'DELETE'", "'SITIO'", "'PAGINA'", 
			"'sitio'", "'pagina'", "'abrir'", "'crear'", "'agregar'", "'eliminar'", 
			"'modificar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMA", "GET", "POST", "PATCH", "DELETE", "SITIO", "PAGINA", "MSITIO", 
			"MPAGINA", "ABRIR", "CREAR", "AGREGAR", "ELIMINAR", "MODIFICAR", "IDENTIFICADOR", 
			"BLANCOS"
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
		"\u0004\u0000\u0010\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000e}\b\u000e\n\u000e\f\u000e\u0080"+
		"\t\u000e\u0001\u000f\u0004\u000f\u0083\b\u000f\u000b\u000f\f\u000f\u0084"+
		"\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0005\u0000--09AZ__az\u0003\u0000\t\n\r\r"+
		"  \u0089\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005\'\u0001"+
		"\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000"+
		"\u0000\u000b9\u0001\u0000\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000f"+
		"F\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013S\u0001"+
		"\u0000\u0000\u0000\u0015Y\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000"+
		"\u0000\u0019g\u0001\u0000\u0000\u0000\u001bp\u0001\u0000\u0000\u0000\u001d"+
		"z\u0001\u0000\u0000\u0000\u001f\u0082\u0001\u0000\u0000\u0000!\"\u0005"+
		",\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005G\u0000\u0000$%\u0005"+
		"E\u0000\u0000%&\u0005T\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005"+
		"P\u0000\u0000()\u0005O\u0000\u0000)*\u0005S\u0000\u0000*+\u0005T\u0000"+
		"\u0000+\u0006\u0001\u0000\u0000\u0000,-\u0005P\u0000\u0000-.\u0005A\u0000"+
		"\u0000./\u0005T\u0000\u0000/0\u0005C\u0000\u000001\u0005H\u0000\u0000"+
		"1\b\u0001\u0000\u0000\u000023\u0005D\u0000\u000034\u0005E\u0000\u0000"+
		"45\u0005L\u0000\u000056\u0005E\u0000\u000067\u0005T\u0000\u000078\u0005"+
		"E\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005S\u0000\u0000:;\u0005"+
		"I\u0000\u0000;<\u0005T\u0000\u0000<=\u0005I\u0000\u0000=>\u0005O\u0000"+
		"\u0000>\f\u0001\u0000\u0000\u0000?@\u0005P\u0000\u0000@A\u0005A\u0000"+
		"\u0000AB\u0005G\u0000\u0000BC\u0005I\u0000\u0000CD\u0005N\u0000\u0000"+
		"DE\u0005A\u0000\u0000E\u000e\u0001\u0000\u0000\u0000FG\u0005s\u0000\u0000"+
		"GH\u0005i\u0000\u0000HI\u0005t\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005"+
		"o\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005p\u0000\u0000MN\u0005"+
		"a\u0000\u0000NO\u0005g\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005n\u0000"+
		"\u0000QR\u0005a\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005a\u0000"+
		"\u0000TU\u0005b\u0000\u0000UV\u0005r\u0000\u0000VW\u0005i\u0000\u0000"+
		"WX\u0005r\u0000\u0000X\u0014\u0001\u0000\u0000\u0000YZ\u0005c\u0000\u0000"+
		"Z[\u0005r\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005"+
		"r\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_`\u0005a\u0000\u0000`a\u0005"+
		"g\u0000\u0000ab\u0005r\u0000\u0000bc\u0005e\u0000\u0000cd\u0005g\u0000"+
		"\u0000de\u0005a\u0000\u0000ef\u0005r\u0000\u0000f\u0018\u0001\u0000\u0000"+
		"\u0000gh\u0005e\u0000\u0000hi\u0005l\u0000\u0000ij\u0005i\u0000\u0000"+
		"jk\u0005m\u0000\u0000kl\u0005i\u0000\u0000lm\u0005n\u0000\u0000mn\u0005"+
		"a\u0000\u0000no\u0005r\u0000\u0000o\u001a\u0001\u0000\u0000\u0000pq\u0005"+
		"m\u0000\u0000qr\u0005o\u0000\u0000rs\u0005d\u0000\u0000st\u0005i\u0000"+
		"\u0000tu\u0005f\u0000\u0000uv\u0005i\u0000\u0000vw\u0005c\u0000\u0000"+
		"wx\u0005a\u0000\u0000xy\u0005r\u0000\u0000y\u001c\u0001\u0000\u0000\u0000"+
		"z~\u0007\u0000\u0000\u0000{}\u0007\u0001\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0007\u0002\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0006\u000f\u0000\u0000\u0087 \u0001\u0000"+
		"\u0000\u0000\u0003\u0000~\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}