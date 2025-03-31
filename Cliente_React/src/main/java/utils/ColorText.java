package utils;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

/**
 *
 * @author marco
 */
public class ColorText {

    java.awt.Color white = java.awt.Color.white;
    java.awt.Color cyan = java.awt.Color.cyan;
    java.awt.Color magenta = java.awt.Color.magenta;
    java.awt.Color red = java.awt.Color.red;
    java.awt.Color gray = java.awt.Color.gray;
    java.awt.Color green = java.awt.Color.green;
    java.awt.Color yellow = java.awt.Color.yellow;

    private List<String> palabrasclave = Arrays.asList("const", "return", "break", "number",
            "string", "char", "boolean", "void", "var", "console.log", "function", "if",
            "else", "for", "true", "false", "value", "onClick");

    private List<String> logicos = Arrays.asList("&&", "||", "!");
    private List<String> punto = Arrays.asList(".", "\"", "\'");
    private List<String> barra = Arrays.asList("_");
    private List<String> otros = Arrays.asList("(", ")", "{", "}", "[", "]", ",", ":", ";");
    private List<String> aritmetico = Arrays.asList("+", "-", "*", "/", "^", "=", "==",
            "!=", "<", ">", "<=", ">=");
    private List<String> etiquetasHtml = Arrays.asList("<h1>", "</h1>", "<p>", "</p>", "<input", 
            "/>", "<button", "</button>", "<main>", "</main>"
            ,"<h2>", "</h2>", "<h3>", "</h3>", "<h4>", "</h4>", "<h5>", "</h5>", "<h6>", "</h6>");

    public void colorearEditorTexto(JTextPane textPane) {
        StyledDocument doc = textPane.getStyledDocument();
        String contenido = null;
        //cambiarTamanioDeFuente(textPane, 15);

        try {
            // Obtiene el texto completo del JTextPane
            contenido = doc.getText(0, doc.getLength());
        } catch (BadLocationException e) {
            e.printStackTrace();
            return;
        }

        for (int i = 0; i < contenido.length(); i++) {
            char c = contenido.charAt(i);
            Color color;

            if (Character.isLetter(c)) {
                color = white; // Letras en negro
            } else if (Character.isDigit(c)) {
                color = red;   // Numeros en rojo
            } else {
                color = yellow;  // los que no tienen sentido
            }

            StyleContext sc = StyleContext.getDefaultStyleContext();
            AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);

            doc.setCharacterAttributes(i, 1, aset, true);
        }

        for (String palabra : palabrasclave) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(palabra) + "\\b");
            Matcher matcher = pattern.matcher(contenido);

            while (matcher.find()) {
                int inicio = matcher.start();
                int fin = matcher.end();

                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, magenta); // Palabras clave en morado
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
            }
        }

        for (String palabra : barra) {
            int inicio = contenido.indexOf(palabra);
            while (inicio >= 0) {
                int fin = inicio + palabra.length();
                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, white); // barra blanca
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
                inicio = contenido.indexOf(palabra, fin);
            }
        }

        for (String palabra : aritmetico) {
            int inicio = contenido.indexOf(palabra);
            while (inicio >= 0) {
                int fin = inicio + palabra.length();
                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, cyan); // aritmetico cyan
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
                inicio = contenido.indexOf(palabra, fin);
            }
        }

        for (String palabra : logicos) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(palabra) + "\\b");
            Matcher matcher = pattern.matcher(contenido);

            while (matcher.find()) {
                int inicio = matcher.start();
                int fin = matcher.end();

                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, cyan); // Logicos cyan 
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
            }
        }

        for (String palabra : punto) {
            int inicio = contenido.indexOf(palabra);
            while (inicio >= 0) {
                int fin = inicio + palabra.length();
                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, red); // punto red
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
                inicio = contenido.indexOf(palabra, fin);
            }
        }

        for (String palabra : otros) {
            int inicio = contenido.indexOf(palabra);
            while (inicio >= 0) {
                int fin = inicio + palabra.length();
                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, cyan); // otros celeste
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
                inicio = contenido.indexOf(palabra, fin);
            }
        }

        for (String etiqueta : etiquetasHtml) {
            Pattern pattern = Pattern.compile(Pattern.quote(etiqueta));
            Matcher matcher = pattern.matcher(contenido);

            while (matcher.find()) {
                int inicio = matcher.start();
                int fin = matcher.end();

                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, red); // Etiquetas HTML en rojo
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
            }
        }

        // Comillas Dobles
        Pattern pattern = Pattern.compile("\"[^\"]*\"");
        Matcher matcher = pattern.matcher(contenido);

        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.end();

            AttributeSet aset = new SimpleAttributeSet();
            StyleConstants.setForeground((MutableAttributeSet) aset, green); // Comillas d en verde
            doc.setCharacterAttributes(startIndex, endIndex - startIndex, aset, false);
        }

        // Comillas Simples
        pattern = Pattern.compile("'[^']*'");
        matcher = pattern.matcher(contenido);

        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.end();

            AttributeSet aset = new SimpleAttributeSet();
            StyleConstants.setForeground((MutableAttributeSet) aset, green); // Comillas s en verde
            doc.setCharacterAttributes(startIndex, endIndex - startIndex, aset, false);
        }
    }

}
