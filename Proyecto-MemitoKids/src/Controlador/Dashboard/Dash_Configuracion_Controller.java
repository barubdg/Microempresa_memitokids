package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.empleado.Empleado;
import tabla.usuarios.Usuarios;
import vista.configuracion.popmenu_configuracion;
import vista.dashboard.dashboard_principal;
import vista.recuperar_contraseña.popmenu_RecuperarContraseña;

public class Dash_Configuracion_Controller implements ActionListener
{
    private Usuarios modelUsuario;
    private popmenu_configuracion conf_view;
    private DashboardDAO dash_DAO;
    private dashboard_principal dashview;
    
    public Dash_Configuracion_Controller(Usuarios modelUsuario, popmenu_configuracion conf_view) {
        this.modelUsuario = modelUsuario;
        this.conf_view = conf_view;
        dash_DAO = new DashboardDAOImpl();
        
        conf_view.btn_cambiarcontraseña.addActionListener(this);
        conf_view.btn_salir.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {   
        if (e.getSource() == conf_view.btn_cambiarcontraseña)
        {
            dashview = new dashboard_principal();
            Empleado newmodelEmpleado = new Empleado();
            popmenu_RecuperarContraseña RecCon_view = new popmenu_RecuperarContraseña(dashview, true);
            Dash_RecuperarContraseña_Controller dashRecCo_Regcontroller = new Dash_RecuperarContraseña_Controller(newmodelEmpleado, RecCon_view);
            RecCon_view.setController(newmodelEmpleado, dashRecCo_Regcontroller);
            String traerIdUsuario = conf_view.txt_idUsuario.getText();
            RecCon_view.setTraerIdUsuarioRecuperar(traerIdUsuario);
            RecCon_view.setVisible(true);
        }
        else if(e.getSource() == conf_view.btn_salir){conf_view.dispose();}
        
    }
    
    
}
