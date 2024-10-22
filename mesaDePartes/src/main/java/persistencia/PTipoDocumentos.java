
package persistencia;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class PTipoDocumentos extends Conexion {
     public static boolean leeLogin;
    
    private String sql;
    
    Connection cone;
    
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    CallableStatement cst;
    
    
}
