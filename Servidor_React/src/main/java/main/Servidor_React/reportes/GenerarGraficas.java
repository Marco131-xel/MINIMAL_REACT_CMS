package main.Servidor_React.reportes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author marco
 */
public class GenerarGraficas {

    public static void generarImagen(Ast ast, String rutaArchivo, String nombreArchivo) {
        // Obtener el directorio del archivo .mtsx
        String directorio = Paths.get(rutaArchivo).getParent().toString();

        // Crear nombres de archivo en la misma carpeta
        String dotFilename = Paths.get(directorio, nombreArchivo + ".dot").toString();
        String pngFilename = Paths.get(directorio, nombreArchivo + ".png").toString();

        // Generar archivo DOT
        String dotContent = ast.generarDot();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dotFilename))) {
            writer.write(dotContent);
            System.out.println("Archivo DOT guardado en: " + dotFilename);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo DOT: " + e.getMessage());
        }

        // Generar PNG con Graphviz
        try {
            Process process = Runtime.getRuntime().exec("dot -Tpng " + dotFilename + " -o " + pngFilename);
            process.waitFor();
            System.out.println("Archivo PNG generado en: " + pngFilename);
        } catch (Exception e) {
            System.err.println("Error al generar el PNG: " + e.getMessage());
        }
    }
}
