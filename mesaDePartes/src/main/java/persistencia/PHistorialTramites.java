/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.EHistorialTramite;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PHistorialTramites extends Conexion {

    public static boolean leeLogin;

    private String sql;

    Connection cone;

    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    CallableStatement cst;

    public int editarHistorialTramites(EHistorialTramite ht) {
        try {
            sql = "update mesadepartes set FechaCambio=?,Comentario=? where idHistorialTramites=?";

            cone = getConexion();

            pst = cone.prepareStatement(sql);

            pst.setString(4, ht.getFechaCambio());
            pst.setString(5, ht.getComentario());

            return pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioU.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;

    }

    public int eliminaHistorialTramites(int id) {

        try {
            sql = "delete from HistorialTramites where idHistorialTramites=?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);

            pst.setInt(1, id);

            return pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PHistorialTramites.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int grabarHistorialTramite(EHistorialTramite ht) {
        try {
            sql = "insert into historial_Tramites(Fecha_Cambio,Comentario)VALUES (?,?)";
            cone = getConexion();

            pst = cone.prepareStatement(sql);
            pst.setString(1,ht.getFechaCambio());
            pst.setString(2,ht.getComentario());

            return pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se pudo grabar historial" +ex.getMessage());
        }
        return 0;
    }

}
