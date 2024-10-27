/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.DocumentosE;
import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class DocumentosDAO extends Conexion {
    private String sql;
    
    Connection cone;
    
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    CallableStatement cst;

 public String agregarDocumento(DocumentosE documento){
      String numeroExpediente = generarNumeroExpediente();
        try {
            sql = "INSERT INTO documentos (tipo_documento, dni,nombre,correo,documento,tramite,folios,fecha,asunto,dependencia_destino,archivo,url,numero_expediente,nombre_archivo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            cone = getConexion();
            
            pst = cone.prepareStatement(sql);
            
            pst.setString(1, documento.getTipo_documento());
            pst.setString(2, documento.getDni());
            pst.setString(3, documento.getNombre());
            pst.setString(4, documento.getCorreo());
            pst.setString(5, documento.getDocumento());
            pst.setString(6, documento.getTramite());
            pst.setInt(7, documento.getFolio());
            pst.setDate(8, documento.getFecha());
            pst.setString(9, documento.getAsunto());
            pst.setString(10, documento.getDep_destino());
            pst.setBytes(11, documento.getArchivo());
            pst.setString(12, documento.getUrl());
            pst.setString(13, documento.getNumero_expediente());
            pst.setString(14, documento.getNombreArchivo());
 
            
           pst.executeUpdate();
            
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en insertar documento" +ex.getMessage());
        }
           return numeroExpediente;
    }
// public static void main(String[] args) {
//       DocumentoDAO db = new DocumentoDAO();
//       DocumentoE documento = new DocumentoE();
//        documento.setNombreDocumento("FUT");
//        documento.setRuta("Instagram");
//        
//        System.out.println(db.agregarDocumento(documento));
//
//    }
 
 private String generarNumeroExpediente() {
    return "EXP-" + (int)(Math.random() * 100000); // Genera un número de expediente aleatorio
}
 
public DocumentosE buscarPorDni(String dni){
    
        DocumentosE documentos = null;
        try {
            
            
            sql = "Select * from documentos where dni =?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);

            pst.setString(1, dni);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                documentos = new DocumentosE();
                
                documentos.setIddocumentos(rs.getInt("iddocumentos"));
                documentos.setTipo_documento(rs.getString("tipo_documento"));
                documentos.setDni(rs.getString("dni"));
                documentos.setNombre(rs.getString("nombre"));
                documentos.setCorreo(rs.getString("correo"));
                documentos.setDocumento(rs.getString("documento"));
                documentos.setTramite(rs.getString("tramite"));
                documentos.setFolio(rs.getInt("folios"));
                documentos.setFecha(rs.getDate("fecha"));
                documentos.setAsunto(rs.getString("asunto"));
                documentos.setDep_destino(rs.getString("dependencia_destino"));
                documentos.setArchivo(rs.getBytes("archivo"));
                documentos.setUrl(rs.getString("url"));
                documentos.setNumero_expediente(rs.getString("numero_expediente"));
                documentos.setNombreArchivo(rs.getString("nombre_archivo"));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Filtrado por dni exitoso" + ex.getMessage());
        }
        return documentos;
}
}

