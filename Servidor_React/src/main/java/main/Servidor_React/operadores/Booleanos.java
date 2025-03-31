package main.Servidor_React.operadores;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import main.Servidor_React.reportes.*;

/**
 *
 * @author marco
 */
public class Booleanos extends Instruccion {

    private Instruccion log1;
    private Instruccion log2;
    private OperadoresBooleanas logico;
    private Instruccion log;

    //SOLO UNA OPERACION
    public Booleanos(Instruccion log, OperadoresBooleanas logico, int linea, int col) {
        super(new Tipo(TipoDato.BOOLEANO), linea, col);
        this.logico = logico;
        this.log = log;
    }

    // OPERACION DE DOS
    public Booleanos(Instruccion log1, Instruccion log2, OperadoresBooleanas logico, int linea, int col) {
        super(new Tipo(TipoDato.BOOLEANO), linea, col);
        this.log1 = log1;
        this.log2 = log2;
        this.logico = logico;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        Object logIzq = null, logDer = null, Unico = null;
        if (this.log != null) {
            Unico = this.log.interpretar(arbol, tabla);
            if (Unico instanceof Errores) {
                return Unico;
            }
        } else {
            logIzq = this.log1.interpretar(arbol, tabla);
            if (logIzq instanceof Errores) {
                return logIzq;
            }
            logDer = this.log2.interpretar(arbol, tabla);
            if (logDer instanceof Errores) {
                return logDer;
            }
        }

        Object resultado = switch (logico) {
            case OR ->
                this.or(logIzq, logDer);
            case AND ->
                this.and(logIzq, logDer);
            case NOT ->
                this.not(Unico);
            default ->
                new Errores("SEMANTICO", "Booleano Invalido", this.linea, this.col);
        };
        GeneradorHtml generador = arbol.getGenerarHtml();
        if (generador != null) {
            String codigoJs = generarJS();
            //generador.agregarScript(codigoJs);
        }

        return resultado;
    }

    // FUNCION PARA OR
    public Object or(Object comp1, Object comp2) {
        if (comp1 instanceof Boolean && comp2 instanceof Boolean) {
            return (Boolean) comp1 || (Boolean) comp2;
        }
        return new Errores("SEMANTICO", "Tipos incompatibles para el operador OR", this.linea, this.col);
    }

    // FUNCION PARA AND
    public Object and(Object comp1, Object comp2) {
        if (comp1 instanceof Boolean && comp2 instanceof Boolean) {
            return (Boolean) comp1 && (Boolean) comp2;
        }
        return new Errores("SEMANTICO", "Tipos incompatibles para el operador AND", this.linea, this.col);
    }

    // FUNCION PARA NOT
    public Object not(Object comp) {
        if (comp instanceof Boolean) {
            return !(Boolean) comp;
        }
        return new Errores("SEMANTICO", "Tipo incompatible para el operador NOT", this.linea, this.col);
    }

    @Override
    public String toString() {
        if (this.log != null) {
            return "!(" + this.log.toString() + ")";
        }

        String op1 = this.log1.toString();
        String op2 = this.log2.toString();
        String operadorJs = switch (this.logico) {
            case OR ->
                "||";
            case AND ->
                "&&";
            case NOT ->
                "!";
            default ->
                "";
        };

        return op1 + " " + operadorJs + " " + op2;
    }

    // Funcion para generar el script
    public String generarJS() {
        if (this.log != null) {
            return "!(" + this.log.toString() + ")";
        }

        String op1 = this.log1.toString();
        String op2 = this.log2.toString();
        String operadorJs = switch (this.logico) {
            case OR ->
                "||";
            case AND ->
                "&&";
            case NOT ->
                "!";
            default ->
                "";
        };

        return op1 + " " + operadorJs + " " + op2;
    }

}
