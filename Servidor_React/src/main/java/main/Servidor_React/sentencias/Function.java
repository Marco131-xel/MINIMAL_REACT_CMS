package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class Function extends Instruccion {

    public Function(Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
