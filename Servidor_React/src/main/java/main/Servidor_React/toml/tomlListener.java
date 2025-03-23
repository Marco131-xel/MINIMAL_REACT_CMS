// Generated from toml.g4 by ANTLR 4.13.2

package main.Servidor_React.toml;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tomlParser}.
 */
public interface tomlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tomlParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(tomlParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(tomlParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(tomlParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(tomlParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(tomlParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(tomlParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas(tomlParser.EtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas(tomlParser.EtiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(tomlParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(tomlParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(tomlParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(tomlParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#atributos}.
	 * @param ctx the parse tree
	 */
	void enterAtributos(tomlParser.AtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#atributos}.
	 * @param ctx the parse tree
	 */
	void exitAtributos(tomlParser.AtributosContext ctx);
}