/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import Entidad.OficinasC;
import Persistencia.OficinasDb;

/**
 *
 * @author CONTABILIDAD 19
 */
public class OficinasLN {

    OficinasDb bo = new OficinasDb();

    public OficinasC buscaOficina(String nombre) {
        return bo.buscaOficina(nombre);
    }

    public int agregaOficina(OficinasC oficina) {
        return bo.agregaOficina(oficina);
    }

    public int modificaOficina(OficinasC oficina) {
        return bo.modificaOficina(oficina);
    }

    public int eliminaOficina(String nombre) {
        return bo.eliminaOficina(nombre);
    }

}
