package main.Servidor_React.toml;

import java.util.*;
import java.io.*;
import com.moandjiezana.toml.Toml;
import com.moandjiezana.toml.TomlWriter;

public class Tomi {

    private static final String TOML_PATH = "/home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/data/recovery.toml";

    public void actualizarTomlSitio(String nombre) {
        File tomlFile = new File(TOML_PATH);
        Map<String, Object> tomlData = new HashMap<>();

        // Leer el archivo TOML si existe
        if (tomlFile.exists()) {
            tomlData = new Toml().read(tomlFile).toMap();
        }

        // Separar la ruta en partes para hacerla jerárquica
        String[] partes = nombre.split("/");

        Map<String, Object> nivelActual = tomlData;
        for (String parte : partes) {
            if (!nivelActual.containsKey(parte)) {
                nivelActual.put(parte, new HashMap<>());
            }
            nivelActual = (Map<String, Object>) nivelActual.get(parte);
        }

        // Agregar el nombre en el nivel más profundo
        nivelActual.put("nombre", partes[partes.length - 1]);

        guardarToml(tomlData);
    }

    public void actualizarTomlPagina(String ruta, String nombre, String path) {
        File tomlFile = new File(TOML_PATH);
        Map<String, Object> tomlData = new HashMap<>();
        // leer toml
        if (tomlFile.exists()) {
            tomlData = new Toml().read(tomlFile).toMap();
        }
        // estructura de carpetas
        String[] carpetas = ruta.split("/");
        Map<String, Object> nivelActual = tomlData;

        for (String carpeta : carpetas) {
            if (!nivelActual.containsKey(carpeta)) {
                nivelActual.put(carpeta, new HashMap<>());
            }
            nivelActual = (Map<String, Object>) nivelActual.get(carpeta);
        }
        // agregar la nueva pagina
        Map<String, Object> paginaData = new HashMap<>();
        paginaData.put("nombre", nombre);
        paginaData.put("path", path);
        nivelActual.put(nombre, paginaData);
        guardarToml(tomlData);
    }

    private void guardarToml(Map<String, Object> data) {
        try (Writer writer = new FileWriter(TOML_PATH)) {
            new TomlWriter().write(data, writer);
            System.out.println("Archivo TOML actualizado");
        } catch (IOException e) {
            System.out.println("Error al escribir el TOML: " + e.getMessage());
        }
    }
}
