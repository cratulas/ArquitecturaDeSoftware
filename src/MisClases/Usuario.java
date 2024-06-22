
package MisClases;

import java.util.List;

public class Usuario {
    private int idUsuario;
    private String rutUsuario;
    private String nombreUsuario;
    private String direccion;
    private Comuna comuna;
    private String telefonoUsuario;
    private String correoUsuario;
    
    private List<Factura> facturas;
    private List<Sesion> sesiones;
    private List<CarritoDeCompra> carritos;

    
//Setters
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    public void setCarritos(List<CarritoDeCompra> carritos) {
        this.carritos = carritos;
    }
    

// Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
    
    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public List<CarritoDeCompra> getCarritos() {
        return carritos;
    }


    // Constructor
    public Usuario(int idUsuario, String rutUsuario, String nombreUsuario, String direccion, Comuna comuna, String telefonoUsuario, String correoUsuario, List<Factura> facturas, List<Sesion> sesiones, List<CarritoDeCompra> carritos) {
        this.idUsuario = idUsuario;
        this.rutUsuario = rutUsuario;
        this.nombreUsuario = nombreUsuario;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefonoUsuario = telefonoUsuario;
        this.correoUsuario = correoUsuario;
        this.facturas = facturas;
        this.sesiones = sesiones;
        this.carritos = carritos;
    }
}
