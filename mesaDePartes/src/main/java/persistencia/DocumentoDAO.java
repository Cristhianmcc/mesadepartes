/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.DocumentoE;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class DocumentoDAO extends Conexion {
    private String sql;
    
    Connection cone;
    
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    CallableStatement cst;

 public int agregarDocumento(DocumentoE documento){
        try {
            sql = "INSERT INTO documentos (Nombre_Documento, Ruta) VALUES (?, ?)";
            cone = getConexion();
            
            pst = cone.prepareStatement(sql);
            
            pst.setString(1, documento.getNombreDocumento());
            pst.setString(2, documento.getRuta());
            
            
            return pst.executeUpdate();
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en insertar documento" +ex.getMessage());
        }
           return 0; 
    }
 public static void main(String[] args) {
       DocumentoDAO db = new DocumentoDAO();
       DocumentoE documento = new DocumentoE();
        documento.setNombreDocumento("FUT");
        documento.setRuta("Instagram");
        
        System.out.println(db.agregarDocumento(documento));

    }
}