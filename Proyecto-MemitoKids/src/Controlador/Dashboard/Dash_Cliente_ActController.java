
package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.cliente.Cliente;
import vista.db_popmenu_opciones_cliente.popmenu_actualizar_cliente;


public class Dash_Cliente_ActController implements ActionListener{
    
    private Cliente modelCliente;
    private popmenu_actualizar_cliente actCli_view;
    private DashboardDAO dashDAO;

    public Dash_Cliente_ActController(Cliente modelCliente, popmenu_actualizar_cliente actCli_view)
    {
        this.modelCliente = modelCliente;
        this.actCli_view = actCli_view;
        dashDAO = new DashboardDAOImpl();
        
        CargarDatosVisu();
        
        actCli_view.btn_cancelar_cliente.addActionListener(this);
        actCli_view.btn_actualizar_cliente.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == actCli_view.btn_actualizar_cliente){actualizarCliente();}
        else if(e.getSource() == actCli_view.btn_cancelar_cliente){actCli_view.dispose();}
    }      
    
        // CARGAR DATOS DEL CLIENTE
    private void CargarDatosVisu()
    { 
        actCli_view.txt_nombres.setText(modelCliente.getNombre());
        actCli_view.txt_apellidos.setText(modelCliente.getApellido());
        actCli_view.txt_dni.setText(modelCliente.getDni());
        actCli_view.txt_direccion.setText(modelCliente.getDireccion());
        actCli_view.txt_telefono.setText(modelCliente.getTelefono());
        actCli_view.label_id.setText(String.valueOf(modelCliente.getClienteId()));
    }    
    
    private void actualizarCliente()
    {
        String nombres = actCli_view.txt_nombres.getText();
        String apellidos = actCli_view.txt_apellidos.getText();
        String dni = actCli_view.txt_dni.getText();
        String direccion = actCli_view.txt_direccion.getText();
        String telefono = actCli_view.txt_telefono.getText();
        int cliente_id = Integer.parseInt(actCli_view.label_id.getText());
        
        modelCliente.setNombre(nombres);
        modelCliente.setApellido(apellidos);
        modelCliente.setDni(dni);
        modelCliente.setDireccion(direccion);
        modelCliente.setTelefono(telefono);
        modelCliente.setClienteId(cliente_id);
        
        dashDAO.ActualizarDatosSeleccionadosCliente(modelCliente);
        actCli_view.dispose();
    }    
    
}
