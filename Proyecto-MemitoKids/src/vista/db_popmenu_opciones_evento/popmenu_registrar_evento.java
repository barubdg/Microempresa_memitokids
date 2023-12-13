package vista.db_popmenu_opciones_evento;

import Controlador.Dashboard.Dash_Evento_RegController;
import tabla.evento.Evento;

public class popmenu_registrar_evento extends javax.swing.JDialog {

    
    private Evento modelEvento;
    private Dash_Evento_RegController dashEv_Regcontroller;

    public void setController(Evento modelEvento, Dash_Evento_RegController dashEv_Regcontroller) {
        this.modelEvento = modelEvento;
        this.dashEv_Regcontroller = dashEv_Regcontroller;
    }
    

    
    
    public popmenu_registrar_evento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        txt_nombreubicacion = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        cbx_cliente = new javax.swing.JComboBox<>();
        cbx_paquete = new javax.swing.JComboBox<>();
        txt_nombre_evento = new javax.swing.JTextField();
        txt_fechareserva = new javax.swing.JTextField();
        txt_presupuesto = new javax.swing.JTextField();
        btn_cancelar_evento = new javax.swing.JButton();
        btn_registrar_evento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_idcliente = new javax.swing.JLabel();
        txt_idpaquete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(1100, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        txt_nombreubicacion.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_nombreubicacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombreubicacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombreubicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreubicacion.setBorder(null);
        jPanel1.add(txt_nombreubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 193, 220, 30));

        txt_direccion.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_direccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.setBorder(null);
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 193, 220, 30));

        jPanel1.add(cbx_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 245, 220, 30));

        jPanel1.add(cbx_paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 245, 220, 30));

        txt_nombre_evento.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_nombre_evento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombre_evento.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre_evento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre_evento.setBorder(null);
        jPanel1.add(txt_nombre_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 297, 615, 30));

        txt_fechareserva.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_fechareserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_fechareserva.setForeground(new java.awt.Color(255, 255, 255));
        txt_fechareserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fechareserva.setBorder(null);
        jPanel1.add(txt_fechareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 220, 30));

        txt_presupuesto.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_presupuesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_presupuesto.setForeground(new java.awt.Color(255, 255, 255));
        txt_presupuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_presupuesto.setBorder(null);
        jPanel1.add(txt_presupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 220, 30));

        btn_cancelar_evento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar.png"))); // NOI18N
        btn_cancelar_evento.setBorder(null);
        btn_cancelar_evento.setBorderPainted(false);
        btn_cancelar_evento.setContentAreaFilled(false);
        btn_cancelar_evento.setFocusPainted(false);
        btn_cancelar_evento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar_select.png"))); // NOI18N
        jPanel1.add(btn_cancelar_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 515, 230, 50));

        btn_registrar_evento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_registrar.png"))); // NOI18N
        btn_registrar_evento.setBorder(null);
        btn_registrar_evento.setBorderPainted(false);
        btn_registrar_evento.setContentAreaFilled(false);
        btn_registrar_evento.setFocusPainted(false);
        btn_registrar_evento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_registrar_select.png"))); // NOI18N
        jPanel1.add(btn_registrar_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 515, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento/img_registrarse.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txt_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));
        jPanel1.add(txt_idpaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(popmenu_registrar_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_registrar_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_registrar_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_registrar_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                popmenu_registrar_evento dialog = new popmenu_registrar_evento(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_cancelar_evento;
    public javax.swing.JButton btn_registrar_evento;
    public javax.swing.JComboBox<String> cbx_cliente;
    public javax.swing.JComboBox<String> cbx_paquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel label_id;
    public javax.swing.JTextField txt_direccion;
    public javax.swing.JTextField txt_fechareserva;
    public javax.swing.JLabel txt_idcliente;
    public javax.swing.JLabel txt_idpaquete;
    public javax.swing.JTextField txt_nombre_evento;
    public javax.swing.JTextField txt_nombreubicacion;
    public javax.swing.JTextField txt_presupuesto;
    // End of variables declaration//GEN-END:variables
}
