package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.cliente.Cliente;
import vista.db_popmenu_opciones_cliente.popmenu_visualizar_cliente;

public class Dash_Cliente_VisuController implements ActionListener{
    
    private Cliente modelCliente;
    private popmenu_visualizar_cliente visuCli_view;
    private DashboardDAO dash_DAO;

    public Dash_Cliente_VisuController(Cliente modelCliente, popmenu_visualizar_cliente visuCli_view) {
        this.modelCliente = modelCliente;
        this.visuCli_view = visuCli_view;
        dash_DAO = new DashboardDAOImpl();
        
        NoEditarJTextField();
        CargarDatosVisu();

        visuCli_view.btn_visualizar_cliente.addActionListener(this);
        visuCli_view.btn_cancelar_cliente.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {    
        if(e.getSource() == visuCli_view.btn_visualizar_cliente)
        {
            if (visuCli_view.txt_busqueda_dni.getText() != null && visuCli_view.txt_busqueda_dni.getText().length() >= 8)
            {
                String obtener_dni = visuCli_view.txt_busqueda_dni.getText();
                Cliente newCliente = dash_DAO.VisualizarBuscarCliente(obtener_dni);

                visuCli_view.txt_nombres.setText(newCliente.getNombre());
                visuCli_view.txt_apellidos.setText(newCliente.getApellido());
                visuCli_view.txt_dni.setText(newCliente.getDni());
                visuCli_view.txt_direccion.setText(newCliente.getDireccion());
                visuCli_view.txt_telefono.setText(newCliente.getTelefono());
                visuCli_view.label_id.setText(String.valueOf(newCliente.getClienteId()));
            } else
            {
                if(visuCli_view.txt_busqueda_dni.getText()==null)
                {JOptionPane.showMessageDialog(visuCli_view, "INGRESAR DNI PARA VISUALIZAR");}
                else{JOptionPane.showMessageDialog(visuCli_view, "SOLO SE ACEPTAN 8 DIGITOS");}
            }
        }
        else if(e.getSource() == visuCli_view.btn_cancelar_cliente){visuCli_view.dispose();}
    }
    
        // CARGAR DATOS DEL CLIENTE
    private void CargarDatosVisu()
    { 
        visuCli_view.txt_nombres.setText(modelCliente.getNombre());
        visuCli_view.txt_apellidos.setText(modelCliente.getApellido());
        visuCli_view.txt_dni.setText(modelCliente.getDni());
        visuCli_view.txt_direccion.setText(modelCliente.getDireccion());
        visuCli_view.txt_telefono.setText(modelCliente.getTelefono());
        visuCli_view.label_id.setText(String.valueOf(modelCliente.getClienteId()));
    }
    
        // ESTE METODO SIRVE PARA QUE LOS COMPONENTES NO SEAN EDITABLES (YA QUE ES LA INTERFAZ VISUALIZAR)
    private void NoEditarJTextField()
    {
        List<JTextField> txtfield = new ArrayList<>();
        txtfield.add(visuCli_view.txt_nombres);
        txtfield.add(visuCli_view.txt_apellidos);
        txtfield.add(visuCli_view.txt_dni);
        txtfield.add(visuCli_view.txt_direccion);
        txtfield.add(visuCli_view.txt_telefono);
        
        for (JTextField jTextField : txtfield) {jTextField.setEditable(false);}  
    }
    
    
}
