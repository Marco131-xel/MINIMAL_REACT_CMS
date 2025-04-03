package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import main.Servidor_React.reportes.*;

/**
 *
 * @author marco
 */
public class Return extends Instruccion {

    private Instruccion expresion;

    public Return(Instruccion expresion, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.expresion = expresion;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        if (this.expresion != null) {
            var resultado = this.expresion.interpretar(arbol, tabla);

            if (resultado instanceof Errores) {
                return resultado;
            }
            GeneradorHtml generador = arbol.getGenerarHtml();
            if (generador != null) {
                generador.agregarScript("return " + this.expresion.toString() + ";");
            }
            return resultado;
        }
        GeneradorHtml generador = arbol.getGenerarHtml();
        if (generador != null) {
            generador.agregarScript("return;");
        }
        return this;
    }

    public boolean valor() {
        return this.expresion != null;
    }

    @Override
    public String toString() {
        return "return " + (expresion != null ? expresion.toString() : "") + ";";
    }

}
