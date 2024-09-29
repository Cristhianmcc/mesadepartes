/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author crist
 */
public class UsuarioU extends Conexion {

    public static boolean leeLogin;
    
    private String sql;
    
    Connection cone;
    
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    CallableStatement cst;
    
//    ArrayList<Usuario> listaUsuario = new ArrayList<>();
    //Usuario usuario;
    
    
//    public boolean leeLogin(String usr, String pss){
//        
//        try {
//            sql = "select * from usuario where nomusuario = ? and clave =?";
//            cone = getConexion();
//            
//            pst = cone.prepareStatement(sql);
//            pst.setString(1, usr);
//            pst.setString(2, pss);
//            
//           rs = pst.executeQuery();
//           
//            if (rs.next()) {
////                System.out.println("Si existe usuarioo");
//                return true;
//            }
////            else {
////                System.out.println("No existe usuario");
////            }
//           
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error de lectura de login " + ex.getMessage());
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        UsuarioU db = new UsuarioU();
//        db.leeLogin("cristhian", "qwert");        
//        }
    //todo esto comentado se hizo para poder probar si estaba bien la lectura de usuario y clave
        public int agregaUsuario(Usuario usuario){
        try {
            sql = "insert into usuario (apellidos,nombres,correo,nomusuario,clave) values (?,?,?,?,?)";
            cone = getConexion();
            
            pst = cone.prepareStatement(sql);
            
            pst.setString(1,usuario.getApellidos());
            pst.setString(2,usuario.getNombres());
            pst.setString(3,usuario.getCorreo());
            pst.setString(4,usuario.getNomusuario());
            pst.setString(5,usuario.getClave());
            
            return pst.executeUpdate();
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en insertar usuario" +ex.getMessage());
        }
           return 0; 
    }
//        public static void main(String[] args) {
//        UsuarioU db = new UsuarioU();
//        Usuario u = new Usuario();
//        u.setApellidos("Pio");
//        u.setNombres("miguel");
//        u.setCorreo("miguelpio@gmail.com");
//        u.setNomusuario("miguelpio");
//        u.setClave("qwert");
//        
//        
//        System.out.println(db.agregaUsuario(u));
//    }
        public int editarUsuario(Usuario usuario){
            
        try {
            sql = "update usuario set apellidos=? ,nombres=?,correo=?,nomusuario=?,clave=? where idusuario=?";
            
            cone = getConexion();
            
            pst = cone.prepareStatement(sql);  
            
            pst.setString(1, usuario.getApellidos());
            pst.setString(2, usuario.getNombres());
            pst.setString(3, usuario.getCorreo());
            pst.setString(4, usuario.getNomusuario());
            pst.setString(5, usuario.getClave());
            pst.setInt(6, usuario.getId());
            
            return pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioU.class.getName()).log(Level.SEVERE, null, ex);
        }
            
          return 0;
            
        }
