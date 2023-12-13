package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.equipo_organizacion.Equipo_Organizacion;
import vista.db_popmenu_opciones_equipo.popmenu_registrar_equipo;

public class Dash_Equipo_RegController implements ActionListener{
    
    private Equipo_Organizacion modelEquipo;
    private popmenu_registrar_equipo regEvEq_view;
    private DashboardDAO dash_DAO;

    public Dash_Equipo_RegController(Equipo_Organizacion modelEquipo, popmenu_registrar_equipo regEvEq_view) {
        this.modelEquipo = modelEquipo;
        this.regEvEq_view = regEvEq_view;
        dash_DAO = new DashboardDAOImpl();
        
        regEvEq_view.btn_registrar_equipo.addActionListener(this);
        regEvEq_view.btn_cancelar_equipo.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == regEvEq_view.btn_registrar_equipo){Registrarequipo();}
        else if (e.getSource() == regEvEq_view.btn_cancelar_equipo) {regEvEq_view.dispose();}

    }
    
    private void Registrarequipo()
    {       
        String registrar_equipo = regEvEq_view.txt_equipo.getText();
        modelEquipo.setNombreEquipo(registrar_equipo);
        dash_DAO.RegistrarEquipo(modelEquipo);
        regEvEq_view.dispose();
    }
    

    
    
    
    
}
