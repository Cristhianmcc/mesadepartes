/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.EHistorialTramite;
import entidad.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CONTABILIDAD 14
 */
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
            sql = "update usuario set ID Historial=? , ID Tramite Usuario=?, ID Estado=? ,Fecha Cambio=?,Comentario=? where ID Historial=?";

            cone = getConexion();

            pst = cone.prepareStatement(sql);

            pst.setInt(1, ht.getIdHistorial());
            pst.setInt(2, ht.getIdTramiteUsuario());
            pst.setInt(3, ht.getIdEstado());
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
            cone = getConexion();

            cst = cone.prepareCall("{call grabarHistorialTramite(?,?,?,?,?)}");

            cst.setInt(1, ht.getIdHistorial());
            cst.setInt(2, ht.getIdTramiteUsuario());
            cst.setInt(3, ht.getIdEstado());
            cst.setString(4, ht.getFechaCambio());
            cst.setString(5, ht.getComentario());

            return cst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PHistorialTramites.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}

   
  
