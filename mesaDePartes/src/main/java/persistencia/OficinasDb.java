package persistencia;

import entidad.OficinasC;
import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OficinasDb extends Conexion {

    Connection cone;
    Statement st;
    PreparedStatement pst;
    ResultSet rst;
    CallableStatement cst;
    String sql;
    ArrayList<OficinasC> listaOficinas = new ArrayList<>();
    OficinasC oficinas;
    

    public int agregaOficina(OficinasC oficinas) {
        try {
            sql = "insert into oficinas (Nombre_Oficina,Descripcion ) values (?,?)";
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            pst.setString(1, oficinas.getNombre());
            pst.setString(2, oficinas.getDescripcion());

            return pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en insertar Oficina" + ex.getMessage());
        }
        return 0;

    }

    public int modificaOficina(OficinasC oficinas) {
        try {
            sql = "update oficinas set Descripcion =? where Nombre_Oficina=?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            
            
            
            pst.setString(1, oficinas.getDescripcion());
            pst.setString(2, oficinas.getNombre());

            return pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en insertar Oficina" + ex.getMessage());
        }
        return 0;
    }

    public int eliminaOficina(String nombre) {
        try {
            sql = "delete  from oficinas where Nombre_Oficina=?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            pst.setString(1,nombre);
            return pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar Oficina" + ex.getMessage());
        }
        return 0;
    }

    public OficinasC buscaOficina(String nombre) {
        OficinasC oficina=null;
        sql = "SELECT * FROM oficinas where Nombre_Oficina = ?";
        try {
           
            cone = getConexion();
            pst = cone.prepareStatement(sql);
            pst.setString(1,nombre);
            rst=pst.executeQuery();
            if(rst.next()){
                oficina = new OficinasC();
                
                oficina.setNombre(rst.getString("Nombre_Oficina"));
                oficina.setDescripcion(rst.getString("Descripcion"));
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oficina no registrado" + ex.getMessage());
        }
       return oficina;

    }

}
