
package MisClases;


import java.util.Date;


public class Despacho {

    private int idDespacho;
    private Date fechaDespacho;
    private String direccionEntrega;
    private String estadoDespacho;
    private Pedido pedido;

    // Getters and Setters

    public int getIdDespacho() {
        return idDespacho;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getEstadoDespacho() {
        return estadoDespacho;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setIdDespacho(int idDespacho) {
        this.idDespacho = idDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public void setEstadoDespacho(String estadoDespacho) {
        this.estadoDespacho = estadoDespacho;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Despacho(int idDespacho, Date fechaDespacho, String direccionEntrega, String estadoDespacho, Pedido pedido) {
        this.idDespacho = idDespacho;
        this.fechaDespacho = fechaDespacho;
        this.direccionEntrega = direccionEntrega;
        this.estadoDespacho = estadoDespacho;
        this.pedido = pedido;
    }
    
    
    
}
