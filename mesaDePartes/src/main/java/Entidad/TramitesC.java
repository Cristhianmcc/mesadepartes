package Entidad;

import java.sql.Date;

public class TramitesC {

    private String Nombre_tramite;
    private String Descripcion;
   private String Costo;
    private String Requisitos;
    private String Duracion_Estimada;
    private String Fecha_Actualizacion;

    public String getNombre_tramite() {
        return Nombre_tramite;
    }

    public void setNombre_tramite(String Nombre_tramite) {
        this.Nombre_tramite = Nombre_tramite;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

  

    public String getRequisitos() {
        return Requisitos;
    }

    public void setRequisitos(String Requisitos) {
        this.Requisitos = Requisitos;
    }

    public String getDuracion_Estimada() {
        return Duracion_Estimada;
    }

    public void setDuracion_Estimada(String Duracion_Estimada) {
        this.Duracion_Estimada = Duracion_Estimada;
    }

    public String getFecha_Actualizacion() {
        return Fecha_Actualizacion;
    }

    public void setFecha_Actualizacion(String Fecha_Actualizacion) {
        this.Fecha_Actualizacion = Fecha_Actualizacion;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
