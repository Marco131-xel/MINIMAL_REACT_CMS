package main.Servidor_React.operadores;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
/**
 *
 * @author marco
 */
public class Aritmeticas extends Instruccion {

    private Instruccion operando1;
    private Instruccion operando2;
    private OperadoresAritmeticos operacion;
    private Instruccion operandoUnico;

    //negacion
    public Aritmeticas(Instruccion operandoUnico, OperadoresAritmeticos operacion, int linea, int col) {
        super(new Tipo(TipoDato.NUMERO), linea, col);
        this.operacion = operacion;
        this.operandoUnico = operandoUnico;
    }

    // operacion dos
    public Aritmeticas(Instruccion operando1, Instruccion operando2, OperadoresAritmeticos operacion, int linea, int col) {
        super(new Tipo(TipoDato.NUMERO), linea, col);
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operacion = operacion;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        Object opIzq = null, opDer = null, unico = null;

        if (this.operandoUnico != null) {
            unico = this.operandoUnico.interpretar(arbol, tabla);
            if (unico instanceof Errores) {
                return unico;
            }
        } else {
            opIzq = this.operando1.interpretar(arbol, tabla);
            if (opIzq instanceof Errores) {
                return opIzq;
            }
            opDer = this.operando2.interpretar(arbol, tabla);
            if (opDer instanceof Errores) {
                return opDer;
            }
        }
        Object resultado = switch (operacion) {
            case SUMA ->
                this.suma(opIzq, opDer);
            case NEGACION ->
                this.negacion(unico);
            case RESTA ->
                this.resta(opIzq, opDer);
            case MULTIPLICACION ->
                this.multiplicar(opIzq, opDer);
            case DIVISION ->
                this.division(opIzq, opDer);
            case POTENCIA ->
                this.potencia(opIzq, opDer);
            default ->
                new Errores("Semantico", this.operacion + "Operador invalido", this.linea, this.col);
        };
        return resultado;
    }

    // Funcion para sumar
    public Object suma(Object op1, Object op2) {
        var tipo1 = this.operando1.tipo.getTipo();
        var tipo2 = this.operando2.tipo.getTipo();

        switch (tipo1) {
            case NUMERO -> {
                switch (tipo2) {
                    case NUMERO -> {
                        this.tipo.setTipo(TipoDato.NUMERO);
                        return (double) op1 + (double) op2;
                    }
                    case CADENA -> {
                        this.tipo.setTipo(TipoDato.CADENA);
                        return op1.toString() + op2.toString();
                    }
                    default -> {
                        return new Errores("SEMANTICO", "Suma erronea", this.linea, this.col);
                    }
                }
            }
            case CADENA -> {
                this.tipo.setTipo(TipoDato.CADENA);
                return op1.toString() + op2.toString();
            }
            default -> {
                return new Errores("SEMANTICO", "Suma erronea", this.linea, this.col);

            }
        }
    }

    // Funcion para restar
    public Object resta(Object op1, Object op2) {
        var tipo1 = this.operando1.tipo.getTipo();
        var tipo2 = this.operando2.tipo.getTipo();

        switch (tipo1) {
            case NUMERO -> {
                switch (tipo2) {
                    case NUMERO -> {
                        this.tipo.setTipo(TipoDato.NUMERO);
                        return (double) op1 - (double) op2;
                    }
                    default -> {
                        return new Errores("SEMANTICO", "Resta erronea", this.linea, this.col);
                    }
                }
            }
            default -> {
                return new Errores("SEMANTICO", "Suma erronea", this.linea, this.col);

            }
        }
    }

    // Funcion para multiplicar
    public Object multiplicar(Object op1, Object op2) {
        var tipo1 = this.operando1.tipo.getTipo();
        var tipo2 = this.operando2.tipo.getTipo();

        switch (tipo1) {
            case NUMERO -> {
                switch (tipo2) {
                    case NUMERO -> {
                        this.tipo.setTipo(TipoDato.NUMERO);
                        return (double) op1 * (double) op2;
                    }
                    default -> {
                        return new Errores("SEMANTICO", "Multiplicacion erronea", this.linea, this.col);
                    }
                }
            }
            default -> {
                return new Errores("SEMANTICO", "Suma erronea", this.linea, this.col);

            }
        }
    }

    // Funcion para la division
    public Object division(Object op1, Object op2) {
        var tipo1 = this.operando1.tipo.getTipo();
        var tipo2 = this.operando2.tipo.getTipo();

        // Verificacion de division por cero
        if (tipo2 == TipoDato.NUMERO && (double) op2 == 0.0) {
            return new Errores("SEMANTICO", "Division por cero no permitido", this.linea, this.col);
        }

        switch (tipo1) {
            case NUMERO -> {
                switch (tipo2) {
                    case NUMERO -> {
                        this.tipo.setTipo(TipoDato.NUMERO);
                        return (double) op1 / (double) op2;
                    }
                    default -> {
                        return new Errores("SEMANTICO", "Division erronea", this.linea, this.col);
                    }
                }
            }
            default -> {
                return new Errores("SEMANTICO", "Division erronea", this.linea, this.col);

            }
        }
    }

    // Funcion para potencia
    public Object potencia(Object op1, Object op2) {
        var tipo1 = this.operando1.tipo.getTipo();
        var tipo2 = this.operando2.tipo.getTipo();

        switch (tipo1) {
            case NUMERO -> {
                switch (tipo2) {
                    case NUMERO -> {
                        this.tipo.setTipo(TipoDato.NUMERO);
                        return Math.pow((double) op1, (double) op2);
                    }
                    default -> {
                        return new Errores("SEMANTICO", "Potencia erronea", this.linea, this.col);
                    }
                }
            }
            default -> {
                return new Errores("SEMANTICO", "Potencia erronea", this.linea, this.col);
            }
        }
    }

    // Funcion para negar una expresion
    public Object negacion(Object op1) {
        var opU = this.operandoUnico.tipo.getTipo();
        switch (opU) {
            case NUMERO -> {
                this.tipo.setTipo(TipoDato.NUMERO);
                return (double) op1 * -1;
            }
            default -> {
                return new Errores("SEMANTICO", "Negacion erronea", this.linea, this.col);
            }
        }
    }

    @Override
    public String toString() {
        if (operandoUnico != null) {
            return "-" + operandoUnico.toString();
        }

        String operador = switch (this.operacion) {
            case SUMA ->
                "+";
            case RESTA ->
                "-";
            case MULTIPLICACION ->
                "*";
            case DIVISION ->
                "/";
            case POTENCIA ->
                "^";
            default ->
                "?";
        };
        
        String izq = operando1.toString();
        String der = operando2.toString();

        int prioridadActual = getPrioridad(this.operacion);
        int prioridadIzq = (operando1 instanceof Aritmeticas) ? getPrioridad(((Aritmeticas) operando1).operacion) : Integer.MAX_VALUE;
        int prioridadDer = (operando2 instanceof Aritmeticas) ? getPrioridad(((Aritmeticas) operando2).operacion) : Integer.MAX_VALUE;

        if (prioridadIzq < prioridadActual) {
            izq = "(" + izq + ")";
        }
        if (prioridadDer <= prioridadActual) {
            der = "(" + der + ")";
        }

        return izq + " " + operador + " " + der;
    }

    // metodo para prioridad de operadores
    private int getPrioridad(OperadoresAritmeticos op) {
        return switch (op) {
            case SUMA, RESTA ->
                1;
            case MULTIPLICACION, DIVISION ->
                2;
            case POTENCIA ->
                3;
            default ->
                0;
        };
    }
   
}
