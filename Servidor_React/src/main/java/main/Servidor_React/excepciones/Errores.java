package main.Servidor_React.excepciones;

/**
 *
 * @author marco
 */
public class Errores {
    private String tipo;
    private String desc;
    private int linea;
    private int columna;

    public Errores(String tipo, String desc, int linea, int columna) {
        this.tipo = tipo;
        this.desc = desc;
        this.linea = linea;
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Error Minimal: \n" + "Tipo: " + tipo + ", Descripcion: " + desc + ", Linea: " + linea + ", Columna: " + columna + '.';
    }
}
