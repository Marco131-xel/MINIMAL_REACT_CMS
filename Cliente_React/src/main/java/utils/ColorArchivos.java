package utils;

import java.awt.Color;
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
public class ColorArchivos {

    Color green = Color.green;
    Color yellow = Color.yellow;
    Color white = Color.white;

    public void colorearEditorTexto(JTextPane textPane) {
        StyledDocument doc = textPane.getStyledDocument();
        String contenido = null;

        try {
            // Obtiene el texto completo del JTextPane
            contenido = doc.getText(0, doc.getLength());
        } catch (BadLocationException e) {
            e.printStackTrace();
            return;
        }
        
        // default
        AttributeSet defaultAset = new SimpleAttributeSet();
        StyleConstants.setForeground((MutableAttributeSet) defaultAset, white);
        doc.setCharacterAttributes(0, contenido.length(), defaultAset, true);
        
        // para html
        Pattern pattern = Pattern.compile("(?<=\\|____)\\w+\\.html\\b");
        Matcher matcher = pattern.matcher(contenido);

        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.end();

            AttributeSet aset = new SimpleAttributeSet();
            StyleConstants.setForeground((MutableAttributeSet) aset, green);
            doc.setCharacterAttributes(startIndex, endIndex - startIndex, aset, false);
        }

        // para mtsx
        pattern = Pattern.compile("(?<=\\|____)\\w+\\.mtsx\\b");
        matcher = pattern.matcher(contenido);

        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.end();

            AttributeSet aset = new SimpleAttributeSet();
            StyleConstants.setForeground((MutableAttributeSet) aset, yellow);
            doc.setCharacterAttributes(startIndex, endIndex - startIndex, aset, false);
        }
    }
}
