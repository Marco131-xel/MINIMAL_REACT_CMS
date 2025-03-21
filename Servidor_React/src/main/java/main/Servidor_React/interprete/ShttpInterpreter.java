package main.Servidor_React.interprete;

import java.io.File;
import main.Servidor_React.antlr4.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author marco
 */
public class ShttpInterpreter implements shttpListener {

    private void crearSitio(String nombre) {
        File carpeta = new File("/home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/data/" + nombre);
        if (!carpeta.exists()) {
            if (carpeta.mkdir()) {
                System.out.println("Sitio " + nombre + " creado");
            } else {
                System.out.println("No se pudo crear el sitio");
            }
        } else {
            System.out.println("El sitio " + nombre + "ya existe");
        }
    }

    @Override
    public void enterInit(shttpParser.InitContext ctx) {
    }

    @Override
    public void exitInit(shttpParser.InitContext ctx) {
    }

    @Override
    public void enterInstrucciones(shttpParser.InstruccionesContext ctx) {
    }

    @Override
    public void exitInstrucciones(shttpParser.InstruccionesContext ctx) {
    }

    @Override
    public void enterInstruccion(shttpParser.InstruccionContext ctx) {
    }

    @Override
    public void exitInstruccion(shttpParser.InstruccionContext ctx) {
    }

    @Override
    public void enterXd(shttpParser.XdContext ctx) {
        String sitio = ctx.PARAMETRO().getText();
        crearSitio(sitio);
    }

    @Override
    public void exitXd(shttpParser.XdContext ctx) {
    }

    @Override
    public void enterMetodo(shttpParser.MetodoContext ctx) {
    }

    @Override
    public void exitMetodo(shttpParser.MetodoContext ctx) {
    }

    @Override
    public void enterObjetivo(shttpParser.ObjetivoContext ctx) {
    }

    @Override
    public void exitObjetivo(shttpParser.ObjetivoContext ctx) {
    }

    @Override
    public void enterInstcl(shttpParser.InstclContext ctx) {
    }

    @Override
    public void exitInstcl(shttpParser.InstclContext ctx) {
    }

    @Override
    public void enterAccion(shttpParser.AccionContext ctx) {
    }

    @Override
    public void exitAccion(shttpParser.AccionContext ctx) {
    }

    @Override
    public void enterBody(shttpParser.BodyContext ctx) {
    }

    @Override
    public void exitBody(shttpParser.BodyContext ctx) {
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
}
