
package MisClases;

import java.util.Date;

public class Pedido {
    private int idPedido;
    private Date fechaPedido;
    private CarritoDeCompra carritoDeCompra;    

    public int getIdPedido() {
        return idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public CarritoDeCompra getCarritoDeCompra() {
        return carritoDeCompra;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setCarritoDeCompra(CarritoDeCompra carritoDeCompra) {
        this.carritoDeCompra = carritoDeCompra;
    }

    public Pedido(int idPedido, Date fechaPedido, CarritoDeCompra carritoDeCompra) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.carritoDeCompra = carritoDeCompra;
    }
    
    
}
