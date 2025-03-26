package main.Servidor_React.interprete;

import main.Servidor_React.toml.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author marco
 */
public class TomInterpreter implements tomlListener {

    private String rutaEncontrar;
    private boolean esSitio;
    private boolean encontrado = false;
    private StringBuilder nuevoContenido = new StringBuilder();

    public TomInterpreter(String rutaEncontrar, boolean esSitio) {
        this.rutaEncontrar = rutaEncontrar;
        this.esSitio = esSitio;
    }

    @Override
    public void enterInit(tomlParser.InitContext ctx) {
    }

    @Override
    public void exitInit(tomlParser.InitContext ctx) {
    }

    @Override
    public void enterInstrucciones(tomlParser.InstruccionesContext ctx) {
    }

    @Override
    public void exitInstrucciones(tomlParser.InstruccionesContext ctx) {
    }

    @Override
    public void enterInstruccion(tomlParser.InstruccionContext ctx) {
    }

    @Override
    public void exitInstruccion(tomlParser.InstruccionContext ctx) {
    }

    @Override
    public void enterEtiquetas(tomlParser.EtiquetasContext ctx) {
        String etiqueta = ctx.getText().replace("[", "").replace("]", "").trim();
        if (etiqueta.equals(rutaEncontrar)) {
            encontrado = true;
        } else {
            nuevoContenido.append(ctx.getText()).append("\n");
        }
    }

    @Override
    public void exitEtiquetas(tomlParser.EtiquetasContext ctx) {
    }

    @Override
    public void enterValores(tomlParser.ValoresContext ctx) {
    }

    @Override
    public void exitValores(tomlParser.ValoresContext ctx) {
    }

    @Override
    public void enterValor(tomlParser.ValorContext ctx) {
    }

    @Override
    public void exitValor(tomlParser.ValorContext ctx) {
    }

    @Override
    public void enterAtributos(tomlParser.AtributosContext ctx) {
        if (!esSitio) {
            String path = ctx.getText();
            if (path.contains("path=\"" + rutaEncontrar.replace(".", "/") + ".mtsx\"")) {
                encontrado = true;
            } else {
                nuevoContenido.append(path).append("\n");
            }
        } else {
            nuevoContenido.append(ctx.getText()).append("\n");
        }
    }

    @Override
    public void exitAtributos(tomlParser.AtributosContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode tn) {
    }

    @Override
    public void visitErrorNode(ErrorNode en) {
    }

    @Override
    public void enterEveryRule(ParserRuleContext prc) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext prc) {
    }

    public boolean fueEncontrado() {
        return encontrado;
    }

    public String getNuevoContenido() {
        return nuevoContenido.toString();
    }
}
