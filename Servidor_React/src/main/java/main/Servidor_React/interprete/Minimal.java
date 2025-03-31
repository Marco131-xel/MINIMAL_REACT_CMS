package main.Servidor_React.interprete;

import main.Servidor_React.abstracto.*;
import main.Servidor_React.ast.*;
import main.Servidor_React.excepciones.*;
import main.Servidor_React.analizador.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;
import main.Servidor_React.reportes.*;

/**
 *
 * @author marco
 */
public class Minimal {

    public static String[] ejecutar(String codigo, String ruta) {
        try {
            Lexer l = new Lexer(new BufferedReader(new StringReader((codigo))));
            parser p = new parser(l);
            var resultado = p.parse();
            var ast = new Arbol((LinkedList<Instruccion>) resultado.value);
            var tabla = new TablaSimbolos();
            var ocurrencias = p.getOcurrencia();
            var modelos = p.getModel();
            var astOcur = new Ast(ocurrencias);
            var dom = new Dom(modelos);
            String nombre = p.identificador != null ? p.identificador.getId() : "AST";
            tabla.setNombre("Global");
            ast.setConsola("");
            LinkedList<Errores> lista = new LinkedList<>();
            lista.addAll(l.listaErrores);
            lista.addAll(p.listaErrores);
            ast.setErrores(lista);
            
            GeneradorHtml generador = new GeneradorHtml(nombre, ruta);
            ast.setGenerarHtml(generador);

            for (var a : ast.getInstrucciones()) {
                if (a == null) {
                    continue;
                }

                var res = a.interpretar(ast, tabla);
                if (res instanceof Errores) {
                    lista.add((Errores) res);
                }
            }
            
            generador.cerrarHTML();
            generador.guardarArchivo();
            GenerarAst.generarImagen(astOcur, ruta, nombre);
            GenerarDom.generarImagen(dom, ruta, nombre);
            GenerarErrores.generar(lista, ruta, nombre);
            StringBuilder erroresStr = new StringBuilder();
            for (var i : lista) {
                erroresStr.append(i.toString()).append("\n");
            }

            return new String[]{ast.getConsola(), erroresStr.toString()};
        } catch (Exception e) {
            return new String[]{"", "Error: " + e.getMessage()};
        }
    }
    
}
