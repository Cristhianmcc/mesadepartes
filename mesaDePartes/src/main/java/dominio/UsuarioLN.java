/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import entidad.OficinasC;
import entidad.TramitesC;
import persistencia.UsuarioDAO;
import entidad.Usuario;
import persistencia.OficinasDb;
import persistencia.TramitesDb;


public class UsuarioLN {
    UsuarioDAO user = new UsuarioDAO();
    
    OficinasDb ao = new OficinasDb();
    OficinasDb eo = new OficinasDb();
    OficinasDb aco = new OficinasDb();
    OficinasDb bo = new OficinasDb();
    
    
    
    TramitesDb at = new TramitesDb();
    TramitesDb et = new TramitesDb();
    TramitesDb act = new TramitesDb();
    TramitesDb bt = new TramitesDb();
    
    
    
    
    public boolean leeLogin(String usr, String pss){
        return user.leeLogin(usr, pss);
    }

    public int grabarUsuario(Usuario usuario) {
        return user.grabarUsuario(usuario);
    }
    
    

     
     
     
     
     
      public int agregaTramite(TramitesC tramite) {
        return at.agregaTramite(tramite);
    }
     public int modificaTramite(TramitesC tramite) {
        return act.modificaTramite(tramite);
    }
    public int eliminaTramite(TramitesC tramite) {
        return et.eliminaTramite(tramite);
    }
     public int buscaTramite(TramitesC tramite) {
        return bt.buscaTramite(tramite);
    }
    
    
    
}
