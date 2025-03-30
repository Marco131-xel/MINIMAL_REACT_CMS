package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import main.Servidor_React.reportes.*;

/**
 *
 * @author marco
 */
public class Console extends Instruccion {

    private Instruccion expresion;

    public Console(Instruccion expresion, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.expresion = expresion;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        var resultado = this.expresion.interpretar(arbol, tabla);
        if (resultado instanceof Errores) {
            return resultado;
        }
        GeneradorHtml generador = arbol.getGenerarHtml();
        if (generador != null) {
            String codigoJs = "console.log(" + this.expresion.toString() + ");";
            generador.agregarScript(codigoJs);
        }
        arbol.Print(resultado.toString());
        return null;
    }

}
