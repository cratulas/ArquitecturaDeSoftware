    
package MisClases;

import java.util.List;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double valorProducto;
    private String descripcion;
    private Proveedor proveedor;
    private List<FacturaDetalle> detalles;
    private List<Inventario> inventarios;
    
    // Getters

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getValorProducto() {
        return valorProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public List<FacturaDetalle> getDetalles() {
        return detalles;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }
    
    
    // Setters

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setDetalles(List<FacturaDetalle> detalles) {
        this.detalles = detalles;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }
    
    
    // Constructor

    public Producto(int idProducto, String nombreProducto, double valorProducto, String descripcion, Proveedor proveedor, List<FacturaDetalle> detalles, List<Inventario> inventarios) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.detalles = detalles;
        this.inventarios = inventarios;
    }
    
    
}
