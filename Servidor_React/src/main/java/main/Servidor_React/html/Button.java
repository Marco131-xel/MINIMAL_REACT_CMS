package main.Servidor_React.html;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

/**
 *
 * @author marco
 */
public class Button extends Instruccion {
    
    private String bt1;
    private Instruccion boton;
    private String bt2;

    public Button(String bt1, Instruccion boton, String bt2, int linea, int col) {
        super(new Tipo(TipoDato.VOID), linea, col);
        this.bt1 = bt1;
        this.boton = boton;
        this.bt2 = bt2;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        var resultado = this.boton.interpretar(arbol, tabla);
        if (resultado instanceof Errores) {
            return resultado;
        }
        
        String boton = bt1 + resultado.toString() + bt2;
        arbol.Print(boton);
        return null;
    }
 
}
