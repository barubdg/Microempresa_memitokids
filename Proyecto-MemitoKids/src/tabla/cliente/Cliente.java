package tabla.cliente;

import tabla.empleado.Empleado;

public class Cliente {
    private int clienteId;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    
    private Empleado modelEmpleado;

    // PARA LA BUSQUEDA POR CLIENTE ID
    public Cliente(int clienteId) {this.clienteId = clienteId;}
    
    // PARA LA BUSQUEDA POR DNI
    public Cliente(String dni) {this.dni = dni;}
    

    public Cliente()
    {

        modelEmpleado = new Empleado();}

    public Empleado getModelEmpleado() {return modelEmpleado;}
    
    
    
    
    

    public int getClienteId() {
        return clienteId;
    }
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
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

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
