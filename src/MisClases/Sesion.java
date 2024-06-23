
package MisClases;

import java.util.Date;


public class Sesion {
    private int idSesion;
    private Date fechaInicio;
    private Date fechaFin;
    private Usuario usuario;

    public int getIdSesion() {
        return idSesion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sesion(int idSesion, Date fechaInicio, Date fechaFin, Usuario usuario) {
        this.idSesion = idSesion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
    }
    
    
    
}
