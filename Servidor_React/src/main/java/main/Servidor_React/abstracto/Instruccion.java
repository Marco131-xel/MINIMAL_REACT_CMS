package main.Servidor_React.abstracto;

import main.Servidor_React.ast.*;

/**
 *
 * @author marco
 */
public abstract class Instruccion {

    public Tipo tipo;
    public int linea;
    public int col;

    public Instruccion(Tipo tipo, int linea, int col) {
        this.tipo = tipo;
        this.linea = linea;
        this.col = col;
    }

    public abstract Object interpretar(Arbol arbol, TablaSimbolos tabla);
}
