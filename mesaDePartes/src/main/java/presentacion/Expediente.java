/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dominio.DocumentoLN;
import dominio.GeExpedienteLN;
import dominio.OficinaLN;
import entidad.DocumentosE;
import entidad.GeExpedientesE;
import entidad.OficinaE;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruce
 */
public class Expediente extends javax.swing.JFrame {

    DocumentoLN ln = new DocumentoLN();

    OficinaE oficina = new OficinaE();

    DocumentosE documento = new DocumentosE();

    DefaultTableModel model = new DefaultTableModel();

    GeExpedientesE expediente = new GeExpedientesE();

    public Expediente() {
        initComponents();

        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Correo");
        model.addColumn("Número de Expediente");
        model.addColumn("Documento"); // Para almacenar el objeto DocumentosE

        tblPanel.setModel(model);
        tblPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPanelMouseClicked(evt);
            }
        });
        cargarDocumentos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscaExpediente = new javax.swing.JButton();
        txtBuscaExpediente = new javax.swing.JTextField();
        cboAreas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnArchivo = new javax.swing.JButton();
        txtObservacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblNombreArchivo = new javax.swing.JLabel();
        lblArchivoNombre = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPanel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscaExpediente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnBuscaExpediente.setText("Buscar Expediente");
        btnBuscaExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaExpedienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscaExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));

        txtBuscaExpediente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel2.add(txtBuscaExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, -1));

        cboAreas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboAreas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Secretaria Académica", "Unidad Académica", "Tesoreria", "Otros", " " }));
        jPanel2.add(cboAreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 220, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Áreas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        btnEnviar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 70, -1));

        btnArchivo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnArchivo.setText("Archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });
        jPanel2.add(btnArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, -1));

        txtObservacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel2.add(txtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 220, 70));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Observación");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        lblNombreArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(lblNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 370, 310, 20));

        lblArchivoNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblArchivoNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(lblArchivoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 220, 20));

        jButton1.setText("jButton1");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 450, 250));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("EXPEDIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        tblPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPanelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPanel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 450, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDocumentos() {
        // Limpiar la tabla antes de agregar nuevos datos
    model.setRowCount(0); // Limpiar la tabla

    // Obtener todos los documentos
    ArrayList<DocumentosE> listaDocumentos = ln.todoDocumentos();

    // Llenar la tabla con los documentos obtenidos
    for (DocumentosE documento : listaDocumentos) {
        Object[] datos = new Object[5]; // Asegúrate de tener suficientes columnas
        datos[0] = documento.getDni();
        datos[1] = documento.getNombre();
        datos[2] = documento.getCorreo();
        datos[3] = documento.getNumero_expediente();
        datos[4] = documento; // Aquí guardas el objeto completo

        model.addRow(datos); // Añadir fila al modelo
    }
    }


    private void btnBuscaExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaExpedienteActionPerformed
        String expediente = txtBuscaExpediente.getText();

        // Busca el documento en la base de datos por el número de expediente
        DocumentosE documento = ln.buscarPorExpediente(expediente); // Asegúrate de que ln es una instancia válida de DocumentoLN

        // Limpiar la tabla antes de agregar nuevos datos
        model.setRowCount(0); // Limpiar la tabla

        if (documento != null) {
            // Agregar los datos a la tabla
            Object[] datos = new Object[5]; // Solo 4 para dni, nombre, correo, numero expediente
            datos[0] = documento.getDni();
            datos[1] = documento.getNombre();
            datos[2] = documento.getCorreo();
            datos[3] = documento.getNumero_expediente();
            datos[4] = documento; // Guarda el objeto DocumentosE aquí

            model.addRow(datos); // Añadir fila a la tabla

            // Mostrar el nombre del archivo en el campo correspondiente
            lblArchivoNombre.setText(documento.getNombreArchivo());

            // Guardar el objeto documento en la tabla para uso posterior
            tblPanel.setValueAt(documento, tblPanel.getRowCount() - 1, 4); // Suponiendo que la columna 4 es para el objeto completo

            // Si deseas también manejar el archivo, puedes hacerlo aquí
            if (documento.getArchivo() != null) {
                try {
                    // Obtener la ruta de la carpeta Descargas del usuario y usar el nombre original del archivo
                    String rutaDescargas = System.getProperty("user.home") + "/Downloads/" + documento.getNombreArchivo();
                    File archivoTemporal = new File(rutaDescargas);

                    // Escribir el contenido del archivo (byte[]) en el archivo en Descargas
                    Files.write(archivoTemporal.toPath(), documento.getArchivo());

                    // Muestra un mensaje de confirmación y la ruta del archivo
                    JOptionPane.showMessageDialog(this, "Archivo recuperado exitosamente en: " + archivoTemporal.getAbsolutePath());

                    // Opción de abrir el archivo automáticamente
                    int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas abrir el archivo?", "Archivo Recuperado", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        Desktop.getDesktop().open(archivoTemporal); // Abre el archivo usando la aplicación predeterminada del sistema
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Expediente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el documento con el expediente ingresado.");
        }

    }//GEN-LAST:event_btnBuscaExpedienteActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                // Convertir el archivo en un arreglo de bytes
                byte[] fileData = Files.readAllBytes(file.toPath());

                // Asignar el archivo y el nombre en el objeto `oficina`
                oficina.setArchivo(fileData);
                documento.setNombreArchivo(file.getName()); // Aquí se guarda el nombre del archivo

                lblArchivoNombre.setText("Archivo seleccionado: " + file.getName());

                // Confirmar al usuario que el archivo fue cargado
                JOptionPane.showMessageDialog(null, "Archivo cargado con éxito: " + file.getName() + ". Listo para enviar.");

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al leer el archivo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo.");
        }

    }//GEN-LAST:event_btnArchivoActionPerformed

    private void tblPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPanelMouseClicked
       int filaSeleccionada = tblPanel.getSelectedRow();
    if (filaSeleccionada != -1) {
        // Obtener el objeto DocumentosE de la columna correcta
        DocumentosE documento = (DocumentosE) model.getValueAt(filaSeleccionada, 4); // Asegúrate de que la columna 4 es donde guardaste el objeto

        if (documento != null) {
            byte[] archivoBytes = documento.getArchivo(); // Obtener el contenido del archivo

            if (archivoBytes != null) {
                try {
                    // Crear un archivo temporal
                    File archivoTemporal = File.createTempFile("documento", ".pdf");
                    Files.write(archivoTemporal.toPath(), archivoBytes);

                    // Abrir el archivo
                    Desktop.getDesktop().open(archivoTemporal);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al intentar abrir el archivo: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "El archivo no se encuentra disponible.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El documento no está disponible.");
        }
    }

    }//GEN-LAST:event_tblPanelMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        // Configurar los campos del objeto expediente
        expediente.setArea(cboAreas.getSelectedItem().toString());
        expediente.setObservacion(txtObservacion.getText());

        // Validar que el archivo ha sido seleccionado
        if (oficina.getArchivo() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un archivo antes de enviar.");
            return; // Detener si el archivo no está seleccionado
        }

        // Asignar el archivo y el número de expediente
        expediente.setArchivo(oficina.getArchivo());
        expediente.setNumero_expediente(txtBuscaExpediente.getText()); // Asegúrate de que este campo contenga el número de expediente

        // Establecer la fecha actual como la fecha de registro (puedes cambiar esto según sea necesario)
        expediente.setFecha(new java.sql.Date(System.currentTimeMillis()));

        // Llamar al método para agregar el expediente a la base de datos
        GeExpedienteLN expedienteLN = new GeExpedienteLN();
        String resultado = expedienteLN.agregarExpediente(expediente);

        if (resultado == null) {
            JOptionPane.showMessageDialog(this, "Expediente guardado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar el expediente: " + resultado);
        }


    }//GEN-LAST:event_btnEnviarActionPerformed
    private void saveFileToDownloads(DocumentosE documento) {
        if (documento.getArchivo() != null) {
            try {
                String rutaDescargas = System.getProperty("user.home") + "/Downloads/" + documento.getNombreArchivo();
                File archivoTemporal = new File(rutaDescargas);
                Files.write(archivoTemporal.toPath(), documento.getArchivo());
                JOptionPane.showMessageDialog(this, "Archivo guardado en: " + archivoTemporal.getAbsolutePath());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "El archivo no está disponible.");
        }
    }

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
            java.util.logging.Logger.getLogger(Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnBuscaExpediente;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> cboAreas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArchivoNombre;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JTable tblPanel;
    private javax.swing.JTextField txtBuscaExpediente;
    private javax.swing.JTextField txtObservacion;
    // End of variables declaration//GEN-END:variables
}
