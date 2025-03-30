package main.Servidor_React.reportes;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author marco
 */
public class GeneradorHtml {

    private StringBuilder contenido;
    private StringBuilder script;
    private String titulo;
    private String ruta;

    public GeneradorHtml(String titulo, String ruta) {
        this.titulo = titulo;
        this.ruta = ruta;
        this.contenido = new StringBuilder();
        this.script = new StringBuilder();
        iniciarHTML();
    }

    private void iniciarHTML() {
        contenido.append("""
            <!DOCTYPE html>
            <html lang="es">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>%s</title>
                <style>
                    body { font-family: Arial, sans-serif; margin: 20px; padding: 20px; }
                    h1 { color: #333; }
                </style>
            </head>
            <body>
            """.formatted(titulo));
    }

    public void agregarEtiqueta(String etiqueta) {
        contenido.append(etiqueta).append("\n");
    }

    public void agregarScript(String js) {
        script.append(js).append("\n");
    }

    public void cerrarHTML() {
        if (script.length() > 0) {
            contenido.append("<script>\n").append(script).append("</script>\n");
        }
        contenido.append("</body>\n</html>");
    }

    public void guardarArchivo() {
        String directorio = Paths.get(ruta).getParent().toString();
        try (FileWriter writer = new FileWriter(directorio + "/" + titulo + ".html")) {
            writer.write(contenido.toString());
            System.out.println("Pagina HTML generada en: " + ruta + "/" + titulo + ".html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
