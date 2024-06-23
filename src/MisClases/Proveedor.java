
package MisClases;

import java.util.List;

public class Proveedor {
    private int idProveedor;
    private String nombreProveedor;
    private String ciudadProveedor;
    private String direccionProveedor;
    private String telefonoProveedor;
    private Comuna comuna;
    private List<Producto> productos;
    
    // Getters

    public int getIdProveedor() {
        return idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public String getCiudadProveedor() {
        return ciudadProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
    // Setters

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setCiudadProveedor(String ciudadProveedor) {
        this.ciudadProveedor = ciudadProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
    // Constructor

    public Proveedor(int idProveedor, String nombreProveedor, String ciudadProveedor, String direccionProveedor, String telefonoProveedor, Comuna comuna, List<Producto> productos) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.ciudadProveedor = ciudadProveedor;
        this.direccionProveedor = direccionProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.comuna = comuna;
        this.productos = productos;
    }
    
    
}
