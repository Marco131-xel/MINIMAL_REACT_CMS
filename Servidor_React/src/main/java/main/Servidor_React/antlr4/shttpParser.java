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
		COMA=1, TREPTS=2, GET=3, POST=4, PATCH=5, DELETE=6, SITIO=7, PAGINA=8, 
		MSITIO=9, MPAGINA=10, ABRIR=11, CREAR=12, AGREGAR=13, ELIMINAR=14, MODIFICAR=15, 
		IDENTIFICADOR=16, BLANCOS=17, CONTENIDO=18;
	public static final int
		RULE_init = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_get = 3, 
		RULE_post = 4, RULE_patch = 5, RULE_delete = 6, RULE_parametros = 7, RULE_parametro = 8, 
		RULE_body = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "instrucciones", "instruccion", "get", "post", "patch", "delete", 
			"parametros", "parametro", "body"
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
			setState(20);
			instrucciones();
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
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
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
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				instruccion();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0) );
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
	public static class InstruccionContext extends ParserRuleContext {
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public PostContext post() {
			return getRuleContext(PostContext.class,0);
		}
		public PatchContext patch() {
			return getRuleContext(PatchContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
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
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				get();
				}
				break;
			case POST:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				post();
				}
				break;
			case PATCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				patch();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				delete();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class GetContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(shttpParser.GET, 0); }
		public TerminalNode ABRIR() { return getToken(shttpParser.ABRIR, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode SITIO() { return getToken(shttpParser.SITIO, 0); }
		public TerminalNode PAGINA() { return getToken(shttpParser.PAGINA, 0); }
		public TerminalNode MSITIO() { return getToken(shttpParser.MSITIO, 0); }
		public TerminalNode MPAGINA() { return getToken(shttpParser.MPAGINA, 0); }
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitGet(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_get);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(GET);
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==SITIO || _la==PAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(35);
			match(ABRIR);
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==MSITIO || _la==MPAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(37);
			parametros();
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
	public static class PostContext extends ParserRuleContext {
		public TerminalNode POST() { return getToken(shttpParser.POST, 0); }
		public TerminalNode CREAR() { return getToken(shttpParser.CREAR, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode SITIO() { return getToken(shttpParser.SITIO, 0); }
		public TerminalNode PAGINA() { return getToken(shttpParser.PAGINA, 0); }
		public TerminalNode MSITIO() { return getToken(shttpParser.MSITIO, 0); }
		public TerminalNode MPAGINA() { return getToken(shttpParser.MPAGINA, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public PostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterPost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitPost(this);
		}
	}

	public final PostContext post() throws RecognitionException {
		PostContext _localctx = new PostContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_post);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(POST);
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==SITIO || _la==PAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			match(CREAR);
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==MSITIO || _la==MPAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(43);
			parametros();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TREPTS) {
				{
				setState(44);
				body();
				}
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
	public static class PatchContext extends ParserRuleContext {
		public TerminalNode PATCH() { return getToken(shttpParser.PATCH, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode SITIO() { return getToken(shttpParser.SITIO, 0); }
		public TerminalNode PAGINA() { return getToken(shttpParser.PAGINA, 0); }
		public TerminalNode MODIFICAR() { return getToken(shttpParser.MODIFICAR, 0); }
		public TerminalNode AGREGAR() { return getToken(shttpParser.AGREGAR, 0); }
		public TerminalNode MSITIO() { return getToken(shttpParser.MSITIO, 0); }
		public TerminalNode MPAGINA() { return getToken(shttpParser.MPAGINA, 0); }
		public PatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterPatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitPatch(this);
		}
	}

	public final PatchContext patch() throws RecognitionException {
		PatchContext _localctx = new PatchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_patch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PATCH);
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==SITIO || _la==PAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==AGREGAR || _la==MODIFICAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==MSITIO || _la==MPAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
			parametros();
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
	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(shttpParser.DELETE, 0); }
		public TerminalNode ELIMINAR() { return getToken(shttpParser.ELIMINAR, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode SITIO() { return getToken(shttpParser.SITIO, 0); }
		public TerminalNode PAGINA() { return getToken(shttpParser.PAGINA, 0); }
		public TerminalNode MSITIO() { return getToken(shttpParser.MSITIO, 0); }
		public TerminalNode MPAGINA() { return getToken(shttpParser.MPAGINA, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(DELETE);
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==SITIO || _la==PAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(55);
			match(ELIMINAR);
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==MSITIO || _la==MPAGINA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
			parametros();
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(shttpParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(shttpParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			parametro();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(60);
				match(COMA);
				setState(61);
				parametro();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(shttpParser.IDENTIFICADOR, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shttpListener ) ((shttpListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IDENTIFICADOR);
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
		public List<TerminalNode> TREPTS() { return getTokens(shttpParser.TREPTS); }
		public TerminalNode TREPTS(int i) {
			return getToken(shttpParser.TREPTS, i);
		}
		public TerminalNode CONTENIDO() { return getToken(shttpParser.CONTENIDO, 0); }
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
		enterRule(_localctx, 18, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(TREPTS);
			setState(70);
			match(CONTENIDO);
			setState(71);
			match(TREPTS);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012J\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"\u0018\b\u0001\u000b\u0001\f\u0001\u0019\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004.\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007?\b\u0007\n\u0007\f\u0007B\t"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000"+
		"\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000"+
		"\u0007\b\u0001\u0000\t\n\u0002\u0000\r\r\u000f\u000fE\u0000\u0014\u0001"+
		"\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u001f\u0001"+
		"\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b\'\u0001\u0000\u0000"+
		"\u0000\n/\u0001\u0000\u0000\u0000\f5\u0001\u0000\u0000\u0000\u000e;\u0001"+
		"\u0000\u0000\u0000\u0010C\u0001\u0000\u0000\u0000\u0012E\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000"+
		"\u0000\u001b \u0003\u0006\u0003\u0000\u001c \u0003\b\u0004\u0000\u001d"+
		" \u0003\n\u0005\u0000\u001e \u0003\f\u0006\u0000\u001f\u001b\u0001\u0000"+
		"\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 \u0005\u0001\u0000\u0000"+
		"\u0000!\"\u0005\u0003\u0000\u0000\"#\u0007\u0000\u0000\u0000#$\u0005\u000b"+
		"\u0000\u0000$%\u0007\u0001\u0000\u0000%&\u0003\u000e\u0007\u0000&\u0007"+
		"\u0001\u0000\u0000\u0000\'(\u0005\u0004\u0000\u0000()\u0007\u0000\u0000"+
		"\u0000)*\u0005\f\u0000\u0000*+\u0007\u0001\u0000\u0000+-\u0003\u000e\u0007"+
		"\u0000,.\u0003\u0012\t\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.\t\u0001\u0000\u0000\u0000/0\u0005\u0005\u0000\u000001\u0007\u0000"+
		"\u0000\u000012\u0007\u0002\u0000\u000023\u0007\u0001\u0000\u000034\u0003"+
		"\u000e\u0007\u00004\u000b\u0001\u0000\u0000\u000056\u0005\u0006\u0000"+
		"\u000067\u0007\u0000\u0000\u000078\u0005\u000e\u0000\u000089\u0007\u0001"+
		"\u0000\u00009:\u0003\u000e\u0007\u0000:\r\u0001\u0000\u0000\u0000;@\u0003"+
		"\u0010\b\u0000<=\u0005\u0001\u0000\u0000=?\u0003\u0010\b\u0000><\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\u000f\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0010\u0000\u0000D\u0011\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0002\u0000\u0000FG\u0005\u0012\u0000\u0000GH\u0005\u0002\u0000"+
		"\u0000H\u0013\u0001\u0000\u0000\u0000\u0004\u0019\u001f-@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}