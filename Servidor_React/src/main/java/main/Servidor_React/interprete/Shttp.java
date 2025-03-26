package main.Servidor_React.interprete;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;
import main.Servidor_React.antlr4.*;
import main.Servidor_React.toml.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 *
 * @author marco
 */
public class Shttp {

    Tomi toml = new Tomi();

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

    public void crearSitio(String nombre) {
        File carpeta = new File("/home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/data/" + nombre);
        if (!carpeta.exists()) {
            if (carpeta.mkdir()) {
                System.out.println("Sitio " + nombre + " creado");
                toml.actualizarTomlSitio(nombre);
            } else {
                System.out.println("No se pudo crear el sitio");
            }
        } else {
            System.out.println("El sitio " + nombre + "ya existe");
        }
    }

    public void crearPagina(String ruta, String nombre, String contenido) {
        File carpeta = new File("/home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/data/" + ruta);
        File archivo = new File(carpeta, nombre + ".mtsx");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Pagina " + nombre + " creada");
                toml.actualizarTomlPagina(ruta, nombre, archivo.getAbsolutePath());
                String contenidoFormateado = "";
                if (contenido != null && !contenido.trim().isEmpty()) {
                    contenidoFormateado = Arrays.stream(contenido.split("\n"))
                            .map(linea -> "\t\t" + linea)
                            .collect(Collectors.joining("\n")) + "\n";
                }

                String estructuraBase = "const " + nombre + " = () => {\n\n"
                        + "\treturn (\n"
                        + contenidoFormateado
                        + "\t);\n"
                        + "}";

                try (FileWriter writer = new FileWriter(archivo)) {
                    writer.write(estructuraBase);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

}
