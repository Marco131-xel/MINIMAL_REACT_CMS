package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import main.Servidor_React.reportes.*;

/**
 *
 * @author marco
 */
public class Asignacion extends Instruccion {

    private String id;
    private Instruccion exp;

    public Asignacion(String id, Instruccion exp, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.id = id;
        this.exp = exp;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        //variable exista
        var variable = tabla.getVariable(id);
        if (variable == null) {
            return new Errores("SEMANTICO", "Variable "+this.id+" no existe",
                    this.linea, this.col);
        }

        // interpretar el nuevo valor a asignar
        var newValor = this.exp.interpretar(arbol, tabla);
        if (newValor instanceof Errores) {
            return newValor;
        }

        //validar tipos
        if (variable.getTipo().getTipo() != this.exp.tipo.getTipo()) {
            return new Errores("SEMANTICO", this.exp.tipo.getTipo()+ " tipo erroneo en asignacion",
                    this.linea, this.col);
        }
        variable.setValor(newValor);
        GeneradorHtml generador = arbol.getGenerarHtml();
        if (generador != null) {
            String codigoJs = generarJS(newValor);
            generador.agregarScript(codigoJs);
        }
        return null;
    }

    public String generarJS(Object valor) {
        if (valor instanceof String) {
            return id + " = \"" + valor + "\";";
        } else {
            return id + " = " + valor.toString() + ";";
        }
    }

}
