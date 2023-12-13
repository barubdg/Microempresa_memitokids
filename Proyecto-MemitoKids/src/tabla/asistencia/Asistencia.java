package tabla.asistencia;

import tabla.empleado.Empleado;
import tabla.equipo_organizacion.Equipo_Organizacion;
import tabla.evento.Evento;

public class Asistencia {

    private int asistenciaId;
    private int eventoId;
    private int empleadoId;
    private int equipoId;
    
    
    
    private Empleado emp;
    private Equipo_Organizacion eq_org;
    private Evento even;

    public Asistencia()
    {
        emp = new Empleado();
        eq_org = new Equipo_Organizacion();
        even = new Evento();
    }

    public Asistencia(int asistenciaId) {
        this.asistenciaId = asistenciaId;
        emp = new Empleado();
        eq_org = new Equipo_Organizacion();
        even = new Evento();
    }
    
    
    
    
    

    public Asistencia(Empleado emp, Equipo_Organizacion eq_org) {
        this.emp = emp;
        this.eq_org = eq_org;
    }

    public Asistencia(Empleado emp, Equipo_Organizacion eq_org, Evento even) {
        this.emp = emp;
        this.eq_org = eq_org;
        this.even = even;
    }
    
    
    

    public Evento getEven() {
        return even;
    }

    public Empleado getEmp() {
        return emp;
    }

    public Equipo_Organizacion getEq_org() {
        return eq_org;
    }
    
    
    
    
    
    
    

    public int getAsistenciaId() {
        return asistenciaId;
    }

    public void setAsistenciaId(int asistenciaId) {
        this.asistenciaId = asistenciaId;
    }

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public int getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(int equipoId) {
        this.equipoId = equipoId;
    }
    
    
    
}
