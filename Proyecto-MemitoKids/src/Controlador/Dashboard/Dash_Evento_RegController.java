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
import vista.dashboard.dashboard_principal;
import vista.db_popmenu_opciones_evento.popmenu_registrar_evento;

public class Dash_Evento_RegController implements ActionListener {

    private Evento modelEvento;
    private popmenu_registrar_evento regEv_view;
    private dashboard_principal dashview;
    private DashboardDAO dash_DAO;

    public Dash_Evento_RegController(Evento modelEvento, popmenu_registrar_evento regEv_view) {
        this.modelEvento = modelEvento;
        this.regEv_view = regEv_view;
        dash_DAO = new DashboardDAOImpl();

        // Llama al método para inicializar el JComboBox con los clientes
        cargarClientesEnComboBox();
        cargarPaquetesEnComboBox();

        regEv_view.btn_registrar_evento.addActionListener(this);
        regEv_view.btn_cancelar_evento.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == regEv_view.btn_registrar_evento)
        {RegistrarEvento();
         regEv_view.dispose();}
        else if (e.getSource() == regEv_view.btn_cancelar_evento) {regEv_view.dispose();}

    }

    /* SIRVE PARA CARGAR CLIENTE EN EL JCOMBOBOX Y OBTENER EL IDCLIENTE POR APELLIDO - SIRVE PARA CARGAR CLIENTE EN EL JCOMBOBOX Y OBTENER EL IDCLIENTE POR APELLIDO*/
    private void cargarClientesEnComboBox() {
        List<Cliente> clientes = dash_DAO.obtenerClientes();

        // Limpia el modelo actual del JComboBox
        regEv_view.cbx_cliente.setModel(new DefaultComboBoxModel<>());

        // Agrega cada cliente al JComboBox solo con el apellido
        for (Cliente cliente : clientes) {
            regEv_view.cbx_cliente.addItem(cliente.getApellido());
        }

        // Agrega un ActionListener al JComboBox para manejar eventos de selección
        regEv_view.cbx_cliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el apellido)
                String apellidoSeleccionado = (String) regEv_view.cbx_cliente.getSelectedItem();

                // Obtén el ID del cliente correspondiente al apellido seleccionado
                int idCliente = obtenerIdClientePorApellido(apellidoSeleccionado);

                // Actualiza el texto del JLabel con el ID del cliente
                regEv_view.txt_idcliente.setText(String.valueOf(idCliente));
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
        regEv_view.cbx_paquete.setModel(new DefaultComboBoxModel<>());

        // Agrega cada paquete al JComboBox solo con el nombre
        for (Paquete paquete : paquetes) {
            regEv_view.cbx_paquete.addItem(paquete.getNombrePaquete());
        }

        // Agrega un ActionListener al JComboBox para manejar eventos de selección
        regEv_view.cbx_paquete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el apellido)
                String nombreSeleccionado = (String) regEv_view.cbx_paquete.getSelectedItem();

                // Obtén el ID del paquete correspondiente al nombre seleccionado
                int idPaquete = obtenerIdPaquetePorNombre(nombreSeleccionado);

                // Actualiza el texto del JLabel con el ID del paquete
                regEv_view.txt_idpaquete.setText(String.valueOf(idPaquete));
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
 
    private void RegistrarEvento() {
        int id_cliente = Integer.parseInt(regEv_view.txt_idcliente.getText());
        int id_paquete = Integer.parseInt(regEv_view.txt_idpaquete.getText());
        
        // PARA LA TABLA UBICACION
        String nombre_ubicacion = regEv_view.txt_nombreubicacion.getText();
        String direccion = regEv_view.txt_direccion.getText();
        
        // PARA LA TABLA EVENTO
        String nombre_evento = regEv_view.txt_nombre_evento.getText();
        
        // PARA LA TABLA RESERVA
        String fecha_reserva = regEv_view.txt_fechareserva.getText();

        // PARA LA TABLA PRESUPUESTO
        double precio_presupuesto = Double.parseDouble(regEv_view.txt_presupuesto.getText());
        
        modelEvento.getUbicacion().setNombreUbicacion(nombre_ubicacion);
        modelEvento.getUbicacion().setDireccion(direccion);
        modelEvento.setNombreEvento(nombre_evento);
        modelEvento.getReserva().setFechaReserva(fecha_reserva);
        modelEvento.getPresupuesto_evento().setPrecio(precio_presupuesto);
        modelEvento.getCliente().setClienteId(id_cliente);
        modelEvento.getPaquete().setPaqueteId(id_paquete);
        
        dash_DAO.RegistrarEvento(modelEvento);
        regEv_view.dispose();
    }
    
    
    
}
