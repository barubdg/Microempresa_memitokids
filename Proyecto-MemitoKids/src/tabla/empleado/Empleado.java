package tabla.empleado;

import tabla.roles.Roles;
import tabla.usuarios.Usuarios;

public class Empleado {
    private int empleadoId;
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNacimiento;
    private String direccion;
    private String email;
    private String celular;
    private int rolId;
    
    
    
    private Roles rol;
    private Usuarios usu;

    public Empleado() {
        rol = new Roles();
        usu = new Usuarios();
    }

    public Empleado(Roles rol, Usuarios usu) {
        this();
        this.rol = rol;
        this.usu = usu;
    }

    public Roles getRol() {
        return rol;
    }

    public Usuarios getUsu() {
        return usu;
    }
    
    
    
    
    
    
    
    

    public int getEmpleadoId() {
        return empleadoId;
    }
    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public int getRolId() {
        return rolId;
    }
    public void setRolId(int rolId) {
        this.rolId = rolId;
    }
    
    
}
