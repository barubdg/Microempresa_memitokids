package modelo.dashboard;

import java.util.List;
import tabla.asistencia.Asistencia;
import tabla.cliente.Cliente;
import tabla.empleado.Empleado;
import tabla.equipo_organizacion.Equipo_Organizacion;
import tabla.evento.Evento;
import tabla.movilidad.Movilidad;
import tabla.paquete.Paquete;
import tabla.roles.Roles;
import tabla.usuarios.Usuarios;

public interface DashboardDAO
{
    /*TABLAS GENERALES*/
    List<Cliente> obtenerClientes();
    List<Empleado> obtenerEmpleados();
    List<Paquete> obtenerPaquetes();
    List<Evento> obtenerEventos();
    List<Equipo_Organizacion> obtenerEquipos();
    List<Asistencia> obtenerAsistencias();
    
    /*TRAER EL EVENTO PARA EL PANEL ASISTENCIA MEDIANTE UN JCOMBOBOX QUE TIENE EL NOMBRE Y EL ID PARA TRAER LOS DATOS DE LA ASISTENCIA POR EVENTO*/
    List<Asistencia> obtenerEventosAsis(int Eventoid);
    
    /*BOTON CLIENTES - BOTON CLIENTES - BOTON CLIENTES - BOTON CLIENTES - BOTON CLIENTES - BOTON CLIENTES - BOTON CLIENTES - BOTON CLIENTES*/
        //REGISTRAR CLIENTE
    void RegistrarCliente(Cliente modelCliente);
        //VISUALIZAR CLIENTE
    Cliente VisualizarDatosSeleccionadosCliente(int codigoID);
        // (VISUALIZAR) - BUSCAR CLIENTE POR DNI
    Cliente VisualizarBuscarCliente(String dni);
        // ACTUALIZAR CLIENTE
    Cliente ActualizarDatosSeleccionadosCliente(Cliente modelCliente);
        // ELIMINAR CLIENTE
    Cliente EliminarDatosSeleccionadosCliente(int codigoID);
    /*FIN BOTON CLIENTES - FIN BOTON CLIENTES - FIN BOTON CLIENTES - FIN BOTON CLIENTES - FIN BOTON CLIENTES - FIN BOTON CLIENTES - FIN BOTON CLIENTES*/
    
    /*BOTON EMPLEADOS - BOTON EMPLEADOS - BOTON EMPLEADOS - BOTON EMPLEADOS - BOTON EMPLEADOS - BOTON EMPLEADOS - BOTON EMPLEADOS - BOTON EMPLEADOS*/
        // REGISTRAR EMPLEADO
    void RegistrarUsuario(Usuarios modelUsuarios);
    Usuarios ObtenerUsuarioInsertado(String correo);
    int RegistrarRoles(Roles modelRoles, Usuarios modelUsuarios);
    void RegistrarEmpleado(Empleado modelEmpleado);
        // FIN REGISTRAR EMPLEADO
    
        // VISUALIZAR EMPLEADO
    Empleado VisualizarDatosSeleccionadosEmpleado(int codigoID);
        // (VISUALIZAR) - BUSCAR CLIENTE POR DNI    
    Empleado VisualizarBuscarEmpleado(String dni);
        // ACTUALIZAR EMPLEADO
    Empleado ActualizarDatosSeleccionadosEmpleado(Empleado modelEmpleado);
        // ELIMINAR EMPLEADO
    Empleado EliminarDatosSeleccionadosEmpleado(int codigoID);
    /*FIN BOTON EMPLEADO - FIN BOTON EMPLEADO - FIN BOTON EMPLEADO - FIN BOTON EMPLEADO - FIN BOTON EMPLEADO - FIN BOTON EMPLEADO - FIN BOTON EMPLEADO*/
    
    /*BOTON PAQUETE - BOTON PAQUETE - BOTON PAQUETE - BOTON PAQUETE - BOTON PAQUETE - BOTON PAQUETE - BOTON PAQUETE - BOTON PAQUETE - BOTON PAQUETE - BOTON PAQUETE*/
        // REGISTRAR PAQUETE
    void RegistrarPaquete(Paquete modelPaquete);
        // VISUALIZAR PAQUETE
    Paquete VisualizarDatosSeleccionadosPaquete(int codigoID);
        // ACTUALIZAR PAQUETE
    Paquete ActualizarDatosSeleccionadosPaquete(Paquete modelPaquete);
        // ELIMINAR PAQUETE
    Paquete EliminarDatosSeleccionadosPaquete(int codigoID);
    /*FIN BOTON PAQUETE - FIN BOTON PAQUETE - FIN BOTON PAQUETE - FIN BOTON PAQUETE - FIN BOTON PAQUETE - FIN BOTON PAQUETE - FIN BOTON PAQUETE - FIN BOTON PAQUETE*/
    
