package vista.dashboard;

import Controlador.Dashboard.DashboardController;
import java.awt.Color;
import java.awt.Dimension;

import Design_controls.CustomScrollBarUI;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import modelo.dashboard.ModelDashboard;
import tabla.empleado.Empleado;


public class dashboard_principal extends javax.swing.JFrame {
    
    private DashboardController dashController;
    private ModelDashboard modeldash;
    private DashboardDAO dashDAO = new DashboardDAOImpl();
    private String traercorreo;

    public void setTraercorreo(String traercorreo) {
        this.traercorreo = traercorreo;
        Empleado modeloEmpleado = dashDAO.TraerNombreApellidoEmpleado(traercorreo);
        txt_nombreapellidoEmpleado.setText(modeloEmpleado.getNombre() + " " + modeloEmpleado.getApellido());
        txt_idUsuario.setText(String.valueOf(modeloEmpleado.getUsu().getUsuario_id()));
    }
    
    
    
    public void setController(DashboardController dashController,ModelDashboard modeldash)
    {this.modeldash=modeldash;
    this.dashController=dashController;}  
    
    
    public dashboard_principal() {initComponents();}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuGen = new javax.swing.JPopupMenu();
        panel_opGen = new javax.swing.JPanel();
        subpanel_opgeneral = new javax.swing.JPanel();
        btn_opcitavisualizar = new javax.swing.JButton();
        btn_opcitactualizar = new javax.swing.JButton();
        btn_opcitaeliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel_general = new javax.swing.JPanel();
        panel_lateral = new javax.swing.JPanel();
        btn_dashboard = new javax.swing.JButton();
        btn_cliente = new javax.swing.JButton();
        btn_empleado = new javax.swing.JButton();
        btn_paquete = new javax.swing.JButton();
        btn_evento = new javax.swing.JButton();
        btn_equipo = new javax.swing.JButton();
        btn_asistencia = new javax.swing.JButton();
        btn_reporte = new javax.swing.JButton();
        btn_informacion = new javax.swing.JButton();
        btn_configuracion = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panel_secundario = new javax.swing.JPanel();
        panel_dashboard = new javax.swing.JPanel();
        txt_nombreapellidoEmpleado = new javax.swing.JLabel();
        txt_cantidadClientes = new javax.swing.JLabel();
        txt_cantidadEmpleados = new javax.swing.JLabel();
        Fondo_Inicio = new javax.swing.JLabel();
        txt_idUsuario = new javax.swing.JLabel();
        panel_cliente = new javax.swing.JPanel();
        txt_busquedarapida_cli = new javax.swing.JTextField();
        cbxOrden_cli = new javax.swing.JComboBox<>();
        cbxColumna_cli = new javax.swing.JComboBox<>();
        Scroll_Cliente = new javax.swing.JScrollPane();
        Scroll_Cliente.getViewport().setOpaque(false);
        Scroll_Cliente.setBackground(new Color(0,0,0,0));
        Scroll_Cliente.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        tablaCliente = new javax.swing.JTable();
        tablaCliente.setOpaque(false);
        tablaCliente.setBackground(new Color(0,0,0,0));
        tablaCliente.getTableHeader().setVisible(false);
        tablaCliente.getTableHeader().setPreferredSize(new Dimension(0,0));
        btn_buscar_cli = new javax.swing.JButton();
        btn_nuevo_registro_cli = new javax.swing.JButton();
        Fondo_Cliente = new javax.swing.JLabel();
        panel_empleado = new javax.swing.JPanel();
        txt_busquedarapida_empl = new javax.swing.JTextField();
        cbxOrden_empl = new javax.swing.JComboBox<>();
        cbxColumna_empl = new javax.swing.JComboBox<>();
        Scroll_Empleado = new javax.swing.JScrollPane();
        Scroll_Empleado.getViewport().setOpaque(false);
        Scroll_Empleado.setBackground(new Color(0,0,0,0));
        Scroll_Empleado.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        tablaEmpleado = new javax.swing.JTable();
        tablaEmpleado.setOpaque(false);
        tablaEmpleado.setBackground(new Color(0,0,0,0));
        tablaEmpleado.getTableHeader().setVisible(false);
        tablaEmpleado.getTableHeader().setPreferredSize(new Dimension(0,0));
        btn_buscar_empl = new javax.swing.JButton();
        btn_nuevo_registro_empl = new javax.swing.JButton();
        Fondo_Empleado = new javax.swing.JLabel();
        panel_paquete = new javax.swing.JPanel();
        txt_busquedarapida_paq = new javax.swing.JTextField();
        cbxOrden_paq = new javax.swing.JComboBox<>();
        cbxColumna_paq = new javax.swing.JComboBox<>();
        Scroll_Paquete = new javax.swing.JScrollPane();
        Scroll_Paquete.getViewport().setOpaque(false);
        Scroll_Paquete.setBackground(new Color(0,0,0,0));
        Scroll_Paquete.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        tablaPaquete = new javax.swing.JTable();
        tablaPaquete.setOpaque(false);
        tablaPaquete.setBackground(new Color(0,0,0,0));
        tablaPaquete.getTableHeader().setVisible(false);
        tablaPaquete.getTableHeader().setPreferredSize(new Dimension(0,0));
        btn_buscar_paq = new javax.swing.JButton();
        btn_nuevo_registro_paq = new javax.swing.JButton();
        Fondo_Paquete = new javax.swing.JLabel();
        panel_evento = new javax.swing.JPanel();
        txt_busquedarapida_eve = new javax.swing.JTextField();
        cbxOrden_eve = new javax.swing.JComboBox<>();
        cbxColumna_eve = new javax.swing.JComboBox<>();
        Scroll_Evento = new javax.swing.JScrollPane();
        Scroll_Evento.getViewport().setOpaque(false);
        Scroll_Evento.setBackground(new Color(0,0,0,0));
        Scroll_Evento.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        tablaEvento = new javax.swing.JTable();
        tablaEvento.setOpaque(false);
        tablaEvento.setBackground(new Color(0,0,0,0));
        tablaEvento.getTableHeader().setVisible(false);
        tablaEvento.getTableHeader().setPreferredSize(new Dimension(0,0));
        btn_buscar_eve = new javax.swing.JButton();
        btn_nuevo_registro_eve = new javax.swing.JButton();
        Fondo_Evento = new javax.swing.JLabel();
        panel_equipo = new javax.swing.JPanel();
        txt_busquedarapida_eq = new javax.swing.JTextField();
        cbxOrden_eq = new javax.swing.JComboBox<>();
        cbxColumna_eq = new javax.swing.JComboBox<>();
        Scroll_Equipo = new javax.swing.JScrollPane();
        Scroll_Equipo.getViewport().setOpaque(false);
        Scroll_Equipo.setBackground(new Color(0,0,0,0));
        Scroll_Equipo.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        tablaEquipo = new javax.swing.JTable();
        tablaEquipo.setOpaque(false);
        tablaEquipo.setBackground(new Color(0,0,0,0));
        tablaEquipo.getTableHeader().setVisible(false);
        tablaEquipo.getTableHeader().setPreferredSize(new Dimension(0,0));
        btn_buscar_eq = new javax.swing.JButton();
        btn_nuevo_registro_eq = new javax.swing.JButton();
        Fondo_Equipo = new javax.swing.JLabel();
        panel_asistencia = new javax.swing.JPanel();
        txt_busquedarapida_asi = new javax.swing.JTextField();
        cbxColumna_asi = new javax.swing.JComboBox<>();
        Scroll_Asistencia = new javax.swing.JScrollPane();
        Scroll_Asistencia.getViewport().setOpaque(false);
        Scroll_Asistencia.setBackground(new Color(0,0,0,0));
        Scroll_Asistencia.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        tablaAsistencia = new javax.swing.JTable();
        tablaAsistencia.setOpaque(false);
        tablaAsistencia.setBackground(new Color(0,0,0,0));
        tablaAsistencia.getTableHeader().setVisible(false);
        tablaAsistencia.getTableHeader().setPreferredSize(new Dimension(0,0));
        btn_buscar_asi = new javax.swing.JButton();
        btn_nuevo_registro_asi = new javax.swing.JButton();
        Fondo_Asistencia = new javax.swing.JLabel();
        txteventoid_asi = new javax.swing.JLabel();
        panel_reporte = new javax.swing.JPanel();
        btn_generar_reporteCliente = new javax.swing.JButton();
        btn_generar_reporteEmpleado = new javax.swing.JButton();
        btn_generar_reportePaquete = new javax.swing.JButton();
        btn_generar_reporteEvento = new javax.swing.JButton();
        btn_generar_reporteEquipo = new javax.swing.JButton();
        btn_generar_reporteAsistencia = new javax.swing.JButton();
        btn_generar_reporteMovilidad = new javax.swing.JButton();
        btn_generar_reporteFactura = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panel_informacion = new javax.swing.JPanel();
        Fondo_Informacion = new javax.swing.JLabel();

