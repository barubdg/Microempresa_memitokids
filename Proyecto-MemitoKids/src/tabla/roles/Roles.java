package tabla.roles;

public class Roles {
    private int rol_id;
    private String nombre_rol;
    private int usuario_id;

    public Roles() {
    }

    public Roles(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
    
    
    
    
    
    
    
    

    public int getRol_id() {return rol_id;}
    public void setRol_id(int rol_id) {this.rol_id = rol_id;}

    public String getNombre_rol() {return nombre_rol;}
    public void setNombre_rol(String nombre_rol) { this.nombre_rol = nombre_rol;}

    public int getUsuario_id() {return usuario_id;}
    public void setUsuario_id(int usuario_id) {this.usuario_id = usuario_id;}
    
    
}
