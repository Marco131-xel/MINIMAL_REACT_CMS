package main.Servidor_React.ast;

/**
 *
 * @author marco
 */
public class Tipo {
    private TipoDato tipo;

    public Tipo(TipoDato tipo) {
        this.tipo = tipo;
    }

    public TipoDato getTipo() {
        return tipo;
    }

    public void setTipo(TipoDato tipo) {
        this.tipo = tipo;
    }
    
}
