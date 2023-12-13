package Controlador.Usuario;
import Controlador.Dashboard.Dash_Empleado_RegController;
import Controlador.Dashboard.Dash_OlvidasteContraseña_Controller;
import Controlador.Dashboard.DashboardController;
import DAO.Usuario.UsuarioDAO;
import DAO.Usuario.UsuarioDAOImpl;
import DTO.Usuario.UsuarioDTO;
import vista.dashboard.dashboard_principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.dashboard.ModelDashboard;
import tabla.empleado.Empleado;
import vista.db_popmenu_opciones_empleado.popmenu_registrar_empleado;
import vista.iniciar_sesion.inicio_sesion;
import vista.olvidaste_contraseña.popmenu_OlvidasteContraseña;

public class InicioSesionController implements ActionListener {

    private final JTextField txtcorreo;
    private final JPasswordField txtcontrasena;
    private final JButton btn_ini_ses;
    private final inicio_sesion vista;
    public InicioSesionController(JTextField txtcorreo, JPasswordField txtcontrasena, JButton btn_ini_ses, inicio_sesion vista) {
        this.txtcorreo = txtcorreo;
        this.txtcontrasena = txtcontrasena;
        this.btn_ini_ses = btn_ini_ses;
        this.vista = vista;

        this.btn_ini_ses.addActionListener(this);
        this.vista.btn_olvidastecontraseña.addActionListener(this);
        this.vista.btn_registrarse.addActionListener(this);
        this.vista.btn_cerrar.addActionListener(this);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_ini_ses) {
            String correo = txtcorreo.getText();
            String contrasena = new String(txtcontrasena.getPassword());
            // Crear una instancia del DTO con los datos ingresados
            UsuarioDTO usuarioDTO = new UsuarioDTO(correo, contrasena);
            // Crear una instancia del DAO
            UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
            // Verificar si el usuario existe en la base de datos
            UsuarioDTO usuario = usuarioDAO.buscarUsuario(usuarioDTO.getCorreo(), usuarioDTO.getContrasena());
            if (usuario != null)
            {
                // CREAR MODELO DASHBOARD PARA ENVIAR ESOS DATOS DEL USUARIO DTO
                ModelDashboard modDash = new ModelDashboard(correo, contrasena);
                // CREAMOS LAS VISTAS DEL DASHBOARD
                dashboard_principal dashview = new dashboard_principal();
                // CREAMOS EL CONTROLADOR DEL DASHBOARD CON LOS PARAMETROS DE LA VISTA Y EL MODELO
                DashboardController dashcontroller = new DashboardController(dashview, modDash);
                // LLAMAMOS EL SET CONTROLLER CON PARAMETROS DEL CONTROLADOR DEL DASHBOARD Y EL MODELO DEL DASHBOARD
                dashview.setController(dashcontroller, modDash);
                // LLevar el correo para usarlo como filtro para traer los datos del nombre del administrador al dashboard
                dashview.setTraercorreo(correo);
                // HACEMOS VISIBLE LA VISTA
                dashview.setVisible(true);
                vista.dispose();// Cerrar la vista actual
                JOptionPane.showMessageDialog(vista, "Inicio de sesión exitoso");
            } else
            {// El usuario no existe, mostrar un mensaje de error en la vista
             JOptionPane.showMessageDialog(vista, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);}
        }
        else if (e.getSource() == vista.btn_registrarse)
        {
            popmenu_registrar_empleado regEmpl_view = new popmenu_registrar_empleado(vista, true);
            Empleado modelEmpleado = new Empleado();
            Dash_Empleado_RegController dashEmpl_RegController = new Dash_Empleado_RegController(modelEmpleado, regEmpl_view);
            regEmpl_view.setController(dashEmpl_RegController, modelEmpleado);
            regEmpl_view.setVisible(true);
            
        }
        else if (e.getSource() == vista.btn_olvidastecontraseña)
        {
            popmenu_OlvidasteContraseña OlvEm_view = new popmenu_OlvidasteContraseña(vista, true);
            Empleado modelEmpleado = new Empleado();
            Dash_OlvidasteContraseña_Controller dashOlvEm_Regcontroller = new Dash_OlvidasteContraseña_Controller(modelEmpleado, OlvEm_view);
            OlvEm_view.setController(modelEmpleado, dashOlvEm_Regcontroller);
            OlvEm_view.setVisible(true);
        }
        else if (e.getSource() == vista.btn_cerrar){vista.dispose();}
        
        

    }

}
