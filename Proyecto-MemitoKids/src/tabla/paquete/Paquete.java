package tabla.paquete;

public class Paquete {

    private int paqueteId;
    private String nombrePaquete;
    private String descripcion;
    private double precio;

    // PARA LA BUSQUEDA POR PAQUETE ID
    public Paquete(int paqueteId) {
        this.paqueteId = paqueteId;
    }

    // PARA LA BUSQUEDA POR NOMBRE PAQUETE
    public Paquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public Paquete() {
    }

    public int getPaqueteId() {
        return paqueteId;
    }

    public void setPaqueteId(int paqueteId) {
        this.paqueteId = paqueteId;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
