package main.Servidor_React.function;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import java.util.LinkedList;

/**
 *
 * @author marco
 */
public class LLamada extends Instruccion {

    private String id;
    private LinkedList<Parametro> parametros;

    public LLamada(String id, LinkedList<Parametro> parametros, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.id = id;
        this.parametros = parametros;
    }

    public String getId(){
        return id;
    }

    public LinkedList<Parametro> getParametros(){ 
        return parametros;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        // buscar funcion en la tabla
        Simbolo funcionSimbolo = tabla.getVariable(id);
        if (funcionSimbolo == null || !(funcionSimbolo.getValor() instanceof Function)) {
            arbol.getErrores().add(new Errores("SEMANTICO", "La funcion " + id + " no esta definida", linea, col));
            return null;
        }

        // obtener la funcion
        Function funcion = (Function) funcionSimbolo.getValor();
        // evualar parametros
        LinkedList<Object> argumentos = new LinkedList<>();
        for (Parametro parametro : parametros) {
            Object valor = parametro.getTipo();
            if (valor == null) {
                arbol.getErrores().add(new Errores("SEMANTICO", "Error al evaluar parametro de la funcion: " + id, linea, col));
                return null;
            }
            argumentos.add(valor);
        }
        
        // Ejecutar la función
        return funcion.ejecutar(arbol, tabla, argumentos);
    }
}
