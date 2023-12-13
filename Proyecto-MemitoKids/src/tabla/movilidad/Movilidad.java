package tabla.movilidad;

public class Movilidad {
    
    private int movilidadId;
    private int eventoId;
    private String descripcion;
    private double costo;

    public Movilidad() {
    }

    public int getMovilidadId() {
        return movilidadId;
    }

    public void setMovilidadId(int movilidadId) {
        this.movilidadId = movilidadId;
    }

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    
}
