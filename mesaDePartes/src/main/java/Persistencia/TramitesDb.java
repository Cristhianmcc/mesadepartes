/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidad.TramitesC;
import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TramitesDb extends Conexion {

    Connection cone;
    Statement st;
    PreparedStatement pst;
    ResultSet rst;
    CallableStatement cst;
    String sql;
    ArrayList<TramitesC> listaTramites = new ArrayList<>();
    TramitesC tramites;

    public int agregaTramite(TramitesC tramites) {
        try {
            sql = "insert into tramites (Nombre_Tramite,Descripcion,Costo,Requisitos,Duracion_Estimada,Fecha_Actualizacion ) values (?,?,?,?,?,?)";
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            pst.setString(1, tramites.getNombre_tramite());
            pst.setString(2, tramites.getDescripcion());
            pst.setString(3, tramites.getCosto());
            pst.setString(4, tramites.getRequisitos());
            pst.setString(5, tramites.getDuracion_Estimada());
            pst.setString(6, tramites.getFecha_Actualizacion());

            return pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en insertar Tramite" + ex.getMessage());
        }
        return 0;

    }

    public int modificaTramite(TramitesC tramites) {
        try {
            sql = "update tramites set Descripcion=?,Costo=?,Requisitos=?,Duracion_Estimada=?,Fecha_Actualizacion=? where Nombre_Tramite=?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            pst.setString(1, tramites.getDescripcion());
            pst.setString(2, tramites.getCosto());
            pst.setString(3, tramites.getRequisitos());
            pst.setString(4, tramites.getDuracion_Estimada());
            pst.setString(5, tramites.getFecha_Actualizacion());
            pst.setString(6, tramites.getNombre_tramite());
            return pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en actualizar tramite" + ex.getMessage());
        }
        return 0;
    }

    public int eliminaTramite(String nombre) {
        try {
            sql = "delete  from tramites where Nombre_Tramite=?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            pst.setString(1, nombre);
            return pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar Tramite" + ex.getMessage());
        }
        return 0;
    }

    
    

    public TramitesC buscaTramite(String nombre) {
        TramitesC tramite=null;
        try {
            sql = "SELECT * FROM tramites where Nombre_Tramite =?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            pst.setString(1, nombre);
            rst = pst.executeQuery();
            if (rst.next()) {
                tramite = new TramitesC();
                
                tramite.setNombre_tramite(rst.getString("Nombre_Tramite"));
                tramite.setDescripcion(rst.getString("Descripcion"));
                tramite.setCosto(rst.getString("Costo"));
                tramite.setRequisitos(rst.getString("Requisitos"));
                tramite.setDuracion_Estimada(rst.getString("Duracion_Estimada"));
                tramite.setFecha_Actualizacion(rst.getString("Fecha_Actualizacion"));
    
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tramite no registrado" + ex.getMessage());
        }
        return tramite;

    }

}
