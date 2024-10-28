/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import entidad.DocumentosE;
import persistencia.DocumentosDAO;

/**
 *
 * @author crist
 */
public class DocumentoLN {
    DocumentosDAO docu = new DocumentosDAO();
    
    public String agregarDocumento(DocumentosE documento){
        return docu.agregarDocumento(documento);
    }
    private String generarNumeroExpediente() {
    return "EXP-" + (int)(Math.random() * 100000);
}
    public DocumentosE buscarPorDni(String dni){
        return docu.buscarPorDni(dni);
    }
    public DocumentosE buscarPorExpediente(String expediente){
        return docu.buscarPorExpediente(expediente);
    }

}
