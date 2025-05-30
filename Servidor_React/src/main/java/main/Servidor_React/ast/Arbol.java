package main.Servidor_React.ast;

import java.util.LinkedList;
import main.Servidor_React.excepciones.*;
import main.Servidor_React.abstracto.*;
import main.Servidor_React.reportes.*;

/**
 *
 * @author marco
 */
public class Arbol {

    private LinkedList<Instruccion> instrucciones;
    private String consola;
    private TablaSimbolos tablaGlobal;
    public LinkedList<Errores> errores;
    private LinkedList<Instruccion> funciones;
    public int contador;
    private static LinkedList<Errores> historialErrores = new LinkedList<>();
    private GeneradorHtml generarHtml;

    public Arbol(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
        this.consola = "";
        this.tablaGlobal = new TablaSimbolos();
        this.errores = new LinkedList<>();
        this.funciones = new LinkedList<>();
        this.contador = 0;
        this.generarHtml = null;
    }

    public LinkedList<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public TablaSimbolos getTablaGlobal() {
        return tablaGlobal;
    }

    public void setTablaGlobal(TablaSimbolos tablaGlobal) {
        this.tablaGlobal = tablaGlobal;
    }

    public LinkedList<Errores> getErrores() {
        return errores;
    }

    public void setErrores(LinkedList<Errores> errores) {
        this.errores = errores;
        agregarErrores(errores);
    }

    public void Print(String valor) {
        this.consola += valor + "\n";
    }

    public LinkedList<Instruccion> getFunciones() {
        return funciones;
    }

    public void setFunciones(LinkedList<Instruccion> funciones) {
        this.funciones = funciones;
    }

    public void addFunciones(Instruccion funcion) {
        this.funciones.add(funcion);
    }

    public int getContador() {
        this.contador++;
        return this.contador;

    }

    public static LinkedList<Errores> getHistorialErrores() {
        return historialErrores;
    }

    public static void agregarErrores(LinkedList<Errores> nuevosErrores) {
        historialErrores.addAll(nuevosErrores);
    }

    public static void limpiarHistorialErrores() {
        historialErrores.clear();
    }

    public GeneradorHtml getGenerarHtml() {
        return generarHtml;
    }

    public void setGenerarHtml(GeneradorHtml generarHtml) {
        this.generarHtml = generarHtml;
    }

}
