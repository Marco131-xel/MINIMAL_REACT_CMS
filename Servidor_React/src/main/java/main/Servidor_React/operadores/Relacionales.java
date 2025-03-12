package main.Servidor_React.operadores;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class Relacionales extends Instruccion {
    
    private Instruccion cond1;
    private Instruccion cond2;
    private OperadoresRelacionales relacional;

    public Relacionales(Instruccion cond1, Instruccion cond2, OperadoresRelacionales relacional, int linea, int col) {
        super(new Tipo(TipoDato.BOOLEANO), linea, col);
        this.cond1 = cond1;
        this.cond2 = cond2;
        this.relacional = relacional;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        var condIzq = this.cond1.interpretar(arbol, tabla);
        if (condIzq instanceof Errores) {
            return condIzq;
        }

        var condDer = this.cond2.interpretar(arbol, tabla);
        if (condDer instanceof Errores) {
            return condDer;
        }

        return switch (relacional) {
            case MENORIGUAL ->
                this.menorigual(condIzq, condDer);
            case MAYORIGUAL ->
                this.mayorigual(condIzq, condDer);
            case MENORQUE ->
                this.menorque(condIzq, condDer);
            case MAYORQUE ->
                this.mayorque(condIzq, condDer);
            default ->
                new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
        };
    }

    // FUNCION PARA EL MENOR IGUAL
    public Object menorigual(Object comp1, Object comp2) {
        var comparando1 = this.cond1.tipo.getTipo();
        var comparando2 = this.cond2.tipo.getTipo();

        return switch (comparando1) {
            case NUMERO ->
                switch (comparando2) {
                    case NUMERO ->
                        (double) comp1 <= (double) comp2;
                    default ->
                        new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
                };
            case CADENA ->
                switch (comparando2) {
                    case CADENA ->
                        comp1.toString().equalsIgnoreCase(comp2.toString());
                    default ->
                        new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
                };
            default ->
                new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
        };
    }

    // FUNCION PARA EL MAYOR IGUAL
    public Object mayorigual(Object comp1, Object comp2) {
        var comparando1 = this.cond1.tipo.getTipo();
        var comparando2 = this.cond2.tipo.getTipo();

        return switch (comparando1) {
            case NUMERO ->
                switch (comparando2) {
                    case NUMERO ->
                        (double) comp1 >= (double) comp2;
                    default ->
                        new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
                };
            case CADENA ->
                switch (comparando2) {
                    case CADENA ->
                        comp1.toString().equalsIgnoreCase(comp2.toString());
                    default ->
                        new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
                };
            default ->
                new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
        };
    }

    // FUNCION PARA EL MENOR
    public Object menorque(Object comp1, Object comp2) {
        var comparando1 = this.cond1.tipo.getTipo();
        var comparando2 = this.cond2.tipo.getTipo();

        return switch (comparando1) {
            case NUMERO ->
                switch (comparando2) {
                    case NUMERO ->
                        (double) comp1 < (double) comp2;
                    default ->
                        new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
                };
            case CADENA ->
                switch (comparando2) {
                    case CADENA ->
                        comp1.toString().equalsIgnoreCase(comp2.toString());
                    default ->
                        new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
                };
            default ->
                new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
        };
    }

    // FUNCION PARA EL MAYOR
    public Object mayorque(Object comp1, Object comp2) {
        var comparando1 = this.cond1.tipo.getTipo();
        var comparando2 = this.cond2.tipo.getTipo();

        return switch (comparando1) {
            case NUMERO ->
                switch (comparando2) {
                    case NUMERO ->
                        (double) comp1 > (double) comp2;
                    default ->
                        new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
                };
            case CADENA ->
                switch (comparando2) {
                    case CADENA ->
                        comp1.toString().equalsIgnoreCase(comp2.toString());
                    default ->
                        new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
                };
            default ->
                new Errores("SEMANTICO", "Relacional Invalido", this.linea, this.col);
        };
    }
    
}
