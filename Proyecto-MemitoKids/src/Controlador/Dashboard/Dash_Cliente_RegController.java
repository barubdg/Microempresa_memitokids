
package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.cliente.Cliente;
import vista.db_popmenu_opciones_cliente.popmenu_registrar_cliente;


public class Dash_Cliente_RegController implements ActionListener {
    
    private Cliente modelCliente;
    private popmenu_registrar_cliente regCli_view;
    private DashboardDAO dash_DAO;

    public Dash_Cliente_RegController(Cliente modelCliente, popmenu_registrar_cliente regCli_view)
    {
        this.modelCliente = modelCliente;
        this.regCli_view = regCli_view;
        dash_DAO = new DashboardDAOImpl();
        
        regCli_view.btn_registrar_cliente.addActionListener(this);
        regCli_view.btn_cancelar_cliente.addActionListener(this);        
    }
    
        @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==regCli_view.btn_registrar_cliente){RegistrarCliente();}
        else if(e.getSource()==regCli_view.btn_cancelar_cliente){regCli_view.dispose();}
    }
    
        // Registrar Pacientes
    private void RegistrarCliente()
    {
        String nombre = regCli_view.txt_nombres.getText();
        String apellido = regCli_view.txt_apellidos.getText();
        String dni = regCli_view.txt_dni.getText();
        String direccion = regCli_view.txt_direccion.getText();
        String telefono = regCli_view.txt_telefono.getText();
        
        modelCliente.setNombre(nombre);
        modelCliente.setApellido(apellido);
        modelCliente.setDni(dni);
        modelCliente.setDireccion(direccion);
        modelCliente.setTelefono(telefono);
        
        dash_DAO.RegistrarCliente(modelCliente);
        regCli_view.dispose();
    }
    
    
}
