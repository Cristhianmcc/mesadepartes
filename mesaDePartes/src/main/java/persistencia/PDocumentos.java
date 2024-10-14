package persistencia;

import entidad.EDocumentos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PDocumentos extends Conexion {

    public static boolean leeLogin;

    private String sql;

    Connection cone;

    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    CallableStatement cst;

    public int editarDocumento(EDocumentos documentos) {

        try {
            sql = "update documento set ID_Documento=?, ID_Tramite_Usuario=?, Nombre_Documento=?, Ruta=?, ID_Tipo_Documento=? where ID_Documento=?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);

            pst.setInt(1, documentos.getIdDocumentos());
            pst.setInt(2, documentos.getIdTramiteUser());
            pst.setString(3, documentos.getNomDocumento());
            pst.setString(4, documentos.getRuta());
            pst.setInt(5, documentos.getIdTipoDoc());

            return pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int eliminarDocumento(int id) {
        try {
            sql = "delete from documento where ID_Documento=?";
            cone = getConexion();
            pst = cone.prepareStatement(sql);

            pst.setInt(1, id);

            return pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int grabarDocumento(EDocumentos documentos) {

        try {
            cone = getConexion();

            cst = cone.prepareCall("{call grabarUsuario(?,?,?,?,?)}");

            cst.setInt(1, documentos.getIdDocumentos());
            cst.setInt(2, documentos.getIdTramiteUser());
            cst.setString(3, documentos.getNomDocumento());
            cst.setString(4, documentos.getRuta());
            cst.setInt(6, documentos.getIdTipoDoc());

            return cst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
    }
}
