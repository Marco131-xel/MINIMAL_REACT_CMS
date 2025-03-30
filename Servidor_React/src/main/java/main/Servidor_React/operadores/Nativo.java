package main.Servidor_React.operadores;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;

/**
 *
 * @author marco
 */
public class Nativo extends Instruccion {

    public Object valor;

    public Nativo(Object valor, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.valor = valor;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        return this.valor;
    }

    @Override
    public String toString() {
        return valor.toString();
    }
    
}
