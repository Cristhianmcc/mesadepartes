/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import entidad.OficinaE;
import persistencia.OficinaDAO;

/**
 *
 * @author crist
 */
public class OficinaLN {
    
    OficinaDAO ofi = new OficinaDAO();
    
    public int agregarOficina(OficinaE oficina){
        return ofi.agregarOficina(oficina);
    }
    
}
