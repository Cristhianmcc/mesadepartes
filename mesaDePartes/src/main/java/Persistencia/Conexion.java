/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Conexion {
   private String url = "jdbc:mysql://localhost:3306/mesadepartes";
   private String usr = "root";
   private String pass = "123456";
   
   Connection conn = null;
   
   public Connection getConexion(){
       
       try {
           conn = DriverManager.getConnection(url,usr,pass);
           // System.out.println("Conexion satisfactoria");
       } 
       catch (SQLException ex)
       {
        JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
       }
       return conn;
   }
    
//   public static void main(String[] args){
//       Conexion cone = new Conexion();
//       cone.getConexion();
//   }
}
