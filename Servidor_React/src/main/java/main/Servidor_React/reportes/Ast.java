package main.Servidor_React.reportes;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author marco
 */
public class Ast {
    private List<Ocurrencia> ocurrencias;
    private int contador;

    public Ast(List<Ocurrencia> ocurrencias) {
        this.ocurrencias = ocurrencias;
        this.contador = 0;
    }

    public List<Ocurrencia> getOcurrencias() {
        return ocurrencias;
    }

    public void setOcurrencias(List<Ocurrencia> ocurrencias) {
        this.ocurrencias = ocurrencias;
    }

    private String generarNodo(String label) {
        return "nodo" + (contador++) + " [label=\"" + label + "\"];\n";
    }

    public String generarDot() {
        StringBuilder dot = new StringBuilder();
        dot.append("digraph AST {\n");
        dot.append("    bgcolor=\"#212F3D\";\n");
        dot.append("    node [shape=circle, style=filled, color=lightblue];\n");

        List<String> nodos = new ArrayList<>();
        for (Ocurrencia ocurrencia : ocurrencias) {
            String nodoOperador = generarNodo(ocurrencia.getOperador());
            String nodoOp1 = generarNodo(ocurrencia.getOp1());
            String nodoOp2 = generarNodo(ocurrencia.getOp2());
            nodos.add(nodoOperador);
            dot.append(nodoOperador);
            dot.append(nodoOp1);
            dot.append(nodoOp2);
            dot.append(nodoOperador.split(" ")[0]).append(" -> ").append(nodoOp1.split(" ")[0]).append(";\n");
            dot.append(nodoOperador.split(" ")[0]).append(" -> ").append(nodoOp2.split(" ")[0]).append(";\n");
        }
        for (int i = nodos.size() - 1; i > 0; i--) {
            dot.append(nodos.get(i - 1).split(" ")[0]).append(" -> ").append(nodos.get(i).split(" ")[0]).append(";\n");
        }

        dot.append("}\n");
        return dot.toString();
    }
}
