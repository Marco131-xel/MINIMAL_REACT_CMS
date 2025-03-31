package main.Servidor_React.reportes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import main.Servidor_React.excepciones.Errores;

/**
 *
 * @author marco
 */
public class GenerarErrores {

    public static void generar(List<Errores> listaErrores, String ruta, String nombre) {
        if (listaErrores.isEmpty()) {
            System.out.println("No hay errores para reportar");
            return;
        }

        String directorio = Paths.get(ruta).getParent().toString();
        String archivo = directorio + "/" + nombre + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) { 
            for (Errores error : listaErrores) {
                writer.write(error.getTipo() + ", " + error.getDesc() + ", " + error.getLinea() + ", " + error.getColumna() + "\n");
            }
            System.out.println("Archivo TXT generado en: " + archivo);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo de errores: " + e.getMessage());
        }
    }

}
