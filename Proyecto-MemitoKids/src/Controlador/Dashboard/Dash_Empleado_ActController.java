package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.empleado.Empleado;

import vista.db_popmenu_opciones_empleado.popmenu_actualizar_empleado;

public class Dash_Empleado_ActController implements ActionListener
{
    private Empleado modelEmpleado;
  
    private popmenu_actualizar_empleado actEmp_view;
    private DashboardDAO dashDAO;

    public Dash_Empleado_ActController(Empleado modelEmpleado, popmenu_actualizar_empleado actEmp_view) {
        this.modelEmpleado = modelEmpleado;
        this.actEmp_view = actEmp_view;
        dashDAO = new DashboardDAOImpl();
        
        CargarDatosEmpleado();
        
        actEmp_view.btn_actualizar_cliente.addActionListener(this);
        actEmp_view.btn_cancelar_cliente.addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == actEmp_view.btn_actualizar_cliente){ActualizarEmpleado();}
        else if(e.getSource() == actEmp_view.btn_cancelar_cliente){actEmp_view.dispose();}
    }      
    
    private void ActualizarEmpleado() {
        

        
        String nombre = actEmp_view.txt_nombres.getText();
        String apellido = actEmp_view.txt_apellido.getText();
        String dni = actEmp_view.txt_dni.getText();
        String fechaNacimiento = actEmp_view.txt_fechanacimiento.getText();
        String direccion = actEmp_view.txt_direccion.getText();
        String email = actEmp_view.txt_email.getText();
        String celular = actEmp_view.txt_telefono.getText();
        
        String nombrerol = actEmp_view.cbx_tiporol.getSelectedItem().toString();
        
        int empleadoId = Integer.parseInt(actEmp_view.txt_empleado_id.getText());
        int rolId = Integer.parseInt(actEmp_view.txt_rol_id.getText());
        int usuarioId = Integer.parseInt(actEmp_view.txt_usuario_id.getText());
        

        String correo;
        String contraseña;
        
        if(nombrerol.equals("Administrador"))
        {
            correo = actEmp_view.txt_correo.getText();
            char [] password = actEmp_view.txt_constrasena.getPassword(); 
            contraseña = new String(password);
        }
        else
        {
            correo = "NN";
            contraseña = "NN";
        }
        
        modelEmpleado.getUsu().setCorreo(correo);
        modelEmpleado.getUsu().setContraseña(contraseña);
        
        modelEmpleado.getRol().setNombre_rol(nombrerol);
        
        
        modelEmpleado.setNombre(nombre);
        modelEmpleado.setApellido(apellido);
        modelEmpleado.setDni(dni);
        modelEmpleado.setFechaNacimiento(fechaNacimiento);
        modelEmpleado.setDireccion(direccion);
        modelEmpleado.setEmail(email);
        modelEmpleado.setCelular(celular);
        
        modelEmpleado.setEmpleadoId(empleadoId);
        modelEmpleado.setRolId(rolId);
        modelEmpleado.getRol().setUsuario_id(usuarioId);
        
        dashDAO.ActualizarDatosSeleccionadosEmpleado(modelEmpleado);
        actEmp_view.dispose();        
    }

    
    
    public void CargarDatosEmpleado(){
        String nombre = modelEmpleado.getNombre() ;
        String apellido = modelEmpleado.getApellido();
        String dni = modelEmpleado.getDni();
        String fechaNacimiento = modelEmpleado.getFechaNacimiento();
        String direccion = modelEmpleado.getDireccion();
        String email = modelEmpleado.getEmail();
        String celular = modelEmpleado.getCelular();
        
        String nombrerol = modelEmpleado.getRol().getNombre_rol();

        String correo = modelEmpleado.getUsu().getCorreo();
        String contraseña = modelEmpleado.getUsu().getContraseña();
        
        String empleadoId = String.valueOf(modelEmpleado.getEmpleadoId());
        String rolId = String.valueOf(modelEmpleado.getRolId());
        String usuarioId = String.valueOf(modelEmpleado.getUsu().getUsuario_id());
        
        actEmp_view.txt_empleado_id.setText(empleadoId);
        actEmp_view.txt_rol_id.setText(rolId);
        actEmp_view.txt_usuario_id.setText(usuarioId);
        
        actEmp_view.txt_nombres.setText(nombre);
        actEmp_view.txt_apellido.setText(apellido);
        actEmp_view.txt_dni.setText(dni);
        actEmp_view.txt_fechanacimiento.setText(fechaNacimiento);
        actEmp_view.txt_direccion.setText(direccion);
        actEmp_view.txt_email.setText(email);
        actEmp_view.txt_telefono.setText(celular);        
        actEmp_view.cbx_tiporol.setSelectedItem(nombrerol);
        if(nombrerol.equals("Empleado"))
        {
            actEmp_view.txt_correo.setText("");
            actEmp_view.txt_constrasena.setText("");
        }
        else
        {
            actEmp_view.txt_correo.setText(correo);
            actEmp_view.txt_constrasena.setText(contraseña);
        }
        
    }    
}
