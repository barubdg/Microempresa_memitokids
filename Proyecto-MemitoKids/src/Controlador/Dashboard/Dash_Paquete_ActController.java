
package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.paquete.Paquete;
import vista.db_popmenu_opciones_paquete.popmenu_actualizar_paquete;

public class Dash_Paquete_ActController implements ActionListener
{
    private Paquete modelPaquete;
    private popmenu_actualizar_paquete actPaq_view;
    private DashboardDAO dashDAO;  

    public Dash_Paquete_ActController(Paquete modelPaquete, popmenu_actualizar_paquete actPaq_view) {
        this.modelPaquete = modelPaquete;
        this.actPaq_view = actPaq_view;
        dashDAO = new DashboardDAOImpl();
        
    
        CargarDatosVisu();

        actPaq_view.btn_actualizar_paquete.addActionListener(this);
        actPaq_view.btn_cancelar_paquete.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == actPaq_view.btn_actualizar_paquete){actualizarPaquete();}
        else if(e.getSource() == actPaq_view.btn_cancelar_paquete){actPaq_view.dispose();}
    }   
    
    private void actualizarPaquete()
    {
        String nombrepaquete = actPaq_view.txt_nombrepaquete.getText();
        String descripcion = actPaq_view.txt_descripcion.getText();
        double precio = Double.parseDouble(actPaq_view.txt_precio.getText());
        int paquete_id = Integer.parseInt(actPaq_view.txt_paquete_id.getText());
        
        modelPaquete.setNombrePaquete(nombrepaquete);
        modelPaquete.setDescripcion(descripcion);
        modelPaquete.setPrecio(precio);
        modelPaquete.setPaqueteId(paquete_id);
        
        dashDAO.ActualizarDatosSeleccionadosPaquete(modelPaquete);
        actPaq_view.dispose();
    }
    
            // CARGAR DATOS DEL PAQUETE
    private void CargarDatosVisu()
    {
        actPaq_view.txt_paquete_id.setText(String.valueOf(modelPaquete.getPaqueteId()));
        actPaq_view.txt_nombrepaquete.setText(modelPaquete.getNombrePaquete());
        actPaq_view.txt_descripcion.setText(modelPaquete.getDescripcion());
        actPaq_view.txt_precio.setText(String.valueOf(modelPaquete.getPrecio()));
    }
    
}
