package main.Servidor_React.function;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import java.util.LinkedList;

/**
 *
 * @author marco
 */
public class Function extends Instruccion {

    private String nombre;
    private LinkedList<Parametro> parametros;
    private LinkedList<Instruccion> cuerpo;

    public Function(Tipo tipo, String nombre, LinkedList<Parametro> parametros, LinkedList<Instruccion> cuerpo, int linea, int col) {
        super(tipo, linea, col);
        this.nombre = nombre;
        this.parametros = parametros;
        this.cuerpo = cuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Parametro> getParametros(){
        return parametros;
    }

    @Override
    public Object interpretar(Arbol arbol, TablaSimbolos tabla) {
        arbol.addFunciones(this);
        tabla.setVariable(new Simbolo(new Tipo(TipoDato.VOID), nombre, this));
        return null;
    }

    // ejecutar la funcion con los argumentos
    public Object ejecutar(Arbol arbol, TablaSimbolos tabla, LinkedList<Object> argumentos){
        if (argumentos.size() != parametros.size()) {
            arbol.getErrores().add(new Errores("SEMANTICO", "Numero incorrecto de argumentos en la funcion: "+nombre, linea, col));
            return null;
        }

        // crear nuevo ambito para la funcion
        TablaSimbolos local = new TablaSimbolos(tabla);

        // definir los parametros en el nuevo ambito
        for (int i = 0; i < parametros.size(); i++) {
            local.setVariable(new Simbolo(parametros.get(i).getTipo(), parametros.get(i).getId(), argumentos.get(i)));
        }

        // Ejecutar las instruccinoes dentro de la funcion
        for (Instruccion instruccion : cuerpo) {
            Object resultado = instruccion.interpretar(arbol, local);
            if (resultado != null) {
                return resultado;
            }
        }
        return null;
    }
    
}
