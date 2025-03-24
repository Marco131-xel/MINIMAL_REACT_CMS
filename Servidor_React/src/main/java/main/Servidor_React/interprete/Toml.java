package main.Servidor_React.interprete;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import main.Servidor_React.toml.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 *
 * @author marco
 */
public class Toml {

    Tomi tomi = new Tomi();
    private static String RECOVERY_PATH = ("/home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/data/recovery.toml");
    private static final String BASE_PATH = "/home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/data/";

    private ParseTree ejecutar(String contenido) {
        CharStream input = CharStreams.fromString(contenido);
        tomlLexer lexer = new tomlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tomlParser parser = new tomlParser(tokens);
        return parser.init();
    }

    public String abrirPagina(String ruta) {
        String contenido = leerArchivo(RECOVERY_PATH);
        if (contenido == null || contenido.isEmpty()) {
            return null;
        }
        ParseTree tree = ejecutar(contenido);
        TomInterpreter interpreter = new TomInterpreter(ruta, false);
        new ParseTreeWalker().walk(interpreter, tree);

        if (interpreter.fueEncontrado()) {
            String rutaArchivo = BASE_PATH + ruta.replace(".", "/") + ".html";
            File archivo = new File(rutaArchivo);

            if (archivo.exists() && archivo.canRead()) {
                return rutaArchivo;
            }
        }
        return null;
    }

    public boolean eliminarSitio(String ruta) {
        String contenido = leerArchivo(RECOVERY_PATH);
        if (contenido == null || contenido.isEmpty()) {
            return false;
        }

        ParseTree tree = ejecutar(contenido);
        TomInterpreter interpreter = new TomInterpreter(ruta, true);
        new ParseTreeWalker().walk(interpreter, tree);

        if (interpreter.fueEncontrado()) {
            for (String subRuta : tomi.relacion(ruta)) {
                tomi.eliminarSeccionToml(subRuta);
            }
            tomi.eliminarSeccionToml(ruta);
            return eliminarCarpeta(BASE_PATH + ruta.replace(".", "/"));
        }
        return false;
    }

    public boolean eliminarPagina(String ruta) {
        String contenido = leerArchivo(RECOVERY_PATH);
        if (contenido == null || contenido.isEmpty()) {
            return false;
        }

        ParseTree tree = ejecutar(contenido);
        TomInterpreter interpreter = new TomInterpreter(ruta, false);
        new ParseTreeWalker().walk(interpreter, tree);

        if (interpreter.fueEncontrado()) {
            tomi.eliminarSeccionToml(ruta);
            return eliminarArchivo(BASE_PATH + ruta.replace(".", "/") + ".html");
        }
        return false;
    }

    private boolean eliminarCarpeta(String ruta) {
        File carpeta = new File(ruta);
        return carpeta.exists() && eliminarRecursivamente(carpeta);
    }

    private boolean eliminarArchivo(String ruta) {
        File archivo = new File(ruta);
        return archivo.exists() && archivo.delete();
    }

    private boolean eliminarRecursivamente(File file) {
        if (file.isDirectory()) {
            for (File subfile : file.listFiles()) {
                eliminarRecursivamente(subfile);
            }
        }
        return file.delete();
    }

    public static String leerArchivo(String ruta) {
        try {
            return new String(Files.readAllBytes(Paths.get(ruta)));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
