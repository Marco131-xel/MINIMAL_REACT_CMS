package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;

/**
 *
 * @author marco
 */
public class Break extends Instruccion {

    public Break(int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        return null;
    }
    
}
