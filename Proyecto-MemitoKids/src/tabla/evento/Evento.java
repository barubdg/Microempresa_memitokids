package tabla.evento;

import tabla.cliente.Cliente;
import tabla.paquete.Paquete;
import tabla.presupuesto_evento.Presupuesto_evento;
import tabla.reserva.Reserva;
import tabla.ubicacion.Ubicacion;

public class Evento {
    private int eventoId;
    private String nombreEvento;
    private int ubicacionId;
    private int clienteId;
    private Ubicacion ubicacion;
    private Cliente cliente;
    private Paquete paquete;
    private Reserva reserva;
    private Presupuesto_evento presupuesto_evento;
    

    public Evento() {
        ubicacion = new Ubicacion();
        cliente = new Cliente();
        paquete = new Paquete();
        reserva = new Reserva();
        presupuesto_evento = new Presupuesto_evento();
    }

    public Evento(int eventoId) {
        this.eventoId = eventoId;
        ubicacion = new Ubicacion();
        cliente = new Cliente();
        paquete = new Paquete();
        reserva = new Reserva();
        presupuesto_evento = new Presupuesto_evento();
    }
    
    
    
    public Evento(Cliente cliente, Ubicacion ubicacion)     
    {
        this();
        this.cliente=cliente;
        this.ubicacion=ubicacion;
    }

    public Evento(Ubicacion ubicacion, Cliente cliente, Paquete paquete, Reserva reserva, Presupuesto_evento presupuesto_evento) {
        this();
        this.ubicacion = ubicacion;
        this.cliente = cliente;
        this.paquete = paquete;
        this.reserva = reserva;
        this.presupuesto_evento = presupuesto_evento;
    }
    
    

    
    
    
    public Ubicacion getUbicacion() {return ubicacion;}
    public Cliente getCliente() {return cliente;}
    public Paquete getPaquete() {return paquete;}
    public Reserva getReserva() {return reserva;}
    public Presupuesto_evento getPresupuesto_evento() {return presupuesto_evento;}
    
    
    
    
    
    public int getEventoId() {return eventoId;}
    public void setEventoId(int eventoId) {this.eventoId = eventoId;}

    public String getNombreEvento() {return nombreEvento;}
    public void setNombreEvento(String nombreEvento) {this.nombreEvento = nombreEvento;}

    public int getUbicacionId() {return ubicacionId;}
    public void setUbicacionId(int ubicacionId) {this.ubicacionId = ubicacionId;}

    public int getClienteId() {return clienteId;}
    public void setClienteId(int clienteId) {this.clienteId = clienteId;}
    
    
    
}
