package MisClases;

public class Administrador {

    private int idAdmin;
    private String nombreAdmin;
    private String rutAdmin;
    private String cargo;
    private String telefonoAdmin;
    
    //Getters

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNombreAdmin() {
        return nombreAdmin;
    }

    public String getRutAdmin() {
        return rutAdmin;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTelefonoAdmin() {
        return telefonoAdmin;
    }
    
    
    // Setters

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setNombreAdmin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    public void setRutAdmin(String rutAdmin) {
        this.rutAdmin = rutAdmin;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTelefonoAdmin(String telefonoAdmin) {
        this.telefonoAdmin = telefonoAdmin;
    }
    
    // Constructor

    public Administrador(int idAdmin, String nombreAdmin, String rutAdmin, String cargo, String telefonoAdmin) {
        this.idAdmin = idAdmin;
        this.nombreAdmin = nombreAdmin;
        this.rutAdmin = rutAdmin;
        this.cargo = cargo;
        this.telefonoAdmin = telefonoAdmin;
    }
    
}
