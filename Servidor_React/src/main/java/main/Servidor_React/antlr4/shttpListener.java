// Generated from shttp.g4 by ANTLR 4.13.2

package main.Servidor_React.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link shttpParser}.
 */
public interface shttpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link shttpParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(shttpParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(shttpParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(shttpParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(shttpParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(shttpParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(shttpParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#xd}.
	 * @param ctx the parse tree
	 */
	void enterXd(shttpParser.XdContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#xd}.
	 * @param ctx the parse tree
	 */
	void exitXd(shttpParser.XdContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(shttpParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(shttpParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#objetivo}.
	 * @param ctx the parse tree
	 */
	void enterObjetivo(shttpParser.ObjetivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#objetivo}.
	 * @param ctx the parse tree
	 */
	void exitObjetivo(shttpParser.ObjetivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#instcl}.
	 * @param ctx the parse tree
	 */
	void enterInstcl(shttpParser.InstclContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#instcl}.
	 * @param ctx the parse tree
	 */
	void exitInstcl(shttpParser.InstclContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(shttpParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(shttpParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(shttpParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(shttpParser.BodyContext ctx);
}