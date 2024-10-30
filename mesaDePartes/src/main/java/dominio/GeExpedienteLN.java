/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import entidad.GeExpedientesE;
import persistencia.GeExpedientesDAO;

/**
 *
 * @author crist
 */
public class GeExpedienteLN {
    GeExpedientesDAO expe = new GeExpedientesDAO();
    
     public String agregarExpediente (GeExpedientesE expedientes){
         return expe.agregarExpediente(expedientes);
     }
}
