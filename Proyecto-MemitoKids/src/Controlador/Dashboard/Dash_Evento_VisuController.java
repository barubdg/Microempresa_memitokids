package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.evento.Evento;
import vista.db_popmenu_opciones_evento.popmenu_visualizar_evento;

public class Dash_Evento_VisuController implements ActionListener {
    
    private Evento modelEvento;
    private popmenu_visualizar_evento visuEv_view;
    private DashboardDAO dash_DAO;

    public Dash_Evento_VisuController(Evento modelEvento, popmenu_visualizar_evento visuEv_view) {
        this.modelEvento = modelEvento;
        this.visuEv_view = visuEv_view;
        dash_DAO = new DashboardDAOImpl();
        
        
        CargarDatosVisualizar();
        
        visuEv_view.btn_cancelar_evento.addActionListener(this);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == visuEv_view.btn_cancelar_evento)
        {visuEv_view.dispose();}
    }
    
    
    public void CargarDatosVisualizar()
    {
        visuEv_view.txt_idubicacion.setText(String.valueOf(modelEvento.getUbicacion().getUbicacionId()));
        visuEv_view.txt_idcliente.setText(String.valueOf(modelEvento.getCliente().getClienteId()));
        visuEv_view.txt_idpaquete.setText(String.valueOf(modelEvento.getPaquete().getPaqueteId()));
        visuEv_view.txt_idevento.setText(String.valueOf(modelEvento.getEventoId()));
        visuEv_view.txt_idreserva.setText(String.valueOf(modelEvento.getReserva().getReservaId()));
        visuEv_view.txt_idpresupuesto.setText(String.valueOf(modelEvento.getPresupuesto_evento().getPresupuestoId()));
        
        
        visuEv_view.txt_nombreubicacion.setText(modelEvento.getUbicacion().getNombreUbicacion());
        visuEv_view.txt_direccion.setText(modelEvento.getUbicacion().getDireccion());
        
        visuEv_view.cbx_cliente.addItem(modelEvento.getCliente().getApellido());
        
        visuEv_view.cbx_paquete.addItem(modelEvento.getPaquete().getNombrePaquete());
        
        visuEv_view.txt_nombre_evento.setText(modelEvento.getNombreEvento());
        
        visuEv_view.txt_fechareserva.setText(modelEvento.getReserva().getFechaReserva());
        
        visuEv_view.txt_presupuesto.setText(String.valueOf(modelEvento.getPresupuesto_evento().getPrecio()));
        
    }
}
    
