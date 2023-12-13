
package vista.db_popmenu_opciones_empleado;

import Controlador.Dashboard.Dash_Empleado_ActController;
import tabla.empleado.Empleado;



public class popmenu_actualizar_empleado extends javax.swing.JDialog {

    private Empleado modelEmpleado;
    private Dash_Empleado_ActController dashEmpl_Actcontroller;

    public void setController(Dash_Empleado_ActController dashEmpl_Actcontroller, Empleado modelEmpleado) {
        this.dashEmpl_Actcontroller = dashEmpl_Actcontroller;
        this.modelEmpleado = modelEmpleado;
    }
    
    public popmenu_actualizar_empleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();


                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_nombres = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_fechanacimiento = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        cbx_tiporol = new javax.swing.JComboBox<>();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_constrasena = new javax.swing.JPasswordField();
        btn_cancelar_cliente = new javax.swing.JButton();
        btn_actualizar_cliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_empleado_id = new javax.swing.JLabel();
        txt_rol_id = new javax.swing.JLabel();
        txt_usuario_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1100, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1100, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombres.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombres.setBorder(null);
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 127, 220, 30));

        txt_apellido.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido.setBorder(null);
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 170, 220, 30));

        txt_fechanacimiento.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_fechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_fechanacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txt_fechanacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fechanacimiento.setBorder(null);
        jPanel1.add(txt_fechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 215, 220, 30));

        txt_dni.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_dni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(255, 255, 255));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(null);
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 127, 220, 30));

        txt_email.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(null);
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 170, 220, 30));

        txt_telefono.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(null);
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 215, 220, 30));

        cbx_tiporol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));
        jPanel1.add(cbx_tiporol, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 383, 220, 30));

        txt_direccion.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_direccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.setBorder(null);
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 259, 550, 30));

        txt_correo.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_correo.setBorder(null);
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 362, 220, 30));

        txt_constrasena.setBackground(new java.awt.Color(0,0,0,1));
        txt_constrasena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_constrasena.setForeground(new java.awt.Color(255, 255, 255));
        txt_constrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_constrasena.setBorder(null);
        jPanel1.add(txt_constrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 408, 220, 30));

        btn_cancelar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar.png"))); // NOI18N
        btn_cancelar_cliente.setBorder(null);
        btn_cancelar_cliente.setBorderPainted(false);
        btn_cancelar_cliente.setContentAreaFilled(false);
        btn_cancelar_cliente.setFocusPainted(false);
        btn_cancelar_cliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar_select.png"))); // NOI18N
        jPanel1.add(btn_cancelar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 515, 230, 50));

        btn_actualizar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_actualizar.png"))); // NOI18N
        btn_actualizar_cliente.setBorder(null);
        btn_actualizar_cliente.setBorderPainted(false);
        btn_actualizar_cliente.setContentAreaFilled(false);
        btn_actualizar_cliente.setFocusPainted(false);
        btn_actualizar_cliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_actualizar_select.png"))); // NOI18N
        jPanel1.add(btn_actualizar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 515, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleado/img_actualizar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txt_empleado_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));
        jPanel1.add(txt_rol_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));
        jPanel1.add(txt_usuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

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
            java.util.logging.Logger.getLogger(popmenu_actualizar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_actualizar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_actualizar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_actualizar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                popmenu_actualizar_empleado dialog = new popmenu_actualizar_empleado(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_actualizar_cliente;
    public javax.swing.JButton btn_cancelar_cliente;
    public javax.swing.JComboBox<String> cbx_tiporol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JPasswordField txt_constrasena;
    public javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_direccion;
    public javax.swing.JTextField txt_dni;
    public javax.swing.JTextField txt_email;
    public javax.swing.JLabel txt_empleado_id;
    public javax.swing.JTextField txt_fechanacimiento;
    public javax.swing.JTextField txt_nombres;
    public javax.swing.JLabel txt_rol_id;
    public javax.swing.JTextField txt_telefono;
    public javax.swing.JLabel txt_usuario_id;
    // End of variables declaration//GEN-END:variables
}
