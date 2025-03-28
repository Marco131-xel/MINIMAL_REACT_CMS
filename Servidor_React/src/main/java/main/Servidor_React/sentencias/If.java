package main.Servidor_React.sentencias;

import java.util.LinkedList;
import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class If extends Instruccion {

    private Instruccion condicion;
    private LinkedList<Instruccion> instruccionesIf;
    private If elseIf;
    private LinkedList<Instruccion> instruccionesElse;

    public If(Instruccion condicion, LinkedList<Instruccion> instruccionesIf, If elseIf, LinkedList<Instruccion> instruccionesElse, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.condicion = condicion;
        this.instruccionesIf = (instruccionesIf != null) ? instruccionesIf : new LinkedList<>();
        this.elseIf = elseIf;
        this.instruccionesElse = (instruccionesElse != null) ? instruccionesElse : new LinkedList<>();
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        // evaluar condicion
        var cond = this.condicion.interpretar(arbol, tabla);

        // si la condicion es error
        if (cond instanceof Errores) {
            return cond;
        }

        // si la condicion no existe
        if (cond == null) {
            return new Errores("SEMANTICO", "La condicion del If no se pudo evaluar correctamente",
                    this.linea, this.col);
        }

        // verificar si la condicion es booleano
        if (this.condicion.tipo.getTipo() != TipoDato.BOOLEANO) {
            return new Errores("SEMANTICO", "La condicion del If debe ser de tipo booleano",
                    this.linea, this.col);
        }

        var newTabla = new TablaSimbolos(tabla);
        try {
            if ((boolean) cond) {
                // ejecutar if
                return ejecutarBloque(arbol, newTabla, this.instruccionesIf);
            } else if (this.elseIf != null) {
                // ejecutar else if
                return this.elseIf.interpretar(arbol, tabla);
            } else {
                // ejecutar else
                return ejecutarBloque(arbol, newTabla, this.instruccionesElse);
            }
        } catch (Exception e) {
            return new Errores("RUNTIME", "Error inesperado en la ejecucion del If-ElseIf-Else: " + e.getMessage(),
                    this.linea, this.col);
        }
    }

    private Object ejecutarBloque(Arbol arbol, TablaSimbolos tabla, LinkedList<Instruccion> instrucciones) {
        for (var i : instrucciones) {
            if (i instanceof Break) {
                return new Errores("SEMANTICO", "Break fuera de un ciclo", this.linea, this.col);
            }

            var resultado = i.interpretar(arbol, tabla);

            if (resultado instanceof Errores) {
                return resultado;
            }

            if (resultado instanceof Return) {
                return resultado;
            }

        }
        return null;
    }
}