//        public static void main(String[] args) {
//        UsuarioU p = new UsuarioU();
//        Usuario u = new Usuario();
//        
//        u.setId(2);
//        u.setApellidos("piolin");
//        u.setNombres("miguelon");
//        u.setCorreo("piolin@gmail.com");
//        u.setNomusuario("piota");
//        u.setClave("qwert");
//        
//        System.out.println(p.editarUsuario(u));
//    }
        public int eliminaUsuario (int id){
            
        try {
            sql = "delete from usuario where idusuario=?";
            cone = getConexion();
            pst= cone.prepareStatement(sql);
            
            pst.setInt(1,id);
            
            return pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioU.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        }
//        public static void main(String[] args) {
//        UsuarioU p = new UsuarioU();
//        
//        System.out.println(p.eliminaUsuario(1));
        
//    }
        
//        public ArrayList<Usuario> todoUsuario(){
//            
//        try {
//            sql = "select * from usuario";
//            cone = getConexion();
//            
//            st = cone.createStatement();
//            
//            rs = st.executeQuery(sql);
//            
//            while(rs.next()){
//                usuario = new Usuario();
//                usuario.setId(rs.getInt(1));
//                usuario.setApellidos(rs.getString(2));
//                usuario.setNombres(rs.getString(3));
//                usuario.setCorreo(rs.getString(4));
//                usuario.setNomusuario(rs.getString(5));
//                usuario.setClave(rs.getString(6));
//                usuario.setEstado(rs.getString(7));
//                
//                listaUsuario.add(usuario);
//            }
//            return listaUsuario;
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuarioU.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            return null;
//        }
        
//        public static void main(String[] args) {
//        UsuarioU p = new UsuarioU();
//        
//        ArrayList<Usuario> listaUsuarios = p.todoUsuario();
//            if (listaUsuarios !=null && !listaUsuarios.isEmpty()) {
//                for (Usuario usuario : listaUsuarios){
//                    System.out.println("ID: "+ usuario.getId());
//                    System.out.println("APELLIDOS: "+ usuario.getApellidos());
//                    System.out.println("NOMBRES: "+ usuario.getNombres());
//                    System.out.println("CORREO: "+ usuario.getCorreo());
//                    System.out.println("USUARIO: "+ usuario.getNomusuario());
//                    System.out.println("CLAVE: "+ usuario.getClave());
//                    System.out.println("ESTADO: "+ usuario.getEstado());
//                }
//                
//            } else {
//                System.out.println("No se encontraron usuarios en la base de datos");
//            }
//    }
        
        public boolean leeLogin(String usr , String pss){
            
        try {
            cone = getConexion();
            
            
          cst =  cone.prepareCall("{call leeLogin(?, ?)}");
          
          cst.setString(1,usr);
          cst.setString(2, pss);
          
          rs = cst.executeQuery();
            if (rs.next()) {
             //   System.out.println("Si existe Usuario");
                return true;
                
            }
//            else{
//                System.out.println("No existe usuario");
//            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de lectura");
        }
            return false;
        }
        
//        public static void main(String[] args) {
//        UsuarioU db = new UsuarioU();
//        db.leeLogin("piota", "qwert");
//    }
        
        public int grabarUsuario(Usuario usuario){
            
        try {
            cone = getConexion();
            cst = cone.prepareCall("{call grabarUsuario(?,?,?,?,?)}");
            
            cst.setString(1, usuario.getApellidos());
            cst.setString(2, usuario.getNombres());
            cst.setString(3, usuario.getCorreo());
            cst.setString(4, usuario.getNomusuario());
            cst.setString(5, usuario.getClave());
            
            return cst.executeUpdate();
                    
                    
            } catch (SQLException ex) {
            Logger.getLogger(UsuarioU.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        }
        
//        public static void main(String[] args) {
//        UsuarioU p = new UsuarioU();
//        Usuario u = new Usuario();
//        
//        u.setApellidos("Medina");
//        u.setNombres("Cristhian");
//        u.setCorreo("cristhian@gmail.com");
//        u.setNomusuario("cristhian");
//        u.setClave("qwert");
//        
//            System.out.println(p.grabarUsuario(u));
//    }
        public int actualizarUsuario(Usuario usuario){
            
        try {
            cone = getConexion();
            cst = cone.prepareCall("{call actualizarUsuario(?,?,?,?,?,?)}");
            
            cst.setString(1, usuario.getApellidos());
            cst.setString(2, usuario.getNombres());
            cst.setString(3, usuario.getCorreo());
            cst.setString(4, usuario.getNomusuario());
            cst.setString(5, usuario.getClave());
            cst.setInt(6, usuario.getId());
            
            return cst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioU.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        }
        
//        public static void main(String[] args) {
//        UsuarioU a = new UsuarioU();
//        Usuario u = new Usuario();
//        
//        u.setId(3);
//        u.setApellidos("Medina Camayo");
//        u.setNombres("cristhian");
//        u.setCorreo("cristhian@gmail.com");
//        u.setNomusuario("cristhian");
//        u.setClave("qwert");
//        
//            System.out.println(a.actualizarUsuario(u));
//    }
        public int eliminarUsuario(int id){
            
        try {
            cone = getConexion();
            cst = cone.prepareCall("{call eliminarUsuario(?)}");
            
            cst.setInt(1, id);
            
            return cst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioU.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        }
        
//        public static void main(String[] args) {
//        UsuarioU u = new UsuarioU();
//            System.out.println(u.eliminaUsuario(3));
//        
//    }
       public ArrayList<Usuario> listarUsuarios(){
           ArrayList<Usuario> listaUsuario = new ArrayList<>();
           
        try {
            cone = getConexion();
            cst = cone.prepareCall("{call listarUsuarios()}");
            
            rs = cst.executeQuery();
            
            while(rs.next()){
                Usuario nuevoUsuario = new Usuario();
                nuevoUsuario.setId(rs.getInt(1));
                nuevoUsuario.setApellidos(rs.getString(2));
                nuevoUsuario.setNombres(rs.getString(3));
                nuevoUsuario.setCorreo(rs.getString(4));
                nuevoUsuario.setNomusuario(rs.getString(5));
                nuevoUsuario.setClave(rs.getString(6));
                nuevoUsuario.setEstado(rs.getString(7));
                
                listaUsuario.add(nuevoUsuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioU.class.getName()).log(Level.SEVERE, null, ex);
        }
           return listaUsuario;
           
       }      
       
       public static void main(String[] args) {
    UsuarioU p = new UsuarioU();
    
    ArrayList<Usuario> listaUsuario = p.listarUsuarios();  // Llamar al método correcto
    if (listaUsuario != null && !listaUsuario.isEmpty()) {  // Corrección de la sintaxis
        for (Usuario usuario : listaUsuario) {
            System.out.println("ID: " + usuario.getId());
            System.out.println("APELLIDOS: " + usuario.getApellidos());
            System.out.println("NOMBRE: " + usuario.getNombres());
            System.out.println("CORREO: " + usuario.getCorreo());
            System.out.println("USUARIO: " + usuario.getNomusuario());
            System.out.println("CLAVE: " + usuario.getClave());
            System.out.println("ESTADO: " + usuario.getEstado());
            System.out.println("-----------------------------");
        }
    } else {
        System.out.println("No se encontraron datos en la base de datos");
    }
}

}

//ArrayList<Usuario> listaUsuarios = p.todoUsuario();
//            if (listaUsuarios !=null && !listaUsuarios.isEmpty()) {
//                for (Usuario usuario : listaUsuarios){
//                    System.out.println("ID: "+ usuario.getId());
//                    System.out.println("APELLIDOS: "+ usuario.getApellidos());
//                    System.out.println("NOMBRES: "+ usuario.getNombres());
//                    System.out.println("CORREO: "+ usuario.getCorreo());
//                    System.out.println("USUARIO: "+ usuario.getNomusuario());
//                    System.out.println("CLAVE: "+ usuario.getClave());
//                    System.out.println("ESTADO: "+ usuario.getEstado());
//                }
//                
//            } else {
//                System.out.println("No se encontraron usuarios en la base de datos");
//            }
