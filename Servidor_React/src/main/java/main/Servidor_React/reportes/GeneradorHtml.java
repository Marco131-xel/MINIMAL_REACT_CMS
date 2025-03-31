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
                body {
                    background-color: #212F3D;
                    color: white;
                    font-family: 'FreeMono', monospace;
                    margin: 0;
                    padding: 0;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    height: 100vh;
                    flex-direction: column;
                }
                h1, h2, h3, h4, h5, h6 {
                    color: white;
                    text-align: center;
                    margin: 10px 0;
                }
                p {
                    color: white;
                    margin: 10px;
                    text-align: center;
                }
                input, button {
                    font-family: 'FreeMono', monospace;
                    padding: 15px;
                    margin: 15px;
                    background-color: #2E4053;
                    color: white;
                    border: none;
                    border-radius: 5px;
                    cursor: pointer;
                    font-size: 18px;
                }
                input:hover, button:hover {
                    background-color: #1C2833;
                }
                button:focus {
                    outline: none;
                }
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
