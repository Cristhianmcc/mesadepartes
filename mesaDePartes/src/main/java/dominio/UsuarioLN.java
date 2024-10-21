/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import persistencia.UsuarioU;
import entidad.Usuario;

/**
 *
 * @author crist
 */
public class UsuarioLN {
    UsuarioU user = new UsuarioU();
    
    public boolean leeLogin(String usr, String pss){
        return user.leeLogin(usr, pss);
    }

    public int grabarUsuario(Usuario usuario) {
        return user.grabarUsuario(usuario);
    }
    
}
