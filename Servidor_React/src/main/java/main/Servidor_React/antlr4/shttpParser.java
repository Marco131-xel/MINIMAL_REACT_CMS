// Generated from shttp.g4 by ANTLR 4.13.2

package main.Servidor_React.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class shttpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, GET=2, POST=3, PATCH=4, DELETE=5, SITIO=6, PAGINA=7, CREAR=8, 
		AGREGAR=9, ELIMINAR=10, MODIFICAR=11, PARAMETRO=12, BLANCOS=13;
	public static final int
		RULE_init = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_xd = 3, 
		RULE_metodo = 4, RULE_objetivo = 5, RULE_instcl = 6, RULE_accion = 7, 
		RULE_body = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "instrucciones", "instruccion", "xd", "metodo", "objetivo", "instcl", 
			"accion", "body"
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

	@Override
	public String getGrammarFileName() { return "shttp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public shttpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			instrucciones(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		return instrucciones(0);
	}

	private InstruccionesContext instrucciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, _parentState);
		InstruccionesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_instrucciones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(21);
			instruccion();
			}
			_ctx.stop = _input.LT(-1);
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstruccionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instrucciones);
					setState(23);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(24);
					instruccion();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public ObjetivoContext objetivo() {
			return getRuleContext(ObjetivoContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public InstclContext instcl() {
			return getRuleContext(InstclContext.class,0);
		}
		public XdContext xd() {
			return getRuleContext(XdContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				metodo();
				setState(31);
				objetivo();
				setState(32);
				body();
				setState(33);
				instcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				xd();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class XdContext extends ParserRuleContext {
		public TerminalNode POST() { return getToken(shttpParser.POST, 0); }
		public List<TerminalNode> SITIO() { return getTokens(shttpParser.SITIO); }
		public TerminalNode SITIO(int i) {
			return getToken(shttpParser.SITIO, i);
		}
		public TerminalNode CREAR() { return getToken(shttpParser.CREAR, 0); }
		public TerminalNode PARAMETRO() { return getToken(shttpParser.PARAMETRO, 0); }
		public XdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterXd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitXd(this);
		}
	}

	public final XdContext xd() throws RecognitionException {
		XdContext _localctx = new XdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_xd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(POST);
			setState(39);
			match(SITIO);
			setState(40);
			match(CREAR);
			setState(41);
			match(SITIO);
			setState(42);
			match(PARAMETRO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(shttpParser.GET, 0); }
		public TerminalNode POST() { return getToken(shttpParser.POST, 0); }
		public TerminalNode PATCH() { return getToken(shttpParser.PATCH, 0); }
		public TerminalNode DELETE() { return getToken(shttpParser.DELETE, 0); }
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjetivoContext extends ParserRuleContext {
		public TerminalNode SITIO() { return getToken(shttpParser.SITIO, 0); }
		public TerminalNode PAGINA() { return getToken(shttpParser.PAGINA, 0); }
		public ObjetivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterObjetivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitObjetivo(this);
		}
	}

	public final ObjetivoContext objetivo() throws RecognitionException {
		ObjetivoContext _localctx = new ObjetivoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objetivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==SITIO || _la==PAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstclContext extends ParserRuleContext {
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public ObjetivoContext objetivo() {
			return getRuleContext(ObjetivoContext.class,0);
		}
		public List<TerminalNode> PARAMETRO() { return getTokens(shttpParser.PARAMETRO); }
		public TerminalNode PARAMETRO(int i) {
			return getToken(shttpParser.PARAMETRO, i);
		}
		public TerminalNode COMA() { return getToken(shttpParser.COMA, 0); }
		public InstclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterInstcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitInstcl(this);
		}
	}

	public final InstclContext instcl() throws RecognitionException {
		InstclContext _localctx = new InstclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			accion();
			setState(49);
			objetivo();
			setState(50);
			match(PARAMETRO);
			setState(51);
			match(COMA);
			setState(52);
			match(PARAMETRO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccionContext extends ParserRuleContext {
		public TerminalNode CREAR() { return getToken(shttpParser.CREAR, 0); }
		public TerminalNode AGREGAR() { return getToken(shttpParser.AGREGAR, 0); }
		public TerminalNode ELIMINAR() { return getToken(shttpParser.ELIMINAR, 0); }
		public TerminalNode MODIFICAR() { return getToken(shttpParser.MODIFICAR, 0); }
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitAccion(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_accion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return instrucciones_sempred((InstruccionesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instrucciones_sempred(InstruccionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\r;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002%\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000\u0001\u0002"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0003\u0001\u0000\u0002"+
		"\u0005\u0001\u0000\u0006\u0007\u0001\u0000\b\u000b3\u0000\u0012\u0001"+
		"\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004$\u0001\u0000"+
		"\u0000\u0000\u0006&\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000"+
		"\n.\u0001\u0000\u0000\u0000\f0\u0001\u0000\u0000\u0000\u000e6\u0001\u0000"+
		"\u0000\u0000\u00108\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0002\u0001"+
		"\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0006\u0001\uffff"+
		"\uffff\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u001b\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\n\u0001\u0000\u0000\u0018\u001a\u0003\u0004\u0002"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0003\n\u0005\u0000 !\u0003"+
		"\u0010\b\u0000!\"\u0003\f\u0006\u0000\"%\u0001\u0000\u0000\u0000#%\u0003"+
		"\u0006\u0003\u0000$\u001e\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000"+
		"\u0000%\u0005\u0001\u0000\u0000\u0000&\'\u0005\u0003\u0000\u0000\'(\u0005"+
		"\u0006\u0000\u0000()\u0005\b\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0005"+
		"\f\u0000\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0007\u0000\u0000\u0000"+
		"-\t\u0001\u0000\u0000\u0000./\u0007\u0001\u0000\u0000/\u000b\u0001\u0000"+
		"\u0000\u000001\u0003\u000e\u0007\u000012\u0003\n\u0005\u000023\u0005\f"+
		"\u0000\u000034\u0005\u0001\u0000\u000045\u0005\f\u0000\u00005\r\u0001"+
		"\u0000\u0000\u000067\u0007\u0002\u0000\u00007\u000f\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009\u0011\u0001\u0000\u0000\u0000\u0002"+
		"\u001b$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}