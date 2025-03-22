package main.Servidor_React.interprete;

import java.util.List;
import main.Servidor_React.antlr4.*;
import main.Servidor_React.socket.ServidorSocket;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author marco
 */
public class ShttpInterpreter implements shttpListener {

    Shttp shttp = new Shttp();

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
    public void enterGet(shttpParser.GetContext ctx) {
    }

    @Override
    public void exitGet(shttpParser.GetContext ctx) {
    }

    @Override
    public void enterPost(shttpParser.PostContext ctx) {
        // identificar si es sitio o pagina
        boolean esSitio = ctx.getToken(shttpParser.SITIO, 0) != null;
        boolean esPagina = ctx.getToken(shttpParser.PAGINA, 0) != null;
        // obtener lista de parametros
        List<shttpParser.ParametroContext> parametros = ctx.parametros().parametro();
        // si no hay parametros error
        if (parametros.isEmpty()) {
            System.out.println("Error: ser requiere al menos un parametro para crear sitio o pagina");
            ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            return;
        }
        // crear sitios con o sin parametros
        if (esSitio) {
            String ruta = parametros.get(0).IDENTIFICADOR().getText();
            for (int i = 1; i < parametros.size(); i++) {
                String subcarpeta = parametros.get(i).IDENTIFICADOR().getText();
                ruta = ruta + "/" + subcarpeta;
            }
            shttp.crearSitio(ruta);
            ServidorSocket.getInst().enviarMensajes("Servidor: SUCCESS");
        } else if (esPagina) {
            if (parametros.size() < 2) {
                System.out.println("Error: se debe indicar el sitio para crear la pagina");
                ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
                return;
            }
            // obtener la ruta de la carpeta para crear la pagina
            String rutaCarpeta = parametros.get(0).IDENTIFICADOR().getText();
            for (int i = 1; i < parametros.size() - 1; i++) {
                rutaCarpeta += "/" + parametros.get(i).IDENTIFICADOR().getText();
            }
            String nombrePagina = parametros.get(parametros.size() - 1).IDENTIFICADOR().getText();
            shttp.crearPagina(rutaCarpeta, nombrePagina);
            ServidorSocket.getInst().enviarMensajes("Servidor: SUCCESS");
        }

    }

    @Override
    public void exitPost(shttpParser.PostContext ctx) {
    }

    @Override
    public void enterPatch(shttpParser.PatchContext ctx) {
    }

    @Override
    public void exitPatch(shttpParser.PatchContext ctx) {
    }

    @Override
    public void enterDelete(shttpParser.DeleteContext ctx) {
    }

    @Override
    public void exitDelete(shttpParser.DeleteContext ctx) {
    }

    @Override
    public void enterParametros(shttpParser.ParametrosContext ctx) {
    }

    @Override
    public void exitParametros(shttpParser.ParametrosContext ctx) {
    }

    @Override
    public void enterParametro(shttpParser.ParametroContext ctx) {
    }

    @Override
    public void exitParametro(shttpParser.ParametroContext ctx) {
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
