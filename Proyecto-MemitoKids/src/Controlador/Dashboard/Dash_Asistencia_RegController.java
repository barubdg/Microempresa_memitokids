package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.asistencia.Asistencia;
import tabla.empleado.Empleado;
import tabla.equipo_organizacion.Equipo_Organizacion;
import tabla.evento.Evento;
import vista.dashboard.dashboard_principal;
import vista.db_popmenu_opciones_asistencia.popmenu_registrar_asistencia;

public class Dash_Asistencia_RegController implements ActionListener{
    
    private Asistencia modelAsistencia;
    private popmenu_registrar_asistencia regEvAs_view;
    private DashboardDAO dash_DAO;

    public Dash_Asistencia_RegController(Asistencia modelAsistencia, popmenu_registrar_asistencia regEvAs_view) {
        this.modelAsistencia = modelAsistencia;
        this.regEvAs_view = regEvAs_view;
        dash_DAO = new DashboardDAOImpl();
 
        // Llama al método para inicializar el JComboBox con los NOMBRE
        cargarEventoEnComboBox();
        cargarEquipoEnComboBox();
        cargarEmpleadoEnComboBox();
        
        regEvAs_view.btn_registrar_asistencia.addActionListener(this);
        regEvAs_view.btn_cancelar_asistencia.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == regEvAs_view.btn_registrar_asistencia)
        {RegistrarEquipo();
         regEvAs_view.dispose();}
        if (e.getSource() == regEvAs_view.btn_cancelar_asistencia){regEvAs_view.dispose();}

    }
    
    private void RegistrarEquipo()
    {
        int idEvento = Integer.parseInt(regEvAs_view.txt_idevento.getText());
        int idEquipo = Integer.parseInt(regEvAs_view.txt_idequipo.getText());
        int idEmpleado = Integer.parseInt(regEvAs_view.txt_idempleado.getText());
        
        modelAsistencia.setEventoId(idEvento);
        modelAsistencia.setEquipoId(idEquipo);
        modelAsistencia.setEmpleadoId(idEmpleado);
        
        dash_DAO.RegistrarAsistencia(modelAsistencia);
    }
    
    /* SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE - SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE*/
    private void cargarEventoEnComboBox() {
        List<Evento> eventos = dash_DAO.obtenerEventos();
        // Limpia el modelo actual del JComboBox
        regEvAs_view.cbx_evento.setModel(new DefaultComboBoxModel<>());
        // Agrega cada EVENTO al JComboBox solo con el NOMBRE
        for (Evento evento : eventos) {regEvAs_view.cbx_evento.addItem(evento.getNombreEvento());}
        // Agrega un ActionListener al JComboBox para manejar eventos de selección
        regEvAs_view.cbx_evento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el apellido)
                String nombreSeleccionado = (String) regEvAs_view.cbx_evento.getSelectedItem();
                // Obtén el ID del cliente correspondiente al apellido seleccionado
                int idEvento = obtenerIdEventoPorNombre(nombreSeleccionado);
                // Actualiza el texto del JLabel con el ID del cliente
                regEvAs_view.txt_idevento.setText(String.valueOf(idEvento));
            }
        });
    }
    // Método auxiliar para obtener el ID del EVENTO por el NOMBRE
    private int obtenerIdEventoPorNombre(String nombre) {
        List<Evento> eventos = dash_DAO.obtenerEventos();
        for (Evento evento : eventos) {
            if (evento.getNombreEvento().equals(nombre)) {
                return evento.getEventoId();
            }
        }
        return -1; // Retorna -1 si no se encuentra el evento
    }
    /* FIN SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE - FIN SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE*/    

    /* SIRVE PARA CARGAR EQUIPO EN EL JCOMBOBOX Y OBTENER EL IDEQUIPO POR NOMBRE - SIRVE PARA CARGAR EQUIPO EN EL JCOMBOBOX Y OBTENER EL IDEQUIPO POR NOMBRE*/
    private void cargarEquipoEnComboBox() {
        List<Equipo_Organizacion> equipos = dash_DAO.obtenerEquipos();

        // Limpia el modelo actual del JComboBox
        regEvAs_view.cbx_equipo.setModel(new DefaultComboBoxModel<>());

        // Agrega cada Equipo al JComboBox solo con el NOMBRE
        for (Equipo_Organizacion equipo : equipos) {
            regEvAs_view.cbx_equipo.addItem(equipo.getNombreEquipo());
        }

        // Agrega un ActionListener al JComboBox para manejar Equipos de selección
        regEvAs_view.cbx_equipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el NOMBRE)
                String nombreSeleccionado = (String) regEvAs_view.cbx_equipo.getSelectedItem();

                // Obtén el ID del Equipo correspondiente al NOMBRE seleccionado
                int idEquipo = obtenerIdEquipoPorNombre(nombreSeleccionado);

                // Actualiza el texto del JLabel con el ID del Equipo
                regEvAs_view.txt_idequipo.setText(String.valueOf(idEquipo));
            }
        });
    }
    // Método auxiliar para obtener el ID del Equipo por el NOMBRE
    private int obtenerIdEquipoPorNombre(String nombre) {
        List<Equipo_Organizacion> equipos = dash_DAO.obtenerEquipos();
        for (Equipo_Organizacion equipo : equipos) {
            if (equipo.getNombreEquipo().equals(nombre)) {
                return equipo.getEquipoId();
            }
        }
        return -1; // Retorna -1 si no se encuentra el Equipo (ajusta según tus necesidades)
    }
    /* FIN SIRVE PARA CARGAR EQUIPO EN EL JCOMBOBOX Y OBTENER EL IDEQUIPO POR NOMBRE - FIN SIRVE PARA CARGAR EQUIPO EN EL JCOMBOBOX Y OBTENER EL IDEQUIPO POR NOMBRE*/    

    /* SIRVE PARA CARGAR EMPLEADO EN EL JCOMBOBOX Y OBTENER EL IDEMPLEADO POR APELLIDO - SIRVE PARA CARGAR EQUIPO EN EL JCOMBOBOX Y OBTENER EL IDEMPLEADO POR APELLIDO*/
    private void cargarEmpleadoEnComboBox() {
        List<Empleado> empleados = dash_DAO.obtenerEmpleados();

        // Limpia el modelo actual del JComboBox
        regEvAs_view.cbx_empleado.setModel(new DefaultComboBoxModel<>());

        // Agrega cada Empleado al JComboBox solo con el NOMBRE
        for (Empleado empleado : empleados) {
            regEvAs_view.cbx_empleado.addItem(empleado.getNombre()+" "+empleado.getApellido());
        }

        // Agrega un ActionListener al JComboBox para manejar Empleados de selección
        regEvAs_view.cbx_empleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el APELLIDO)
                String apellidoSeleccionado = (String) regEvAs_view.cbx_empleado.getSelectedItem();

                // Obtén el ID del Equipo correspondiente al APELLIDO seleccionado
                int idEmpleado = obtenerIdEmpleadoPorApellido(apellidoSeleccionado);

                // Actualiza el texto del JLabel con el ID del Equipo
                regEvAs_view.txt_idempleado.setText(String.valueOf(idEmpleado));
            }
        });
    }
    // Método auxiliar para obtener el ID del EMPLEADO por el APELLIDO
    private int obtenerIdEmpleadoPorApellido(String apellido) {
        List<Empleado> empleados = dash_DAO.obtenerEmpleados();
        for (Empleado empleado : empleados) {
            String NombreApellidoEmpleado = empleado.getNombre()+" "+empleado.getApellido();
            if (NombreApellidoEmpleado.equals(apellido)) {
                return empleado.getEmpleadoId();
            }
        }
        return -1; // Retorna -1 si no se encuentra el EMPLEADO (ajusta según tus necesidades)
    }
    /* FIN SIRVE PARA CARGAR EMPLEADO EN EL JCOMBOBOX Y OBTENER EL IDEMPLEADO POR APELLIDO - FIN SIRVE PARA CARGAR EMPLEADO EN EL JCOMBOBOX Y OBTENER EL IDEMPLEADO POR APELLIDO*/    
    
}
