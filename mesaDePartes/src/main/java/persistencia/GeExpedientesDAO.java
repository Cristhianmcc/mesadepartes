/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.GeExpedientesE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class GeExpedientesDAO extends Conexion {
   
    private String sql;
    Connection cone;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    
    public String agregarExpediente (GeExpedientesE expediente){
       
        try {
            sql = "insert into gestionexpedientes (numero_expediente,area,estado,archivo,observacion,fecha) values (?,?,?,?,?,?)";
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            
            pst.setString(1, expediente.getNumero_expediente());
            pst.setString(2, expediente.getArea());
            pst.setString(3, expediente.getEstado());
            pst.setBytes(4, expediente.getArchivo());
            pst.setString(5, expediente.getObservacion());
            pst.setDate(6, expediente.getFecha());
            
           pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GeExpedientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
