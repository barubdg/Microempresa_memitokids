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
import vista.db_popmenu_opciones_asistencia.popmenu_actualizar_asistencia;

public class Dash_Asistencia_ActController implements ActionListener{
    private Asistencia modelAsistencia;
    private popmenu_actualizar_asistencia actAs_view;
    private DashboardDAO dash_DAO;

    public Dash_Asistencia_ActController(Asistencia modelAsistencia, popmenu_actualizar_asistencia actAs_view) {
        this.modelAsistencia = modelAsistencia;
        this.actAs_view = actAs_view;
        dash_DAO = new DashboardDAOImpl();
        
        actAs_view.txt_idasistencia.setText(String.valueOf(modelAsistencia.getAsistenciaId()));
        
        cargarEventoEnComboBox();
        cargarEquipoEnComboBox();
        cargarEmpleadoEnComboBox();
        
        actAs_view.btn_actualizar_asistencia.addActionListener(this);
        actAs_view.btn_cancelar_asistencia.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == actAs_view.btn_actualizar_asistencia){RegistrarEquipo();}
        else if(e.getSource() == actAs_view.btn_cancelar_asistencia){actAs_view.dispose();}
            
            
    }
    
    
    private void RegistrarEquipo()
    {
        int idEvento = Integer.parseInt(actAs_view.txt_idevento.getText());
        int idEquipo = Integer.parseInt(actAs_view.txt_idequipo.getText());
        int idEmpleado = Integer.parseInt(actAs_view.txt_idempleado.getText());
        int idAsistencia = Integer.parseInt(actAs_view.txt_idasistencia.getText());
        
        modelAsistencia.setEventoId(idEvento);
        modelAsistencia.setEquipoId(idEquipo);
        modelAsistencia.setEmpleadoId(idEmpleado);
        modelAsistencia.setAsistenciaId(idAsistencia);
        
        dash_DAO.ActualizarDatosSeleccionadosAsistencia(modelAsistencia);
        actAs_view.dispose();
    }
    
    
    
    
    /* SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE - SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE*/
    private void cargarEventoEnComboBox() {
        List<Evento> eventos = dash_DAO.obtenerEventos();
        // Limpia el modelo actual del JComboBox
        actAs_view.cbx_evento.setModel(new DefaultComboBoxModel<>());
        // Agrega cada EVENTO al JComboBox solo con el NOMBRE
        for (Evento evento : eventos) {
            actAs_view.cbx_evento.addItem(evento.getNombreEvento());
        }
        actAs_view.cbx_evento.setSelectedItem(modelAsistencia.getEven().getNombreEvento());
        
        String eventoseleccionado = (String) actAs_view.cbx_evento.getSelectedItem();
        int obtidEvento = obtenerIdEventoPorNombre(eventoseleccionado);
        actAs_view.txt_idevento.setText(String.valueOf(obtidEvento));
        
        // Agrega un ActionListener al JComboBox para manejar eventos de selección
        actAs_view.cbx_evento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el apellido)
                String nombreSeleccionado = (String) actAs_view.cbx_evento.getSelectedItem();
                // Obtén el ID del cliente correspondiente al apellido seleccionado
                int idEvento = obtenerIdEventoPorNombre(nombreSeleccionado);
                // Actualiza el texto del JLabel con el ID del cliente
                actAs_view.txt_idevento.setText(String.valueOf(idEvento));
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
        actAs_view.cbx_equipo.setModel(new DefaultComboBoxModel<>());

        // Agrega cada Equipo al JComboBox solo con el NOMBRE
        for (Equipo_Organizacion equipo : equipos) {
            actAs_view.cbx_equipo.addItem(equipo.getNombreEquipo());
        }

        actAs_view.cbx_equipo.setSelectedItem(modelAsistencia.getEq_org().getNombreEquipo());
        
        String equiposeleccionado = (String) actAs_view.cbx_equipo.getSelectedItem();
        int idEquipo = obtenerIdEquipoPorNombre(equiposeleccionado);
        actAs_view.txt_idequipo.setText(String.valueOf(idEquipo));
        
        // Agrega un ActionListener al JComboBox para manejar Equipos de selección
        actAs_view.cbx_equipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el NOMBRE)
                String nombreSeleccionado = (String) actAs_view.cbx_equipo.getSelectedItem();

                // Obtén el ID del Equipo correspondiente al NOMBRE seleccionado
                int idEquipo = obtenerIdEquipoPorNombre(nombreSeleccionado);

                // Actualiza el texto del JLabel con el ID del Equipo
                actAs_view.txt_idequipo.setText(String.valueOf(idEquipo));
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
        actAs_view.cbx_empleado.setModel(new DefaultComboBoxModel<>());

        // Agrega cada Empleado al JComboBox solo con el NOMBRE
        for (Empleado empleado : empleados) {
            actAs_view.cbx_empleado.addItem(empleado.getNombre() + " " + empleado.getApellido());
        }

        actAs_view.cbx_empleado.setSelectedItem(modelAsistencia.getEmp().getNombre() + " " + modelAsistencia.getEmp().getApellido());
        
        String empleadoseleccionado = (String) actAs_view.cbx_empleado.getSelectedItem();
        int idEmpleado = obtenerIdEmpleadoPorApellido(empleadoseleccionado);
        actAs_view.txt_idempleado.setText(String.valueOf(idEmpleado));
        
        // Agrega un ActionListener al JComboBox para manejar Empleados de selección
        actAs_view.cbx_empleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el APELLIDO)
                String apellidoSeleccionado = (String) actAs_view.cbx_empleado.getSelectedItem();

                // Obtén el ID del Equipo correspondiente al APELLIDO seleccionado
                int idEmpleado = obtenerIdEmpleadoPorApellido(apellidoSeleccionado);

                // Actualiza el texto del JLabel con el ID del Equipo
                actAs_view.txt_idempleado.setText(String.valueOf(idEmpleado));
            }
        });
    }
    // Método auxiliar para obtener el ID del EMPLEADO por el APELLIDO
    private int obtenerIdEmpleadoPorApellido(String apellido) {
        List<Empleado> empleados = dash_DAO.obtenerEmpleados();
        for (Empleado empleado : empleados) {
            String NombreApellidoEmpleado = empleado.getNombre() + " " + empleado.getApellido();
            if (NombreApellidoEmpleado.equals(apellido)) {
                return empleado.getEmpleadoId();
            }
        }
        return -1; // Retorna -1 si no se encuentra el EMPLEADO (ajusta según tus necesidades)
    }
    
    
    
    /* FIN SIRVE PARA CARGAR EMPLEADO EN EL JCOMBOBOX Y OBTENER EL IDEMPLEADO POR APELLIDO - FIN SIRVE PARA CARGAR EMPLEADO EN EL JCOMBOBOX Y OBTENER EL IDEMPLEADO POR APELLIDO*/

    
    
}
