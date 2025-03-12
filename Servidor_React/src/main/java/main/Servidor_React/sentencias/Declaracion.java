package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class Declaracion extends Instruccion {

    public String identificador;
    public Instruccion valor;

    public Declaracion(String identificador, Instruccion valor, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.identificador = identificador;
        this.valor = valor;
    }

    public Declaracion(String identificador, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.identificador = identificador;
        this.valor = null;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        // interpretado la expresion
        var valorInterpretado = (this.valor == null) ? this.valoresDefault() : this.valor.interpretar(arbol, tabla);

        // verificamos si tiene error
        if (valorInterpretado instanceof Errores) {
            return valorInterpretado;
        }

        //validamos los tipos
        if (this.valor != null) {
            if (this.valor.tipo.getTipo() != this.tipo.getTipo()) {
                return new Errores("SEMANTICO", "Tipos erroneos", this.linea, this.col);
            }
        }

        Simbolo s = new Simbolo(this.tipo, this.identificador, valorInterpretado);

        boolean creacion = tabla.setVariable(s);
        if (!creacion) {
            return new Errores("SEMANTICO", "Variable ya existente", this.linea, this.col);
        }

        return null;
    }

    public Object valoresDefault() {
        return switch (this.tipo.getTipo()) {
            case BOOLEANO ->
                true;
            case CADENA ->
                "";
            case CARACTER ->
                '\u0000';
            case ENTERO ->
                0;
            case DECIMAL ->
                0.0;
            default ->
                null;
        };
    }

}
