/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dominio.DocumentoLN;
import entidad.DocumentosE;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import persistencia.DocumentosDAO;

/**
 *
 * @author crist
 */
public class Principal extends javax.swing.JFrame {
DocumentosE documento = new DocumentosE();
    public Principal() {
        initComponents();
        initFechaActual();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboTipoDocumento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFolios = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnArchivo = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        txtDependecia = new javax.swing.JTextField();
        cboTramite = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblNombreArchivo = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboDocumento = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Registrando Nuevo Documento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 763, 53));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Tipo de Documento:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        cboTipoDocumento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "DNI", "Carnet De Extranjeria" }));
        cboTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoDocumentoActionPerformed(evt);
            }
        });
        jPanel3.add(cboTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 61, 200, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Documento:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 91, -1));

        txtFolios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(txtFolios, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 123, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("N° Folios:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 74, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Fecha:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 41, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Dni del Firmante:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 102, -1));

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel3.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 159, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Nombres y Apellidos:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 132, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 245, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setText("Asunto (tal y como está consignado en su documento):");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 330, -1));

        txtAsunto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 660, 80));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setText("Dependencia(s) Destino(s):");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 180, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setText("Archivo (PDF máx 5 MB):");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 159, -1));

        btnArchivo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnArchivo.setText("Seleccionar archivo |  Ningún archivo seleccionado");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });
        jPanel3.add(btnArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 350, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel19.setText("URL del Anexo (leer indicaciones):");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 420, 200, -1));

        txtUrl.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(txtUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 307, -1));

        btnEnviar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 91, 38));

        txtDependecia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDependecia.setText("El Director");
        jPanel3.add(txtDependecia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 250, -1));

        cboTramite.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboTramite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Reingreso Por Repitencia", "Cambio De Turno", "Licencia De Estudios", "Record De Notas", "Certificado Modular", "Reingreso", "Costancia De Estudios", "Certificado De Estudios", "Otros" }));
        jPanel3.add(cboTramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 180, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setText("Trámite:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Correo Electronico: ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 230, -1));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 180, -1));

        lblNombreArchivo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombreArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(lblNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 350, 20));

        lblfecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 100, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 763, 550));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("NUEVO TRAMITE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 40));

        cboDocumento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Solicitud", "Otros" }));
        jPanel1.add(cboDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 170, -1));

        jScrollPane1.setViewportView(jPanel1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String generarNumeroExpediente() {
    return "EXP-" + (int)(Math.random() * 100000);
}

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // Configurar los demás datos en el objeto DocumentosE existente
    documento.setTipo_documento(cboDocumento.getSelectedItem().toString());
    documento.setDni(txtDni.getText());
    documento.setNombre(txtNombre.getText());
    documento.setCorreo(txtCorreo.getText());
    documento.setDocumento(cboDocumento.getSelectedItem().toString());
    documento.setTramite(cboTramite.getSelectedItem().toString());
    documento.setFolio(Integer.parseInt(txtFolios.getText()));
    documento.setFecha(java.sql.Date.valueOf(lblfecha.getText())); // Asegúrate del formato
    documento.setAsunto(txtAsunto.getText());
    documento.setDep_destino(txtDependecia.getText());
    documento.setUrl(txtUrl.getText());

    // Generar y asignar número de expediente
    String numeroExpediente = generarNumeroExpediente();
    documento.setNumero_expediente(numeroExpediente);

    // Verificar si el archivo fue seleccionado
    if (documento.getArchivo() == null) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un archivo antes de enviar.");
        return; // Detener si el archivo no está seleccionado
    }

    // Guardar el documento en la base de datos a través de la lógica de negocio
    DocumentoLN ln = new DocumentoLN();
    ln.agregarDocumento(documento);

    // Mostrar mensaje de confirmación
    JOptionPane.showMessageDialog(null, "Documento registrado con éxito. N° de Expediente: " + numeroExpediente);

    // Limpiar el objeto y los campos después de guardar
    documento = new DocumentosE(); // Reiniciar el objeto documento
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

            // Asignar el archivo y el nombre del archivo en el objeto DocumentosE
            documento.setArchivo(fileData);
            documento.setNombreArchivo(file.getName()); // Guardar el nombre del archivo
            
            // Mostrar el nombre del archivo en el JLabel
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

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int swe = evt.getKeyChar();
        boolean letra = Character.isLetter(swe);
        boolean espacio = Character.isWhitespace(swe);
        if (!letra && !espacio) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        int swe = evt.getKeyChar();
        boolean numero = swe >= 48 && swe <= 57;
        if (!numero) {
            evt.consume();
        }
        if (txtDni.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void cboTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoDocumentoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
     private void limpiarCampos() {
    cboDocumento.setSelectedIndex(0);
    txtDni.setText("");
    txtNombre.setText("");
    txtCorreo.setText("");
    cboTramite.setSelectedIndex(0);
    txtFolios.setText("");
    txtAsunto.setText("");
    txtUrl.setText("");
    // No es necesario limpiar el archivo en `documento` aquí, ya se reinicia al crear un nuevo `DocumentosE`
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> cboDocumento;
    private javax.swing.JComboBox<String> cboTipoDocumento;
    private javax.swing.JComboBox<String> cboTramite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDependecia;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFolios;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUrl;
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
