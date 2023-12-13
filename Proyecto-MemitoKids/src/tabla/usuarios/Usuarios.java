package tabla.usuarios;
public class Usuarios
{
    private int usuario_id;
    private String correo;
    private String contraseña;

    public Usuarios() {
    }

    public Usuarios(String correo) {
        this.correo = correo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public int getUsuario_id() {return usuario_id;}
    public void setUsuario_id(int usuario_id) {this.usuario_id = usuario_id;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}

    public String getContraseña() {return contraseña;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}
    
    
}
