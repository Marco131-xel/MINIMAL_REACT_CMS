package utils;

import java.io.*;

/**
 *
 * @author marco
 */

public class GestionArchivos {

    FileInputStream entrada;
    FileOutputStream salida;

    public GestionArchivos() {
    }

    // METODO PARA LOS ARCHIVOS
    public String AbrirATexto(File archivo) {
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int afk;
            while ((afk = entrada.read()) != -1) {
                char caracter = (char) afk;
                contenido += caracter;
            }
            System.out.println("Archivo leido correctamente: " + archivo.getName());
        } catch (Exception e) {

        }
        return contenido;
    }
}
