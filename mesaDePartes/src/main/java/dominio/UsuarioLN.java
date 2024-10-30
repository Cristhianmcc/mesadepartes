/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import entidad.UsuarioE;
import persistencia.UsuarioDAO;

/**
 *
 * @author crist
 */
public class UsuarioLN {
    
    
   
    UsuarioDAO user = new UsuarioDAO();

    
    
    
    public boolean leeLogin(String usr, String pss){
        return user.leeLogin(usr, pss);
    }

    public int grabarUsuario(UsuarioE usuario) {
        return user.agregaUsuario(usuario);
    }
}

