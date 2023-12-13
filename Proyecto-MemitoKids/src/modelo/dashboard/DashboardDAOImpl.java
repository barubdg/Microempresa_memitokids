package modelo.dashboard;

import Conexion.ConexionSQLWorkbrench;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.Statement;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tabla.asistencia.Asistencia;
import tabla.cliente.Cliente;
import tabla.empleado.Empleado;
import tabla.equipo_organizacion.Equipo_Organizacion;
import tabla.evento.Evento;
import tabla.movilidad.Movilidad;
import tabla.paquete.Paquete;
import tabla.roles.Roles;
import tabla.ubicacion.Ubicacion;
import tabla.usuarios.Usuarios;

public class DashboardDAOImpl implements DashboardDAO {

    @Override
    public List<Cliente> obtenerClientes() {
        List<Cliente> Clientes = new ArrayList<>();

        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // CONSULTAR LOS CLIENTES EN LA BASE DE DATOS
            String consulta = "select * from clientes;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // OBTENER LOS DATOS DE CADA CLIENTE
                int clienteIdBD = resultSet.getInt("cliente_id");
                String nombresBD = resultSet.getString("nombre");
                String apellidosBD = resultSet.getString("apellido");
                String telefonoBD = resultSet.getString("telefono");

                // CREAR UN OBJETO CLASE Cliente CON LOS DATOS OBTENIDOS
                Cliente clientes_clase = new Cliente();

                // AGREGAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS A LOS SETTERS DEL CLIENTE
                clientes_clase.setClienteId(clienteIdBD);
                clientes_clase.setNombre(nombresBD);
                clientes_clase.setApellido(apellidosBD);
                clientes_clase.setTelefono(telefonoBD);

                // Establecer los demás datos en el objeto Clientes
                Clientes.add(clientes_clase); // Agregar el clientes_clase a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return Clientes;
    }
    @Override
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> Empleados = new ArrayList<>();

        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // CONSULTAR LOS EMPLEADOS EN LA BASE DE DATOS
            String consulta = "select * from empleados;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // OBTENER LOS DATOS DE CADA CLIENTE
                int empleadoIdBD = resultSet.getInt("empleado_id");
                String nombresBD = resultSet.getString("nombre");
                String apellidosBD = resultSet.getString("apellido");
                String dniBD = resultSet.getString("dni");

                // CREAR UN OBJETO CLASE Cliente CON LOS DATOS OBTENIDOS
                Empleado empleados_clase = new Empleado();

                // AGREGAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS A LOS SETTERS DEL CLIENTE
                empleados_clase.setEmpleadoId(empleadoIdBD);
                empleados_clase.setNombre(nombresBD);
                empleados_clase.setApellido(apellidosBD);
                empleados_clase.setDni(dniBD);

