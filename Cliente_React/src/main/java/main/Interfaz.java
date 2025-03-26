package main;

import java.io.File;
import java.io.IOException;
import socket.ClienteWs;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import utils.GestionArchivos;

/**
 *
 * @author marco
 */
public class Interfaz extends javax.swing.JFrame {

    NumeroLinea numerolinea;
    private ClienteWs clienteWs;
    private static String RECOVERY_PATH = ("/home/marco/Documentos/Compi_2025/MINIMAL_REACT_CMS/data/recovery.toml");
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    GestionArchivos gestion = new GestionArchivos();

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        conectarWebSocket();
        numerolinea = new NumeroLinea(panelito);
        scroll_num.setRowHeaderView(numerolinea);
        solicitudes.setEditable(false);
        solicitudes.setFocusable(false);
        text_console.setEditable(false);
        text_console.setFocusable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        scroll_num = new javax.swing.JScrollPane();
        panelito = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        solicitudes = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BT_abrir = new javax.swing.JButton();
        BT_Guardar = new javax.swing.JButton();
        BT_procesar = new javax.swing.JButton();
        BT_agregar = new javax.swing.JButton();
        BT_modificar = new javax.swing.JButton();
        BT_eliminar = new javax.swing.JButton();
        BT_limpiar = new javax.swing.JButton();
        BT_toml = new javax.swing.JButton();
        BT_crear = new javax.swing.JButton();
        BT_reportes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Errores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        text_console = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(33, 47, 61));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll_num.setBackground(new java.awt.Color(255, 0, 0));

        panelito.setBackground(new java.awt.Color(46, 64, 83));
        panelito.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        panelito.setForeground(new java.awt.Color(255, 255, 255));
        scroll_num.setViewportView(panelito);

        bg.add(scroll_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 690, 530));

        solicitudes.setBackground(new java.awt.Color(46, 64, 83));
        solicitudes.setColumns(20);
        solicitudes.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N
        solicitudes.setForeground(new java.awt.Color(255, 255, 255));
        solicitudes.setRows(5);
        jScrollPane1.setViewportView(solicitudes);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, 510, 140));

        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tabla Errores");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, -1, -1));

        jPanel1.setBackground(new java.awt.Color(46, 64, 83));

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editor Minimal React CMS");

        BT_abrir.setBackground(new java.awt.Color(33, 47, 61));
        BT_abrir.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_abrir.setForeground(new java.awt.Color(255, 255, 255));
        BT_abrir.setText("Abrir");
        BT_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_abrirActionPerformed(evt);
            }
        });

        BT_Guardar.setBackground(new java.awt.Color(33, 47, 61));
        BT_Guardar.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Guardar.setText("Guardar");

        BT_procesar.setBackground(new java.awt.Color(33, 47, 61));
        BT_procesar.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_procesar.setForeground(new java.awt.Color(255, 255, 255));
        BT_procesar.setText("Procesar");
        BT_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_procesarActionPerformed(evt);
            }
        });

        BT_agregar.setBackground(new java.awt.Color(33, 47, 61));
        BT_agregar.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_agregar.setForeground(new java.awt.Color(255, 255, 255));
        BT_agregar.setText("Agregar");
        BT_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_agregarActionPerformed(evt);
            }
        });

        BT_modificar.setBackground(new java.awt.Color(33, 47, 61));
        BT_modificar.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_modificar.setForeground(new java.awt.Color(255, 255, 255));
        BT_modificar.setText("Modificar");
        BT_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_modificarActionPerformed(evt);
            }
        });

        BT_eliminar.setBackground(new java.awt.Color(33, 47, 61));
        BT_eliminar.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        BT_eliminar.setText("Eliminar");
        BT_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_eliminarActionPerformed(evt);
            }
        });

        BT_limpiar.setBackground(new java.awt.Color(33, 47, 61));
        BT_limpiar.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        BT_limpiar.setText("Limpiar");
        BT_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_limpiarActionPerformed(evt);
            }
        });

        BT_toml.setBackground(new java.awt.Color(33, 47, 61));
        BT_toml.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_toml.setForeground(new java.awt.Color(255, 255, 255));
        BT_toml.setText("Toml");
        BT_toml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_tomlActionPerformed(evt);
            }
        });

        BT_crear.setBackground(new java.awt.Color(33, 47, 61));
        BT_crear.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_crear.setForeground(new java.awt.Color(255, 255, 255));
        BT_crear.setText("Crear");
        BT_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_crearActionPerformed(evt);
            }
        });

        BT_reportes.setBackground(new java.awt.Color(33, 47, 61));
        BT_reportes.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        BT_reportes.setForeground(new java.awt.Color(255, 255, 255));
        BT_reportes.setText("Reportes");
        BT_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BT_abrir)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(BT_procesar)
                        .addGap(18, 18, 18)
                        .addComponent(BT_toml)
                        .addGap(18, 18, 18)
                        .addComponent(BT_limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(BT_reportes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(BT_crear)))
                .addGap(18, 18, 18)
                .addComponent(BT_agregar)
                .addGap(18, 18, 18)
                .addComponent(BT_modificar)
                .addGap(18, 18, 18)
                .addComponent(BT_eliminar)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_abrir)
                    .addComponent(BT_Guardar)
                    .addComponent(BT_procesar)
                    .addComponent(BT_agregar)
                    .addComponent(BT_modificar)
                    .addComponent(BT_eliminar)
                    .addComponent(BT_limpiar)
                    .addComponent(BT_toml)
                    .addComponent(BT_crear)
                    .addComponent(BT_reportes))
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 160));

        Table_Errores.setBackground(new java.awt.Color(33, 47, 61));
        Table_Errores.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N
        Table_Errores.setForeground(new java.awt.Color(255, 255, 255));
        Table_Errores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Descripcion", "Linea", "Columna"
            }
        ));
        jScrollPane2.setViewportView(Table_Errores);
        if (Table_Errores.getColumnModel().getColumnCount() > 0) {
            Table_Errores.getColumnModel().getColumn(0).setMinWidth(125);
            Table_Errores.getColumnModel().getColumn(0).setPreferredWidth(125);
            Table_Errores.getColumnModel().getColumn(0).setMaxWidth(125);
            Table_Errores.getColumnModel().getColumn(2).setMinWidth(80);
            Table_Errores.getColumnModel().getColumn(2).setPreferredWidth(80);
            Table_Errores.getColumnModel().getColumn(2).setMaxWidth(80);
            Table_Errores.getColumnModel().getColumn(3).setMinWidth(80);
            Table_Errores.getColumnModel().getColumn(3).setPreferredWidth(80);
            Table_Errores.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 680, 160));

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consola");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, -1, 30));

        text_console.setBackground(new java.awt.Color(46, 64, 83));
        text_console.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        text_console.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(text_console);

        bg.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, 440, 130));

        jLabel4.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Solicitudes");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 690, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarWebSocket() {
        try {
            clienteWs = new ClienteWs(new URI("ws://localhost:8080/ws"), this);
            clienteWs.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarTexto(String texto) {
        SwingUtilities.invokeLater(() -> {
            try {
                Document doc = solicitudes.getDocument();
                doc.insertString(doc.getLength(), texto, null);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        });
    }

    public void recibirMensaje(String mensaje) {
        if (mensaje.startsWith("RUTA ")) {
            mensaje = mensaje.trim();
            String rutaArchivo = mensaje.substring(5);
            abrirArchivoEditor(rutaArchivo);
        } else if (mensaje.startsWith("CONSOLA ")) {
            String salidaConsola = mensaje.substring(8);
            text_console.setText("run:\n" + salidaConsola);
            //agregarTexto("Salida:\n" + salidaConsola + "\n");
        } else if (mensaje.startsWith("ERRORES ")) {
            String errores = mensaje.substring(8);
            if (!errores.trim().isEmpty()) {
                erroresTabla(errores);
            } else {
                agregarTexto("No se encontraron errores.\n");
                DefaultTableModel model = (DefaultTableModel) Table_Errores.getModel();
                model.setRowCount(0);
            }
        }
    }

    private void abrirArchivoEditor(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        if (archivo.exists() && archivo.canRead()) {
            try {
                String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
                panelito.setText(contenido);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede leer el archivo");
        }
    }

    private void erroresTabla(String errores) {
        DefaultTableModel modelo = (DefaultTableModel) Table_Errores.getModel();
        modelo.setRowCount(0);

        String[] lineas = errores.split("\n");
        for (String linea : lineas) {
            if (linea.startsWith("Error Minimal:")) {
                continue;
            }

            String tipo = "", desc = "";
            int lineaNum = 0, columnaNum = 0;

            String[] partes = linea.split(", ");
            for (String parte : partes) {
                if (parte.startsWith("Tipo: ")) {
                    tipo = parte.substring(6);
                } else if (parte.startsWith("Descripcion: ")) {
                    desc = parte.substring(13);
                } else if (parte.startsWith("Linea: ")) {
                    lineaNum = Integer.parseInt(parte.substring(7).replaceAll("\\D", ""));
                } else if (parte.startsWith("Columna: ")) {
                    columnaNum = Integer.parseInt(parte.substring(9).replaceAll("\\D", ""));
                }
            }
            modelo.addRow(new Object[]{tipo, desc, lineaNum, columnaNum});
        }
    }

    private void BT_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_procesarActionPerformed
        // TODO add your handling code here:
        if (clienteWs != null) {
            String codigoMtsx = panelito.getText();
            if (!codigoMtsx.trim().isEmpty()) {
                String mensaje = "EJECUTAR_MTSX " + codigoMtsx;
                clienteWs.enviarMensajes(mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "El editor esta vacio.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay conexion WebSocket", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BT_procesarActionPerformed

    private void BT_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_abrirActionPerformed
        // TODO add your handling code here:
        String[] opciones = {"Sitio", "Pagina"};
        int seleccion = JOptionPane.showOptionDialog(this,
                "Seleccione que desea Abrir:",
                "Abrir Sitio o Pagina",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        // si eligio sitio
        if (seleccion == 0) {
            // AUN NOSE DEFINE ESTO 
            System.out.println("PROXIMAMENTE");
            // si elegio pagina
        } else if (seleccion == 1) {
            String nombrePagina = JOptionPane.showInputDialog(this,
                    "Ingrese el nombre de la pagina:",
                    "Abrir Pagina",
                    JOptionPane.PLAIN_MESSAGE);

            if (nombrePagina != null && !nombrePagina.trim().isEmpty()) {
                String mensaje = "GET PAGINA abrir pagina " + nombrePagina.trim();
                if (clienteWs != null) {
                    clienteWs.enviarMensajes(mensaje);
                } else {
                    System.out.println("No hay cliente WEBSOCKET");
                }
            }
        }
    }//GEN-LAST:event_BT_abrirActionPerformed

    private void BT_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_crearActionPerformed
        // TODO add your handling code here:
        String[] opciones = {"Sitio", "Pagina"};
        int seleccion = JOptionPane.showOptionDialog(this,
                "Seleccione que desea crear:",
                "Crear Sitio o Pagina",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        // Si eligio sitio
        if (seleccion == 0) {
            String nombreSitio = JOptionPane.showInputDialog(this,
                    "Ingrese el nombre del sitio:",
                    "Crear Sitio",
                    JOptionPane.PLAIN_MESSAGE);

            if (nombreSitio != null && !nombreSitio.trim().isEmpty()) {
                String mensaje = "POST SITIO crear sitio " + nombreSitio.trim();
                if (clienteWs != null) {
                    clienteWs.enviarMensajes(mensaje);
                } else {
                    System.out.println("No hay cliente WEBSOCKET");
                }
            }
            // Si eligio pagina
        } else if (seleccion == 1) {
            String nombrePagina = JOptionPane.showInputDialog(this,
                    "Ingrese el nombre de la pagina:",
                    "Crear Pagina",
                    JOptionPane.PLAIN_MESSAGE);

            if (nombrePagina != null && !nombrePagina.trim().isEmpty()) {
                // Preguntar si quiere agregar contenido HTML
                int respuesta = JOptionPane.showConfirmDialog(this,
                        "¿Desea agregar contenido HTML o MTSX?",
                        "Agregar contenido",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                String mensaje;
                if (respuesta == JOptionPane.YES_OPTION) {
                    // jtextarea para agregar contenido html
                    JTextArea textArea = new JTextArea(10, 30);
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    int resultado = JOptionPane.showConfirmDialog(this, scrollPane,
                            "Ingrese el contenido HTML", JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.PLAIN_MESSAGE);

                    if (resultado == JOptionPane.OK_OPTION) {
                        String contenidoHtml = textArea.getText().trim();
                        if (!contenidoHtml.isEmpty()) {
                            mensaje = "POST PAGINA\ncrear pagina " + nombrePagina.trim() + "\n...\n <main>\n" + contenidoHtml + "\n</main>\n...";
                        } else {
                            mensaje = "POST PAGINA crear pagina " + nombrePagina.trim();
                        }
                    } else {
                        mensaje = "POST PAGINA crear pagina " + nombrePagina.trim();
                    }
                } else {
                    mensaje = "POST PAGINA crear pagina " + nombrePagina.trim();
                }

                if (clienteWs != null) {
                    clienteWs.enviarMensajes(mensaje);
                } else {
                    System.out.println("No hay cliente WEBSOCKET");
                }
            }
        }
    }//GEN-LAST:event_BT_crearActionPerformed

    private void BT_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_limpiarActionPerformed
        // TODO add your handling code here:
        panelito.setText("");
        text_console.setText("");
        DefaultTableModel model = (DefaultTableModel) Table_Errores.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_BT_limpiarActionPerformed

    private void BT_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_agregarActionPerformed

    private void BT_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_eliminarActionPerformed
        // TODO add your handling code here:
        String[] opciones = {"Sitio", "Pagina"};
        int seleccion = JOptionPane.showOptionDialog(this,
                "Seleccione que desea eliminar:",
                "Eliminar Sitio o Pagina",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        // si eligio sitio
        if (seleccion == 0) {
            String nombreSitio = JOptionPane.showInputDialog(this,
                    "Ingrese el nombre del sitio:",
                    "Eliminar Sitio",
                    JOptionPane.PLAIN_MESSAGE);

            if (nombreSitio != null && !nombreSitio.trim().isEmpty()) {
                String mensaje = "DELETE SITIO eliminar sitio " + nombreSitio.trim();
                if (clienteWs != null) {
                    clienteWs.enviarMensajes(mensaje);
                } else {
                    System.out.println("No hay cliente WEBSOCKET");
                }
            }
            // si elegio pagina
        } else if (seleccion == 1) {
            String nombrePagina = JOptionPane.showInputDialog(this,
                    "Ingrese el nombre de la pagina:",
                    "Eliminar Pagina",
                    JOptionPane.PLAIN_MESSAGE);

            if (nombrePagina != null && !nombrePagina.trim().isEmpty()) {
                String mensaje = "DELETE PAGINA eliminar pagina " + nombrePagina.trim();
                if (clienteWs != null) {
                    clienteWs.enviarMensajes(mensaje);
                } else {
                    System.out.println("No hay cliente WEBSOCKET");
                }
            }
        }
    }//GEN-LAST:event_BT_eliminarActionPerformed

    private void BT_tomlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_tomlActionPerformed
        // TODO add your handling code here:
        String contenido = gestion.AbrirATexto(new File(RECOVERY_PATH));
        JFrame ventanaEditor = new JFrame("Editor TOML");
        ventanaEditor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaEditor.setSize(1100, 650);
        editorToml editor = new editorToml(contenido);
        ventanaEditor.add(editor);
        ventanaEditor.setVisible(true);
    }//GEN-LAST:event_BT_tomlActionPerformed

    private void BT_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_modificarActionPerformed

    private void BT_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_reportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_reportesActionPerformed

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
    private javax.swing.JButton BT_Guardar;
    private javax.swing.JButton BT_abrir;
    private javax.swing.JButton BT_agregar;
    private javax.swing.JButton BT_crear;
    private javax.swing.JButton BT_eliminar;
    private javax.swing.JButton BT_limpiar;
    private javax.swing.JButton BT_modificar;
    private javax.swing.JButton BT_procesar;
    private javax.swing.JButton BT_reportes;
    private javax.swing.JButton BT_toml;
    private javax.swing.JTable Table_Errores;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane panelito;
    private javax.swing.JScrollPane scroll_num;
    private javax.swing.JTextArea solicitudes;
    private javax.swing.JTextPane text_console;
    // End of variables declaration//GEN-END:variables
}
