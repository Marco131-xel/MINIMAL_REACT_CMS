package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import java.util.LinkedList;

/**
 *
 * @author marco
 */
public class For extends Instruccion {

    private Instruccion asignacion;
    private Instruccion condicion;
    private Instruccion actualizar;
    private LinkedList<Instruccion> instrucciones;

    public For(Instruccion asignacion, Instruccion condicion, Instruccion actualizar, LinkedList<Instruccion> instrucciones, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.asignacion = asignacion;
        this.condicion = condicion;
        this.actualizar = actualizar;
        this.instrucciones = instrucciones;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        // crear un nuevo entorno
        var newTabla = new TablaSimbolos(tabla);
        // ejcutar la asignacion e inicializar
        var res1 = this.asignacion.interpretar(arbol, newTabla);
        if (res1 instanceof Errores) {
            return res1;
        }

        while (true) {
            // evualar la condicion si e booleana
            var cond = this.condicion.interpretar(arbol, newTabla);
            if (cond instanceof Errores) {
                return cond;
            }

            if (this.condicion.tipo.getTipo() != TipoDato.BOOLEANO) {
                return new Errores("SEMANTICO", "La condicion debe ser booleana", this.linea, this.col);
            }
            // salir del ciclo si la condicion es falsa
            if (!(boolean) cond) {
                break;
            }

            // crear un nuevo ambito
            var newTabla2 = new TablaSimbolos(newTabla);

            for (var i : this.instrucciones) {
                var resIns = i.interpretar(arbol, newTabla2);

                if (resIns instanceof Break) {
                    return null;
                }
                if (resIns instanceof Return) {
                    return resIns;
                }
            }

            // Ejecutar la actualizacion
            var act = this.actualizar.interpretar(arbol, newTabla);
            if (act instanceof Errores) {
                return act;
            }
        }
        return null;
    }

}
