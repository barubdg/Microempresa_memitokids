package Controlador.Dashboard;

import Conexion.ConexionSQLWorkbrench;
import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.WindowConstants;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import tabla.evento.Evento;
import vista.db_popmenu_opciones_evento.generar_reporte_evento;

public class Dash_GenerarReporte_Evento implements ActionListener {
    
    private generar_reporte_evento genRepEv_view;
    private Evento modelEvento;
    private DashboardDAO dash_DAO;

    public Dash_GenerarReporte_Evento(generar_reporte_evento genRepEv_view, Evento modelEvento) {
        this.genRepEv_view = genRepEv_view;
        this.modelEvento = modelEvento;
        dash_DAO = new DashboardDAOImpl();
        
        cargarEventoEnComboBox();
        
        genRepEv_view.btn_generarreporte_evento.addActionListener(this);
        genRepEv_view.btn_cancelar_reportevento.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == genRepEv_view.btn_generarreporte_evento)
        {
            Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
            JasperReport reporte = null;
            String path="src\\reportes\\reporte_evento\\ReportEvento.jasper";

            Map parametro = new HashMap();
            int idEvento = Integer.parseInt(genRepEv_view.txt_idevento.getText());
            
            parametro.put("id_evento",idEvento);
            
            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperPrint jprint = null;
            try {
                jprint = JasperFillManager.fillReport(path, parametro, conexion);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperViewer view = new JasperViewer(jprint,false);            
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);            
            view.setVisible(true);
            
        }
        else{genRepEv_view.dispose();}
    }
   
    
    /* SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE - SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE*/
    private void cargarEventoEnComboBox() {
        List<Evento> eventos = dash_DAO.obtenerEventos();
        // Limpia el modelo actual del JComboBox
        genRepEv_view.cbx_evento.setModel(new DefaultComboBoxModel<>());
        // Agrega cada EVENTO al JComboBox solo con el NOMBRE
        for (Evento evento : eventos) {genRepEv_view.cbx_evento.addItem(evento.getNombreEvento());}
        // Agrega un ActionListener al JComboBox para manejar eventos de selección
        genRepEv_view.cbx_evento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el apellido)
                String nombreSeleccionado = (String) genRepEv_view.cbx_evento.getSelectedItem();
                // Obtén el ID del cliente correspondiente al apellido seleccionado
                int idEvento = obtenerIdEventoPorNombre(nombreSeleccionado);
                // Actualiza el texto del JLabel con el ID del cliente
                genRepEv_view.txt_idevento.setText(String.valueOf(idEvento));
            }
        });
    }
    // Método auxiliar para obtener el ID del EVENTO por el NOMBRE
    private int obtenerIdEventoPorNombre(String nombre) {
        List<Evento> eventos = dash_DAO.obtenerEventos();
        for (Evento evento : eventos) {
            if (evento.getNombreEvento().equals(nombre)) {
                return evento.getEventoId();
            }
        }
        return -1; // Retorna -1 si no se encuentra el evento
    }
    /* FIN SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE - FIN SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE*/    

    
}
