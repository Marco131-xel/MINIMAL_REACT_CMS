package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class Incremento extends Instruccion {

    private String id;

    public Incremento(String id, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.id = id;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        var variable = tabla.getVariable(id);

        if (variable == null) {
            return new Errores("SEMANTICO", "Variable no existente", this.linea, this.col);
        }

        Object valorActual = variable.getValor();
        if (valorActual instanceof Double) {
            double nuevoValor = (double) valorActual + 1.0;
            variable.setValor(nuevoValor);
            return nuevoValor;
        } else {
            return new Errores("SEMANTICO", "Incremento solo aplicable a tipos numericos", this.linea, this.col);
        }
    }
}
