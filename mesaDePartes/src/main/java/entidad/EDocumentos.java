
package entidad;


public class EDocumentos {
    private int IdDocumentos;
    private int IdTramiteUser;
    private String NomDocumento;
    private String Ruta;
    private int IdTipoDoc;

    public int getIdDocumentos() {
        return IdDocumentos;
    }

    public void setIdDocumentos(int IdDocumentos) {
        this.IdDocumentos = IdDocumentos;
    }

    public int getIdTramiteUser() {
        return IdTramiteUser;
    }

    public void setIdTramiteUser(int IdTramiteUser) {
        this.IdTramiteUser = IdTramiteUser;
    }

    public String getNomDocumento() {
        return NomDocumento;
    }

    public void setNomDocumento(String NomDocumento) {
        this.NomDocumento = NomDocumento;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public int getIdTipoDoc() {
        return IdTipoDoc;
    }

    public void setIdTipoDoc(int IdTipoDoc) {
        this.IdTipoDoc = IdTipoDoc;
    }
    
    
}