    /*BOTON EVENTO - BOTON EVENTO - BOTON EVENTO - BOTON EVENTO - BOTON EVENTO - BOTON EVENTO - BOTON EVENTO - BOTON EVENTO - BOTON EVENTO - BOTON EVENTO*/
        // REGISTRAR EVENTO
    void RegistrarEvento(Evento modelEvento);
        // VISUALIZAR EVENTO
    Evento VisualizarDatosSeleccionadosEvento(int codigoID);
        // ACTUALIZAR EVENTO
    Evento ActualizarDatosSeleccionadosEvento(Evento modelEvento);
        // ELIMINAR EVENTO
    Evento EliminarDatosSeleccionadosEvento(int codigoID);
    /*FIN BOTON EVENTO - FIN BOTON EVENTO - FIN BOTON EVENTO - FIN BOTON EVENTO - FIN BOTON EVENTO - FIN BOTON EVENTO - FIN BOTON EVENTO - FIN BOTON EVENTO*/
    
    /*BOTON EQUIPO - BOTON EQUIPO - BOTON EQUIPO - BOTON EQUIPO - BOTON EQUIPO - BOTON EQUIPO - BOTON EQUIPO - BOTON EQUIPO - BOTON EQUIPO - BOTON EQUIPO*/
        // REGISTRAR EQUIPO
    void RegistrarEquipo(Equipo_Organizacion modelEquipo);
        // VISUALIZAR EQUIPO
    Equipo_Organizacion VisualizarDatosSeleccionadosEquipo(int codigoID);
        // ACTUALIZAR EQUIPO
    Equipo_Organizacion ActualizarDatosSeleccionadosEquipo(Equipo_Organizacion modelEquipo);
        // ELIMINAR EQUIPO
    Equipo_Organizacion EliminarDatosSeleccionadosEquipo(int codigoID);
    /*FIN BOTON EQUIPO - FIN BOTON EQUIPO - FIN BOTON EQUIPO - FIN BOTON EQUIPO - FIN BOTON EQUIPO - FIN BOTON EQUIPO - FIN BOTON EQUIPO - FIN BOTON EQUIPO*/
    
    /*BOTON ASISTENCIA - BOTON ASISTENCIA - BOTON ASISTENCIA - BOTON ASISTENCIA - BOTON ASISTENCIA - BOTON ASISTENCIA - BOTON ASISTENCIA - BOTON ASISTENCIA*/
        // REGISTRAR ASISTENCIA
    void RegistrarAsistencia(Asistencia modelAsistencia);
        // VISUALIZAR ASISTENCIA
    Asistencia VisualizarDatosSeleccionadosAsistencia(int codigoID);
        // ACTUALIZAR ASISTENCIA
    Asistencia ActualizarDatosSeleccionadosAsistencia(Asistencia modelAsistencia);
        // ELIMINAR ASISTENCIA
    Asistencia EliminarDatosSeleccionadosAsistencia(int codigoID);
    /*FIN BOTON ASISTENCIA - FIN BOTON ASISTENCIA - FIN BOTON ASISTENCIA - FIN BOTON ASISTENCIA - FIN BOTON ASISTENCIA - FIN BOTON ASISTENCIA - FIN BOTON ASISTENCIA*/

    
    /* PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD*/
    /* OBTENER CONTEO DE CLIENTES Y EMPLEADOS - OBTENER CONTEO DE CLIENTES Y EMPLEADOS - OBTENER CONTEO DE CLIENTES Y EMPLEADOS - OBTENER CONTEO DE CLIENTES Y EMPLEADOS*/
    Cliente TraerCantidadClientesEmpleados();
    /* FIN OBTENER CONTEO DE CLIENTES Y EMPLEADOS - FIN OBTENER CONTEO DE CLIENTES Y EMPLEADOS - FIN OBTENER CONTEO DE CLIENTES Y EMPLEADOS - FIN OBTENER CONTEO DE CLIENTES Y EMPLEADOS*/

    /* OBTENER NOMBRE DEL EMPLEADO - OBTENER NOMBRE DEL EMPLEADO - OBTENER NOMBRE DEL EMPLEADO - OBTENER NOMBRE DEL EMPLEADO - OBTENER NOMBRE DEL EMPLEADO - OBTENER NOMBRE DEL EMPLEADO*/
    Empleado TraerNombreApellidoEmpleado(String correo);
    /* FIN OBTENER NOMBRE DEL EMPLEADO - FIN OBTENER NOMBRE DEL EMPLEADO - FIN OBTENER NOMBRE DEL EMPLEADO - FIN OBTENER NOMBRE DEL EMPLEADO - FIN OBTENER NOMBRE DEL EMPLEADO*/
    /* FIN PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD - PARA EL PANEL DASHBOARD*/

    Usuarios ActualizarUsuarios(Usuarios modelUsuario);
    
    
    Movilidad RegistrarMovilidad(Movilidad modelMovilidad);
}
