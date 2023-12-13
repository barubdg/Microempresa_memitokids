package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.empleado.Empleado;
import tabla.roles.Roles;
import tabla.usuarios.Usuarios;
import vista.db_popmenu_opciones_empleado.popmenu_registrar_empleado;

public class Dash_Empleado_RegController implements ActionListener
{
    private Empleado modelEmpleado;
    private Roles modelRoles;
    private Usuarios modelUsuarios;
    private popmenu_registrar_empleado regEmpl_view;
    private DashboardDAO dash_DAO;

    public Dash_Empleado_RegController(Empleado modelEmpleado, popmenu_registrar_empleado regEmpl_view)
    {
        this.modelEmpleado = modelEmpleado;
        this.regEmpl_view = regEmpl_view;
        dash_DAO = new DashboardDAOImpl();
        
        regEmpl_view.btn_registrar_empleado.addActionListener(this);
        regEmpl_view.btn_cancelar_empleado.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {   
        if(e.getSource() == regEmpl_view.btn_registrar_empleado){RegistrarEmpleado();}
        else if(e.getSource() == regEmpl_view.btn_cancelar_empleado){regEmpl_view.dispose();}
    }
    
    private void RegistrarEmpleado() {
        
        modelUsuarios = new Usuarios();
        modelRoles = new Roles();
        
        String nombre = regEmpl_view.txt_nombres.getText();
        String apellido = regEmpl_view.txt_apellido.getText();
        String dni = regEmpl_view.txt_dni.getText();
        String fechaNacimiento = regEmpl_view.txt_fechanacimiento.getText();
        String direccion = regEmpl_view.txt_direccion.getText();
        String email = regEmpl_view.txt_email.getText();
        String celular = regEmpl_view.txt_telefono.getText();
        
        String nombrerol = regEmpl_view.cbx_tiporol.getSelectedItem().toString();

        String correo;
        String contraseña;
        
        if(nombrerol.equals("Administrador"))
        {
            correo = regEmpl_view.txt_correo.getText();
            char [] password = regEmpl_view.txt_constrasena.getPassword(); 
            contraseña = new String(password);
        }
        else
        {
            correo = "NN";
            contraseña = "NN";
        }
        
        modelUsuarios.setCorreo(correo);
        modelUsuarios.setContraseña(contraseña);
        
        dash_DAO.RegistrarUsuario(modelUsuarios);
        Usuarios newmodelusu = dash_DAO.ObtenerUsuarioInsertado(correo);
        
        newmodelusu.getUsuario_id();
        
        modelRoles.setNombre_rol(nombrerol);
        
        int idRegistrarRoles = dash_DAO.RegistrarRoles(modelRoles, newmodelusu);
        
//        Roles newmodelrol = dash_DAO.ObtenerRolInsertado(nombrerol);        
        
        modelEmpleado.setNombre(nombre);
        modelEmpleado.setApellido(apellido);
        modelEmpleado.setDni(dni);
        modelEmpleado.setFechaNacimiento(fechaNacimiento);
        modelEmpleado.setDireccion(direccion);
        modelEmpleado.setEmail(email);
        modelEmpleado.setCelular(celular);
        modelEmpleado.setRolId(idRegistrarRoles);
        
        dash_DAO.RegistrarEmpleado(modelEmpleado);
        regEmpl_view.dispose();        
    }

 
}
