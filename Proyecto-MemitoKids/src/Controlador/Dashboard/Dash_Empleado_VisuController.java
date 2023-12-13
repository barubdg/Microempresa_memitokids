
package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.empleado.Empleado;
import vista.db_popmenu_opciones_empleado.popmenu_visualizar_empleado;


public class Dash_Empleado_VisuController implements ActionListener {
    
    private Empleado modelEmpleado;
    private popmenu_visualizar_empleado visuEmpl_view;
    private DashboardDAO dash_DAO;

    public Dash_Empleado_VisuController(Empleado modelEmpleado, popmenu_visualizar_empleado visuEmpl_view) {
        this.modelEmpleado = modelEmpleado;
        this.visuEmpl_view = visuEmpl_view;
        dash_DAO = new DashboardDAOImpl();
        
        NoEditarJTextField();
        CargarDatosEmpleado();
        
        visuEmpl_view.btn_cancelar_empleado.addActionListener(this);
        visuEmpl_view.btn_visualizar_empleado.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == visuEmpl_view.btn_visualizar_empleado)
        {

            if (visuEmpl_view.txt_busqueda_dni.getText() != null && visuEmpl_view.txt_busqueda_dni.getText().length() >= 8)
            {
                String obtener_dni = visuEmpl_view.txt_busqueda_dni.getText();
                Empleado newEmpleado = dash_DAO.VisualizarBuscarEmpleado(obtener_dni);

                visuEmpl_view.txt_empleado_id.setText(String.valueOf(newEmpleado.getEmpleadoId()));
                visuEmpl_view.txt_rol_id.setText(String.valueOf(newEmpleado.getRolId()));
                visuEmpl_view.txt_usuario_id.setText(String.valueOf(newEmpleado.getUsu().getUsuario_id()));
                
                visuEmpl_view.txt_nombres.setText(newEmpleado.getNombre());
                visuEmpl_view.txt_apellido.setText(newEmpleado.getApellido());
                visuEmpl_view.txt_dni.setText(newEmpleado.getDni());
                visuEmpl_view.txt_fechanacimiento.setText(newEmpleado.getFechaNacimiento());
                visuEmpl_view.txt_direccion.setText(newEmpleado.getDireccion());
                visuEmpl_view.txt_email.setText(newEmpleado.getEmail());
                visuEmpl_view.txt_telefono.setText(newEmpleado.getCelular());
                String itemSelect = newEmpleado.getRol().getNombre_rol();
                visuEmpl_view.cbx_tiporol.setSelectedItem(itemSelect);
                System.out.println(newEmpleado.getRol().getNombre_rol());
                
                
                if (newEmpleado.getRol().getNombre_rol().equalsIgnoreCase("Empleado"))
                {
                    visuEmpl_view.txt_correo.setText("");
                    visuEmpl_view.txt_constrasena.setText("");
                } else
                {
                    visuEmpl_view.txt_correo.setText(newEmpleado.getUsu().getCorreo());
                    visuEmpl_view.txt_constrasena.setText(newEmpleado.getUsu().getContraseña());
                }
            } else
            {
                if (visuEmpl_view.txt_busqueda_dni.getText() == null) {JOptionPane.showMessageDialog(visuEmpl_view, "INGRESAR DNI PARA VISUALIZAR");}
                else {JOptionPane.showMessageDialog(visuEmpl_view, "SOLO SE ACEPTAN 8 DIGITOS");}
            }
        } else if (e.getSource() == visuEmpl_view.btn_cancelar_empleado) {
            visuEmpl_view.dispose();
        }

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
        
        visuEmpl_view.txt_empleado_id.setText(empleadoId);
        visuEmpl_view.txt_rol_id.setText(rolId);
        visuEmpl_view.txt_usuario_id.setText(usuarioId);
        
        visuEmpl_view.txt_nombres.setText(nombre);
        visuEmpl_view.txt_apellido.setText(apellido);
        visuEmpl_view.txt_dni.setText(dni);
        visuEmpl_view.txt_fechanacimiento.setText(fechaNacimiento);
        visuEmpl_view.txt_direccion.setText(direccion);
        visuEmpl_view.txt_email.setText(email);
        visuEmpl_view.txt_telefono.setText(celular);        
        visuEmpl_view.cbx_tiporol.setSelectedItem(nombrerol);
        if(nombrerol.equals("Empleado"))
        {
            visuEmpl_view.txt_correo.setText("");
            visuEmpl_view.txt_constrasena.setText("");
        }
        else
        {
            visuEmpl_view.txt_correo.setText(correo);
            visuEmpl_view.txt_constrasena.setText(contraseña);
        }
        
    }
    
    
    private void NoEditarJTextField() {
        List<JTextField> txtfield = new ArrayList<>();
        txtfield.add(visuEmpl_view.txt_nombres);
        txtfield.add(visuEmpl_view.txt_apellido);
        txtfield.add(visuEmpl_view.txt_dni);
        txtfield.add(visuEmpl_view.txt_fechanacimiento);
        txtfield.add(visuEmpl_view.txt_direccion);
        txtfield.add(visuEmpl_view.txt_email);
        txtfield.add(visuEmpl_view.txt_telefono);
        txtfield.add(visuEmpl_view.txt_correo);
        txtfield.add(visuEmpl_view.txt_constrasena);
        

        for (JTextField jTextField : txtfield) {
            jTextField.setEditable(false);
        }
        
        visuEmpl_view.cbx_tiporol.setEditable(false);
    }
}
