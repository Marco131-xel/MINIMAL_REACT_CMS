package main.Servidor_React.toml;

import java.util.*;
import java.io.*;

/**
 *
 * @author marco
 */
public class Tomi {

    private static final String TOML_PATH = "/home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/data/recovery.toml";

    public void actualizarTomlSitio(String nombre) {
        Map<String, Map<String, String>> tomlData = leerToml();
        String claveSeccion = nombre.replace("/", ".");
        tomlData.putIfAbsent(claveSeccion, new HashMap<>());
        tomlData.get(claveSeccion).put("nombre", nombre);
        guardarToml(tomlData);
    }

    public void actualizarTomlPagina(String ruta, String nombre, String path) {
        Map<String, Map<String, String>> tomlData = leerToml();
        String claveSeccion = (ruta + "." + nombre).replace("/", ".");

        Map<String, String> paginaData = new HashMap<>();
        paginaData.put("nombre", nombre);
        paginaData.put("path", path);

        tomlData.put(claveSeccion, paginaData);
        guardarToml(tomlData);
    }

    private Map<String, Map<String, String>> leerToml() {
        Map<String, Map<String, String>> tomlData = new LinkedHashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(TOML_PATH))) {
            String linea;
            String seccionActual = null;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty() || linea.startsWith("#")) {
                    continue;
                }
                if (linea.startsWith("[")) {
                    seccionActual = linea.substring(1, linea.length() - 1);
                    tomlData.putIfAbsent(seccionActual, new HashMap<>());
                } else if (seccionActual != null) {
                    String[] partes = linea.split("=", 2);
                    if (partes.length == 2) {
                        tomlData.get(seccionActual).put(partes[0].trim(), partes[1].trim().replace("\"", ""));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo TOML: " + e.getMessage());
        }
        return tomlData;
    }

    public boolean eliminarSeccionToml(String nombre) {
        Map<String, Map<String, String>> tomlData = leerToml();
        String claveSeccion = nombre.replace("/", ".");

        if (tomlData.containsKey(claveSeccion)) {
            tomlData.remove(claveSeccion);
            guardarToml(tomlData);
            return true;
        }
        return false;
    }

    private void guardarToml(Map<String, Map<String, String>> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TOML_PATH))) {
            for (Map.Entry<String, Map<String, String>> seccion : data.entrySet()) {
                bw.write("[" + seccion.getKey() + "]\n");
                for (Map.Entry<String, String> entry : seccion.getValue().entrySet()) {
                    bw.write(entry.getKey() + " = \"" + entry.getValue() + "\"\n");
                }
                bw.write("\n");
            }
            System.out.println("Archivo TOML actualizado");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo TOML: " + e.getMessage());
        }
    }
}
