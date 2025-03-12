package main.Servidor_React.prueba;

import javax.swing.JOptionPane;
import main.Servidor_React.interprete.*;

/**
 *
 * @author marco
 */
public class Interfaz extends javax.swing.JFrame {

    NumeroLinea numerolinea;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        //Panelito.setEditable(false);
        //Panelito.setFocusable(false);
        //TextErrores.setEditable(false);
        //TextErrores.setFocusable(false);
        numerolinea = new NumeroLinea(TextPane);
        ContadorLineas.setRowHeaderView(numerolinea);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BT_Limpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Panelito = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextErrores = new javax.swing.JTextPane();
        ContadorLineas = new javax.swing.JScrollPane();
        TextPane = new javax.swing.JTextArea();
        BT_interpretar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compilador TypeScript");

        BT_Limpiar.setText("Limpiar");
        BT_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LimpiarActionPerformed(evt);
            }
        });

        Panelito.setBackground(new java.awt.Color(51, 51, 51));
        Panelito.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        Panelito.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Panelito);

        TextErrores.setBackground(new java.awt.Color(51, 51, 51));
        TextErrores.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        TextErrores.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane3.setViewportView(TextErrores);

        ContadorLineas.setBackground(new java.awt.Color(51, 51, 51));
        ContadorLineas.setForeground(new java.awt.Color(255, 255, 255));

        TextPane.setBackground(new java.awt.Color(51, 51, 51));
        TextPane.setColumns(20);
        TextPane.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        TextPane.setForeground(new java.awt.Color(255, 255, 255));
        TextPane.setRows(5);
        ContadorLineas.setViewportView(TextPane);

        BT_interpretar.setText("Interpretar");
        BT_interpretar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_interpretarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ContadorLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BT_interpretar)
                            .addComponent(BT_Limpiar))
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContadorLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(BT_interpretar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BT_Limpiar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LimpiarActionPerformed
        // TODO add your handling code here:
        TextPane.setText("");
        Panelito.setText("");
        TextErrores.setText("");
    }//GEN-LAST:event_BT_LimpiarActionPerformed

    private void BT_interpretarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_interpretarActionPerformed
        // TODO add your handling code here:
        try {
            String codigo = TextPane.getText();
            if (codigo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay codigo para analizar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String[] resultado = Interprete.ejecutar(codigo);
            Panelito.setText(resultado[0]); // Consola
            TextErrores.setText(resultado[1]); // Errores

        } catch (Exception e) {
            e.printStackTrace();
            TextErrores.setText("Error en el analisis: " + e.getMessage());
        }
    }//GEN-LAST:event_BT_interpretarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Limpiar;
    private javax.swing.JButton BT_interpretar;
    private javax.swing.JScrollPane ContadorLineas;
    private javax.swing.JTextPane Panelito;
    private javax.swing.JTextPane TextErrores;
    private javax.swing.JTextArea TextPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
