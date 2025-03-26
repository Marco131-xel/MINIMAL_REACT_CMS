package main.Servidor_React.html;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class Etiqueta extends Instruccion {

    private String tag1;
    private Instruccion contenido;
    private String tag2;

    public Etiqueta(String tag1, Instruccion contenido, String tag2, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.tag1 = tag1;
        this.contenido = contenido;
        this.tag2 = tag2;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        // ver que las etiquetas sean iguales
        if(!etiquetaValida()){
            return new Errores("SEMANTICO", tag1 +" no equivale con la etiqueta de cierre " + tag2, this.linea, this.col);
        }
        
        var resultado = this.contenido.interpretar(arbol, tabla);
        if (resultado instanceof Errores) {
            return resultado;
        }
        
        String conteVar = resultado.toString();
        conteVar = procesarVariables(conteVar, tabla);
        String etiqueta = tag1 + conteVar + tag2;
        arbol.Print(etiqueta);
        return null;
    }
    
    // Funcion para ver si las etiquetas son iguales
    private boolean etiquetaValida(){
        if (tag1.length() > 0 && tag2.length() > 0){
            String tagCierre = "</" + tag1.substring(1);
            return tagCierre.equals(tag2);
        }
        return false;
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