
package vista.db_popmenu_opciones_evento;

import Controlador.Dashboard.Dash_GenerarReporte_Movilidad;
import tabla.movilidad.Movilidad;

public class generar_reporte_movilidad extends javax.swing.JDialog {

    private Movilidad modelmovilidad;
    private Dash_GenerarReporte_Movilidad dashMov;

    public void setController(Movilidad modelmovilidad, Dash_GenerarReporte_Movilidad dashMov) {
        this.modelmovilidad = modelmovilidad;
        this.dashMov = dashMov;
    }
    
    
    
    public generar_reporte_movilidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbx_evento = new javax.swing.JComboBox<>();
        txt_descripcion = new javax.swing.JTextField();
        txt_costomovilidad = new javax.swing.JTextField();
        btn_generarreporte_evento = new javax.swing.JButton();
        btn_cancelar_reportevento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_idevento = new javax.swing.JLabel();
        txt_idmovilidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cbx_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 103, 560, 30));

        txt_descripcion.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_descripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(255, 255, 255));
        txt_descripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_descripcion.setBorder(null);
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 140, 290, 30));

        txt_costomovilidad.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_costomovilidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_costomovilidad.setForeground(new java.awt.Color(255, 255, 255));
        txt_costomovilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_costomovilidad.setBorder(null);
        jPanel1.add(txt_costomovilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 120, 30));

        btn_generarreporte_evento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_generar_reporte.png"))); // NOI18N
        btn_generarreporte_evento.setBorder(null);
        btn_generarreporte_evento.setBorderPainted(false);
        btn_generarreporte_evento.setContentAreaFilled(false);
        btn_generarreporte_evento.setFocusPainted(false);
        btn_generarreporte_evento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/botones_reportes/btn_generar_reporte_select.png"))); // NOI18N
        jPanel1.add(btn_generarreporte_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 213, 230, 50));

        btn_cancelar_reportevento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar.png"))); // NOI18N
        btn_cancelar_reportevento.setBorder(null);
        btn_cancelar_reportevento.setBorderPainted(false);
        btn_cancelar_reportevento.setContentAreaFilled(false);
        btn_cancelar_reportevento.setFocusPainted(false);
        btn_cancelar_reportevento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar_select.png"))); // NOI18N
        jPanel1.add(btn_cancelar_reportevento, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 213, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte/ventana_generar_reporteMovilidad.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txt_idevento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txt_idmovilidad.setText("jLabel2");
        jPanel1.add(txt_idmovilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(generar_reporte_movilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generar_reporte_movilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generar_reporte_movilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generar_reporte_movilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                generar_reporte_movilidad dialog = new generar_reporte_movilidad(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_cancelar_reportevento;
    public javax.swing.JButton btn_generarreporte_evento;
    public javax.swing.JComboBox<String> cbx_evento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_costomovilidad;
    public javax.swing.JTextField txt_descripcion;
    public javax.swing.JLabel txt_idevento;
    public javax.swing.JLabel txt_idmovilidad;
    // End of variables declaration//GEN-END:variables
}
