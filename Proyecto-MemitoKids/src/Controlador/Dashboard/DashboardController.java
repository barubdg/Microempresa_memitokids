package Controlador.Dashboard;

import Conexion.ConexionSQLWorkbrench;
import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import modelo.dashboard.ModelDashboard;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import tabla.asistencia.Asistencia;
import tabla.cliente.Cliente;
import tabla.empleado.Empleado;
import tabla.equipo_organizacion.Equipo_Organizacion;
import tabla.evento.Evento;
import tabla.movilidad.Movilidad;
import tabla.paquete.Paquete;
import tabla.usuarios.Usuarios;
import vista.configuracion.popmenu_configuracion;
import vista.dashboard.dashboard_principal;
import vista.db_popmenu_opciones_asistencia.generar_reporte_asistencia;
import vista.db_popmenu_opciones_asistencia.popmenu_actualizar_asistencia;
import vista.db_popmenu_opciones_asistencia.popmenu_registrar_asistencia;
import vista.db_popmenu_opciones_asistencia.popmenu_visualizar_asistencia;
import vista.db_popmenu_opciones_cliente.popmenu_actualizar_cliente;
import vista.db_popmenu_opciones_cliente.popmenu_registrar_cliente;
import vista.db_popmenu_opciones_cliente.popmenu_visualizar_cliente;
import vista.db_popmenu_opciones_empleado.popmenu_actualizar_empleado;
import vista.db_popmenu_opciones_empleado.popmenu_registrar_empleado;
import vista.db_popmenu_opciones_empleado.popmenu_visualizar_empleado;
import vista.db_popmenu_opciones_equipo.popmenu_actualizar_equipo;
import vista.db_popmenu_opciones_equipo.popmenu_registrar_equipo;
import vista.db_popmenu_opciones_equipo.popmenu_visualizar_equipo;
import vista.db_popmenu_opciones_evento.generar_reporte_evento;
import vista.db_popmenu_opciones_evento.generar_reporte_factura;
import vista.db_popmenu_opciones_evento.generar_reporte_movilidad;
import vista.db_popmenu_opciones_evento.popmenu_actualizar_evento;
import vista.db_popmenu_opciones_evento.popmenu_registrar_evento;
import vista.db_popmenu_opciones_evento.popmenu_visualizar_evento;
import vista.db_popmenu_opciones_paquete.popmenu_actualizar_paquete;
import vista.db_popmenu_opciones_paquete.popmenu_registrar_paquete;
import vista.db_popmenu_opciones_paquete.popmenu_visualizar_paquete;


public class DashboardController implements ActionListener {
    
    private dashboard_principal dashview;
    private ModelDashboard dashmodel;
    private DashboardDAO dashDAO;
    private int PosicionMouse;
    private int obtenerId; // SIRVE PARA RECIBIR EL VALOR DE LA CELDA PARA ELIMINAR EL DATO

