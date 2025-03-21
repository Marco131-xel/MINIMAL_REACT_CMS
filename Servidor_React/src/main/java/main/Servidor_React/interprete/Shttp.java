package main.Servidor_React.interprete;

import main.Servidor_React.antlr4.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 *
 * @author marco
 */
public class Shttp {

    public void ejecutar(String codigo) {
        CharStream input = CharStreams.fromString(codigo);
        shttpLexer lexer = new shttpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        shttpParser parser = new shttpParser(tokens);

        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShttpInterpreter(), tree);

    }
}
