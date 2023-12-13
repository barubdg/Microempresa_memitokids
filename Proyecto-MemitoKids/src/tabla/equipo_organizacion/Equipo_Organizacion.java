package tabla.equipo_organizacion;

public class Equipo_Organizacion
{
    private int equipoId;
    private String nombreEquipo;   

    public Equipo_Organizacion() {
    }

    public Equipo_Organizacion(int equipoId) {
        this.equipoId = equipoId;
    }
    
    
    

    public int getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(int equipoId) {
        this.equipoId = equipoId;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
    
    
}