                // Establecer los demás datos en el objeto Clientes
                Empleados.add(empleados_clase); // Agregar el clientes_clase a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return Empleados;
    }
    @Override
    public List<Paquete> obtenerPaquetes() {
        List<Paquete> Paquetes = new ArrayList<>();

        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // CONSULTAR LOS EMPLEADOS EN LA BASE DE DATOS
            String consulta = "select * from paquetes;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // OBTENER LOS DATOS DE CADA CLIENTE
                int paqueteIdBD = resultSet.getInt("paquete_id");
                String nombresBD = resultSet.getString("nombre_paquete");
                String descripcionBD = resultSet.getString("descripcion");
                double precioBD = resultSet.getDouble("precio");

                // CREAR UN OBJETO CLASE Cliente CON LOS DATOS OBTENIDOS
                Paquete paquete_clase = new Paquete();

                // AGREGAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS A LOS SETTERS DEL CLIENTE
                paquete_clase.setPaqueteId(paqueteIdBD);
                paquete_clase.setNombrePaquete(nombresBD);
                paquete_clase.setDescripcion(descripcionBD);
                paquete_clase.setPrecio(precioBD);

                // Establecer los demás datos en el objeto Clientes
                Paquetes.add(paquete_clase); // Agregar el clientes_clase a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return Paquetes;
    }
    @Override
    public List<Evento> obtenerEventos() {
        List<Evento> Eventos = new ArrayList<>();

        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // CONSULTAR
            String consulta = "select evento.evento_id, evento.nombre_evento, ubicacion.direccion, clientes.nombre from evento inner join ubicacion on evento.ubicacion_id = ubicacion.ubicacion_id inner join clientes on evento.cliente_id = clientes.cliente_id;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // OBTENER LOS DATOS DE CADA CLIENTE
                int eventoIdBD = resultSet.getInt("evento.evento_id");
                String nombreEventoBD = resultSet.getString("evento.nombre_evento");
                String direccionUbicacionBD = resultSet.getString("ubicacion.direccion");
                String nombreClienteBD = resultSet.getString("clientes.nombre");

                // AGREGAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS A LOS SETTERS DEL CLIENTE
                // CREAR UN OBJETO CLASE Ubicacion CON LOS DATOS OBTENIDOS                
                Ubicacion ubicacion_clase = new Ubicacion();
                ubicacion_clase.setDireccion(direccionUbicacionBD);

                // CREAR UN OBJETO CLASE cliente con los datos obtenidos
                Cliente cliente_clase = new Cliente();
                cliente_clase.setNombre(nombreClienteBD);

                // CREAR UN OBJETO CLASE cliente CON LOS DATOS OBTENIDOS
                Evento evento_clase = new Evento(cliente_clase, ubicacion_clase);
                evento_clase.setEventoId(eventoIdBD);
                evento_clase.setNombreEvento(nombreEventoBD);

                // Establecer los demás datos en el objeto Clientes
                Eventos.add(evento_clase); // Agregar el evento_clase a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return Eventos;
    }
    @Override
    public List<Equipo_Organizacion> obtenerEquipos() {
        List<Equipo_Organizacion> Equipos = new ArrayList<>();

        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // CONSULTAR LOS Equipos EN LA BASE DE DATOS
            String consulta = "select * from equipos_de_organizacion;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // OBTENER LOS DATOS DE CADA Equipo
                int equipoIdBD = resultSet.getInt("equipo_id");
                String nombreEquipoBD = resultSet.getString("nombre_equipo");

                // CREAR UN OBJETO CLASE Cliente CON LOS DATOS OBTENIDOS
                Equipo_Organizacion equipo_clase = new Equipo_Organizacion();

                // AGREGAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS A LOS SETTERS DEL Equipo
                equipo_clase.setEquipoId(equipoIdBD);
                equipo_clase.setNombreEquipo(nombreEquipoBD);

                // Establecer los demás datos en el objeto Equipo
                Equipos.add(equipo_clase); // Agregar el equipo_clase a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return Equipos;
    }    
    @Override
    public List<Asistencia> obtenerAsistencias() {
        List<Asistencia> Asistencias = new ArrayList<>();

        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // CONSULTAR LOS Equipos EN LA BASE DE DATOS
            String consulta = "select asistencia.asistencia_id, empleados.nombre, empleados.apellido, equipos_de_organizacion.nombre_equipo from Asistencia inner join empleados on asistencia.empleado_id = empleados.empleado_id inner join equipos_de_organizacion on asistencia.equipo_id = equipos_de_organizacion.equipo_id;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // OBTENER LOS DATOS DE CADA Equipo
                int AsistenciaIdBD = resultSet.getInt("asistencia.asistencia_id");
                String nombreEmpleadoBD = resultSet.getString("empleados.nombre");
                String apellidoEmpleadoBD = resultSet.getString("empleados.apellido");
                String nombreEquipoBD = resultSet.getString("equipos_de_organizacion.nombre_equipo");

                // CREAR UN OBJETO CLASE Cliente CON LOS DATOS OBTENIDOS
                Asistencia asistencia_clase = new Asistencia();

                // AGREGAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS A LOS SETTERS DEL Equipo
                asistencia_clase.setAsistenciaId(AsistenciaIdBD);
                asistencia_clase.getEmp().setNombre(nombreEmpleadoBD);
                asistencia_clase.getEmp().setApellido(apellidoEmpleadoBD);
                asistencia_clase.getEq_org().setNombreEquipo(nombreEquipoBD);

                // Establecer los demás datos en el objeto Equipo
                Asistencias.add(asistencia_clase); // Agregar el equipo_clase a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return Asistencias;
    }   
    @Override
    public List<Asistencia> obtenerEventosAsis(int Eventoid){
        List<Asistencia> Asistencias = new ArrayList<>();

        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // CONSULTAR
            String consulta = "select asistencia.asistencia_id, empleados.nombre, empleados.apellido, equipos_de_organizacion.nombre_equipo from Asistencia inner join evento on evento.evento_id = asistencia.evento_id inner join empleados on asistencia.empleado_id = empleados.empleado_id inner join equipos_de_organizacion on asistencia.equipo_id = equipos_de_organizacion.equipo_id where evento.evento_id="+Eventoid+";";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                // OBTENER LOS DATOS DE CADA Equipo
                int AsistenciaIdBD = resultSet.getInt("asistencia.asistencia_id");
                String nombreEmpleadoBD = resultSet.getString("empleados.nombre");
                String apellidoEmpleadoBD = resultSet.getString("empleados.apellido");
                String nombreEquipoBD = resultSet.getString("equipos_de_organizacion.nombre_equipo");

                // CREAR UN OBJETO CLASE Cliente CON LOS DATOS OBTENIDOS
                Asistencia asistencia_clase = new Asistencia();

                // AGREGAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS A LOS SETTERS DEL Equipo
                asistencia_clase.setAsistenciaId(AsistenciaIdBD);
                asistencia_clase.getEmp().setNombre(nombreEmpleadoBD);
                asistencia_clase.getEmp().setApellido(apellidoEmpleadoBD);
                asistencia_clase.getEq_org().setNombreEquipo(nombreEquipoBD);

                // Establecer los demás datos en el objeto Equipo
                Asistencias.add(asistencia_clase); // Agregar el equipo_clase a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return Asistencias;
    }

    /*INTERFAZ CLIENTE - INTERFAZ CLIENTE - INTERFAZ CLIENTE - INTERFAZ CLIENTE - INTERFAZ CLIENTE - INTERFAZ CLIENTE - INTERFAZ CLIENTE - INTERFAZ CLIENTE - INTERFAZ CLIENTE*/
    // BOTON REGISTRAR CLIENTE
    @Override
    public void RegistrarCliente(Cliente modelCliente) {
        Connection conexion = null;
        PreparedStatement statement = null;
        Cliente clientemodelo = modelCliente; // Asignar el objeto model_cita a citamodelo

        try {
            // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Insertar el administrador en la base de datos
            String consulta = "INSERT INTO clientes(nombre,apellido,dni,direccion,telefono)VALUES(?,?,?,?,?);";
            statement = (PreparedStatement) conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, clientemodelo.getNombre());
            statement.setString(2, clientemodelo.getApellido());
            statement.setString(3, clientemodelo.getDni());
            statement.setString(4, clientemodelo.getDireccion());
            statement.setString(5, clientemodelo.getTelefono());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idCliente = generatedKeys.getInt(1);
                    System.out.println("ID Generado: " + idCliente);
                    // Haz lo que necesites con el ID generado
                }
                generatedKeys.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // BOTON VISUALIZAR CLIENTE
    @Override
    public Cliente VisualizarDatosSeleccionadosCliente(int codigoID) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Cliente modelCliente = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "select * from clientes where clientes.cliente_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                String nombresBD = resultSet.getString("nombre");
                String apellidosBD = resultSet.getString("apellido");
                String dniBD = resultSet.getString("dni");
                String direccionBD = resultSet.getString("direccion");
                String telefonoBD = resultSet.getString("telefono");

                // Si se encuentra el usuario, crear el objeto ModelCliente con los datos obtenidos
                modelCliente = new Cliente(resultSet.getInt("cliente_id"));
                modelCliente.setNombre(nombresBD);
                modelCliente.setApellido(apellidosBD);
                modelCliente.setDireccion(direccionBD);
                modelCliente.setTelefono(telefonoBD);
                modelCliente.setDni(dniBD);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelCliente;
    }
    // BOTON VISUALIZAR BUSCAR CLIENTE    
    @Override
    public Cliente VisualizarBuscarCliente(String dni) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Cliente modelCliente = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "select * from clientes where clientes.dni= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, dni);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                String nombresBD = resultSet.getString("nombre");
                String apellidosBD = resultSet.getString("apellido");
                String dniBD = resultSet.getString("dni");
                String direccionBD = resultSet.getString("direccion");
                String telefonoBD = resultSet.getString("telefono");
                int cliente_idBD = resultSet.getInt("cliente_id");

                // Si se encuentra el usuario, crear el objeto ModelCliente con los datos obtenidos
                modelCliente = new Cliente(resultSet.getString("dni"));
                modelCliente.setNombre(nombresBD);
                modelCliente.setApellido(apellidosBD);
                modelCliente.setDireccion(direccionBD);
                modelCliente.setTelefono(telefonoBD);
                modelCliente.setDni(dniBD);
                modelCliente.setClienteId(cliente_idBD);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelCliente;
    }
    // BOTON ACTUALIZAR DATOS SELECCIONADOS CLIENTE    
    @Override
    public Cliente ActualizarDatosSeleccionadosCliente(Cliente modelCliente) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Crear el PreparedStatement y establecer los parámetros
            String consulta = "UPDATE clientes SET nombre=?,apellido=?,dni=?,direccion=?,telefono=? WHERE clientes.cliente_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, modelCliente.getNombre());
            statement.setString(2, modelCliente.getApellido());
            statement.setString(3, modelCliente.getDni());
            statement.setString(4, modelCliente.getDireccion());
            statement.setString(5, modelCliente.getTelefono());
            statement.setInt(6, modelCliente.getClienteId());

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelCliente;
    }
    // BOTON ELIMINAR DATOS SELECCIONADOS CLIENTE
    @Override
    public Cliente EliminarDatosSeleccionadosCliente(int codigoID) {
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        Cliente modelCliente = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Definir la consulta SQL DELETE
            String consulta = "delete from clientes where clientes.cliente_id= ?";

            // Crear el PreparedStatement y establecer el parámetro
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se eliminaron registros
            if (filasAfectadas > 0) {
                System.out.println("Los datos se eliminaron correctamente.");
            } else {
                System.out.println("No se encontraron registros para eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelCliente;
    }

    /*FIN INTERFAZ CLIENTE - FIN INTERFAZ CLIENTE - FIN INTERFAZ CLIENTE - FIN INTERFAZ CLIENTE - FIN INTERFAZ CLIENTE - FIN INTERFAZ CLIENTE - FIN INTERFAZ CLIENTE*/


 /*INTERFAZ EMPLEADO - INTERFAZ EMPLEADO - INTERFAZ EMPLEADO - INTERFAZ EMPLEADO - INTERFAZ EMPLEADO - INTERFAZ EMPLEADO - INTERFAZ EMPLEADO - INTERFAZ EMPLEADO*/
    // BOTON REGISTRAR EMPLEADO
    @Override
    public void RegistrarUsuario(Usuarios modelUsuarios) {
        Connection conexion = null;
        PreparedStatement statement = null;
        Usuarios usuariosmodelo = modelUsuarios; // Asignar el objeto model_cita a citamodelo

        try {
            // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Insertar el administrador en la base de datos
            String consulta = "INSERT INTO USUARIOS (correo, contraseña) VALUES (?, ?);";
            statement = (PreparedStatement) conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, usuariosmodelo.getCorreo());
            statement.setString(2, usuariosmodelo.getContraseña());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idCliente = generatedKeys.getInt(1);
                    System.out.println("ID Generado: " + idCliente);
                    // Haz lo que necesites con el ID generado
                }
                generatedKeys.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public Usuarios ObtenerUsuarioInsertado(String correo) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Usuarios modelUsuarios = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "SELECT usuario_id, correo FROM USUARIOS WHERE correo = ?";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, correo);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                int usuario_idBD = resultSet.getInt("usuario_id");
                String correoBD = resultSet.getString("correo");

                modelUsuarios = new Usuarios(correoBD);
                modelUsuarios.setUsuario_id(usuario_idBD);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelUsuarios;
    }
    @Override
    public int RegistrarRoles(Roles modelRoles, Usuarios modelUsuarios) {
        Connection conexion = null;
        PreparedStatement statement = null;
        Roles rolesmodelo = modelRoles; // Asignar el objeto model_cita a citamodelo
        int idRoles = -1; // Valor predeterminado en caso de error
        try {
            // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Insertar el administrador en la base de datos
            String consulta = "INSERT INTO ROLES (nombre_rol, usuario_id) VALUES (?, ?);";
            statement = (PreparedStatement) conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, rolesmodelo.getNombre_rol());

            int usuarioID = modelUsuarios.getUsuario_id();
            rolesmodelo.setUsuario_id(usuarioID);

            statement.setInt(2, rolesmodelo.getUsuario_id());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idRoles = generatedKeys.getInt(1);
                    System.out.println("ID Generado: " + idRoles);
                    // Haz lo que necesites con el ID generado
                }
                generatedKeys.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return idRoles; // Devolver el ID generado
    }
    @Override
    public void RegistrarEmpleado(Empleado modelEmpleado) {
        Connection conexion = null;
        PreparedStatement statement = null;
        Empleado empleadomodelo = modelEmpleado; // Asignar el objeto model_cita a citamodelo

        try {
            // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Insertar el administrador en la base de datos
            String consulta = "INSERT INTO empleados(nombre,apellido,dni,fechaNacimiento,direccion,email,celular,rol_id)VALUES(?,?,?,?,?,?,?,?);";
            statement = (PreparedStatement) conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, empleadomodelo.getNombre());
            statement.setString(2, empleadomodelo.getApellido());
            statement.setString(3, empleadomodelo.getDni());
            statement.setString(4, empleadomodelo.getFechaNacimiento());
            statement.setString(5, empleadomodelo.getDireccion());
            statement.setString(6, empleadomodelo.getEmail());
            statement.setString(7, empleadomodelo.getCelular());
            statement.setInt(8, empleadomodelo.getRolId());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idCliente = generatedKeys.getInt(1);
                    System.out.println("ID Generado: " + idCliente);
                    // Haz lo que necesites con el ID generado
                }
                generatedKeys.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // FIN BOTON REGISTRAR EMPLEADO

    // BOTON VISUALIZAR EMPLEADO
    @Override
    public Empleado VisualizarDatosSeleccionadosEmpleado(int codigoID) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Empleado modelEmpleado = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "SELECT * FROM USUARIOS INNER JOIN ROLES ON USUARIOS.usuario_id = ROLES.usuario_id INNER JOIN EMPLEADOS ON ROLES.rol_id = EMPLEADOS.rol_id where Empleados.empleado_id=?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                // OBTENER LOS DATOS DE LA CLASE ROLES
                String nombreRolBD = resultSet.getString("ROLES.nombre_rol");

                // OBTENER LOS DATOS DE LA CLASE USUARIOS
                String correoUsuBD = resultSet.getString("USUARIOS.correo");
                String contraseñaUsuBD = resultSet.getString("USUARIOS.contraseña");
                int usuarioIdBD = resultSet.getInt("USUARIOS.usuario_id");

                // OBTENER LOS DATOS DE LA CLASE EMPLEADO
                int empleadoIdBD = resultSet.getInt("Empleados.empleado_id");
                int rolIdBD = resultSet.getInt("Empleados.rol_id");
                String nombresBD = resultSet.getString("EMPLEADOS.nombre");
                String apellidosBD = resultSet.getString("EMPLEADOS.apellido");
                String dniBD = resultSet.getString("EMPLEADOS.dni");
                String fechaNBD = resultSet.getString("EMPLEADOS.fechaNacimiento");
                String direccionBD = resultSet.getString("EMPLEADOS.direccion");
                String emailBD = resultSet.getString("EMPLEADOS.email");
                String celularBD = resultSet.getString("EMPLEADOS.celular");

                Roles rol = new Roles();
                rol.setNombre_rol(nombreRolBD);

                Usuarios usu = new Usuarios();
                usu.setCorreo(correoUsuBD);
                usu.setContraseña(contraseñaUsuBD);
                usu.setUsuario_id(usuarioIdBD);

                modelEmpleado = new Empleado(rol, usu);
                modelEmpleado.setEmpleadoId(empleadoIdBD);
                modelEmpleado.setRolId(rolIdBD);
                modelEmpleado.setNombre(nombresBD);
                modelEmpleado.setApellido(apellidosBD);
                modelEmpleado.setDni(dniBD);
                modelEmpleado.setFechaNacimiento(fechaNBD);
                modelEmpleado.setDireccion(direccionBD);
                modelEmpleado.setEmail(emailBD);
                modelEmpleado.setCelular(celularBD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelEmpleado;
    }
    // BOTON VISUALIZAR BUSCAR EMPLEADO   
    @Override
    public Empleado VisualizarBuscarEmpleado(String dni) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Empleado modelEmpleado = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "SELECT * FROM USUARIOS INNER JOIN ROLES ON USUARIOS.usuario_id = ROLES.usuario_id INNER JOIN EMPLEADOS ON ROLES.rol_id = EMPLEADOS.rol_id where EMPLEADOS.dni=?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, dni);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                // OBTENER LOS DATOS DE LA CLASE ROLES
                String nombreRolBD = resultSet.getString("ROLES.nombre_rol");

                // OBTENER LOS DATOS DE LA CLASE USUARIOS
                String correoUsuBD = resultSet.getString("USUARIOS.correo");
                String contraseñaUsuBD = resultSet.getString("USUARIOS.contraseña");
                int usuarioIdBD = resultSet.getInt("USUARIOS.usuario_id");

                // OBTENER LOS DATOS DE LA CLASE EMPLEADO
                int empleadoIdBD = resultSet.getInt("Empleados.empleado_id");
                int rolIdBD = resultSet.getInt("Empleados.rol_id");
                String nombresBD = resultSet.getString("EMPLEADOS.nombre");
                String apellidosBD = resultSet.getString("EMPLEADOS.apellido");
                String dniBD = resultSet.getString("EMPLEADOS.dni");
                String fechaNBD = resultSet.getString("EMPLEADOS.fechaNacimiento");
                String direccionBD = resultSet.getString("EMPLEADOS.direccion");
                String emailBD = resultSet.getString("EMPLEADOS.email");
                String celularBD = resultSet.getString("EMPLEADOS.celular");

                Roles rol = new Roles();
                rol.setNombre_rol(nombreRolBD);

                Usuarios usu = new Usuarios();
                usu.setCorreo(correoUsuBD);
                usu.setContraseña(contraseñaUsuBD);
                usu.setUsuario_id(usuarioIdBD);

                modelEmpleado = new Empleado(rol, usu);
                modelEmpleado.setEmpleadoId(empleadoIdBD);
                modelEmpleado.setRolId(rolIdBD);
                modelEmpleado.setNombre(nombresBD);
                modelEmpleado.setApellido(apellidosBD);
                modelEmpleado.setDni(dniBD);
                modelEmpleado.setFechaNacimiento(fechaNBD);
                modelEmpleado.setDireccion(direccionBD);
                modelEmpleado.setEmail(emailBD);
                modelEmpleado.setCelular(celularBD);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelEmpleado;
    }
    // BOTON ACTUALIZAR DATOS SELECCIONADOS EMPLEADO
    @Override
    public Empleado ActualizarDatosSeleccionadosEmpleado(Empleado modelEmpleado) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Crear el PreparedStatement y establecer los parámetros
            String consulta = "UPDATE empleados SET nombre=?,apellido=?,dni=?,fechaNacimiento=?,direccion=?,email=?,celular=? WHERE empleados.empleado_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, modelEmpleado.getNombre());
            statement.setString(2, modelEmpleado.getApellido());
            statement.setString(3, modelEmpleado.getDni());
            statement.setString(4, modelEmpleado.getFechaNacimiento());
            statement.setString(5, modelEmpleado.getDireccion());
            statement.setString(6, modelEmpleado.getEmail());
            statement.setString(7, modelEmpleado.getCelular());
            statement.setInt(8, modelEmpleado.getEmpleadoId());

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas > 0) {
                System.out.println("Los datos se actualizaron correctamente en empleado.");
            } else {
                System.out.println("No se encontró el registro para actualizar (empleado).");
            }

            // Crear el PreparedStatement y establecer los parámetros
            String consulta2 = "UPDATE roles SET nombre_rol=? WHERE roles.rol_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta2);
            statement.setString(1, modelEmpleado.getRol().getNombre_rol());
            statement.setInt(2, modelEmpleado.getRolId());

            // Ejecutar la consulta
            int filasAfectadas2 = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas2 > 0) {
                System.out.println("Los datos se actualizaron correctamente en roles.");
            } else {
                System.out.println("No se encontró el registro para actualizar (roles).");
            }

            // Crear el PreparedStatement y establecer los parámetros
            String consulta3 = "UPDATE usuarios SET correo=?,contraseña=? WHERE usuarios.usuario_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta3);
            statement.setString(1, modelEmpleado.getUsu().getCorreo());
            statement.setString(2, modelEmpleado.getUsu().getContraseña());
            statement.setInt(3, modelEmpleado.getRol().getUsuario_id());

            // Ejecutar la consulta
            int filasAfectadas3 = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas3 > 0) {
                System.out.println("Los datos se actualizaron correctamente en usuarios.");
            } else {
                System.out.println("No se encontró el registro para actualizar (roles).");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelEmpleado;
    }
    // BOTON ELIMINAR DATOS SELECCIONADOS EMPLEADO
    @Override
    public Empleado EliminarDatosSeleccionadosEmpleado(int codigoID) {
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        Empleado modelEmpleado = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Definir la consulta SQL DELETE
            String consulta = "delete from empleados where empleados.empleado_id= ?";

            // Crear el PreparedStatement y establecer el parámetro
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se eliminaron registros
            if (filasAfectadas > 0) {
                System.out.println("Los datos se eliminaron correctamente.");
            } else {
                System.out.println("No se encontraron registros para eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelEmpleado;
    }
    
    
    /*FIN INTERFAZ EMPLEADO - FIN INTERFAZ EMPLEADO - FIN INTERFAZ EMPLEADO - FIN INTERFAZ EMPLEADO - FIN INTERFAZ EMPLEADO - FIN INTERFAZ EMPLEADO - FIN INTERFAZ EMPLEADO*/
    
 /*INTERFAZ PAQUETE - INTERFAZ PAQUETE - INTERFAZ PAQUETE - INTERFAZ PAQUETE - INTERFAZ PAQUETE - INTERFAZ PAQUETE - INTERFAZ PAQUETE - INTERFAZ PAQUETE - INTERFAZ PAQUETE*/
    // BOTON REGISTRAR PAQUETE
    @Override
    public void RegistrarPaquete(Paquete modelPaquete) {
        Connection conexion = null;
        PreparedStatement statement = null;
        Paquete paquetemodelo = modelPaquete; // Asignar el objeto model_cita a citamodelo

        try {
            // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Insertar el administrador en la base de datos
            String consulta = "INSERT INTO PAQUETES (nombre_paquete, descripcion, precio) VALUES (?,?,?);";
            statement = (PreparedStatement) conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, paquetemodelo.getNombrePaquete());
            statement.setString(2, paquetemodelo.getDescripcion());
            statement.setDouble(3, paquetemodelo.getPrecio());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idCliente = generatedKeys.getInt(1);
                    System.out.println("ID Generado: " + idCliente);
                    // Haz lo que necesites con el ID generado
                }
                generatedKeys.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // BOTON VISUALIZAR PAQUETE
    @Override
    public Paquete VisualizarDatosSeleccionadosPaquete(int codigoID) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Paquete modelPaquete = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "select * from paquetes where paquetes.paquete_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                int paquete_idBD = resultSet.getInt("paquete_id");
                String nombresBD = resultSet.getString("nombre_paquete");
                String descripcionBD = resultSet.getString("descripcion");
                double precioBD = resultSet.getDouble("precio");

                // Si se encuentra el usuario, crear el objeto ModelPaquete con los datos obtenidos
                modelPaquete = new Paquete(resultSet.getInt("paquete_id"));
                modelPaquete.setPaqueteId(paquete_idBD);
                modelPaquete.setNombrePaquete(nombresBD);
                modelPaquete.setDescripcion(descripcionBD);
                modelPaquete.setPrecio(precioBD);
                

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelPaquete;
    }
    // BOTON ACTUALIZAR PAQUETE
    @Override
    public Paquete ActualizarDatosSeleccionadosPaquete(Paquete modelPaquete) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Crear el PreparedStatement y establecer los parámetros
            String consulta = "UPDATE paquetes SET nombre_paquete=?, descripcion=?, precio=? WHERE paquetes.paquete_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, modelPaquete.getNombrePaquete());
            statement.setString(2, modelPaquete.getDescripcion());
            statement.setDouble(3, modelPaquete.getPrecio());
            statement.setInt(4, modelPaquete.getPaqueteId());

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelPaquete;
    }
    // BOTON ELIMINAR DATOS SELECCIONADOS CLIENTE
    @Override
    public Paquete EliminarDatosSeleccionadosPaquete(int codigoID) {
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        Paquete modelPaquete = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Definir la consulta SQL DELETE
            String consulta = "delete from paquetes where paquetes.paquete_id= ?";

            // Crear el PreparedStatement y establecer el parámetro
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se eliminaron registros
            if (filasAfectadas > 0) {
                System.out.println("Los datos se eliminaron correctamente.");
            } else {
                System.out.println("No se encontraron registros para eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelPaquete;
    }
    /*FIN INTERFAZ PAQUETE - FIN INTERFAZ PAQUETE - FIN INTERFAZ PAQUETE - FIN INTERFAZ PAQUETE - FIN INTERFAZ PAQUETE - FIN INTERFAZ PAQUETE - FIN INTERFAZ PAQUETE - FIN INTERFAZ PAQUETE*/

 /*INTERFAZ EVENTO - INTERFAZ EVENTO - INTERFAZ EVENTO - INTERFAZ EVENTO - INTERFAZ EVENTO - INTERFAZ EVENTO - INTERFAZ EVENTO - INTERFAZ EVENTO - INTERFAZ EVENTO - INTERFAZ EVENTO*/
    // BOTON REGISTRAR EVENTO   
    @Override
    public void RegistrarEvento(Evento modelEvento) {
        Connection conexion = null;
        PreparedStatement statement = null;
        try {
            // Obtener la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // INSERTAR EN LA TABLA UBICACION
            String consultaUbicacion = "INSERT INTO ubicacion (nombre_ubicacion, direccion) VALUES (?,?);";
            statement = (PreparedStatement) conexion.prepareStatement(consultaUbicacion, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, modelEvento.getUbicacion().getNombreUbicacion());
            statement.setString(2, modelEvento.getUbicacion().getDireccion());

            int filasAfectadasUbicacion = statement.executeUpdate();
            int idUbicacion = 0;
            if (filasAfectadasUbicacion > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idUbicacion = generatedKeys.getInt(1);
                    System.out.println("IDUbicacion Generado: " + idUbicacion);
                }
                generatedKeys.close();
            }

            // INSERTAR EN LA TABLA EVENTO
            String consultaEvento = "INSERT INTO evento (nombre_evento, ubicacion_id, cliente_id) VALUES(?,?,?);";
            statement = (PreparedStatement) conexion.prepareStatement(consultaEvento, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, modelEvento.getNombreEvento());
            statement.setInt(2, idUbicacion);
            statement.setInt(3, modelEvento.getCliente().getClienteId());

            int filasAfectadasEvento = statement.executeUpdate();
            int idEvento = 0;
            if (filasAfectadasEvento > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idEvento = generatedKeys.getInt(1);
                    System.out.println("IDEvento Generado: " + idEvento);
                }
                generatedKeys.close();
            }

            // INSERTAR EN LA TABLA RESERVA
            String consultaReserva = "INSERT INTO reserva (paquete_id, evento_id, fecha_reserva) VALUES (?,?,?)";
            statement = (PreparedStatement) conexion.prepareStatement(consultaReserva, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, modelEvento.getPaquete().getPaqueteId());
            statement.setInt(2, idEvento);
            statement.setString(3, modelEvento.getReserva().getFechaReserva());

            int filasAfectadasReserva = statement.executeUpdate();
            int idReserva = 0;
            if (filasAfectadasReserva > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idReserva = generatedKeys.getInt(1);
                    System.out.println("IDReserva Generado: " + idReserva);
                }
                generatedKeys.close();
            }

            // INSERTAR EN LA TABLA PRESUPUESTO_EVENTO
            String consultaPresupuesto = "INSERT INTO presupuesto_evento (evento_id, precio) VALUES (?,?)";
            statement = (PreparedStatement) conexion.prepareStatement(consultaPresupuesto, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idEvento);
            statement.setDouble(2, modelEvento.getPresupuesto_evento().getPrecio());

            int filasAfectadasPresupuesto = statement.executeUpdate();
            int idPresupuesto = 0;
            if (filasAfectadasPresupuesto > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idPresupuesto = generatedKeys.getInt(1);
                    System.out.println("IDPresupuesto Generado: " + idPresupuesto);
                }
                generatedKeys.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // BOTON VISUALIZAR EVENTO
    @Override
    public Evento VisualizarDatosSeleccionadosEvento(int codigoID) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Evento modelEvento = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "SELECT * FROM UBICACION INNER JOIN EVENTO ON UBICACION.ubicacion_id = EVENTO.ubicacion_id INNER JOIN CLIENTES ON EVENTO.cliente_id = CLIENTES.cliente_id INNER JOIN RESERVA ON EVENTO.evento_id = RESERVA.evento_id INNER JOIN PAQUETES ON RESERVA.paquete_id = PAQUETES.paquete_id INNER JOIN PRESUPUESTO_EVENTO ON EVENTO.evento_id = PRESUPUESTO_EVENTO.evento_id where evento.evento_id=?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                int ubicacionidBD = resultSet.getInt("ubicacion.ubicacion_id");
                int clienteidBD = resultSet.getInt("clientes.cliente_id");
                int paqueteidBD = resultSet.getInt("paquetes.paquete_id");
                int evento_idBD = resultSet.getInt("evento.evento_id");
                int reservaidBD = resultSet.getInt("reserva.reserva_id");
                int presupuestoidBD = resultSet.getInt("presupuesto_evento.presupuesto_id");
                
                //UBICACION
                String nombreUbiBD = resultSet.getString("ubicacion.nombre_ubicacion");
                String direccionUbBD = resultSet.getString("ubicacion.direccion");
                
                //CLIENTES
                String apellidoCliBD = resultSet.getString("clientes.apellido");
                
                //PAQUETES
                String nombrepaqueteBD = resultSet.getString("paquetes.nombre_paquete");
                
                //EVENTO
                String nombreEvBD = resultSet.getString("evento.nombre_evento");
                
                //RESERVA
                String fechaReservaBD = resultSet.getString("reserva.fecha_reserva");
                
                //PRESUPUESTO EVENTO
                Double precioPresupuestoBD = resultSet.getDouble("presupuesto_evento.precio");
                
                
                modelEvento = new Evento(resultSet.getInt("evento.evento_id"));
                modelEvento.getUbicacion().setUbicacionId(ubicacionidBD);
                modelEvento.getCliente().setClienteId(clienteidBD);
                modelEvento.getPaquete().setPaqueteId(paqueteidBD);
                modelEvento.setEventoId(evento_idBD);
                modelEvento.getReserva().setReservaId(reservaidBD);
                modelEvento.getPresupuesto_evento().setPresupuestoId(presupuestoidBD);
                
                modelEvento.getUbicacion().setNombreUbicacion(nombreUbiBD);
                modelEvento.getUbicacion().setDireccion(direccionUbBD);
                
                modelEvento.getCliente().setApellido(apellidoCliBD);
                
                modelEvento.getPaquete().setNombrePaquete(nombrepaqueteBD);
                
                modelEvento.setNombreEvento(nombreEvBD);
                
                modelEvento.getReserva().setFechaReserva(fechaReservaBD);
                
                modelEvento.getPresupuesto_evento().setPrecio(precioPresupuestoBD);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelEvento;
    }
    // BOTON ACTUALIZAR EVENTO
    @Override
    public Evento ActualizarDatosSeleccionadosEvento(Evento modelEvento) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Crear el PreparedStatement y establecer los parámetros
            String consulta = "UPDATE ubicacion SET nombre_ubicacion=?, direccion=? WHERE ubicacion.ubicacion_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, modelEvento.getUbicacion().getNombreUbicacion());
            statement.setString(2, modelEvento.getUbicacion().getDireccion());
            statement.setInt(3, modelEvento.getUbicacion().getUbicacionId());

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }
            
            
            // INSERTAR EN LA TABLA EVENTO
            String consultaEvento = "UPDATE evento SET nombre_evento=?, ubicacion_id=?, cliente_id=? WHERE evento.evento_id=?;";
            statement = (PreparedStatement) conexion.prepareStatement(consultaEvento, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, modelEvento.getNombreEvento());
            statement.setInt(2, modelEvento.getUbicacion().getUbicacionId());
            statement.setInt(3, modelEvento.getCliente().getClienteId());
            statement.setInt(4, modelEvento.getEventoId());
            
            // Ejecutar la consulta
            int filasAfectadas2 = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas2 > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }
            
            
            // INSERTAR EN LA TABLA RESERVA
            String consultaReserva = "UPDATE reserva SET paquete_id=?, evento_id=?, fecha_reserva=? WHERE reserva.reserva_id=?";
            statement = (PreparedStatement) conexion.prepareStatement(consultaReserva, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, modelEvento.getPaquete().getPaqueteId());
            statement.setInt(2, modelEvento.getEventoId());
            statement.setString(3, modelEvento.getReserva().getFechaReserva());
            statement.setInt(4, modelEvento.getReserva().getReservaId());
            
            // Ejecutar la consulta
            int filasAfectadas3 = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas3 > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }
            
            
            // INSERTAR EN LA TABLA PRESUPUESTO_EVENTO
            String consultaPresupuesto = "UPDATE presupuesto_evento SET evento_id=?, precio=? WHERE presupuesto_evento.presupuesto_id=?";
            statement = (PreparedStatement) conexion.prepareStatement(consultaPresupuesto, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, modelEvento.getEventoId());
            statement.setDouble(2, modelEvento.getPresupuesto_evento().getPrecio());
            statement.setInt(3, modelEvento.getPresupuesto_evento().getPresupuestoId());
            
            // Ejecutar la consulta
            int filasAfectadas4 = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas4 > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelEvento;
    }
    // BOTON ELIMINAR EVENTO
    @Override
    public Evento EliminarDatosSeleccionadosEvento(int codigoID) {
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        Evento modelEvento = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Definir la consulta SQL DELETE
            String consulta = "delete from evento where evento.evento_id= ?";

            // Crear el PreparedStatement y establecer el parámetro
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se eliminaron registros
            if (filasAfectadas > 0) {
                System.out.println("Los datos se eliminaron correctamente.");
            } else {
                System.out.println("No se encontraron registros para eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelEvento;
    }
 /*FIN INTERFAZ EVENTO - FIN INTERFAZ EVENTO - FIN INTERFAZ EVENTO - FIN INTERFAZ EVENTO - FIN INTERFAZ EVENTO - FIN INTERFAZ EVENTO - FIN INTERFAZ EVENTO - FIN INTERFAZ EVENTO*/
    
    
/*INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO - INTERFAZ EQUIPO*/    


    // BOTON AGREGAR REGISTRAR EQUIPO DE ORGANIZACION
    @Override
    public void RegistrarEquipo(Equipo_Organizacion modelEquipo) {
        Connection conexion = null;
        PreparedStatement statement = null;
        Equipo_Organizacion Equipomodelo = modelEquipo; // Asignar el objeto model_cita a citamodelo

        try {
            // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Insertar el equipos_de_organizacion en la base de datos
            String consulta = "INSERT INTO equipos_de_organizacion (nombre_equipo) VALUES(?);";
            statement = (PreparedStatement) conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, Equipomodelo.getNombreEquipo());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idEquipo = generatedKeys.getInt(1);
                    System.out.println("IDEquipo Generado: " + idEquipo);
                    // Haz lo que necesites con el ID generado
                }
                generatedKeys.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // BOTON VISUALIZAR EQUIPO DE ORGANIZACION
    @Override
    public Equipo_Organizacion VisualizarDatosSeleccionadosEquipo(int codigoID) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Equipo_Organizacion modelEquipo = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "select * from equipos_de_organizacion where equipos_de_organizacion.equipo_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                int equipo_idBD = resultSet.getInt("equipo_id");
                String nombresBD = resultSet.getString("nombre_equipo");

                // Si se encuentra el usuario, crear el objeto ModelPaquete con los datos obtenidos
                modelEquipo = new Equipo_Organizacion(resultSet.getInt("equipo_id"));
                modelEquipo.setEquipoId(equipo_idBD);
                modelEquipo.setNombreEquipo(nombresBD);
                

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelEquipo;
    }
    // BOTON ACTUALIZAR EQUIPO DE ORGANIZACION
    @Override
    public Equipo_Organizacion ActualizarDatosSeleccionadosEquipo(Equipo_Organizacion modelEquipo){
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Crear el PreparedStatement y establecer los parámetros
            String consulta = "UPDATE equipos_de_organizacion SET nombre_equipo=? WHERE equipos_de_organizacion.equipo_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, modelEquipo.getNombreEquipo());
            statement.setInt(2, modelEquipo.getEquipoId());

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelEquipo;
    }
    // BOTON ELIMINAR EQUIPO DE ORGANIZACION
    @Override
    public Equipo_Organizacion EliminarDatosSeleccionadosEquipo(int codigoID) {
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        Equipo_Organizacion modelEquipo = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Definir la consulta SQL DELETE
            String consulta = "delete from equipos_de_organizacion where equipos_de_organizacion.equipo_id= ?";

            // Crear el PreparedStatement y establecer el parámetro
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se eliminaron registros
            if (filasAfectadas > 0) {
                System.out.println("Los datos se eliminaron correctamente.");
            } else {
                System.out.println("No se encontraron registros para eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelEquipo;
    }
    
    
    
/*FIN INTERFAZ EQUIPO - FIN INTERFAZ EQUIPO - FIN INTERFAZ EQUIPO - FIN INTERFAZ EQUIPO - FIN INTERFAZ EQUIPO - FIN INTERFAZ EQUIPO - FIN INTERFAZ EQUIPO - FIN INTERFAZ EQUIPO - FIN INTERFAZ EQUIPO*/

    
/*INTERFAZ ASISTENCIA - INTERFAZ ASISTENCIA - INTERFAZ ASISTENCIA - INTERFAZ ASISTENCIA - INTERFAZ ASISTENCIA - INTERFAZ ASISTENCIA - INTERFAZ ASISTENCIA - INTERFAZ ASISTENCIA - INTERFAZ ASISTENCIA*/
    // BOTON AGREGAR ASISTENCIA
    @Override
    public void RegistrarAsistencia(Asistencia modelAsistencia) {
        Connection conexion = null;
        PreparedStatement statement = null;
        Asistencia modeloasistencia = modelAsistencia; // Asignar el objeto model_cita a citamodelo

        try {
            // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Insertar el equipos_de_organizacion en la base de datos
            String consulta = "INSERT INTO asistencia (evento_id, empleado_id, equipo_id) VALUES (?,?,?);";
            statement = (PreparedStatement) conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, modeloasistencia.getEventoId());
            statement.setInt(2, modeloasistencia.getEmpleadoId());
            statement.setInt(3, modeloasistencia.getEquipoId());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idAsistencia = generatedKeys.getInt(1);
                    System.out.println("IDAsistencia Generado: " + idAsistencia);
                    // Haz lo que necesites con el ID generado
                }
                generatedKeys.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // BOTON VISUALIZAR ASISTENCIA
    @Override
    public Asistencia VisualizarDatosSeleccionadosAsistencia(int codigoID) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Asistencia modelAsistencia = null;

        try {
            // Consultar el usuario en la base de datos
            String consulta = "select * from Asistencia inner join evento on evento.evento_id = asistencia.evento_id inner join empleados on asistencia.empleado_id = empleados.empleado_id inner join equipos_de_organizacion on asistencia.equipo_id = equipos_de_organizacion.equipo_id where asistencia.asistencia_id=?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                // OBTENER LOS DATOS DE CADA Equipo
                int AsistenciaIdBD = resultSet.getInt("asistencia.asistencia_id");
                String nombreEmpleadoBD = resultSet.getString("empleados.nombre");
                String apellidoEmpleadoBD = resultSet.getString("empleados.apellido");
                String nombreEquipoBD = resultSet.getString("equipos_de_organizacion.nombre_equipo");
                String nombreEventoBD = resultSet.getString("evento.nombre_evento");

                // Si se encuentra el usuario, crear el objeto ModelPaquete con los datos obtenidos
                modelAsistencia = new Asistencia(resultSet.getInt("asistencia.asistencia_id"));
                modelAsistencia.setAsistenciaId(AsistenciaIdBD);
                modelAsistencia.getEmp().setNombre(nombreEmpleadoBD);
                modelAsistencia.getEmp().setApellido(apellidoEmpleadoBD);
                modelAsistencia.getEq_org().setNombreEquipo(nombreEquipoBD);
                modelAsistencia.getEven().setNombreEvento(nombreEventoBD);
                

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelAsistencia;
    }
    // BOTON ACTUALIZAR ASISTENCIA
    @Override
    public Asistencia ActualizarDatosSeleccionadosAsistencia(Asistencia modelAsistencia){
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Crear el PreparedStatement y establecer los parámetros
            String consulta = "UPDATE asistencia SET evento_id=?, empleado_id=?, equipo_id=? WHERE asistencia.asistencia_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, modelAsistencia.getEventoId());
            statement.setInt(2, modelAsistencia.getEmpleadoId());
            statement.setInt(3, modelAsistencia.getEquipoId());
            statement.setInt(4,modelAsistencia.getAsistenciaId());

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelAsistencia;
    }
    // BOTON ELIMINAR ASISTENCIA
    @Override
    public Asistencia EliminarDatosSeleccionadosAsistencia(int codigoID) {
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        Asistencia modeloasistencia = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Definir la consulta SQL DELETE
            String consulta = "delete from asistencia where asistencia.asistencia_id= ?";

            // Crear el PreparedStatement y establecer el parámetro
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setInt(1, codigoID);

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se eliminaron registros
            if (filasAfectadas > 0) {
                System.out.println("Los datos se eliminaron correctamente.");
            } else {
                System.out.println("No se encontraron registros para eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modeloasistencia;
    }
    
    
    
    
/*FIN INTERFAZ ASISTENCIA - FIN INTERFAZ ASISTENCIA - FIN INTERFAZ ASISTENCIA - FIN INTERFAZ ASISTENCIA - FIN INTERFAZ ASISTENCIA - FIN INTERFAZ ASISTENCIA - FIN INTERFAZ ASISTENCIA - FIN INTERFAZ ASISTENCIA*/


    @Override
    public Cliente TraerCantidadClientesEmpleados() {
        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        Cliente modelCliente = new Cliente();
        ResultSet resultSet = null;

        try {
            // CONSULTAR LOS Equipos EN LA BASE DE DATOS
            String consulta = "select count(clientes.nombre) as ConteoClientes from clientes;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();
            
            if(resultSet.next())
            {
            int cantidadclientes = resultSet.getInt("ConteoClientes");
            modelCliente.setClienteId(cantidadclientes);                
            }
            
            // CONSULTAR LOS Equipos EN LA BASE DE DATOS
            String consulta2 = "select count(empleados.nombre) as ConteoEmpleados from empleados;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta2);
            resultSet = statement.executeQuery();
            
            if(resultSet.next())
            {
            int cantidadempleados = resultSet.getInt("ConteoEmpleados");            
            modelCliente.getModelEmpleado().setEmpleadoId(cantidadempleados);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelCliente;
    }
    @Override
    public Empleado TraerNombreApellidoEmpleado(String correo)
    {
        // REALIZAR LA CONEXIÓN A LA BASE DE DATOS UTILIZANDO LA CLASE ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        Empleado modelEmpelado = new Empleado();
        ResultSet resultSet = null;

        try {           
            // CONSULTAR LOS Equipos EN LA BASE DE DATOS
            String consulta2 = "select nombre, apellido, usuarios.usuario_id from empleados inner join roles on roles.rol_id = empleados.rol_id inner join usuarios on usuarios.usuario_id = roles.usuario_id where usuarios.correo=?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta2);
            statement.setString(1, correo);
            resultSet = statement.executeQuery();
            
            if(resultSet.next())
            {
                String nombre = resultSet.getString("empleados.nombre");
                String apellido = resultSet.getString("empleados.apellido");
                int usuarioid = resultSet.getInt("usuarios.usuario_id");
                
                modelEmpelado.setNombre(nombre);
                modelEmpelado.setApellido(apellido);
                modelEmpelado.getUsu().setUsuario_id(usuarioid);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelEmpelado;
    }
    
    /* SIRVE PARA ACTUALIZAR LAS CONTRASEÑAS AL MOMENTO DE RECUPERAR LA CONTRASEÑA*/
    @Override
    public Usuarios ActualizarUsuarios(Usuarios modelUsuario)
    {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Crear el PreparedStatement y establecer los parámetros
            String consulta = "UPDATE usuarios SET contraseña=? WHERE usuarios.usuario_id= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, modelUsuario.getContraseña());
            statement.setInt(2, modelUsuario.getUsuario_id());

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            // Verificar si se actualizó el registro
            if (filasAfectadas > 0) {
                System.out.println("Los datos se actualizaron correctamente.");
            } else {
                System.out.println("No se encontró el registro para actualizar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modelUsuario;
    }
    
    @Override
    public Movilidad RegistrarMovilidad(Movilidad modelMovilidad) {
        Connection conexion = null;
        PreparedStatement statement = null;
        Movilidad modelmovilidad = modelMovilidad; // Asignar el objeto model_cita a citamodelo

        try {
            // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
            conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();

            // Insertar el equipos_de_organizacion en la base de datos
            String consulta = "INSERT INTO movilidad (evento_id, descripcion, costo) VALUES (?, ?, ?);";
            statement = (PreparedStatement) conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, modelmovilidad.getEventoId());
            statement.setString(2, modelmovilidad.getDescripcion());
            statement.setDouble(3, modelmovilidad.getCosto());

            int filasAfectadas = statement.executeUpdate();
            int idMovilidad = 0;
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idMovilidad = generatedKeys.getInt(1);
                    System.out.println("IDMovilidad Generado: " + idMovilidad);
                    // Haz lo que necesites con el ID generado
                }
                generatedKeys.close();

            }
            modelMovilidad.setMovilidadId(idMovilidad);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelMovilidad;
    }
}
