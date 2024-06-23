
package MisClases;

import java.util.Date;

public class CarritoDeCompra {
    
    private int idCarritoCompra;
    private int cantidad;
    private Producto producto;
    private Usuario usuario;
    private Date fecha;

    public int getIdCarritoCompra() {
        return idCarritoCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setIdCarritoCompra(int idCarritoCompra) {
        this.idCarritoCompra = idCarritoCompra;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public CarritoDeCompra(int idCarritoCompra, int cantidad, Producto producto, Usuario usuario, Date fecha) {
        this.idCarritoCompra = idCarritoCompra;
        this.cantidad = cantidad;
        this.producto = producto;
        this.usuario = usuario;
        this.fecha = fecha;
    }
    
    
}
