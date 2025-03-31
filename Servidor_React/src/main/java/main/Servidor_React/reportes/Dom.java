package main.Servidor_React.reportes;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Dom {

    private List<Model> modelos;
    private int contador;

    public Dom(List<Model> modelos) {
        this.modelos = modelos;
        this.contador = 0;
    }

    public List<Model> getModelos() {
        return modelos;
    }

    public void setModelos(List<Model> modelos) {
        this.modelos = modelos;
    }

    private String generarNodo(String etiqueta) {
        String nombreEtiqueta = etiqueta.replaceAll("[<>]", "");
        return "nodo" + (contador++) + " [label=\"" + nombreEtiqueta + "\", shape=square, style=filled, color=lightgreen];\n";
    }
    
    public String generarDot(String nombre) {
        StringBuilder dot = new StringBuilder();
        dot.append("digraph Dom {\n");
        dot.append("    bgcolor=\"#212F3D\";\n");
        dot.append("    node [style=filled, color=lightgreen];\n");

        String document = nombre;
        String html = "html";
        String head = "head";
        String body = "body";
        String meta = "meta";
        String title = "title";
        String style = "style";
        String script = "script";

        dot.append(generarNodo(document));
        dot.append(generarNodo(html));
        dot.append(generarNodo(head));
        dot.append(generarNodo(body));
        dot.append(generarNodo(meta));
        dot.append(generarNodo(title));
        dot.append(generarNodo(style));
        dot.append(generarNodo(script));

        dot.append("nodo0 -> nodo1;\n");
        dot.append("nodo1 -> nodo2;\n");
        dot.append("nodo1 -> nodo3;\n");
        dot.append("nodo2 -> nodo4;\n");
        dot.append("nodo2 -> nodo5;\n");
        dot.append("nodo2 -> nodo6;\n");
        dot.append("nodo3 -> nodo7;\n");
        
        List<String> nodos = new ArrayList<>();
        for (Model model : modelos) {
            String nodo = generarNodo(model.getEtiqueta());
            nodos.add(nodo);
            dot.append(nodo);
        }
        
        for (int i = 0; i < nodos.size(); i++) {
            dot.append("nodo3 -> " + nodos.get(i).split(" ")[0] + ";\n");
        }

        dot.append("}\n");
        return dot.toString();
    }
}
