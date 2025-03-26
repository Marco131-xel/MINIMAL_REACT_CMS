package main.Servidor_React.html;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class Parrafo extends Instruccion {

    private String p1;
    private Instruccion contenido;
    private String p2;

    public Parrafo(String p1, Instruccion contenido, String p2, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.p1 = p1;
        this.contenido = contenido;
        this.p2 = p2;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        var resultado = this.contenido.interpretar(arbol, tabla);
        
        if (resultado instanceof Errores) {
            return resultado;
        }
        
        String conteVar = resultado.toString();
        conteVar = procesarVariables(conteVar, tabla);
        String etiqueta = p1 + conteVar + p2;
        arbol.Print(etiqueta);
        return null;
    }

    // Funcion para ver si existe un variable en contenido
    private String procesarVariables(String contenido, TablaSimbolos tabla) {
        String regex = "\\{([^}]+)\\}";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(contenido);

        while (matcher.find()) {
            String variableNombre = matcher.group(1);
            Simbolo simbolo = (Simbolo) tabla.getVariable(variableNombre);

            if (simbolo != null) {
                Object valor = simbolo.getValor();
                contenido = contenido.replace("{" + variableNombre + "}", valor.toString());
            } else {
                contenido = contenido.replace("{" + variableNombre + "}", "[Variable no definida]");
            }
        }
        return contenido;
    }
}
