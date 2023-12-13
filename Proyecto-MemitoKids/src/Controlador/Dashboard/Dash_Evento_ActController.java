package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.cliente.Cliente;
import tabla.evento.Evento;
import tabla.paquete.Paquete;
import vista.db_popmenu_opciones_evento.popmenu_actualizar_evento;

public class Dash_Evento_ActController implements ActionListener {
    
    private Evento modelEvento;
    private popmenu_actualizar_evento actEv_view;
    private DashboardDAO dash_DAO;

    public Dash_Evento_ActController(Evento modelEvento, popmenu_actualizar_evento actEv_view) {
        this.modelEvento = modelEvento;
        this.actEv_view = actEv_view;
        dash_DAO = new DashboardDAOImpl();
        
        CargarDatosVisualizar();
        cargarClientesEnComboBox();
        cargarPaquetesEnComboBox();
        actEv_view.btn_actualizar_evento.addActionListener(this);
        actEv_view.btn_cancelar_evento.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == actEv_view.btn_actualizar_evento)
        {ActualizarEvento();}
        else if(e.getSource() == actEv_view.btn_cancelar_evento){actEv_view.dispose();}
    }
    
    public void CargarDatosVisualizar()
    {
        actEv_view.txt_idubicacion.setText(String.valueOf(modelEvento.getUbicacion().getUbicacionId()));
        actEv_view.txt_idcliente.setText(String.valueOf(modelEvento.getCliente().getClienteId()));
        actEv_view.txt_idpaquete.setText(String.valueOf(modelEvento.getPaquete().getPaqueteId()));
        actEv_view.txt_idevento.setText(String.valueOf(modelEvento.getEventoId()));
        actEv_view.txt_idreserva.setText(String.valueOf(modelEvento.getReserva().getReservaId()));
        actEv_view.txt_idpresupuesto.setText(String.valueOf(modelEvento.getPresupuesto_evento().getPresupuestoId()));
        
        
        actEv_view.txt_nombreubicacion.setText(modelEvento.getUbicacion().getNombreUbicacion());
        actEv_view.txt_direccion.setText(modelEvento.getUbicacion().getDireccion());
        
        actEv_view.cbx_cliente.addItem(modelEvento.getCliente().getApellido());
        
        actEv_view.cbx_paquete.addItem(modelEvento.getPaquete().getNombrePaquete());
        
        actEv_view.txt_nombre_evento.setText(modelEvento.getNombreEvento());
        
        actEv_view.txt_fechareserva.setText(modelEvento.getReserva().getFechaReserva());
        
        actEv_view.txt_presupuesto.setText(String.valueOf(modelEvento.getPresupuesto_evento().getPrecio()));
        
    }
    
    /* SIRVE PARA CARGAR CLIENTE EN EL JCOMBOBOX Y OBTENER EL IDCLIENTE POR APELLIDO - SIRVE PARA CARGAR CLIENTE EN EL JCOMBOBOX Y OBTENER EL IDCLIENTE POR APELLIDO*/
    private void cargarClientesEnComboBox() {
        List<Cliente> clientes = dash_DAO.obtenerClientes();

        // Limpia el modelo actual del JComboBox
        actEv_view.cbx_cliente.setModel(new DefaultComboBoxModel<>());

        // Agrega cada cliente al JComboBox solo con el apellido
        for (Cliente cliente : clientes) {
            actEv_view.cbx_cliente.addItem(cliente.getApellido());
        }
        
        /*CARGAR EL CLIENTE SELECCIONADO DEL COMBOBOX JUNTO CON LOS ITEMS EXISTENTES*/
        actEv_view.cbx_cliente.setSelectedItem(modelEvento.getCliente().getApellido());
        
        String clienteapellidoseleccionado = (String) actEv_view.cbx_cliente.getSelectedItem();
        int idCliente = obtenerIdClientePorApellido(clienteapellidoseleccionado);
        actEv_view.txt_idcliente.setText(String.valueOf(idCliente));

        // Agrega un ActionListener al JComboBox para manejar eventos de selección
        actEv_view.cbx_cliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el apellido)
                String apellidoSeleccionado = (String) actEv_view.cbx_cliente.getSelectedItem();

                // Obtén el ID del cliente correspondiente al apellido seleccionado
                int idCliente = obtenerIdClientePorApellido(apellidoSeleccionado);

                // Actualiza el texto del JLabel con el ID del cliente
                actEv_view.txt_idcliente.setText(String.valueOf(idCliente));
            }
        });
    }
    // Método auxiliar para obtener el ID del cliente por el apellido
    private int obtenerIdClientePorApellido(String apellido) {
        List<Cliente> clientes = dash_DAO.obtenerClientes();
        for (Cliente cliente : clientes) {
            if (cliente.getApellido().equals(apellido)) {
                return cliente.getClienteId();
            }
        }
        return -1; // Retorna -1 si no se encuentra el cliente (ajusta según tus necesidades)
    }
    /* FIN SIRVE PARA CARGAR CLIENTE EN EL JCOMBOBOX Y OBTENER EL IDCLIENTE POR APELLIDO - FIN SIRVE PARA CARGAR CLIENTE EN EL JCOMBOBOX Y OBTENER EL IDCLIENTE POR APELLIDO*/    
    
    /* SIRVE PARA CARGAR PAQUETE EN EL JCOMBOBOX Y OBTENER EL IDPAQUETE POR NOMBRE - SIRVE PARA CARGAR PAQUETE EN EL JCOMBOBOX Y OBTENER EL IDPAQUETE POR NOMBRE*/
    private void cargarPaquetesEnComboBox() {
        List<Paquete> paquetes = dash_DAO.obtenerPaquetes();

        // Limpia el modelo actual del JComboBox
        actEv_view.cbx_paquete.setModel(new DefaultComboBoxModel<>());

        // Agrega cada paquete al JComboBox solo con el nombre
        for (Paquete paquete : paquetes) {
            actEv_view.cbx_paquete.addItem(paquete.getNombrePaquete());
        }
        
        /*CARGAR EL PAQUETE SELECCIONADO DEL COMBOBOX JUNTO CON LOS ITEMS EXISTENTES*/
        actEv_view.cbx_paquete.setSelectedItem(modelEvento.getPaquete().getNombrePaquete());
        
        String nombrepaqueteseleccionado = (String) actEv_view.cbx_paquete.getSelectedItem();
        int idPaquete = obtenerIdPaquetePorNombre(nombrepaqueteseleccionado);
        actEv_view.txt_idpaquete.setText(String.valueOf(idPaquete));

        // Agrega un ActionListener al JComboBox para manejar eventos de selección
        actEv_view.cbx_paquete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el apellido)
                String nombreSeleccionado = (String) actEv_view.cbx_paquete.getSelectedItem();

                // Obtén el ID del paquete correspondiente al nombre seleccionado
                int idPaquete = obtenerIdPaquetePorNombre(nombreSeleccionado);

                // Actualiza el texto del JLabel con el ID del paquete
                actEv_view.txt_idpaquete.setText(String.valueOf(idPaquete));
            }
        });
    }
    // Método auxiliar para obtener el ID del paquete por el nombre
    private int obtenerIdPaquetePorNombre(String nombre) {
        List<Paquete> paquetes = dash_DAO.obtenerPaquetes();
        for (Paquete paquete : paquetes) {
            if (paquete.getNombrePaquete().equals(nombre)) {
                return paquete.getPaqueteId();
            }
        }
        return -1; // Retorna -1 si no se encuentra el paquete
    }
    /* FIN SIRVE PARA CARGAR PAQUETE EN EL JCOMBOBOX Y OBTENER EL IDPAQUETE POR NOMBRE - FIN SIRVE PARA CARGAR PAQUETE EN EL JCOMBOBOX Y OBTENER EL IDPAQUETE POR NOMBRE*/
    
    private void ActualizarEvento() {
        int id_ubicacion = Integer.parseInt(actEv_view.txt_idubicacion.getText());
        int id_cliente = Integer.parseInt(actEv_view.txt_idcliente.getText());
        int id_paquete = Integer.parseInt(actEv_view.txt_idpaquete.getText());
        int id_evento = Integer.parseInt(actEv_view.txt_idevento.getText());
        int id_reserva = Integer.parseInt(actEv_view.txt_idreserva.getText());
        int id_presupuesto = Integer.parseInt(actEv_view.txt_idpresupuesto.getText());
        
        // PARA LA TABLA UBICACION
        String nombre_ubicacion = actEv_view.txt_nombreubicacion.getText();
        String direccion = actEv_view.txt_direccion.getText();
        
        // PARA LA TABLA EVENTO
        String nombre_evento = actEv_view.txt_nombre_evento.getText();
        
        // PARA LA TABLA RESERVA
        String fecha_reserva = actEv_view.txt_fechareserva.getText();

        // PARA LA TABLA PRESUPUESTO
        double precio_presupuesto = Double.parseDouble(actEv_view.txt_presupuesto.getText());
        
        modelEvento.getUbicacion().setNombreUbicacion(nombre_ubicacion);
        modelEvento.getUbicacion().setDireccion(direccion);
        modelEvento.setNombreEvento(nombre_evento);
        modelEvento.getReserva().setFechaReserva(fecha_reserva);
        modelEvento.getPresupuesto_evento().setPrecio(precio_presupuesto);
        modelEvento.getUbicacion().setUbicacionId(id_ubicacion);
        modelEvento.getCliente().setClienteId(id_cliente);
        modelEvento.getPaquete().setPaqueteId(id_paquete);
        modelEvento.setEventoId(id_evento);
        modelEvento.getReserva().setReservaId(id_reserva);
        modelEvento.getPresupuesto_evento().setPresupuestoId(id_presupuesto);
        
        dash_DAO.ActualizarDatosSeleccionadosEvento(modelEvento);
        actEv_view.dispose();
    }
    
}