    public DashboardController(dashboard_principal dashview, ModelDashboard dashmodel) {
        this.dashview = dashview;
        this.dashmodel = dashmodel;
        dashDAO = new DashboardDAOImpl();
        
        
        Cliente modeloCliente = dashDAO.TraerCantidadClientesEmpleados();
        dashview.txt_cantidadClientes.setText(String.valueOf(modeloCliente.getClienteId()));
        dashview.txt_cantidadEmpleados.setText(String.valueOf(modeloCliente.getModelEmpleado().getEmpleadoId()));
        
        dashview.btn_dashboard.addActionListener(this);
        dashview.btn_cliente.addActionListener(this);
        dashview.btn_empleado.addActionListener(this);
        dashview.btn_paquete.addActionListener(this);
        dashview.btn_evento.addActionListener(this);
        dashview.btn_equipo.addActionListener(this);
        dashview.btn_asistencia.addActionListener(this);
        dashview.btn_reporte.addActionListener(this);
        dashview.btn_informacion.addActionListener(this);
        dashview.btn_configuracion.addActionListener(this);
        dashview.btn_salir.addActionListener(this);
        
        
        // BOTONES DE REGISTRO DEL PANEL CLIENTE - EMPLEADO - PAQUETE - EVENTO - EQUIPO - ASISTENCIA
        dashview.btn_nuevo_registro_cli.addActionListener(this);       
        dashview.btn_nuevo_registro_empl.addActionListener(this);
        dashview.btn_nuevo_registro_paq.addActionListener(this);
        dashview.btn_nuevo_registro_eve.addActionListener(this);
        dashview.btn_nuevo_registro_eq.addActionListener(this);
        dashview.btn_nuevo_registro_asi.addActionListener(this);
        
        
        // BOTONES PARA LOS BOTONES BUSCAR DE CADA PANEL
        dashview.btn_buscar_asi.addActionListener(this);
        
        
        
        // AGREGAR EL panel_opGen AL menuGen PARA VISUALIZAR LOS BOTONES DEL PANEL (Visualizar, Editar, Eliminar)
        dashview.menuGen.add(dashview.panel_opGen);
        
        // BOTONES POPMENU
        dashview.btn_opcitavisualizar.addActionListener(this);
        dashview.btn_opcitactualizar.addActionListener(this);
        dashview.btn_opcitaeliminar.addActionListener(this);

        // BOTONES DE REPORTES
        dashview.btn_generar_reporteCliente.addActionListener(this);
        dashview.btn_generar_reporteEmpleado.addActionListener(this);
        dashview.btn_generar_reportePaquete.addActionListener(this);
        dashview.btn_generar_reporteEvento.addActionListener(this);
        dashview.btn_generar_reporteEquipo.addActionListener(this);
        dashview.btn_generar_reporteAsistencia.addActionListener(this);
        dashview.btn_generar_reporteMovilidad.addActionListener(this);
        dashview.btn_generar_reporteFactura.addActionListener(this);
        
        
        
        // PARA ESCUCHAR EL EVENTO CLICKED - - ---------------------------------
            // ESCUCHAR PARA LA TABLA CLIENTE
        dashview.tablaCliente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                DashboardController.this.tablaClientemouseClicked(evt);
                // Obtener la columna seleccionada
                int column = dashview.tablaCliente.columnAtPoint(evt.getPoint());

                // Obtener la fila seleccionada
                int row = dashview.tablaCliente.rowAtPoint(evt.getPoint());

                // Verificar si la fila y la columna son válidas
                if (row >= 0 && row < dashview.tablaCliente.getRowCount() && column >= 0 && column < dashview.tablaCliente.getColumnCount()) {
                    // Obtener el contenido de la celda seleccionada en la columna
                    Object value = dashview.tablaCliente.getValueAt(row, column);
                    obtenerId =  (int) value; //Obtenemos el Id para eliminar el dato
                    // Imprimir el contenido de la celda seleccionada
                    System.out.println("Contenido de la celda seleccionada: " + value);
 
                }
            }
        });
            // ESCUCHAR PARA LA TABLA EMPLEADO        
        dashview.tablaEmpleado.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                DashboardController.this.tablaEmpleadomouseClicked(evt);
                // Obtener la columna seleccionada
                int column = dashview.tablaEmpleado.columnAtPoint(evt.getPoint());

                // Obtener la fila seleccionada
                int row = dashview.tablaEmpleado.rowAtPoint(evt.getPoint());

                // Verificar si la fila y la columna son válidas
                if (row >= 0 && row < dashview.tablaEmpleado.getRowCount() && column >= 0 && column < dashview.tablaEmpleado.getColumnCount()) {
                    // Obtener el contenido de la celda seleccionada en la columna
                    Object value = dashview.tablaEmpleado.getValueAt(row, column);
                    obtenerId =  (int) value; //Obtenemos el Id para eliminar el dato
                    // Imprimir el contenido de la celda seleccionada
                    System.out.println("Contenido de la celda seleccionada: " + value);
 
                }
            }
        });        
            // ESCUCHAR PARA LA TABLA PAQUETE        
        dashview.tablaPaquete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                DashboardController.this.tablaPaquetemouseClicked(evt);
                // Obtener la columna seleccionada
                int column = dashview.tablaPaquete.columnAtPoint(evt.getPoint());

                // Obtener la fila seleccionada
                int row = dashview.tablaPaquete.rowAtPoint(evt.getPoint());

                // Verificar si la fila y la columna son válidas
                if (row >= 0 && row < dashview.tablaPaquete.getRowCount() && column >= 0 && column < dashview.tablaPaquete.getColumnCount()) {
                    // Obtener el contenido de la celda seleccionada en la columna
                    Object value = dashview.tablaPaquete.getValueAt(row, column);
                    obtenerId =  (int) value; //Obtenemos el Id para eliminar el dato
                    // Imprimir el contenido de la celda seleccionada
                    System.out.println("Contenido de la celda seleccionada: " + value);
 
                }
            }
        }); 
            // ESCUCHAR PARA LA TABLA EVENTO        
        dashview.tablaEvento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                DashboardController.this.tablaEventomouseClicked(evt);
                // Obtener la columna seleccionada
                int column = dashview.tablaEvento.columnAtPoint(evt.getPoint());

                // Obtener la fila seleccionada
                int row = dashview.tablaEvento.rowAtPoint(evt.getPoint());

                // Verificar si la fila y la columna son válidas
                if (row >= 0 && row < dashview.tablaEvento.getRowCount() && column >= 0 && column < dashview.tablaEvento.getColumnCount()) {
                    // Obtener el contenido de la celda seleccionada en la columna
                    Object value = dashview.tablaEvento.getValueAt(row, column);
                    obtenerId =  (int) value; //Obtenemos el Id para eliminar el dato
                    // Imprimir el contenido de la celda seleccionada
                    System.out.println("Contenido de la celda seleccionada: " + value);
 
                }
            }
        });
            // ESCUCHAR PARA LA TABLA EQUIPO
        dashview.tablaEquipo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                DashboardController.this.tablaEquipomouseClicked(evt);
                // Obtener la columna seleccionada
                int column = dashview.tablaEquipo.columnAtPoint(evt.getPoint());

                // Obtener la fila seleccionada
                int row = dashview.tablaEquipo.rowAtPoint(evt.getPoint());

                // Verificar si la fila y la columna son válidas
                if (row >= 0 && row < dashview.tablaEquipo.getRowCount() && column >= 0 && column < dashview.tablaEquipo.getColumnCount()) {
                    // Obtener el contenido de la celda seleccionada en la columna
                    Object value = dashview.tablaEquipo.getValueAt(row, column);
                    obtenerId =  (int) value; //Obtenemos el Id para eliminar el dato
                    // Imprimir el contenido de la celda seleccionada
                    System.out.println("Contenido de la celda seleccionada: " + value);
 
                }
            }
        });
            // ESCUCHAR PARA LA TABLA ASISTENCIA
        dashview.tablaAsistencia.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                DashboardController.this.tablaAsistenciamouseClicked(evt);
                // Obtener la columna seleccionada
                int column = dashview.tablaAsistencia.columnAtPoint(evt.getPoint());

                // Obtener la fila seleccionada
                int row = dashview.tablaAsistencia.rowAtPoint(evt.getPoint());

                // Verificar si la fila y la columna son válidas
                if (row >= 0 && row < dashview.tablaAsistencia.getRowCount() && column >= 0 && column < dashview.tablaAsistencia.getColumnCount()) {
                    // Obtener el contenido de la celda seleccionada en la columna
                    Object value = dashview.tablaAsistencia.getValueAt(row, column);
                    obtenerId =  (int) value; //Obtenemos el Id para eliminar el dato
                    // Imprimir el contenido de la celda seleccionada
                    System.out.println("Contenido de la celda seleccionada: " + value);
 
                }
            }
        });
        // FIN PARA ESCUCHAR LOS EVENTOS CLICKER -------------------------------

        
        
        
        
        // PARA ESCUCHAR EL EVENTO DE BUSQUEDA RAPIDA ---------------------------
            // ESCUCHAR BUSQUEDA RAPIDA CLIENTE PARA LA TABLA CLIENTE
        dashview.txt_busquedarapida_cli.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {BusquedaRapidaTablaCliente();}
            @Override
            public void removeUpdate(DocumentEvent e) {BusquedaRapidaTablaCliente();}
            @Override
            public void changedUpdate(DocumentEvent e) {}            
        });
            // ESCUCHAR BUSQUEDA RAPIDA EMPLEADO PARA LA TABLA EMPLEADO
        dashview.txt_busquedarapida_empl.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {BusquedaRapidaTablaEmpleado();}
            @Override
            public void removeUpdate(DocumentEvent e) {BusquedaRapidaTablaEmpleado();}
            @Override
            public void changedUpdate(DocumentEvent e) {}            
        });
            // ESCUCHAR BUSQUEDA RAPIDA PAQUETE PARA LA TABLA PAQUETE
        dashview.txt_busquedarapida_paq.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {BusquedaRapidaTablaPaquete();}
            @Override
            public void removeUpdate(DocumentEvent e) {BusquedaRapidaTablaPaquete();}
            @Override
            public void changedUpdate(DocumentEvent e) {}            
        });        
            // ESCUCHAR BUSQUEDA RAPIDA EVENTO PARA LA TABLA EVENTO
        dashview.txt_busquedarapida_eve.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {BusquedaRapidaTablaEvento();}
            @Override
            public void removeUpdate(DocumentEvent e) {BusquedaRapidaTablaEvento();}
            @Override
            public void changedUpdate(DocumentEvent e) {}            
        });
            // ESCUCHAR BUSQUEDA RAPIDA EQUIPO PARA LA TABLA EQUIPO
        dashview.txt_busquedarapida_eq.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {BusquedaRapidaTablaEquipo();}
            @Override
            public void removeUpdate(DocumentEvent e) {BusquedaRapidaTablaEquipo();}
            @Override
            public void changedUpdate(DocumentEvent e) {}            
        });
        if (dashview.btn_buscar_asi.isSelected() == true)
        {
                // NO USARLO - NO USARLO - NO USARLO
//            // ESCUCHAR LA BUSQUEDA RAPIDA ASISTENCIA PARA LA TABLA ASISTENCIA
//            dashview.txt_busquedarapida_asi.getDocument().addDocumentListener(new DocumentListener() {
//                @Override
//                public void insertUpdate(DocumentEvent e) {
//                    BusquedaRapidaTablaAsistencia();
//                }
//
//                @Override
//                public void removeUpdate(DocumentEvent e) {
//                    BusquedaRapidaTablaAsistencia();
//                }
//
//                @Override
//                public void changedUpdate(DocumentEvent e) {
//                }
//            });
//            // FIN PARA ESCUCHAR EL EVENTO DE BUSQUEDA RAPIDA --------------------------- 
        } else
        {
  
            // ESCUCHAR LA BUSQUEDA RAPIDA ASISTENCIA PARA LA TABLA ASISTENCIA
            dashview.txt_busquedarapida_asi.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    BusquedaRapidaTablaAsistenciaporIdEvento();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    BusquedaRapidaTablaAsistenciaporIdEvento();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                }
            });
            // FIN PARA ESCUCHAR EL EVENTO DE BUSQUEDA RAPIDA ---------------------------  
        }
        
        
        
     
        
        
    }
    
    
    // FUNCIONES DE LOS BOTONES PRINCIPALES
    @Override
    public void actionPerformed(ActionEvent e) {
     
    // BOTONES GENERALES LATERALES DEL DASHBOARD - BOTONES GENERALES LATERALES DEL DASHBOARD - BOTONES GENERALES LATERALES DEL DASHBOARD - BOTONES GENERALES LATERALES DEL DASHBOARD
        if (e.getSource() == dashview.btn_dashboard) {
            habilitarbotones(true, false, false,false, false, false, false, false, false);
            Cliente modeloCliente = dashDAO.TraerCantidadClientesEmpleados();
            dashview.txt_cantidadClientes.setText(String.valueOf(modeloCliente.getClienteId()));
            dashview.txt_cantidadEmpleados.setText(String.valueOf(modeloCliente.getModelEmpleado().getEmpleadoId()));
            CambiarPanel(dashview.panel_dashboard);
        } else if (e.getSource() == dashview.btn_cliente) {
            habilitarbotones(false,true,false,false,false,false,false,false,false);
            CambiarPanel(dashview.panel_cliente);
            ObtenerDatosTablaClientes();
        } else if (e.getSource() == dashview.btn_empleado) {
            habilitarbotones(false,false,true,false,false,false,false,false,false);
            CambiarPanel(dashview.panel_empleado);
            ObtenerDatosTablaEmpleados();
        } else if (e.getSource() == dashview.btn_paquete) {
            habilitarbotones(false,false,false,true,false,false,false,false,false);
            CambiarPanel(dashview.panel_paquete);
            ObtenerDatosTablaPaquetes();
        } else if (e.getSource() == dashview.btn_evento) {
            habilitarbotones(false,false,false,false,true,false,false,false,false);
            CambiarPanel(dashview.panel_evento);
            ObtenerDatosTablaEventos();
        } else if (e.getSource() == dashview.btn_equipo){
            habilitarbotones(false, false, false, false, false, true, false,false, false);
            CambiarPanel(dashview.panel_equipo);
            ObtenerDatosTablaEquipos();
        } else if (e.getSource() == dashview.btn_asistencia){
            habilitarbotones(false, false, false, false, false,false, true,false, false);
            CambiarPanel(dashview.panel_asistencia);
            ObtenerDatosTablaAsistencia();
            cargarEventoEnComboBox();
        }
        else if (e.getSource() == dashview.btn_reporte) {
            habilitarbotones(false, false, false, false, false, false,false, true, false);
            CambiarPanel(dashview.panel_reporte);            
        } else if (e.getSource() == dashview.btn_informacion) {
            habilitarbotones(false, false, false, false, false, false,false, false, true);
            CambiarPanel(dashview.panel_informacion);
        } else if (e.getSource() == dashview.btn_configuracion)
        {
            popmenu_configuracion conf_view = new popmenu_configuracion(dashview, true);
            Usuarios modelUsuario = new Usuarios();
            Dash_Configuracion_Controller dashConf_Controller = new Dash_Configuracion_Controller(modelUsuario, conf_view);
            conf_view.setController(dashConf_Controller, modelUsuario);
            conf_view.setTraerIdUsuario(dashview.txt_idUsuario.getText());
            conf_view.setVisible(true);
        } 
          else if (e.getSource() == dashview.btn_salir){dashview.dispose();}
    // FIN BOTONES GENERALES LATERALES DEL DASHBOARD - FIN BOTONES GENERALES LATERALES DEL DASHBOARD - FIN BOTONES GENERALES LATERALES DEL DASHBOARD - FIN BOTONES GENERALES LATERALES DEL DASHBOARD
        
        
        // DEL PANEL CLIENTES - BOTONES GENERALES (REGISTRAR - VISUALIZAR - ACTUALIZAR - ELIMINAR)
            // BOTON REGISTRAR CLIENTE
        else if (e.getSource() == dashview.btn_nuevo_registro_cli)
        {
            popmenu_registrar_cliente regCli_view = new popmenu_registrar_cliente(dashview, true);
            Cliente modelCliente = new Cliente();
            Dash_Cliente_RegController dashCli_Regcontroller = new Dash_Cliente_RegController(modelCliente, regCli_view);
            regCli_view.setController(dashCli_Regcontroller, modelCliente);
            regCli_view.setVisible(true); 
        }
            // BOTON REGISTRAR EMPLEADO
        else if (e.getSource() == dashview.btn_nuevo_registro_empl)
        {
            popmenu_registrar_empleado regEmpl_view = new popmenu_registrar_empleado(dashview, true);
            Empleado modelEmpleado = new Empleado();
            Dash_Empleado_RegController dashEmpl_RegController = new Dash_Empleado_RegController(modelEmpleado, regEmpl_view);
            regEmpl_view.setController(dashEmpl_RegController, modelEmpleado);
            regEmpl_view.setVisible(true);
        }
            // BOTON REGISTRAR PAQUETE
        else if(e.getSource() == dashview.btn_nuevo_registro_paq)
        {
            popmenu_registrar_paquete regPaq_view = new popmenu_registrar_paquete(dashview, true);
            Paquete modelPaquete = new Paquete();
            Dash_Paquete_RegController dashPaq_RegController = new Dash_Paquete_RegController(modelPaquete, regPaq_view);
            regPaq_view.setController(modelPaquete, dashPaq_RegController);
            regPaq_view.setVisible(true);
        }
            // BOTON REGISTRAR EVENTO
        else if(e.getSource() == dashview.btn_nuevo_registro_eve)
        {
            popmenu_registrar_evento regEv_view = new popmenu_registrar_evento(dashview, true);
            Evento modelEvento = new Evento();
            Dash_Evento_RegController dashEv_RegController = new Dash_Evento_RegController(modelEvento, regEv_view);
            regEv_view.setController(modelEvento, dashEv_RegController);
            regEv_view.setVisible(true);
        }
            // BOTON REGISTRAR EQUIPO
        else if (e.getSource() == dashview.btn_nuevo_registro_eq)
        {
            popmenu_registrar_equipo regEq_view = new popmenu_registrar_equipo(dashview, true);
            Equipo_Organizacion modelEquipo = new Equipo_Organizacion();
            Dash_Equipo_RegController dashEvEq_RegController = new Dash_Equipo_RegController(modelEquipo, regEq_view);
            regEq_view.setController(modelEquipo, dashEvEq_RegController);
            regEq_view.setVisible(true);
        }
            // BOTON REGISTRAR ASISTENCIA
        else if (e.getSource() == dashview.btn_nuevo_registro_asi)
        {
            popmenu_registrar_asistencia regAs_view = new popmenu_registrar_asistencia(dashview, true);
            Asistencia modelAsistencia = new Asistencia();
            Dash_Asistencia_RegController dashEvAs_RegController = new Dash_Asistencia_RegController(modelAsistencia, regAs_view);
            regAs_view.setController(modelAsistencia, dashEvAs_RegController);
            regAs_view.setVisible(true);
        }
            // BOTON VISUALIZAR GENERAL PARA CADA PANEL (CLIENTE - EMPLEADO - PAQUETE - EVENTO)
        else if (e.getSource() == dashview.btn_opcitavisualizar)
        {
            // SI EL BOTON CLIENTE ESTÁ SELECCIONADO SE EJECUTA LA PORCIÓN DE CÓDIGO
            if(dashview.btn_cliente.isSelected())
            {
                Cliente newmodelCliente = dashDAO.VisualizarDatosSeleccionadosCliente(obtenerId);
                popmenu_visualizar_cliente visuCli_view = new popmenu_visualizar_cliente(dashview, true);
                Dash_Cliente_VisuController dashClivisuController = new Dash_Cliente_VisuController(newmodelCliente, visuCli_view);
                visuCli_view.setController(dashClivisuController, newmodelCliente);
                visuCli_view.setVisible(true);
            }
            else if(dashview.btn_empleado.isSelected())
            {
                Empleado newmodelEmpleado = dashDAO.VisualizarDatosSeleccionadosEmpleado(obtenerId);
                popmenu_visualizar_empleado visuEmpl_view = new popmenu_visualizar_empleado(dashview, true);
                Dash_Empleado_VisuController dashEmplvisuController = new Dash_Empleado_VisuController(newmodelEmpleado, visuEmpl_view);
                visuEmpl_view.setController(dashEmplvisuController, newmodelEmpleado);
                visuEmpl_view.setVisible(true);
            }
            else if(dashview.btn_paquete.isSelected())
            {
                Paquete newmodelPaquete = dashDAO.VisualizarDatosSeleccionadosPaquete(obtenerId);
                popmenu_visualizar_paquete visuPaq_view = new popmenu_visualizar_paquete(dashview, true);
                Dash_Paquete_VisuController dashPaqvisuController = new Dash_Paquete_VisuController(newmodelPaquete, visuPaq_view);
                visuPaq_view.setController(newmodelPaquete, dashPaqvisuController);
                visuPaq_view.setVisible(true);
            }
            else if (dashview.btn_evento.isSelected())
            {
                Evento newmodelEvento = dashDAO.VisualizarDatosSeleccionadosEvento(obtenerId);
                popmenu_visualizar_evento visuEv_view = new popmenu_visualizar_evento(dashview, true);
                Dash_Evento_VisuController dashEvvisuController = new Dash_Evento_VisuController(newmodelEvento, visuEv_view);
                visuEv_view.setController(newmodelEvento, dashEvvisuController);
                visuEv_view.setVisible(true);
                
            }
            else if (dashview.btn_equipo.isSelected())
            {
                Equipo_Organizacion newmodelEquipo = dashDAO.VisualizarDatosSeleccionadosEquipo(obtenerId);
                popmenu_visualizar_equipo visuEq_view = new popmenu_visualizar_equipo(dashview, true);
                Dash_Equipo_VisuController dashEq_VisuController = new Dash_Equipo_VisuController(newmodelEquipo, visuEq_view);
                visuEq_view.setController(newmodelEquipo, dashEq_VisuController);
                visuEq_view.setVisible(true);
            }
            else if(dashview.btn_asistencia.isSelected())
            {
                Asistencia newmodelAsistencia = dashDAO.VisualizarDatosSeleccionadosAsistencia(obtenerId);
                popmenu_visualizar_asistencia visuAs_view = new popmenu_visualizar_asistencia(dashview, true);
                Dash_Asistencia_VisuController dashAs_VisuController = new Dash_Asistencia_VisuController(newmodelAsistencia, visuAs_view);
                visuAs_view.setController(newmodelAsistencia, dashAs_VisuController);
                visuAs_view.setVisible(true);
            }
        }
        else if (e.getSource() == dashview.btn_opcitactualizar)
        {
            // SI EL BOTON CLIENTE ESTÁ SELECCIONADO SE EJECUTA LA PORCIÓN DE CÓDIGO
            if(dashview.btn_cliente.isSelected())
            {
                Cliente newmodelCliente = dashDAO.VisualizarDatosSeleccionadosCliente(obtenerId);
                popmenu_actualizar_cliente actCli_view = new popmenu_actualizar_cliente(dashview, true);
                Dash_Cliente_ActController dashCliactController = new Dash_Cliente_ActController(newmodelCliente, actCli_view);
                actCli_view.setController(dashCliactController, newmodelCliente);
                actCli_view.setVisible(true);
            }
            else if(dashview.btn_empleado.isSelected())
            {
                Empleado newmodelEmpleado = dashDAO.VisualizarDatosSeleccionadosEmpleado(obtenerId);
                popmenu_actualizar_empleado actEmp_view = new popmenu_actualizar_empleado(dashview, true);
                Dash_Empleado_ActController dashEmpactController = new Dash_Empleado_ActController(newmodelEmpleado, actEmp_view);
                actEmp_view.setController(dashEmpactController, newmodelEmpleado);
                actEmp_view.setVisible(true);
            }
            else if(dashview.btn_paquete.isSelected())
            {
                Paquete newmodelPaquete = dashDAO.VisualizarDatosSeleccionadosPaquete(obtenerId);
                popmenu_actualizar_paquete actPaq_view = new popmenu_actualizar_paquete(dashview, true);
                Dash_Paquete_ActController dashPaqactController = new Dash_Paquete_ActController(newmodelPaquete, actPaq_view);
                actPaq_view.setController(newmodelPaquete, dashPaqactController);
                actPaq_view.setVisible(true);
            }
            else if(dashview.btn_evento.isSelected())
            {
                Evento newmodelEvento = dashDAO.VisualizarDatosSeleccionadosEvento(obtenerId);
                popmenu_actualizar_evento actEv_view = new popmenu_actualizar_evento(dashview, true);
                Dash_Evento_ActController dashEvactController = new Dash_Evento_ActController(newmodelEvento, actEv_view);
                actEv_view.setController(newmodelEvento, dashEvactController);
                actEv_view.setVisible(true);
            }
            else if(dashview.btn_equipo.isSelected())
            {
                Equipo_Organizacion newmodelEquipo = dashDAO.VisualizarDatosSeleccionadosEquipo(obtenerId);
                popmenu_actualizar_equipo ActEq_view = new popmenu_actualizar_equipo(dashview, true);
                Dash_Equipo_ActController dashEq_ActController = new Dash_Equipo_ActController(newmodelEquipo, ActEq_view);
                ActEq_view.setController(newmodelEquipo, dashEq_ActController);
                ActEq_view.setVisible(true);
            }
            else if(dashview.btn_asistencia.isSelected())
            {
                Asistencia newmodelAsitencia = dashDAO.VisualizarDatosSeleccionadosAsistencia(obtenerId);
                popmenu_actualizar_asistencia actAs_view = new popmenu_actualizar_asistencia(dashview, true);
                Dash_Asistencia_ActController dashAct_VisuController = new Dash_Asistencia_ActController(newmodelAsitencia, actAs_view);
                actAs_view.setController(newmodelAsitencia, dashAct_VisuController);
                actAs_view.setVisible(true);
            }
        }
        else if (e.getSource() == dashview.btn_opcitaeliminar)
        {
            // SI EL BOTON CLIENTE ESTÁ SELECCIONADO SE EJECUTA LA PORCIÓN DE CÓDIGO
            if(dashview.btn_cliente.isSelected())
            {
                dashDAO.EliminarDatosSeleccionadosCliente(obtenerId);
                dashview.menuGen.setVisible(false); //ESCONDER EL POPMENU AL SELECCIONAR LA OPCION ELIMINAR
            }
            else if(dashview.btn_empleado.isSelected())
            {
                dashDAO.EliminarDatosSeleccionadosEmpleado(obtenerId);
                dashview.menuGen.setVisible(false);
            }
            else if(dashview.btn_paquete.isSelected())
            {
                dashDAO.EliminarDatosSeleccionadosPaquete(obtenerId);
                dashview.menuGen.setVisible(false);
            }
            else if(dashview.btn_evento.isSelected())
            {
                dashDAO.EliminarDatosSeleccionadosEvento(obtenerId);
                dashview.menuGen.setVisible(false);
            }
            else if(dashview.btn_equipo.isSelected())
            {
                dashDAO.EliminarDatosSeleccionadosEquipo(obtenerId);
                dashview.menuGen.setVisible(false);
            }
            else if(dashview.btn_asistencia.isSelected())
            {
                dashDAO.EliminarDatosSeleccionadosAsistencia(obtenerId);
                dashview.menuGen.setVisible(false);
            }
            
        }
        /*BOTON BUSCAR DE CADA PANEL - BOTON BUSCAR DE CADA PANEL - BOTON BUSCAR DE CADA PANEL - BOTON BUSCAR DE CADA PANEL - BOTON BUSCAR DE CADA PANEL - BOTON BUSCAR DE CADA PANEL*/
        else if (e.getSource() == dashview.btn_buscar_asi)
        {
            int EventoId = Integer.parseInt(dashview.txteventoid_asi.getText());
            ObtenerDatosTablaAsistenciaporIdEvento(EventoId);
            dashview.btn_buscar_asi.setSelected(true);
        }
        else if(e.getSource() == dashview.btn_generar_reporteCliente)
        {
            Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
            JasperReport reporte = null;
            String path="src\\reportes\\reporte_cliente\\ReportCliente.jasper";            
            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperPrint jprint = null;
            try {
                jprint = JasperFillManager.fillReport(path, null,conexion);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);            
            view.setVisible(true);
            
        }
        else if(e.getSource() == dashview.btn_generar_reporteEmpleado)
        {
            Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
            JasperReport reporte = null;
            String path="src\\reportes\\reporte_empleado\\ReportEmpleado.jasper";            
            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperPrint jprint = null;
            try {
                jprint = JasperFillManager.fillReport(path, null,conexion);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperViewer view = new JasperViewer(jprint,false);            
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);            
            view.setVisible(true); 
        }
        else if(e.getSource() == dashview.btn_generar_reportePaquete)
        {
            Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
            JasperReport reporte = null;
            String path="src\\reportes\\reporte_paquete\\ReportPaquete.jasper";            
            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperPrint jprint = null;
            try {
                jprint = JasperFillManager.fillReport(path, null,conexion);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperViewer view = new JasperViewer(jprint,false);            
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);            
            view.setVisible(true); 
        }
        else if(e.getSource() == dashview.btn_generar_reporteEvento)
        {
            Evento newmodelEvento = new Evento();
            generar_reporte_evento GenRepEv_view = new generar_reporte_evento(dashview, true);
            Dash_GenerarReporte_Evento dashGen_RepEvController = new Dash_GenerarReporte_Evento(GenRepEv_view, newmodelEvento);
            GenRepEv_view.setController(newmodelEvento, dashGen_RepEvController);
            GenRepEv_view.setVisible(true);
        }
        else if(e.getSource() == dashview.btn_generar_reporteEquipo)
        {
            Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
            JasperReport reporte = null;
            String path="src\\reportes\\reporte_equipo\\ReportEquipo.jasper";            
            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperPrint jprint = null;
            try {
                jprint = JasperFillManager.fillReport(path, null,conexion);
            } catch (JRException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }            
            JasperViewer view = new JasperViewer(jprint,false);            
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);            
            view.setVisible(true); 
        }
        else if(e.getSource() == dashview.btn_generar_reporteAsistencia)
        {
            Evento newmodelEvento = new Evento();
            generar_reporte_asistencia GenRepAs_view = new generar_reporte_asistencia(dashview, true);
            Dash_GenerarReporte_Asistencia dashGen_RepAsController = new Dash_GenerarReporte_Asistencia(GenRepAs_view, newmodelEvento);
            GenRepAs_view.setController(newmodelEvento, dashGen_RepAsController);
            GenRepAs_view.setVisible(true); 
        }
        else if(e.getSource() == dashview.btn_generar_reporteMovilidad)
        {
            Movilidad newmodelMovilidad = new Movilidad();
            generar_reporte_movilidad GenRepMov_view = new generar_reporte_movilidad(dashview, true);
            Dash_GenerarReporte_Movilidad dashGen_RepMovController = new Dash_GenerarReporte_Movilidad(newmodelMovilidad, GenRepMov_view);
            GenRepMov_view.setController(newmodelMovilidad, dashGen_RepMovController);
            GenRepMov_view.setVisible(true);
        }
        else if(e.getSource() == dashview.btn_generar_reporteFactura)
        {
            Evento newmodelEvento = new Evento();
            generar_reporte_factura GenRepFa_view = new generar_reporte_factura(dashview, true);
            Dash_GenerarReporte_Factura dashGen_RepFaController = new Dash_GenerarReporte_Factura(GenRepFa_view, newmodelEvento);
            GenRepFa_view.setController(newmodelEvento, dashGen_RepFaController);
            GenRepFa_view.setVisible(true); 
        }
        
        
    }     
     
    
    //EVENTOS DE MOUSE - EVENTOS DE MOUSE - EVENTOS DE MOUSE - EVENTOS DE MOUSE - EVENTOS DE MOUSE - EVENTOS DE MOUSE - EVENTOS DE MOUSE - EVENTOS DE MOUSE - EVENTOS DE MOUSE
    private void tablaClientemouseClicked(MouseEvent evt) {
        int row = dashview.tablaCliente.rowAtPoint(evt.getPoint());
        if ((evt.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
            dashview.tablaCliente.setRowSelectionInterval(row, row);
            PosicionMouse = evt.getY() / 16;
            dashview.menuGen.show(evt.getComponent(), evt.getX(), evt.getY());
        } else {dashview.tablaCliente.setRowSelectionInterval(row, row);}
    }
    private void tablaEmpleadomouseClicked(MouseEvent evt) {
        int row = dashview.tablaEmpleado.rowAtPoint(evt.getPoint());
        if ((evt.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
            dashview.tablaEmpleado.setRowSelectionInterval(row, row);
            PosicionMouse = evt.getY() / 16;
            dashview.menuGen.show(evt.getComponent(), evt.getX(), evt.getY());
        } else {dashview.tablaEmpleado.setRowSelectionInterval(row, row);}
    }
    private void tablaPaquetemouseClicked(MouseEvent evt) {
        int row = dashview.tablaPaquete.rowAtPoint(evt.getPoint());
        if ((evt.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
            dashview.tablaPaquete.setRowSelectionInterval(row, row);
            PosicionMouse = evt.getY() / 16;
            dashview.menuGen.show(evt.getComponent(), evt.getX(), evt.getY());
        } else {dashview.tablaPaquete.setRowSelectionInterval(row, row);}
    }    
    private void tablaEventomouseClicked(MouseEvent evt) {
        int row = dashview.tablaEvento.rowAtPoint(evt.getPoint());
        if ((evt.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
            dashview.tablaEvento.setRowSelectionInterval(row, row);
            PosicionMouse = evt.getY() / 16;
            dashview.menuGen.show(evt.getComponent(), evt.getX(), evt.getY());
        } else {dashview.tablaEvento.setRowSelectionInterval(row, row);}
    }
    private void tablaEquipomouseClicked(MouseEvent evt) {
        int row = dashview.tablaEquipo.rowAtPoint(evt.getPoint());
        if ((evt.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
            dashview.tablaEquipo.setRowSelectionInterval(row, row);
            PosicionMouse = evt.getY() / 16;
            dashview.menuGen.show(evt.getComponent(), evt.getX(), evt.getY());
        } else {dashview.tablaEquipo.setRowSelectionInterval(row, row);}
    }
    private void tablaAsistenciamouseClicked(MouseEvent evt) {
        int row = dashview.tablaAsistencia.rowAtPoint(evt.getPoint());
        if ((evt.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
            dashview.tablaAsistencia.setRowSelectionInterval(row, row);
            PosicionMouse = evt.getY() / 16;
            dashview.menuGen.show(evt.getComponent(), evt.getX(), evt.getY());
        } else {dashview.tablaAsistencia.setRowSelectionInterval(row, row);}
    }
    // FIN EVENTOS DE MOUSE - FIN EVENTOS DE MOUSE -  FIN EVENTOS DE MOUSE -  FIN EVENTOS DE MOUSE -  FIN EVENTOS DE MOUSE -  FIN EVENTOS DE MOUSE -  FIN EVENTOS DE MOUSE   
    
    
    
    // VARIABLES PARA BUSQUEDA RAPIDA DE CADA TABLA
    String textoBusqueda = null;
    DefaultTableModel modeloTabla = null;
    
    private void BusquedaRapidaTablaCliente() {
        textoBusqueda = dashview.txt_busquedarapida_cli.getText().toLowerCase();
        modeloTabla = (DefaultTableModel) dashview.tablaCliente.getModel();
        if (modeloTabla != null)
        {
            modeloTabla.setRowCount(0);
            List<Cliente> Clientes = dashDAO.obtenerClientes();
            for (Cliente cliente : Clientes)
            {
                if (cliente.getNombre().toLowerCase().contains(textoBusqueda)
                        || cliente.getApellido().toLowerCase().contains(textoBusqueda)
                        || cliente.getTelefono().contains(textoBusqueda))
                {modeloTabla.addRow(new Object[]{cliente.getClienteId(), cliente.getNombre(), cliente.getApellido(), cliente.getTelefono()});}
            }

        }

    }    
    private void BusquedaRapidaTablaEmpleado()
    {
        textoBusqueda = dashview.txt_busquedarapida_empl.getText().toLowerCase();
        modeloTabla = (DefaultTableModel) dashview.tablaEmpleado.getModel();
        if (modeloTabla != null)
        {
            modeloTabla.setRowCount(0);
            List<Empleado> Empleados = dashDAO.obtenerEmpleados();
            for (Empleado empleado : Empleados)
            {
                if (empleado.getNombre().toLowerCase().contains(textoBusqueda)
                        || empleado.getApellido().toLowerCase().contains(textoBusqueda)
                        || empleado.getDni().contains(textoBusqueda))
                {modeloTabla.addRow(new Object[]{empleado.getEmpleadoId(), empleado.getNombre(), empleado.getApellido(), empleado.getDni()});}
            }
        }
    }
    private void BusquedaRapidaTablaPaquete()
    {
        textoBusqueda = dashview.txt_busquedarapida_paq.getText().toLowerCase();
        modeloTabla = (DefaultTableModel) dashview.tablaPaquete.getModel();
        if (modeloTabla != null)
        {
            modeloTabla.setRowCount(0);
            List<Paquete> Paquetes = dashDAO.obtenerPaquetes();
            for (Paquete paquete : Paquetes)
            {
                if (paquete.getNombrePaquete().toLowerCase().contains(textoBusqueda)
                        || paquete.getDescripcion().toLowerCase().contains(textoBusqueda)
                        || String.valueOf(paquete.getPrecio()).contains(textoBusqueda))
                {modeloTabla.addRow(new Object[]{paquete.getPaqueteId(), paquete.getNombrePaquete(), paquete.getDescripcion(), paquete.getPrecio()});}
            }
        }
    }
    private void BusquedaRapidaTablaEvento()
    {
        textoBusqueda = dashview.txt_busquedarapida_eve.getText().toLowerCase();
        modeloTabla = (DefaultTableModel) dashview.tablaEvento.getModel();
        if (modeloTabla != null)
        {
            modeloTabla.setRowCount(0);
            List<Evento> Eventos = dashDAO.obtenerEventos();
            for (Evento evento : Eventos)
            {
                if (evento.getNombreEvento().toLowerCase().contains(textoBusqueda)
                        || evento.getUbicacion().getDireccion().toLowerCase().contains(textoBusqueda)
                        || evento.getCliente().getNombre().toLowerCase().contains(textoBusqueda))
                {modeloTabla.addRow(new Object[]{evento.getEventoId(), evento.getNombreEvento(), evento.getUbicacion().getDireccion(), evento.getCliente().getNombre()});}
            }
        }        
    }
    private void BusquedaRapidaTablaEquipo()
    {
        textoBusqueda = dashview.txt_busquedarapida_eq.getText().toLowerCase();
        modeloTabla = (DefaultTableModel) dashview.tablaEquipo.getModel();
        if (modeloTabla != null)
        {
            modeloTabla.setRowCount(0);
            List<Equipo_Organizacion> Equipos = dashDAO.obtenerEquipos();
            for (Equipo_Organizacion equipo : Equipos)
            {
                if (equipo.getNombreEquipo().toLowerCase().contains(textoBusqueda))
                {modeloTabla.addRow(new Object[]{equipo.getEquipoId(), equipo.getNombreEquipo()});}
            }
        }        
    }
    
    // NO USARLO - NO USARLO - NO USARLO
//    private void BusquedaRapidaTablaAsistencia()
//    {
//        textoBusqueda = dashview.txt_busquedarapida_asi.getText().toLowerCase();
//        modeloTabla = (DefaultTableModel) dashview.tablaAsistencia.getModel();
//        if (modeloTabla != null)
//        {
//            modeloTabla.setRowCount(0);
//            List<Asistencia> Asistencias = dashDAO.obtenerAsistencias();
//            for (Asistencia asistencia : Asistencias)
//            {
//                if (asistencia.getEmp().getNombre().toLowerCase().contains(textoBusqueda)
//                    || asistencia.getEmp().getApellido().toLowerCase().contains(textoBusqueda)
//                    || asistencia.getEq_org().getNombreEquipo().toLowerCase().contains(textoBusqueda))
//                {modeloTabla.addRow(new Object[]{asistencia.getAsistenciaId(), asistencia.getEmp().getNombre(), asistencia.getEmp().getApellido(),asistencia.getEq_org().getNombreEquipo()});}
//            }
//        }        
//    }
    private void BusquedaRapidaTablaAsistenciaporIdEvento()
    {
        textoBusqueda = dashview.txt_busquedarapida_asi.getText().toLowerCase();
        modeloTabla = (DefaultTableModel) dashview.tablaAsistencia.getModel();
        if (modeloTabla != null)
        {
            modeloTabla.setRowCount(0);
            int EventoId = Integer.parseInt(dashview.txteventoid_asi.getText());
            List<Asistencia> Asistencias = dashDAO.obtenerEventosAsis(EventoId);
            for (Asistencia asistencia : Asistencias)
            {
                if (asistencia.getEmp().getNombre().toLowerCase().contains(textoBusqueda)
                    || asistencia.getEmp().getApellido().toLowerCase().contains(textoBusqueda)
                    || asistencia.getEq_org().getNombreEquipo().toLowerCase().contains(textoBusqueda))
                {modeloTabla.addRow(new Object[]{asistencia.getAsistenciaId(), asistencia.getEmp().getNombre(), asistencia.getEmp().getApellido(),asistencia.getEq_org().getNombreEquipo()});}
            }
        }        
    }
    
 
    
     // CARGAR TODOS LOS DATOS DEL TIPO CLIENTE A LA TABLA CLIENTES
    private void ObtenerDatosTablaClientes()
    {
        List<Cliente> Clientes = dashDAO.obtenerClientes();
        // Llenar la tabla con los datos obtenidos
        DefaultTableModel model = (DefaultTableModel) dashview.tablaCliente.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla nuevamente        

        for (Cliente cliente : Clientes) {
            // Agregar cada cliente como una fila en la tabla
            Object[] row = {
                cliente.getClienteId(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getTelefono()
            // Agrega aquí los demás datos que deseas mostrar en la tabla
            };
            model.addRow(row);
        }        
    }  
    // CARGAR TODOS LOS DATOS DEL TIPO EMPLEADO A LA TABLA EMPLEADOS
    private void ObtenerDatosTablaEmpleados()
    {
        List<Empleado> Empleados = dashDAO.obtenerEmpleados();
        // Llenar la tabla con los datos obtenidos
        DefaultTableModel model = (DefaultTableModel) dashview.tablaEmpleado.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla nuevamente        

        for (Empleado empleado : Empleados) {
            // Agregar cada administrador como una fila en la tabla
            Object[] row = {
                empleado.getEmpleadoId(),
                empleado.getNombre(),
                empleado.getApellido(),
                empleado.getDni()
            // Agrega aquí los demás datos que deseas mostrar en la tabla
            };
            model.addRow(row);
        }        
    }  
    // CARGAR TODOS LOS DATOS DEL TIPO PAQUETE A LA TABLA PAQUETES
    private void ObtenerDatosTablaPaquetes()
    {
        List<Paquete> Paquetes = dashDAO.obtenerPaquetes();
        // Llenar la tabla con los datos obtenidos
        DefaultTableModel model = (DefaultTableModel) dashview.tablaPaquete.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla nuevamente        

        for (Paquete paquete : Paquetes) {
            // Agregar cada administrador como una fila en la tabla
            Object[] row = {
                paquete.getPaqueteId(),
                paquete.getNombrePaquete(),
                paquete.getDescripcion(),
                paquete.getPrecio()
            // Agrega aquí los demás datos que deseas mostrar en la tabla
            };
            model.addRow(row);
        }
        
    }   
    // CARGAR TODOS LOS DATOS DEL TIPO PAQUETE A LA TABLA PAQUETES
    private void ObtenerDatosTablaEventos()
    {
        List<Evento> Eventos = dashDAO.obtenerEventos();
        // Llenar la tabla con los datos obtenidos
        DefaultTableModel model = (DefaultTableModel) dashview.tablaEvento.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla nuevamente        

        for (Evento evento : Eventos) {
            // Agregar cada administrador como una fila en la tabla
            Object[] row = {
                evento.getEventoId(),
                evento.getNombreEvento(),
                evento.getUbicacion().getDireccion(),
                evento.getCliente().getNombre()
            // Agrega aquí los demás datos que deseas mostrar en la tabla
            };
            model.addRow(row);
        }
        
    }    
    // CARGAR TODOS LOS DATOS DEL TIPO EQUIPO A LA TABLA EQUIPOS
    private void ObtenerDatosTablaEquipos()
    {
        List<Equipo_Organizacion> Equipos = dashDAO.obtenerEquipos();
        // Llenar la tabla con los datos obtenidos
        DefaultTableModel model = (DefaultTableModel) dashview.tablaEquipo.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla nuevamente        

        for (Equipo_Organizacion equipo : Equipos) {
            // Agregar cada administrador como una fila en la tabla
            Object[] row = {
                equipo.getEquipoId(),
                equipo.getNombreEquipo(),
            // Agrega aquí los demás datos que deseas mostrar en la tabla
            };
            model.addRow(row);
        }
    }
    // CARGAR TODOS LOS DATOS DEL TIPO ASISTENCIA A LA TABLA ASISTENCIA
    private void ObtenerDatosTablaAsistencia()
    {
        List<Asistencia> Asistencias = dashDAO.obtenerAsistencias();
        // Llenar la tabla con los datos obtenidos
        DefaultTableModel model = (DefaultTableModel) dashview.tablaAsistencia.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla nuevamente        

        for (Asistencia asistencia : Asistencias) {
            // Agregar cada administrador como una fila en la tabla
            Object[] row = {
                asistencia.getAsistenciaId(),
                asistencia.getEmp().getNombre(),
                asistencia.getEmp().getApellido(),
                asistencia.getEq_org().getNombreEquipo()
            // Agrega aquí los demás datos que deseas mostrar en la tabla
            };
            model.addRow(row);
        }
    }  
    // CARGAR TODOS LOS DATOS DEL IDEVENTO A LA ASISTENCIA DE LA TABLA ASISTENCIA
    private void ObtenerDatosTablaAsistenciaporIdEvento(int EventoId)
    {
        List<Asistencia> Asistencias = dashDAO.obtenerEventosAsis(EventoId);
        // Llenar la tabla con los datos obtenidos
        DefaultTableModel model = (DefaultTableModel) dashview.tablaAsistencia.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla nuevamente        

        for (Asistencia asistencia : Asistencias) {
            // Agregar cada administrador como una fila en la tabla
            Object[] row = {
                asistencia.getAsistenciaId(),
                asistencia.getEmp().getNombre(),
                asistencia.getEmp().getApellido(),
                asistencia.getEq_org().getNombreEquipo()
            // Agrega aquí los demás datos que deseas mostrar en la tabla
            };
            model.addRow(row);
        }
    }
    
    
    
    
        /* SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE - SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE*/
    private void cargarEventoEnComboBox() {
        List<Evento> eventos = dashDAO.obtenerEventos();
        // Limpia el modelo actual del JComboBox
        dashview.cbxColumna_asi.setModel(new DefaultComboBoxModel<>());
        // Agrega cada EVENTO al JComboBox solo con el NOMBRE
        for (Evento evento : eventos) {dashview.cbxColumna_asi.addItem(evento.getNombreEvento());}
        // Agrega un ActionListener al JComboBox para manejar eventos de selección
        dashview.cbxColumna_asi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtén el ítem seleccionado del JComboBox (que incluye el apellido)
                String nombreSeleccionado = (String) dashview.cbxColumna_asi.getSelectedItem();
                // Obtén el ID del cliente correspondiente al apellido seleccionado
                int idEvento = obtenerIdEventoPorNombre(nombreSeleccionado);
                // Actualiza el texto del JLabel con el ID del cliente
                dashview.txteventoid_asi.setText(String.valueOf(idEvento));
                dashview.btn_buscar_asi.setSelected(false);
            }
        });
    }
    // Método auxiliar para obtener el ID del EVENTO por el NOMBRE
    private int obtenerIdEventoPorNombre(String nombre) {
        List<Evento> eventos = dashDAO.obtenerEventos();
        for (Evento evento : eventos) {
            if (evento.getNombreEvento().equals(nombre)) {
                return evento.getEventoId();
            }
        }
        return -1; // Retorna -1 si no se encuentra el evento
    }
    /* FIN SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE - FIN SIRVE PARA CARGAR EVENTO EN EL JCOMBOBOX Y OBTENER EL IDEVENTO POR NOMBRE*/    

    
    
    
    
    
    private void habilitarbotones(boolean dashboard, boolean cliente, boolean empleado, boolean paquete, boolean evento, boolean equipo, boolean asistencia, boolean reporte, boolean informacion) {
        dashview.btn_dashboard.setSelected(dashboard);
        dashview.btn_cliente.setSelected(cliente);
        dashview.btn_empleado.setSelected(empleado);
        dashview.btn_paquete.setSelected(paquete);
        dashview.btn_evento.setSelected(evento);
        dashview.btn_equipo.setSelected(equipo);
        dashview.btn_asistencia.setSelected(asistencia);
        dashview.btn_reporte.setSelected(reporte);
        dashview.btn_informacion.setSelected(informacion);
    }
    private void CambiarPanel(JPanel Panel) {
        dashview.panel_secundario.removeAll();
        dashview.panel_secundario.add(Panel);
        dashview.panel_secundario.repaint();
        dashview.panel_secundario.revalidate();
    }

}
