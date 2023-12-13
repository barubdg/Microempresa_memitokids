package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.empleado.Empleado;
import tabla.usuarios.Usuarios;
import vista.recuperar_contraseña.popmenu_RecuperarContraseña;

public class Dash_RecuperarContraseña_Controller implements ActionListener
{
    private Empleado modelEmpleado;
    private popmenu_RecuperarContraseña RecCo_view;
    private DashboardDAO dashDAO; 

    public Dash_RecuperarContraseña_Controller(Empleado modelEmpleado, popmenu_RecuperarContraseña RecCo_view) {
        this.modelEmpleado = modelEmpleado;
        this.RecCo_view = RecCo_view;
        dashDAO = new DashboardDAOImpl();
        
        RecCo_view.btn_registrarcontraseña.addActionListener(this);
        RecCo_view.btn_cerrar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {if(e.getSource() == RecCo_view.btn_registrarcontraseña){RegistrarContraseña();}
    else if(e.getSource() == RecCo_view.btn_cerrar){RecCo_view.dispose();}}
    
    private void RegistrarContraseña()
    {
        String contraseña = String.valueOf(RecCo_view.txt_contraseña.getPassword());
        String confirmarContra = String.valueOf(RecCo_view.txt_confirmarcontraseña.getPassword());
        
        if(contraseña.equals(confirmarContra))
        {
            Usuarios modelUsuarios = new Usuarios();
            modelUsuarios.setUsuario_id(Integer.parseInt(RecCo_view.txt_idusuario.getText()));
            modelUsuarios.setContraseña(contraseña);
            dashDAO.ActualizarUsuarios(modelUsuarios);
            JOptionPane.showMessageDialog(RecCo_view, "Contraseña Actualizada correctamente");
            RecCo_view.dispose();
        }
        else{JOptionPane.showMessageDialog(RecCo_view, "Las contraseñas son diferentes");}   
    }
}
