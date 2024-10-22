
package dominio;

import entidad.EHistorialTramite;
import persistencia.PHistorialTramites;

public class DHistorialTramite {
    PHistorialTramites user = new PHistorialTramites();
    
    public int editarHistorialTramites(EHistorialTramite ht) {
        return user.editarHistorialTramites(ht);
    }
    public int eliminaHistorialTramites(EHistorialTramite id) {
         return user.eliminaHistorialTramites(id.getId());
    }
    public int grabarHistorialTramite(EHistorialTramite ht) {
        return user.grabarHistorialTramite(ht);
    }



}
