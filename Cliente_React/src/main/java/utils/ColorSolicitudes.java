package utils;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author marco
 */
public class ColorSolicitudes {
    Color cyan = Color.cyan;
    Color red = Color.red;
    Color green = Color.green;
    Color orange = Color.orange;
    
    private List<String> usuarios = Arrays.asList("Cliente", "Servidor");
    private List<String> success = Arrays.asList("SUCCESS", "SERVIDOR", "ACTIVO");
    private List<String> not_found = Arrays.asList("NOT_FOUND", "CONEXION", "CERRADA", "Error");
    private List<String> internal = Arrays.asList("INTERNAL_SERVER_ERROR");
    
    
    public void colorearSolicitudes(JTextPane textPane) {
        StyledDocument doc = textPane.getStyledDocument();
        String contenido = null;

        try {
            // Obtiene el texto completo del JTextPane
            contenido = doc.getText(0, doc.getLength());
        } catch (BadLocationException e) {
            e.printStackTrace();
            return;
        }
        // colorear servidor y cliente
        for (String palabra : usuarios) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(palabra) + "\\b");
            Matcher matcher = pattern.matcher(contenido);

            while (matcher.find()) {
                int inicio = matcher.start();
                int fin = matcher.end();

                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, cyan);
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
            }
        }
        // respuesta verde success
        for (String palabra : success) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(palabra) + "\\b");
            Matcher matcher = pattern.matcher(contenido);

            while (matcher.find()) {
                int inicio = matcher.start();
                int fin = matcher.end();

                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, green);
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
            }
        }
        // respuesta rojo con not_found
        for (String palabra : not_found) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(palabra) + "\\b");
            Matcher matcher = pattern.matcher(contenido);

            while (matcher.find()) {
                int inicio = matcher.start();
                int fin = matcher.end();

                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, red);
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
            }
        }
        // respuesta naranja de internal
        for (String palabra : internal) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(palabra) + "\\b");
            Matcher matcher = pattern.matcher(contenido);

            while (matcher.find()) {
                int inicio = matcher.start();
                int fin = matcher.end();

                AttributeSet aset = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) aset, orange);
                doc.setCharacterAttributes(inicio, fin - inicio, aset, false);
            }
        }
    }
}
