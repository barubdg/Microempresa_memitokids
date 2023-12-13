
package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.paquete.Paquete;
import vista.db_popmenu_opciones_paquete.popmenu_visualizar_paquete;

public class Dash_Paquete_VisuController implements ActionListener
{
    Paquete modelPaquete;
    private popmenu_visualizar_paquete visuPaq_view;
    private DashboardDAO dashDAO;

    public Dash_Paquete_VisuController(Paquete modelPaquete, popmenu_visualizar_paquete visuPaq_view) {
        this.modelPaquete = modelPaquete;
        this.visuPaq_view = visuPaq_view;
        dashDAO = new DashboardDAOImpl();
        
        NoEditarJTextField();        
        CargarDatosVisu();
        
        visuPaq_view.btn_visualizar_paquete.addActionListener(this);
        visuPaq_view.btn_cancelar_paquete.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == visuPaq_view.btn_visualizar_paquete) {}
        else if (e.getSource() == visuPaq_view.btn_cancelar_paquete){visuPaq_view.dispose();}
    }
    
    
        // CARGAR DATOS DEL PAQUETE
    private void CargarDatosVisu()
    {
        visuPaq_view.txt_paquete_id.setText(String.valueOf(modelPaquete.getPaqueteId()));
        visuPaq_view.txt_nombrepaquete.setText(modelPaquete.getNombrePaquete());
        visuPaq_view.txt_descripcion.setText(modelPaquete.getDescripcion());
        visuPaq_view.txt_precio.setText(String.valueOf(modelPaquete.getPrecio()));
    }

        // ESTE METODO SIRVE PARA QUE LOS COMPONENTES NO SEAN EDITABLES (YA QUE ES LA INTERFAZ VISUALIZAR)
    private void NoEditarJTextField()
    {
        List<JTextField> txtfield = new ArrayList<>();
        txtfield.add(visuPaq_view.txt_nombrepaquete);
        txtfield.add(visuPaq_view.txt_descripcion);
        txtfield.add(visuPaq_view.txt_precio);
        
        for (JTextField jTextField : txtfield) {jTextField.setEditable(false);}  
    }    
    
}
