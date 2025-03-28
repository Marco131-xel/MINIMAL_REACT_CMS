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
    Toml toml = new Toml();

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
        boolean esSitio = ctx.getToken(shttpParser.SITIO, 0) != null;
        boolean esPagina = ctx.getToken(shttpParser.PAGINA, 0) != null;
        // obtener lista parametros
        List<shttpParser.ParametroContext> parametros = ctx.parametros().parametro();
        if (parametros.isEmpty()) {
            System.out.println("Error: se requiere un parametro para eliminar");
            ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            return;
        }
        // construir la ruta para los parametros
        String ruta = parametros.get(0).IDENTIFICADOR().getText();
        for (int i = 1; i < parametros.size(); i++) {
            ruta += "." + parametros.get(i).IDENTIFICADOR().getText();
        }

        if (esSitio) {
            // AUN NO SE DEFINE ESTO
            System.out.println("PROXIMAMENTE");
        } else if (esPagina) {
            String rutaArchivo = toml.abrirPagina(ruta);
            if (rutaArchivo != null) {
                ServidorSocket.getInst().enviarMensajes("Servidor: SUCCESS");
                ServidorSocket.getInst().enviarMensajes("RUTA " + rutaArchivo);
            } else {
                ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            }
        }
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
            String contenido = (ctx.body() != null && ctx.body().CONTENIDO() != null) ? ctx.body().CONTENIDO().getText() : "";
            shttp.crearPagina(rutaCarpeta, nombrePagina, contenido);
            ServidorSocket.getInst().enviarMensajes(contenido.isEmpty()
                    ? "Servidor: SUCCESS" : "Servidor: SUCCESS " + "... " + contenido + " ...");
        }

    }

    @Override
    public void exitPost(shttpParser.PostContext ctx) {
    }

    @Override
    public void enterPatch(shttpParser.PatchContext ctx) {
        // entrada shttp
        boolean esSitio = ctx.getToken(shttpParser.SITIO, 0) != null;
        boolean esPagina = ctx.getToken(shttpParser.PAGINA, 0) != null;
        // entrada scl
        boolean esModificar = ctx.getToken(shttpParser.MODIFICAR, 0) != null;
        boolean esAgregar = ctx.getToken(shttpParser.AGREGAR, 0) != null;
        boolean esMSitio = ctx.getToken(shttpParser.MSITIO, 0) != null;
        boolean esMPagina = ctx.getToken(shttpParser.MPAGINA, 0) != null;
        // Identificar el tipo de operacion
        boolean esSitioModificar = esSitio && esModificar && esMSitio;
        boolean esPaginaModificar = esPagina && esModificar && esMPagina;
        boolean esPaginaAgregar = esPagina && esAgregar && esMPagina;
        // Obtener lista de parametros
        List<shttpParser.ParametroContext> parametros = ctx.parametros().parametro();
        if (parametros.isEmpty()) {
            System.out.println("Error: Se requiere al menos un parámetro");
            ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            return;
        }
        // Construir la ruta
        String ruta = parametros.get(0).IDENTIFICADOR().getText();
        for (int i = 1; i < parametros.size(); i++) {
            ruta += "." + parametros.get(i).IDENTIFICADOR().getText();
        }
        // Obtener contenido si hay body
        String contenido = (ctx.body() != null && ctx.body().CONTENIDO() != null) ? ctx.body().CONTENIDO().getText() : "";

        if (esSitioModificar) {
            System.out.println("Modificando sitio: " + ruta);
            if (toml.modificarSitio(ruta)) {
                ServidorSocket.getInst().enviarMensajes("Servidor: SUCCESS");
            } else {
                ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            }
        } else if (esPaginaModificar) {
            System.out.println("Modificando pagina: " + ruta);
            if (toml.modificarPagina(ruta)) {
                ServidorSocket.getInst().enviarMensajes("Servidor: SUCCESS");
            } else {
                ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            }
        } else if (esPaginaAgregar) {
            System.out.println("Agregando contenido a pagina: " + ruta);
            if (toml.agregarPagina(ruta, contenido)) {
                ServidorSocket.getInst().enviarMensajes("Servidor: SUCCESS");
            } else {
                ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            }
        } else {
            System.out.println("Error: Comando PATCH no reconocido");
            ServidorSocket.getInst().enviarMensajes("Servidor: BAD_REQUEST");
        }
    }

    @Override
    public void exitPatch(shttpParser.PatchContext ctx) {
    }

    @Override
    public void enterDelete(shttpParser.DeleteContext ctx) {
        boolean esSitio = ctx.getToken(shttpParser.SITIO, 0) != null;
        boolean esPagina = ctx.getToken(shttpParser.PAGINA, 0) != null;
        // obtener lista parametros
        List<shttpParser.ParametroContext> parametros = ctx.parametros().parametro();
        if (parametros.isEmpty()) {
            System.out.println("Error: se requiere un parametro para eliminar");
            ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            return;
        }
        // construir la ruta para los parametros
        String ruta = parametros.get(0).IDENTIFICADOR().getText();
        for (int i = 1; i < parametros.size(); i++) {
            ruta += "." + parametros.get(i).IDENTIFICADOR().getText();
        }

        if (esSitio) {
            if (toml.eliminarSitio(ruta)) {
                ServidorSocket.getInst().enviarMensajes("Servidor: SUCCESS");
            } else {
                ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            }
        } else if (esPagina) {
            if (toml.eliminarPagina(ruta)) {
                ServidorSocket.getInst().enviarMensajes("Servidor: SUCCESS");
            } else {
                ServidorSocket.getInst().enviarMensajes("Servidor: NOT_FOUND");
            }
        }
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

    @Override
    public void enterBody(shttpParser.BodyContext ctx) {
    }

    @Override
    public void exitBody(shttpParser.BodyContext ctx) {
    }
}
