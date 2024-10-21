/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import Entidad.TramitesC;
import Persistencia.TramitesDb;

/**
 *
 * @author CONTABILIDAD 19
 */
public class TramitesLN {
    
        TramitesDb tg = new TramitesDb();

    public TramitesC buscaTramite(String nombre) {
        return tg.buscaTramite(nombre);
    }

    public int agregaTramites(TramitesC tramite) {
        return tg.agregaTramite(tramite);
    }

    public int modificaTramites(TramitesC tramite) {
        return tg.modificaTramite(tramite);
    }

    public int eliminaTramites(String nombre) {
        return tg.eliminaTramite(nombre);
    }
    
    
}
