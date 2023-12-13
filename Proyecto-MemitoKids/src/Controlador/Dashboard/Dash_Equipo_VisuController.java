package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.equipo_organizacion.Equipo_Organizacion;
import vista.dashboard.dashboard_principal;
import vista.db_popmenu_opciones_equipo.popmenu_visualizar_equipo;

public class Dash_Equipo_VisuController implements ActionListener {
    
    private Equipo_Organizacion modelEquipo;
    private popmenu_visualizar_equipo regVis_view;
    private dashboard_principal dashview;
    private DashboardDAO dash_DAO;

    public Dash_Equipo_VisuController(Equipo_Organizacion modelEquipo, popmenu_visualizar_equipo regVis_view) {
        this.modelEquipo = modelEquipo;
        this.regVis_view = regVis_view;
        dash_DAO = new DashboardDAOImpl();
        
        CargarDatosVisualizar();
        
        
        regVis_view.btn_cancelar_equipo.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    { 
        if(e.getSource() == regVis_view.btn_cancelar_equipo){regVis_view.dispose();}
    }
    
    public void CargarDatosVisualizar()
    {
        regVis_view.txt_idequipo.setText(String.valueOf(modelEquipo.getEquipoId()));
        regVis_view.txt_equipo.setText(modelEquipo.getNombreEquipo());
    }
    
}
