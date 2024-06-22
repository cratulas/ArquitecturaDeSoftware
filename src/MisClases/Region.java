
package MisClases;

import java.util.List;

public class Region {

    private int idRegion;
    private String nombreRegion;
    private List<Comuna> comunas;

    //Setters
    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public void setComunas(List<Comuna> comunas) {
        this.comunas = comunas;
    }

    // Getters
    public int getIdRegion() {
        return idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public List<Comuna> getComunas() {
        return comunas;
    }

    // Constructor
    public Region(int idRegion, String nombreRegion, List<Comuna> comunas) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
        this.comunas = comunas;
    }
    
    
    
    
    
}
