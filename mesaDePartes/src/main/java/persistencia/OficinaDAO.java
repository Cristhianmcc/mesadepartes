/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.OficinaE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class OficinaDAO extends Conexion {

    private String sql;
    Connection cone;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    public int agregarOficina(OficinaE oficina) {

        try {
            sql = "Insert into oficinas (dni,numexp,nombre,correo,archivo,observacion,fecha) values (?,?,?,?,?,?,?)";
            cone = getConexion();
            pst = cone.prepareStatement(sql);

            pst.setString(1, oficina.getDni());
            pst.setString(2,oficina.getNumexp());
            pst.setString(3,oficina.getNombre());
            pst.setString(4, oficina.getCorreo());
            pst.setBytes(5, oficina.getArchivo());
            pst.setString(6, oficina.getObservacion());
            pst.setDate(7, oficina.getFecha());

            return pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "oficina grabada con exito" + ex.getMessage());
        }

        return 0;
    }
    
    
    public int editaOficina(OficinaE oficina){
    
        try {
            sql = "Update oficinas set correo=? where dni=?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);

            pst.setString(1, oficina.getCorreo());



            return pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "oficina actualizada con exito" + ex.getMessage());
        }

        return 0;
        
    }
    
    
}
