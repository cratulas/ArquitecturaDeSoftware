
package MisClases;


public class Inventario {
    private int idInventario;
    private int cantidadInicialProducto;
    private int cantidadDisponibleProducto;
    private Producto producto;
    
    //Getters
    public int getIdInventario() {
        return idInventario;
    }

    public int getCantidadInicialProducto() {
        return cantidadInicialProducto;
    }

    public int getCantidadDisponibleProducto() {
        return cantidadDisponibleProducto;
    }

    public Producto getProducto() {
        return producto;
    }
    
    //Setters

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public void setCantidadInicialProducto(int cantidadInicialProducto) {
        this.cantidadInicialProducto = cantidadInicialProducto;
    }

    public void setCantidadDisponibleProducto(int cantidadDisponibleProducto) {
        this.cantidadDisponibleProducto = cantidadDisponibleProducto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
        
    //Constructor

    public Inventario(int idInventario, int cantidadInicialProducto, int cantidadDisponibleProducto, Producto producto) {
        this.idInventario = idInventario;
        this.cantidadInicialProducto = cantidadInicialProducto;
        this.cantidadDisponibleProducto = cantidadDisponibleProducto;
        this.producto = producto;
    }
    
    
}
