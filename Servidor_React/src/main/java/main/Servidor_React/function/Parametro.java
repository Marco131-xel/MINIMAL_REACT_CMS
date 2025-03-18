package main.Servidor_React.function;

import main.Servidor_React.ast.*;
/**
 *
 * @author marco
 */
public class Parametro {
    
    private String id;
    private Tipo tipo;
    
    
    public Parametro(String id, Tipo tipo){
        this.id = id;
        this.tipo = tipo;
    }

    public String getId(){
        return id;
    }

    public Tipo getTipo(){
        return tipo;
    }
    
}
