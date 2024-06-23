
package MisClases;

import java.util.Date;
import java.util.List;


public class Factura {
    private int idFactura;
    private Date fechaFactura;
    private double valorTotal;
    private Usuario usuario;
    private List<FacturaDetalle> detalles;
    
    // Getters

    public int getIdFactura() {
        return idFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<FacturaDetalle> getDetalles() {
        return detalles;
    }
    
    
    // Setters

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDetalles(List<FacturaDetalle> detalles) {
        this.detalles = detalles;
    }
    
    
    // Constructor

    public Factura(int idFactura, Date fechaFactura, double valorTotal, Usuario usuario, List<FacturaDetalle> detalles) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.valorTotal = valorTotal;
        this.usuario = usuario;
        this.detalles = detalles;
    }
    
    
}
