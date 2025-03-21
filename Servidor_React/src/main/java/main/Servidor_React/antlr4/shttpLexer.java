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
		COMA=1, GET=2, POST=3, PATCH=4, DELETE=5, SITIO=6, PAGINA=7, ABRIR=8, 
		CREAR=9, AGREGAR=10, ELIMINAR=11, MODIFICAR=12, IDENTIFICADOR=13, BLANCOS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMA", "GET", "POST", "PATCH", "DELETE", "SITIO", "PAGINA", "ABRIR", 
			"CREAR", "AGREGAR", "ELIMINAR", "MODIFICAR", "IDENTIFICADOR", "BLANCOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'get'", "'post'", "'patch'", "'delete'", "'sitio'", "'pagina'", 
			"'abrir'", "'crear'", "'agregar'", "'eliminar'", "'modificar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMA", "GET", "POST", "PATCH", "DELETE", "SITIO", "PAGINA", "ABRIR", 
			"CREAR", "AGREGAR", "ELIMINAR", "MODIFICAR", "IDENTIFICADOR", "BLANCOS"
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
		"\u0004\u0000\u000ew\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\fl\b\f\n\f\f\fo\t\f\u0001\r\u0004\rr\b\r\u000b"+
		"\r\f\rs\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0003\u0002\u0000"+
		"AZaz\u0005\u0000--09AZ__az\u0003\u0000\t\n\r\r  x\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000"+
		"\u0003\u001f\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007"+
		"(\u0001\u0000\u0000\u0000\t.\u0001\u0000\u0000\u0000\u000b5\u0001\u0000"+
		"\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000fB\u0001\u0000\u0000\u0000"+
		"\u0011H\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000\u0015V"+
		"\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000\u0000\u0019i\u0001\u0000"+
		"\u0000\u0000\u001bq\u0001\u0000\u0000\u0000\u001d\u001e\u0005,\u0000\u0000"+
		"\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005g\u0000\u0000 !\u0005"+
		"e\u0000\u0000!\"\u0005t\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$"+
		"\u0005p\u0000\u0000$%\u0005o\u0000\u0000%&\u0005s\u0000\u0000&\'\u0005"+
		"t\u0000\u0000\'\u0006\u0001\u0000\u0000\u0000()\u0005p\u0000\u0000)*\u0005"+
		"a\u0000\u0000*+\u0005t\u0000\u0000+,\u0005c\u0000\u0000,-\u0005h\u0000"+
		"\u0000-\b\u0001\u0000\u0000\u0000./\u0005d\u0000\u0000/0\u0005e\u0000"+
		"\u000001\u0005l\u0000\u000012\u0005e\u0000\u000023\u0005t\u0000\u0000"+
		"34\u0005e\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005s\u0000\u0000"+
		"67\u0005i\u0000\u000078\u0005t\u0000\u000089\u0005i\u0000\u00009:\u0005"+
		"o\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005p\u0000\u0000<=\u0005"+
		"a\u0000\u0000=>\u0005g\u0000\u0000>?\u0005i\u0000\u0000?@\u0005n\u0000"+
		"\u0000@A\u0005a\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BC\u0005a\u0000"+
		"\u0000CD\u0005b\u0000\u0000DE\u0005r\u0000\u0000EF\u0005i\u0000\u0000"+
		"FG\u0005r\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005c\u0000\u0000"+
		"IJ\u0005r\u0000\u0000JK\u0005e\u0000\u0000KL\u0005a\u0000\u0000LM\u0005"+
		"r\u0000\u0000M\u0012\u0001\u0000\u0000\u0000NO\u0005a\u0000\u0000OP\u0005"+
		"g\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005e\u0000\u0000RS\u0005g\u0000"+
		"\u0000ST\u0005a\u0000\u0000TU\u0005r\u0000\u0000U\u0014\u0001\u0000\u0000"+
		"\u0000VW\u0005e\u0000\u0000WX\u0005l\u0000\u0000XY\u0005i\u0000\u0000"+
		"YZ\u0005m\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005"+
		"a\u0000\u0000]^\u0005r\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_`\u0005"+
		"m\u0000\u0000`a\u0005o\u0000\u0000ab\u0005d\u0000\u0000bc\u0005i\u0000"+
		"\u0000cd\u0005f\u0000\u0000de\u0005i\u0000\u0000ef\u0005c\u0000\u0000"+
		"fg\u0005a\u0000\u0000gh\u0005r\u0000\u0000h\u0018\u0001\u0000\u0000\u0000"+
		"im\u0007\u0000\u0000\u0000jl\u0007\u0001\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000n\u001a\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"pr\u0007\u0002\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0006\r\u0000\u0000v\u001c\u0001\u0000\u0000\u0000\u0003"+
		"\u0000ms\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}