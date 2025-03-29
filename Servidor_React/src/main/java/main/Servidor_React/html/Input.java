package main.Servidor_React.html;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import main.Servidor_React.reportes.*;

/**
 *
 * @author marco
 */
public class Input extends Instruccion {

    private Instruccion value;

    public Input(Instruccion value, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.value = value;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        var resultado = this.value.interpretar(arbol, tabla);

        if (resultado instanceof Errores) {
            return resultado;
        }

        String valorVariable = resultado.toString();
        String inputHtml = "<input value=\"" + valorVariable + "\"/>";

        GeneradorHtml generador = arbol.getGenerarHtml();
        if (generador != null) {
            generador.agregarEtiqueta(inputHtml);
        }
        return null;
    }

}
