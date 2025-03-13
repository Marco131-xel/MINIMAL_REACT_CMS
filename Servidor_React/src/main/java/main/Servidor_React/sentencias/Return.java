package main.Servidor_React.sentencias;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;

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
        if(this.expresion != null) {
            var resultado = this.expresion.interpretar(arbol, tabla);
            
            if (resultado instanceof Errores) {
                return resultado;
            }
            return resultado;
        }
        return this;
    }
    
    public boolean valor(){
        return this.expresion != null;
    }
    
}
