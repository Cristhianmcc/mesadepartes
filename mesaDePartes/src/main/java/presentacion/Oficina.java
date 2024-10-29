/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dominio.DocumentoLN;
import dominio.OficinaLN;
import entidad.DocumentosE;
import entidad.OficinaE;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import servicios.EmailService;

/**
 *
 * @author bruce
 */
public class Oficina extends javax.swing.JFrame {

    OficinaE oficina = new OficinaE();
    DocumentoLN ln = new DocumentoLN();
    DocumentosE documento = new DocumentosE();

    public Oficina() {
        initComponents();
        initFechaActual();
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
        jPanel2 = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        btnArchivo = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        txtObservacion = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnBuscaDni = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNombreArchivo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnumexp = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 240, -1));

        btnArchivo.setText("Archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });
        jPanel2.add(btnArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, -1));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, -1));
        jPanel2.add(txtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 240, 80));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 80, -1));

        btnBuscaDni.setText("Buscar DNI");
        btnBuscaDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaDniActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscaDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, -1));

        jLabel1.setText("Correo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, -1));

        lblNombreArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(lblNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 240, 20));

        jLabel3.setText("Observacion");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, -1));

        jLabel4.setText("Fecha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jLabel2.setText("Num. Expediente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel5.setText("Nombre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel2.add(txtnumexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, -1));
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 240, -1));

        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        // Guardar la información de oficina
        oficina.setDni(txtDni.getText());
        oficina.setNumexp(txtnumexp.getText());
        oficina.setNombre(txtnombre.getText());
        oficina.setCorreo(txtCorreo.getText());
        oficina.setObservacion(txtObservacion.getText());
        oficina.setFecha(java.sql.Date.valueOf(lblfecha.getText()));

        // Verificar si el archivo fue seleccionado
        if (oficina.getArchivo() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un archivo antes de enviar.");
            return;
        }

        // Guardar la información en la base de datos
        OficinaLN ln = new OficinaLN();
        ln.agregarOficina(oficina);
        JOptionPane.showMessageDialog(null, "Información de la oficina guardada con éxito.");

        // Preparación del correo
        String destinatario = oficina.getCorreo(); // Correo del estudiante o usuario
        String asunto = "Documento recibido - Expediente: " + oficina.getNumexp();
        String mensaje = "Estimado/a " + oficina.getNombre() + ",\n\nSe ha enviado el documento solicitado.\n\nSaludos cordiales.";

        // Ruta del archivo que se guardó en Descargas o en la carpeta temporal
        String rutaArchivo = System.getProperty("user.home") + "/Downloads/" + documento.getNombreArchivo();
        System.out.println("Ruta del archivo adjunto: " + rutaArchivo); // Verificar la ruta en la consola

        File archivoAdjunto = new File(rutaArchivo);

        // Verificar si el archivo adjunto realmente existe
        if (!archivoAdjunto.exists()) {
            JOptionPane.showMessageDialog(this, "El archivo adjunto no se encontró en la ruta especificada: " + rutaArchivo);
            return;
        }

        // Instancia de EmailService y envío de correo
        EmailService emailService = new EmailService();
        emailService.enviarCorreoConAdjunto(destinatario, asunto, mensaje, archivoAdjunto);

        JOptionPane.showMessageDialog(this, "Documento enviado a " + destinatario);

        // Limpiar los campos después de enviar
        limpiarCampos();
    }//GEN-LAST:event_btnEnviarActionPerformed

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

            lblNombreArchivo.setText("Archivo seleccionado: " + file.getName());

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

    private void btnBuscaDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaDniActionPerformed
        String dni = txtDni.getText();

        // Busca el documento en la base de datos por DNI
        DocumentosE documento = ln.buscarPorDni(dni); // Asegúrate de que ln es una instancia válida de DocumentoLN

        if (documento != null && documento.getArchivo() != null && documento.getNombreArchivo() != null) {
            txtnumexp.setText(documento.getNumero_expediente());
            txtnombre.setText(documento.getNombre());
            // Establecer el correo en el campo de texto
            txtCorreo.setText(documento.getCorreo()); // Muestra el correo recuperado
            lblNombreArchivo.setText(documento.getNombreArchivo());
            try {
                // Obtener la ruta de la carpeta Descargas del usuario y usa el nombre original del archivo
                String rutaDescargas = System.getProperty("user.home") + "/Downloads/" + documento.getNombreArchivo();
                File archivoTemporal = new File(rutaDescargas);

                // Escribe el contenido del archivo (byte[]) en el archivo en Descargas
                Files.write(archivoTemporal.toPath(), documento.getArchivo());

                // Muestra un mensaje de confirmación y la ruta del archivo
                JOptionPane.showMessageDialog(this, "Archivo recuperado exitosamente en: " + archivoTemporal.getAbsolutePath());

                // Opción de abrir el archivo automáticamente
                int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas abrir el archivo?", "Archivo Recuperado", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    Desktop.getDesktop().open(archivoTemporal); // Abre el archivo usando la aplicación predeterminada del sistema
                }
            } catch (IOException ex) {
                Logger.getLogger(Oficina.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el documento con el dni ingresado o el archivo está vacío.");
        }
    }//GEN-LAST:event_btnBuscaDniActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        oficina.setDni(txtDni.getText());
        oficina.setCorreo(txtCorreo.getText());

        


        // Guardar la información en la base de datos
        OficinaLN ln = new OficinaLN();
        ln.agregarOficina(oficina);
        JOptionPane.showMessageDialog(null, "Información de la oficina actualizada con éxito.");
        
        // Limpiar los campos después de enviar
        limpiarCampos();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Principal form= new Principal();
        form.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnSalirActionPerformed

    public void limpiarCampos() {
        txtDni.setText("");
        txtnumexp.setText("");
        txtnombre.setText("");
        txtCorreo.setText("");
        lblNombreArchivo.setText("");
        txtObservacion.setText("");

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
            java.util.logging.Logger.getLogger(Oficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oficina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnBuscaDni;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumexp;
    // End of variables declaration//GEN-END:variables

    private void initFechaActual() {
        // Define el formato de la fecha
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    // Obtiene la fecha actual
    String fechaActual = formatoFecha.format(new Date());
    // Muestra la fecha en el campo de fecha (por ejemplo, txtFecha)
    lblfecha.setText(fechaActual);
    }
}
