package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.empleado.Empleado;
import vista.iniciar_sesion.inicio_sesion;
import vista.olvidaste_contraseña.popmenu_OlvidasteContraseña;
import vista.recuperar_contraseña.popmenu_RecuperarContraseña;

public class Dash_OlvidasteContraseña_Controller implements ActionListener
{
    private Empleado modelEmpleado;
    private popmenu_OlvidasteContraseña OlvEm_view;
    private DashboardDAO dashDAO;  
    private inicio_sesion vista;
    
    public Dash_OlvidasteContraseña_Controller(Empleado modelEmpleado, popmenu_OlvidasteContraseña OlvEm_view) {
        this.modelEmpleado = modelEmpleado;
        this.OlvEm_view = OlvEm_view;
        dashDAO = new DashboardDAOImpl();
        
        OlvEm_view.btn_verificar.addActionListener(this);
        
        OlvEm_view.btn_cerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == OlvEm_view.btn_verificar)
        {if (OlvEm_view.txt_dni.getText().length() == 8)
            {
                Empleado ceroEmpleado = dashDAO.VisualizarBuscarEmpleado(OlvEm_view.txt_dni.getText());
                // Verifica si ceroEmpleado es null antes de acceder a sus métodos
                if (ceroEmpleado != null)
                {if (!OlvEm_view.txt_dni.getText().equals(ceroEmpleado.getDni()))
                    {JOptionPane.showMessageDialog(OlvEm_view, "NO EXISTEN LOS DATOS EN LA BASE DE DATOS");}
                    else
                    {
                        Empleado newmodelEmpleado = new Empleado();
                        popmenu_RecuperarContraseña RecCon_view = new popmenu_RecuperarContraseña(vista, true);
                        Dash_RecuperarContraseña_Controller dashRecCo_Regcontroller;
                        dashRecCo_Regcontroller = new Dash_RecuperarContraseña_Controller(newmodelEmpleado, RecCon_view);
                        RecCon_view.setController(newmodelEmpleado, dashRecCo_Regcontroller);
                        RecCon_view.setTraerIdUsuario(String.valueOf(OlvEm_view.txt_dni.getText()));
                        RecCon_view.setVisible(true);
                        OlvEm_view.dispose();
                    }
                }else {JOptionPane.showMessageDialog(OlvEm_view, "NO EXISTE EL DNI EN LA BASE DE DATOS");}
            }else {JOptionPane.showMessageDialog(OlvEm_view, "DATOS INCORRECTOS");}
        }else if (e.getSource() == OlvEm_view.btn_cerrar){OlvEm_view.dispose();}
    }




}
