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
	 * Enter a parse tree produced by {@link shttpParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(shttpParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(shttpParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#post}.
	 * @param ctx the parse tree
	 */
	void enterPost(shttpParser.PostContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#post}.
	 * @param ctx the parse tree
	 */
	void exitPost(shttpParser.PostContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#patch}.
	 * @param ctx the parse tree
	 */
	void enterPatch(shttpParser.PatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#patch}.
	 * @param ctx the parse tree
	 */
	void exitPatch(shttpParser.PatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(shttpParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(shttpParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(shttpParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(shttpParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link shttpParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(shttpParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link shttpParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(shttpParser.ParametroContext ctx);
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