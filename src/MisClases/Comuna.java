
package MisClases;

import java.util.List;
public class Comuna {
    private int idComuna;
    private String nombre;
    private Region region;
    private List<Usuario> usuarios;
    private List<Proveedor> proveedores;

    
    // Getters
    public int getIdComuna() {
        return idComuna;
    }

    public String getNombre() {
        return nombre;
    }

    public Region getRegion() {
        return region;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    // Setters
    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    // Constructor

    public Comuna(int idComuna, String nombre, Region region, List<Usuario> usuarios, List<Proveedor> proveedores) {
        this.idComuna = idComuna;
        this.nombre = nombre;
        this.region = region;
        this.usuarios = usuarios;
        this.proveedores = proveedores;
    }
    
    
}
