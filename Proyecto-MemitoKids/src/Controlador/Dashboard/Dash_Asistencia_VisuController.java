package Controlador.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.asistencia.Asistencia;
import vista.db_popmenu_opciones_asistencia.popmenu_visualizar_asistencia;

public class Dash_Asistencia_VisuController implements ActionListener{
    private Asistencia modelAsistencia;
    private popmenu_visualizar_asistencia visuAs_view;
    private DashboardDAO dash_DAO;

    public Dash_Asistencia_VisuController(Asistencia modelAsistencia, popmenu_visualizar_asistencia visuAs_view) {
        this.modelAsistencia = modelAsistencia;
        this.visuAs_view = visuAs_view;
        dash_DAO = new DashboardDAOImpl();
        
        CargarDatosVisualizar();
        
        visuAs_view.btn_cancelar_asistencia.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == visuAs_view.btn_cancelar_asistencia){visuAs_view.dispose();}
    }
    
    
    public void CargarDatosVisualizar()
    {
        visuAs_view.txt_idasistencia.setText(String.valueOf(modelAsistencia.getAsistenciaId()));
        visuAs_view.cbx_evento.addItem(modelAsistencia.getEven().getNombreEvento());
        visuAs_view.cbx_empleado.addItem(modelAsistencia.getEmp().getNombre() +" "+modelAsistencia.getEmp().getApellido());
        visuAs_view.cbx_equipo.addItem(modelAsistencia.getEq_org().getNombreEquipo());        
    }
    
}
