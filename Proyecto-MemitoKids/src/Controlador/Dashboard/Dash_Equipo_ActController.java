package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.equipo_organizacion.Equipo_Organizacion;
import vista.db_popmenu_opciones_equipo.popmenu_actualizar_equipo;

public class Dash_Equipo_ActController  implements ActionListener
{
    private Equipo_Organizacion modelEquipo;
    private popmenu_actualizar_equipo regAct_view;
    private DashboardDAO dash_DAO;

    public Dash_Equipo_ActController(Equipo_Organizacion modelEquipo, popmenu_actualizar_equipo regAct_view) {
        this.modelEquipo = modelEquipo;
        this.regAct_view = regAct_view;
        dash_DAO = new DashboardDAOImpl();
        
        CargarDatosVisualizar();
        regAct_view.btn_cancelar_equipo.addActionListener(this);
        regAct_view.btn_actualizar_equipo.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == regAct_view.btn_actualizar_equipo)
        {Actualizarequipo();}
        else if(e.getSource() == regAct_view.btn_cancelar_equipo){regAct_view.dispose();}
    }
    
    
    public void CargarDatosVisualizar() {
        regAct_view.txt_equipoid.setText(String.valueOf(modelEquipo.getEquipoId()));
        regAct_view.txt_equipo.setText(modelEquipo.getNombreEquipo());
    }
        
        
    private void Actualizarequipo() {
        String registrar_equipo = regAct_view.txt_equipo.getText();
        int equipo_id = Integer.parseInt(regAct_view.txt_equipoid.getText());
        
        modelEquipo.setNombreEquipo(registrar_equipo);
        modelEquipo.setEquipoId(equipo_id);
        dash_DAO.ActualizarDatosSeleccionadosEquipo(modelEquipo);
        regAct_view.dispose();
    }

}
