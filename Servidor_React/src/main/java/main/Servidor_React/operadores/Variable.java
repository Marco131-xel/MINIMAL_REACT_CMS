package main.Servidor_React.operadores;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class Variable extends Instruccion {

    private String id;

    public Variable(String id, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.id = id;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        var valor = tabla.getVariable(this.id);
        if (valor == null) {
            return new Errores("SEMANTICO", "La Variable no Existe", this.linea, this.col);
        }
        this.tipo.setTipo(valor.getTipo().getTipo());
        return valor.getValor();
    }

    @Override
    public String toString() {
        return this.id;
    }
    
}
