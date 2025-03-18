package main.Servidor_React.function;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
/**
 *
 * @author marco
 */
public class Parametro extends Instruccion {
    
    private String id;
    private Tipo tipo;

    public Parametro(String id, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.id = id;
    }
    
    public String getId(){
        return id;
    }

    public Tipo getTipo(){
        return tipo;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        return null;
    }
    
}
