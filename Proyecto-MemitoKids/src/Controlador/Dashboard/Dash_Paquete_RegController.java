
package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.paquete.Paquete;
import vista.db_popmenu_opciones_paquete.popmenu_registrar_paquete;

public class Dash_Paquete_RegController implements ActionListener {
    
    private Paquete modelPaquete;
    private popmenu_registrar_paquete regPaq_view;
    private DashboardDAO dash_DAO;

    public Dash_Paquete_RegController(Paquete modelPaquete, popmenu_registrar_paquete regPaq_view) {
        this.modelPaquete = modelPaquete;
        this.regPaq_view = regPaq_view;
        dash_DAO = new DashboardDAOImpl();
        
        regPaq_view.btn_registrar_paquete.addActionListener(this);
        regPaq_view.btn_cancelar_paquete.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {   
        if(e.getSource() == regPaq_view.btn_registrar_paquete){RegistrarPaquete();}
        else if(e.getSource() == regPaq_view.btn_cancelar_paquete){regPaq_view.dispose();}
        
        
    }

    private void RegistrarPaquete()
    {
        String nombre_paquete = regPaq_view.txt_nombrepaquete.getText();
        String descripcion = regPaq_view.txt_descripcion.getText();
        double precio = Double.parseDouble(regPaq_view.txt_precio.getText());
        
        modelPaquete.setNombrePaquete(nombre_paquete);
        modelPaquete.setDescripcion(descripcion);
        modelPaquete.setPrecio(precio);
        
        dash_DAO.RegistrarPaquete(modelPaquete);
        regPaq_view.dispose();
    }
    
}
