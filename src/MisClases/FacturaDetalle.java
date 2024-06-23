
package MisClases;


public class FacturaDetalle {
    
    private int idDetalleFactura;
    private int cantidad;
    private double precioUnitario;
    private Factura factura;
    private Producto producto;
    
    // Getters 

    public int getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public Factura getFactura() {
        return factura;
    }

    public Producto getProducto() {
        return producto;
    }
    
    
    // Setters

    public void setIdDetalleFactura(int idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    // Constructor

    public FacturaDetalle(int idDetalleFactura, int cantidad, double precioUnitario, Factura factura, Producto producto) {
        this.idDetalleFactura = idDetalleFactura;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.factura = factura;
        this.producto = producto;
    }
    
    
}