        menuGen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 255)));

        panel_opGen.setBackground(new java.awt.Color(204, 204, 204));

        subpanel_opgeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_opcitavisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opciones_tablas/btn_opcitavisualizar.png"))); // NOI18N
        btn_opcitavisualizar.setBorder(null);
        btn_opcitavisualizar.setBorderPainted(false);
        btn_opcitavisualizar.setContentAreaFilled(false);
        btn_opcitavisualizar.setFocusPainted(false);
        btn_opcitavisualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opciones_tablas/btn_opcitavisualizar_select.png"))); // NOI18N
        subpanel_opgeneral.add(btn_opcitavisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 138, 38));

        btn_opcitactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opciones_tablas/btn_opcitactualizar.png"))); // NOI18N
        btn_opcitactualizar.setBorder(null);
        btn_opcitactualizar.setBorderPainted(false);
        btn_opcitactualizar.setContentAreaFilled(false);
        btn_opcitactualizar.setFocusPainted(false);
        btn_opcitactualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opciones_tablas/btn_opcitactualizar_select.png"))); // NOI18N
        subpanel_opgeneral.add(btn_opcitactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 40, 138, 38));

        btn_opcitaeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opciones_tablas/btn_opcitaeliminar.png"))); // NOI18N
        btn_opcitaeliminar.setBorder(null);
        btn_opcitaeliminar.setBorderPainted(false);
        btn_opcitaeliminar.setContentAreaFilled(false);
        btn_opcitaeliminar.setFocusPainted(false);
        btn_opcitaeliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opciones_tablas/btn_opcitaeliminar_select.png"))); // NOI18N
        subpanel_opgeneral.add(btn_opcitaeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 79, 138, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opciones_tablas/fondo_viedel_general.png"))); // NOI18N
        subpanel_opgeneral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 119));

        javax.swing.GroupLayout panel_opGenLayout = new javax.swing.GroupLayout(panel_opGen);
        panel_opGen.setLayout(panel_opGenLayout);
        panel_opGenLayout.setHorizontalGroup(
            panel_opGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subpanel_opgeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_opGenLayout.setVerticalGroup(
            panel_opGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subpanel_opgeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_general.setMaximumSize(new java.awt.Dimension(1280, 720));
        panel_general.setMinimumSize(new java.awt.Dimension(1280, 720));
        panel_general.setPreferredSize(new java.awt.Dimension(1280, 720));
        panel_general.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_lateral.setMaximumSize(new java.awt.Dimension(130, 720));
        panel_lateral.setMinimumSize(new java.awt.Dimension(130, 720));
        panel_lateral.setPreferredSize(new java.awt.Dimension(130, 720));
        panel_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_dashboard.png"))); // NOI18N
        btn_dashboard.setBorder(null);
        btn_dashboard.setBorderPainted(false);
        btn_dashboard.setContentAreaFilled(false);
        btn_dashboard.setFocusPainted(false);
        btn_dashboard.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_dashboard_select.png"))); // NOI18N
        panel_lateral.add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 136, 109, 25));

        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_cliente.png"))); // NOI18N
        btn_cliente.setBorder(null);
        btn_cliente.setBorderPainted(false);
        btn_cliente.setContentAreaFilled(false);
        btn_cliente.setFocusPainted(false);
        btn_cliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_cliente_select.png"))); // NOI18N
        panel_lateral.add(btn_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 195, 109, 25));

        btn_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_empleado.png"))); // NOI18N
        btn_empleado.setBorder(null);
        btn_empleado.setBorderPainted(false);
        btn_empleado.setContentAreaFilled(false);
        btn_empleado.setFocusPainted(false);
        btn_empleado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_empleado_select.png"))); // NOI18N
        panel_lateral.add(btn_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 254, 109, 25));

        btn_paquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_paquete.png"))); // NOI18N
        btn_paquete.setBorder(null);
        btn_paquete.setBorderPainted(false);
        btn_paquete.setContentAreaFilled(false);
        btn_paquete.setFocusPainted(false);
        btn_paquete.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_paquete_select.png"))); // NOI18N
        panel_lateral.add(btn_paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 314, 109, 25));

        btn_evento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_evento.png"))); // NOI18N
        btn_evento.setBorder(null);
        btn_evento.setBorderPainted(false);
        btn_evento.setContentAreaFilled(false);
        btn_evento.setFocusPainted(false);
        btn_evento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_evento_select.png"))); // NOI18N
        panel_lateral.add(btn_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 373, 109, 25));

        btn_equipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_equipo.png"))); // NOI18N
        btn_equipo.setBorder(null);
        btn_equipo.setBorderPainted(false);
        btn_equipo.setContentAreaFilled(false);
        btn_equipo.setFocusPainted(false);
        btn_equipo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_equipo_select.png"))); // NOI18N
        panel_lateral.add(btn_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 432, 109, 25));

        btn_asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_asistencia.png"))); // NOI18N
        btn_asistencia.setBorder(null);
        btn_asistencia.setBorderPainted(false);
        btn_asistencia.setContentAreaFilled(false);
        btn_asistencia.setFocusPainted(false);
        btn_asistencia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_asistencia_select.png"))); // NOI18N
        panel_lateral.add(btn_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 491, 109, 25));

        btn_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_reporte.png"))); // NOI18N
        btn_reporte.setBorder(null);
        btn_reporte.setBorderPainted(false);
        btn_reporte.setContentAreaFilled(false);
        btn_reporte.setFocusPainted(false);
        btn_reporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_reporte_select.png"))); // NOI18N
        panel_lateral.add(btn_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 550, 109, 25));

        btn_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_informacion.png"))); // NOI18N
        btn_informacion.setBorder(null);
        btn_informacion.setBorderPainted(false);
        btn_informacion.setContentAreaFilled(false);
        btn_informacion.setFocusPainted(false);
        btn_informacion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/botones-lateral/btn_informacion_select.png"))); // NOI18N
        panel_lateral.add(btn_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 609, 109, 25));

        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/configuration_93800.png"))); // NOI18N
        btn_configuracion.setBorder(null);
        btn_configuracion.setBorderPainted(false);
        btn_configuracion.setContentAreaFilled(false);
        btn_configuracion.setFocusPainted(false);
        panel_lateral.add(btn_configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 680, 18, 19));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/btn_salir_select.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setFocusPainted(false);
        panel_lateral.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 680, 18, 19));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/Fondo_lateral.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(130, 720));
        jLabel3.setMinimumSize(new java.awt.Dimension(130, 720));
        jLabel3.setPreferredSize(new java.awt.Dimension(130, 720));
        panel_lateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 720));

        panel_general.add(panel_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_secundario.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_secundario.setMinimumSize(new java.awt.Dimension(1150, 720));
        panel_secundario.setPreferredSize(new java.awt.Dimension(1150, 720));
        panel_secundario.setLayout(new java.awt.CardLayout());

        panel_dashboard.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_dashboard.setMinimumSize(new java.awt.Dimension(1150, 720));
        panel_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombreapellidoEmpleado.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        txt_nombreapellidoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombreapellidoEmpleado.setText("Nombre1 Nombre2 Apellido1 Apellido2");
        panel_dashboard.add(txt_nombreapellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 88, 660, -1));

        txt_cantidadClientes.setFont(new java.awt.Font("Arial", 1, 62)); // NOI18N
        txt_cantidadClientes.setForeground(new java.awt.Color(255, 255, 255));
        txt_cantidadClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_cantidadClientes.setText("1000");
        panel_dashboard.add(txt_cantidadClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 465, 142, 60));

        txt_cantidadEmpleados.setFont(new java.awt.Font("Arial", 1, 62)); // NOI18N
        txt_cantidadEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        txt_cantidadEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_cantidadEmpleados.setText("1000");
        panel_dashboard.add(txt_cantidadEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 465, 142, 60));

        Fondo_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/Ventana_Inicio.png"))); // NOI18N
        panel_dashboard.add(Fondo_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 720));

        txt_idUsuario.setText("jLabel4");
        panel_dashboard.add(txt_idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        panel_secundario.add(panel_dashboard, "card1");

        panel_cliente.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_cliente.setMinimumSize(new java.awt.Dimension(1150, 720));
        panel_cliente.setPreferredSize(new java.awt.Dimension(1150, 720));
        panel_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_busquedarapida_cli.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_busquedarapida_cli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_busquedarapida_cli.setForeground(new java.awt.Color(153, 51, 255));
        txt_busquedarapida_cli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_busquedarapida_cli.setBorder(null);
        panel_cliente.add(txt_busquedarapida_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 128, 500, 33));

        cbxOrden_cli.setBackground(new java.awt.Color(255, 163, 0));
        cbxOrden_cli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ascendente", "descendente" }));
        panel_cliente.add(cbxOrden_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 127, 178, 33));

        cbxColumna_cli.setBackground(new java.awt.Color(255, 163, 0));
        cbxColumna_cli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° Cliente", "Nombre", "Apellido", "Teléfono" }));
        cbxColumna_cli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panel_cliente.add(cbxColumna_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 127, 178, 33));

        Scroll_Cliente.setBackground(new java.awt.Color(0,0,0,1));
        Scroll_Cliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Scroll_Cliente.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Scroll_Cliente.setMaximumSize(new java.awt.Dimension(1110, 500));
        Scroll_Cliente.setMinimumSize(new java.awt.Dimension(1110, 500));
        Scroll_Cliente.setPreferredSize(new java.awt.Dimension(1110, 500));

        tablaCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaCliente.setForeground(new java.awt.Color(255, 153, 0));
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Cliente", "Nombre", "Apellido", "Telefono"
            }
        ));
        tablaCliente.setMaximumSize(new java.awt.Dimension(300, 800));
        tablaCliente.setMinimumSize(new java.awt.Dimension(300, 800));
        Scroll_Cliente.setViewportView(tablaCliente);

        panel_cliente.add(Scroll_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 213, 1110, 500));

        btn_buscar_cli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar.png"))); // NOI18N
        btn_buscar_cli.setBorder(null);
        btn_buscar_cli.setBorderPainted(false);
        btn_buscar_cli.setContentAreaFilled(false);
        btn_buscar_cli.setFocusPainted(false);
        btn_buscar_cli.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar_select.png"))); // NOI18N
        panel_cliente.add(btn_buscar_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 126, 154, 37));

        btn_nuevo_registro_cli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregistro.png"))); // NOI18N
        btn_nuevo_registro_cli.setBorder(null);
        btn_nuevo_registro_cli.setBorderPainted(false);
        btn_nuevo_registro_cli.setContentAreaFilled(false);
        btn_nuevo_registro_cli.setFocusPainted(false);
        btn_nuevo_registro_cli.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregis_select.png"))); // NOI18N
        panel_cliente.add(btn_nuevo_registro_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 44, 172, 37));

        Fondo_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente/Ventana_Cliente.png"))); // NOI18N
        panel_cliente.add(Fondo_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_secundario.add(panel_cliente, "card2");

        panel_empleado.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_empleado.setMinimumSize(new java.awt.Dimension(1150, 720));
        panel_empleado.setPreferredSize(new java.awt.Dimension(1150, 720));
        panel_empleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_busquedarapida_empl.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_busquedarapida_empl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_busquedarapida_empl.setForeground(new java.awt.Color(153, 51, 255));
        txt_busquedarapida_empl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_busquedarapida_empl.setBorder(null);
        panel_empleado.add(txt_busquedarapida_empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 128, 500, 33));

        cbxOrden_empl.setBackground(new java.awt.Color(255, 163, 0));
        cbxOrden_empl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ascendente", "descendente" }));
        panel_empleado.add(cbxOrden_empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 127, 178, 33));

        cbxColumna_empl.setBackground(new java.awt.Color(255, 163, 0));
        cbxColumna_empl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° Empleado", "Nombre", "Apellido", "Rol" }));
        panel_empleado.add(cbxColumna_empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 127, 178, 33));

        Scroll_Empleado.setBackground(new java.awt.Color(0,0,0,1));
        Scroll_Empleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Scroll_Empleado.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tablaEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaEmpleado.setForeground(new java.awt.Color(255, 153, 0));
        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Empleado", "Nombre", "Apellido", "Dni"
            }
        ));
        Scroll_Empleado.setViewportView(tablaEmpleado);

        panel_empleado.add(Scroll_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 213, 1110, 500));

        btn_buscar_empl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar.png"))); // NOI18N
        btn_buscar_empl.setBorder(null);
        btn_buscar_empl.setBorderPainted(false);
        btn_buscar_empl.setContentAreaFilled(false);
        btn_buscar_empl.setFocusPainted(false);
        btn_buscar_empl.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar_select.png"))); // NOI18N
        panel_empleado.add(btn_buscar_empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 126, 154, 37));

        btn_nuevo_registro_empl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregistro.png"))); // NOI18N
        btn_nuevo_registro_empl.setBorder(null);
        btn_nuevo_registro_empl.setBorderPainted(false);
        btn_nuevo_registro_empl.setContentAreaFilled(false);
        btn_nuevo_registro_empl.setFocusPainted(false);
        btn_nuevo_registro_empl.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregis_select.png"))); // NOI18N
        panel_empleado.add(btn_nuevo_registro_empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 44, 172, 37));

        Fondo_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleado/Ventana_Empleado.png"))); // NOI18N
        panel_empleado.add(Fondo_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_secundario.add(panel_empleado, "card3");

        panel_paquete.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_paquete.setMinimumSize(new java.awt.Dimension(1150, 720));
        panel_paquete.setPreferredSize(new java.awt.Dimension(1150, 720));
        panel_paquete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_busquedarapida_paq.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_busquedarapida_paq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_busquedarapida_paq.setForeground(new java.awt.Color(153, 51, 255));
        txt_busquedarapida_paq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_busquedarapida_paq.setBorder(null);
        panel_paquete.add(txt_busquedarapida_paq, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 128, 500, 33));

        cbxOrden_paq.setBackground(new java.awt.Color(255, 163, 0));
        cbxOrden_paq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ascendente", "descendente" }));
        panel_paquete.add(cbxOrden_paq, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 127, 178, 33));

        cbxColumna_paq.setBackground(new java.awt.Color(255, 163, 0));
        cbxColumna_paq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° Paquete", "Nombre Paquete", "Descripción", "Precio" }));
        panel_paquete.add(cbxColumna_paq, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 127, 178, 33));

        Scroll_Paquete.setBackground(new java.awt.Color(0,0,0,1));
        Scroll_Paquete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Scroll_Paquete.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tablaPaquete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaPaquete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaPaquete.setForeground(new java.awt.Color(255, 153, 0));
        tablaPaquete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Paquete", "Nombre Paquete", "Descripcion", "Precio"
            }
        ));
        Scroll_Paquete.setViewportView(tablaPaquete);

        panel_paquete.add(Scroll_Paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 213, 1110, 500));

        btn_buscar_paq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar.png"))); // NOI18N
        btn_buscar_paq.setBorder(null);
        btn_buscar_paq.setBorderPainted(false);
        btn_buscar_paq.setContentAreaFilled(false);
        btn_buscar_paq.setFocusPainted(false);
        btn_buscar_paq.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar_select.png"))); // NOI18N
        panel_paquete.add(btn_buscar_paq, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 126, 154, 37));

        btn_nuevo_registro_paq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregistro.png"))); // NOI18N
        btn_nuevo_registro_paq.setBorder(null);
        btn_nuevo_registro_paq.setBorderPainted(false);
        btn_nuevo_registro_paq.setContentAreaFilled(false);
        btn_nuevo_registro_paq.setFocusPainted(false);
        btn_nuevo_registro_paq.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregis_select.png"))); // NOI18N
        panel_paquete.add(btn_nuevo_registro_paq, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 44, 172, 37));

        Fondo_Paquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paquete/Ventana_Paquete.png"))); // NOI18N
        panel_paquete.add(Fondo_Paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_secundario.add(panel_paquete, "card4");

        panel_evento.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_evento.setMinimumSize(new java.awt.Dimension(1150, 720));
        panel_evento.setPreferredSize(new java.awt.Dimension(1150, 720));
        panel_evento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_busquedarapida_eve.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_busquedarapida_eve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_busquedarapida_eve.setForeground(new java.awt.Color(153, 51, 255));
        txt_busquedarapida_eve.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_busquedarapida_eve.setBorder(null);
        panel_evento.add(txt_busquedarapida_eve, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 128, 500, 33));

        cbxOrden_eve.setBackground(new java.awt.Color(255, 163, 0));
        cbxOrden_eve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ascendente", "descendente" }));
        panel_evento.add(cbxOrden_eve, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 127, 178, 33));

        cbxColumna_eve.setBackground(new java.awt.Color(255, 163, 0));
        cbxColumna_eve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° Evento", "Nombre Evento", "Ubicación Evento", "Nombre Cliente" }));
        panel_evento.add(cbxColumna_eve, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 127, 178, 33));

        Scroll_Evento.setBackground(new java.awt.Color(0,0,0,1));
        Scroll_Evento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Scroll_Evento.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tablaEvento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaEvento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaEvento.setForeground(new java.awt.Color(255, 153, 0));
        tablaEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Evento", "Nombre Evento", "Direccion Evento", "Nombre Cliente"
            }
        ));
        Scroll_Evento.setViewportView(tablaEvento);

        panel_evento.add(Scroll_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 213, 1110, 500));

        btn_buscar_eve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar.png"))); // NOI18N
        btn_buscar_eve.setBorder(null);
        btn_buscar_eve.setBorderPainted(false);
        btn_buscar_eve.setContentAreaFilled(false);
        btn_buscar_eve.setFocusPainted(false);
        btn_buscar_eve.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar_select.png"))); // NOI18N
        panel_evento.add(btn_buscar_eve, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 126, 154, 37));

        btn_nuevo_registro_eve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregistro.png"))); // NOI18N
        btn_nuevo_registro_eve.setBorder(null);
        btn_nuevo_registro_eve.setBorderPainted(false);
        btn_nuevo_registro_eve.setContentAreaFilled(false);
        btn_nuevo_registro_eve.setFocusPainted(false);
        btn_nuevo_registro_eve.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregis_select.png"))); // NOI18N
        panel_evento.add(btn_nuevo_registro_eve, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 44, 172, 37));

        Fondo_Evento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento/Ventana_Evento.png"))); // NOI18N
        panel_evento.add(Fondo_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_secundario.add(panel_evento, "card5");

        panel_equipo.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_equipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_busquedarapida_eq.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_busquedarapida_eq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_busquedarapida_eq.setForeground(new java.awt.Color(153, 51, 255));
        txt_busquedarapida_eq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_busquedarapida_eq.setBorder(null);
        panel_equipo.add(txt_busquedarapida_eq, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 128, 500, 33));

        cbxOrden_eq.setBackground(new java.awt.Color(255, 163, 0));
        cbxOrden_eq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ascendente", "descendente" }));
        panel_equipo.add(cbxOrden_eq, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 127, 178, 33));

        cbxColumna_eq.setBackground(new java.awt.Color(255, 163, 0));
        cbxColumna_eq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° Equipo", "Equipo de Organización" }));
        panel_equipo.add(cbxColumna_eq, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 127, 178, 33));

        Scroll_Equipo.setBackground(new java.awt.Color(0,0,0,1));
        Scroll_Equipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Scroll_Equipo.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tablaEquipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaEquipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaEquipo.setForeground(new java.awt.Color(255, 153, 0));
        tablaEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Baby Shower"}
            },
            new String [] {
                "N° Equipo", "Equipo de Organización"
            }
        ));
        Scroll_Equipo.setViewportView(tablaEquipo);
        if (tablaEquipo.getColumnModel().getColumnCount() > 0) {
            tablaEquipo.getColumnModel().getColumn(0).setMinWidth(276);
            tablaEquipo.getColumnModel().getColumn(0).setMaxWidth(276);
        }

        panel_equipo.add(Scroll_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 213, 1110, 500));

        btn_buscar_eq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar.png"))); // NOI18N
        btn_buscar_eq.setBorder(null);
        btn_buscar_eq.setBorderPainted(false);
        btn_buscar_eq.setContentAreaFilled(false);
        btn_buscar_eq.setFocusPainted(false);
        btn_buscar_eq.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar_select.png"))); // NOI18N
        panel_equipo.add(btn_buscar_eq, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 126, 154, 37));

        btn_nuevo_registro_eq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregistro.png"))); // NOI18N
        btn_nuevo_registro_eq.setBorder(null);
        btn_nuevo_registro_eq.setBorderPainted(false);
        btn_nuevo_registro_eq.setContentAreaFilled(false);
        btn_nuevo_registro_eq.setFocusPainted(false);
        btn_nuevo_registro_eq.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregis_select.png"))); // NOI18N
        panel_equipo.add(btn_nuevo_registro_eq, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 44, 172, 37));

        Fondo_Equipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/equipo/Ventana_Equipo.png"))); // NOI18N
        panel_equipo.add(Fondo_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_secundario.add(panel_equipo, "card6");

        panel_asistencia.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_asistencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_busquedarapida_asi.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_busquedarapida_asi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_busquedarapida_asi.setForeground(new java.awt.Color(153, 51, 255));
        txt_busquedarapida_asi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_busquedarapida_asi.setBorder(null);
        panel_asistencia.add(txt_busquedarapida_asi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 128, 500, 33));

        cbxColumna_asi.setBackground(new java.awt.Color(255, 163, 0));
        cbxColumna_asi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° Evento", "Nombre Evento", "Ubicación Evento", "Nombre Cliente" }));
        panel_asistencia.add(cbxColumna_asi, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 127, 375, 33));

        Scroll_Asistencia.setBackground(new java.awt.Color(0,0,0,1));
        Scroll_Asistencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Scroll_Asistencia.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tablaAsistencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaAsistencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaAsistencia.setForeground(new java.awt.Color(255, 153, 0));
        tablaAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Asistencia", "Nombre Empleado", "Apellido Empleado", "Equipo Perteneciente"
            }
        ));
        Scroll_Asistencia.setViewportView(tablaAsistencia);

        panel_asistencia.add(Scroll_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 213, 1110, 500));

        btn_buscar_asi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar.png"))); // NOI18N
        btn_buscar_asi.setBorder(null);
        btn_buscar_asi.setBorderPainted(false);
        btn_buscar_asi.setContentAreaFilled(false);
        btn_buscar_asi.setFocusPainted(false);
        btn_buscar_asi.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_buscar_select.png"))); // NOI18N
        panel_asistencia.add(btn_buscar_asi, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 126, 154, 37));

        btn_nuevo_registro_asi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregistro.png"))); // NOI18N
        btn_nuevo_registro_asi.setBorder(null);
        btn_nuevo_registro_asi.setBorderPainted(false);
        btn_nuevo_registro_asi.setContentAreaFilled(false);
        btn_nuevo_registro_asi.setFocusPainted(false);
        btn_nuevo_registro_asi.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_generales/btn_nuevoregis_select.png"))); // NOI18N
        panel_asistencia.add(btn_nuevo_registro_asi, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 44, 172, 37));

        Fondo_Asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistencia/Ventana_Asistencia.png"))); // NOI18N
        panel_asistencia.add(Fondo_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txteventoid_asi.setText("jLabel4");
        panel_asistencia.add(txteventoid_asi, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        panel_secundario.add(panel_asistencia, "card7");

        panel_reporte.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_reporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_generar_reporteCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_cliente.png"))); // NOI18N
        btn_generar_reporteCliente.setBorder(null);
        btn_generar_reporteCliente.setBorderPainted(false);
        btn_generar_reporteCliente.setContentAreaFilled(false);
        btn_generar_reporteCliente.setFocusPainted(false);
        btn_generar_reporteCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_cliente_select.png"))); // NOI18N
        panel_reporte.add(btn_generar_reporteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 119, 214, 138));

        btn_generar_reporteEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_empleado.png"))); // NOI18N
        btn_generar_reporteEmpleado.setBorder(null);
        btn_generar_reporteEmpleado.setBorderPainted(false);
        btn_generar_reporteEmpleado.setContentAreaFilled(false);
        btn_generar_reporteEmpleado.setFocusPainted(false);
        btn_generar_reporteEmpleado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_empleado_select.png"))); // NOI18N
        panel_reporte.add(btn_generar_reporteEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 119, 214, 138));

        btn_generar_reportePaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_paquete.png"))); // NOI18N
        btn_generar_reportePaquete.setBorder(null);
        btn_generar_reportePaquete.setBorderPainted(false);
        btn_generar_reportePaquete.setContentAreaFilled(false);
        btn_generar_reportePaquete.setFocusPainted(false);
        btn_generar_reportePaquete.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_paquete_select.png"))); // NOI18N
        panel_reporte.add(btn_generar_reportePaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 119, 214, 138));

        btn_generar_reporteEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_eventos.png"))); // NOI18N
        btn_generar_reporteEvento.setBorder(null);
        btn_generar_reporteEvento.setBorderPainted(false);
        btn_generar_reporteEvento.setContentAreaFilled(false);
        btn_generar_reporteEvento.setFocusPainted(false);
        btn_generar_reporteEvento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_eventos_select.png"))); // NOI18N
        panel_reporte.add(btn_generar_reporteEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 328, 214, 138));

        btn_generar_reporteEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_equipos.png"))); // NOI18N
        btn_generar_reporteEquipo.setBorder(null);
        btn_generar_reporteEquipo.setBorderPainted(false);
        btn_generar_reporteEquipo.setContentAreaFilled(false);
        btn_generar_reporteEquipo.setFocusPainted(false);
        btn_generar_reporteEquipo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_equipos_select.png"))); // NOI18N
        panel_reporte.add(btn_generar_reporteEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 328, 214, 138));

        btn_generar_reporteAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_asistencias.png"))); // NOI18N
        btn_generar_reporteAsistencia.setBorder(null);
        btn_generar_reporteAsistencia.setBorderPainted(false);
        btn_generar_reporteAsistencia.setContentAreaFilled(false);
        btn_generar_reporteAsistencia.setFocusPainted(false);
        btn_generar_reporteAsistencia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_asistencias_select.png"))); // NOI18N
        panel_reporte.add(btn_generar_reporteAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 328, 214, 138));

        btn_generar_reporteMovilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_movilidad.png"))); // NOI18N
        btn_generar_reporteMovilidad.setBorder(null);
        btn_generar_reporteMovilidad.setBorderPainted(false);
        btn_generar_reporteMovilidad.setContentAreaFilled(false);
        btn_generar_reporteMovilidad.setFocusPainted(false);
        btn_generar_reporteMovilidad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_movilidad_select.png"))); // NOI18N
        panel_reporte.add(btn_generar_reporteMovilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 535, 214, 138));

        btn_generar_reporteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_factura.png"))); // NOI18N
        btn_generar_reporteFactura.setBorder(null);
        btn_generar_reporteFactura.setBorderPainted(false);
        btn_generar_reporteFactura.setContentAreaFilled(false);
        btn_generar_reporteFactura.setFocusPainted(false);
        btn_generar_reporteFactura.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_Reporte_factura_select.png"))); // NOI18N
        panel_reporte.add(btn_generar_reporteFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 535, 214, 138));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/Ventana_Reporte.png"))); // NOI18N
        panel_reporte.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 720));

        panel_secundario.add(panel_reporte, "card8");

        panel_informacion.setMaximumSize(new java.awt.Dimension(1150, 720));
        panel_informacion.setMinimumSize(new java.awt.Dimension(1150, 720));
        panel_informacion.setPreferredSize(new java.awt.Dimension(1150, 720));
        panel_informacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo_Informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informacion/Ventana_Informacion.png"))); // NOI18N
        panel_informacion.add(Fondo_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_secundario.add(panel_informacion, "card9");

        panel_general.add(panel_secundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1150, 720));

        getContentPane().add(panel_general, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_principal().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Asistencia;
    private javax.swing.JLabel Fondo_Cliente;
    private javax.swing.JLabel Fondo_Empleado;
    private javax.swing.JLabel Fondo_Equipo;
    private javax.swing.JLabel Fondo_Evento;
    private javax.swing.JLabel Fondo_Informacion;
    private javax.swing.JLabel Fondo_Inicio;
    private javax.swing.JLabel Fondo_Paquete;
    private javax.swing.JScrollPane Scroll_Asistencia;
    private javax.swing.JScrollPane Scroll_Cliente;
    private javax.swing.JScrollPane Scroll_Empleado;
    private javax.swing.JScrollPane Scroll_Equipo;
    private javax.swing.JScrollPane Scroll_Evento;
    private javax.swing.JScrollPane Scroll_Paquete;
    public javax.swing.JButton btn_asistencia;
    public javax.swing.JButton btn_buscar_asi;
    private javax.swing.JButton btn_buscar_cli;
    private javax.swing.JButton btn_buscar_empl;
    private javax.swing.JButton btn_buscar_eq;
    private javax.swing.JButton btn_buscar_eve;
    private javax.swing.JButton btn_buscar_paq;
    public javax.swing.JButton btn_cliente;
    public javax.swing.JButton btn_configuracion;
    public javax.swing.JButton btn_dashboard;
    public javax.swing.JButton btn_empleado;
    public javax.swing.JButton btn_equipo;
    public javax.swing.JButton btn_evento;
    public javax.swing.JButton btn_generar_reporteAsistencia;
    public javax.swing.JButton btn_generar_reporteCliente;
    public javax.swing.JButton btn_generar_reporteEmpleado;
    public javax.swing.JButton btn_generar_reporteEquipo;
    public javax.swing.JButton btn_generar_reporteEvento;
    public javax.swing.JButton btn_generar_reporteFactura;
    public javax.swing.JButton btn_generar_reporteMovilidad;
    public javax.swing.JButton btn_generar_reportePaquete;
    public javax.swing.JButton btn_informacion;
    public javax.swing.JButton btn_nuevo_registro_asi;
    public javax.swing.JButton btn_nuevo_registro_cli;
    public javax.swing.JButton btn_nuevo_registro_empl;
    public javax.swing.JButton btn_nuevo_registro_eq;
    public javax.swing.JButton btn_nuevo_registro_eve;
    public javax.swing.JButton btn_nuevo_registro_paq;
    public javax.swing.JButton btn_opcitactualizar;
    public javax.swing.JButton btn_opcitaeliminar;
    public javax.swing.JButton btn_opcitavisualizar;
    public javax.swing.JButton btn_paquete;
    public javax.swing.JButton btn_reporte;
    public javax.swing.JButton btn_salir;
    public javax.swing.JComboBox<String> cbxColumna_asi;
    private javax.swing.JComboBox<String> cbxColumna_cli;
    private javax.swing.JComboBox<String> cbxColumna_empl;
    private javax.swing.JComboBox<String> cbxColumna_eq;
    private javax.swing.JComboBox<String> cbxColumna_eve;
    private javax.swing.JComboBox<String> cbxColumna_paq;
    private javax.swing.JComboBox<String> cbxOrden_cli;
    private javax.swing.JComboBox<String> cbxOrden_empl;
    private javax.swing.JComboBox<String> cbxOrden_eq;
    private javax.swing.JComboBox<String> cbxOrden_eve;
    private javax.swing.JComboBox<String> cbxOrden_paq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPopupMenu menuGen;
    public javax.swing.JPanel panel_asistencia;
    public javax.swing.JPanel panel_cliente;
    public javax.swing.JPanel panel_dashboard;
    public javax.swing.JPanel panel_empleado;
    public javax.swing.JPanel panel_equipo;
    public javax.swing.JPanel panel_evento;
    private javax.swing.JPanel panel_general;
    public javax.swing.JPanel panel_informacion;
    private javax.swing.JPanel panel_lateral;
    public javax.swing.JPanel panel_opGen;
    public javax.swing.JPanel panel_paquete;
    public javax.swing.JPanel panel_reporte;
    public javax.swing.JPanel panel_secundario;
    private javax.swing.JPanel subpanel_opgeneral;
    public javax.swing.JTable tablaAsistencia;
    public javax.swing.JTable tablaCliente;
    public javax.swing.JTable tablaEmpleado;
    public javax.swing.JTable tablaEquipo;
    public javax.swing.JTable tablaEvento;
    public javax.swing.JTable tablaPaquete;
    public javax.swing.JTextField txt_busquedarapida_asi;
    public javax.swing.JTextField txt_busquedarapida_cli;
    public javax.swing.JTextField txt_busquedarapida_empl;
    public javax.swing.JTextField txt_busquedarapida_eq;
    public javax.swing.JTextField txt_busquedarapida_eve;
    public javax.swing.JTextField txt_busquedarapida_paq;
    public javax.swing.JLabel txt_cantidadClientes;
    public javax.swing.JLabel txt_cantidadEmpleados;
    public javax.swing.JLabel txt_idUsuario;
    public javax.swing.JLabel txt_nombreapellidoEmpleado;
    public javax.swing.JLabel txteventoid_asi;
    // End of variables declaration//GEN-END:variables
}
