package vista.recuperar_contraseña;

import Controlador.Dashboard.Dash_RecuperarContraseña_Controller;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.empleado.Empleado;

public class popmenu_RecuperarContraseña extends javax.swing.JDialog {

    
    private Empleado modelEmpleado;
    private Dash_RecuperarContraseña_Controller dashRecCo_Regcontroller;
    private String traerIdUsuario;
    private DashboardDAO dashDAO = new DashboardDAOImpl();
    
    
    public void setController(Empleado modelEmpleado, Dash_RecuperarContraseña_Controller dashRecCo_Regcontroller) {
        this.modelEmpleado = modelEmpleado;
        this.dashRecCo_Regcontroller = dashRecCo_Regcontroller;
    }
    
    
    public popmenu_RecuperarContraseña(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void setTraerIdUsuario(String traerIdUsuario) {
        this.traerIdUsuario = traerIdUsuario;
        Empleado modelEmpleado = dashDAO.VisualizarBuscarEmpleado(traerIdUsuario);
        txt_idusuario.setText(String.valueOf(modelEmpleado.getUsu().getUsuario_id())); 
    }
    
    public void setTraerIdUsuarioRecuperar(String traerIdUsuario)
    {
        this.traerIdUsuario = traerIdUsuario;
        txt_idusuario.setText(traerIdUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_contraseña = new javax.swing.JPasswordField();
        txt_confirmarcontraseña = new javax.swing.JPasswordField();
        btn_cerrar = new javax.swing.JButton();
        btn_registrarcontraseña = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_idusuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 600));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(440, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(440, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_contraseña.setBackground(new java.awt.Color(0,0,0,1));
        txt_contraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contraseña.setBorder(null);
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 50));

        txt_confirmarcontraseña.setBackground(new java.awt.Color(0,0,0,1));
        txt_confirmarcontraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_confirmarcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        txt_confirmarcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_confirmarcontraseña.setBorder(null);
        jPanel1.add(txt_confirmarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 382, 300, 50));

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cerrar.png"))); // NOI18N
        btn_cerrar.setBorder(null);
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setFocusPainted(false);
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 13, 14, 11));

        btn_registrarcontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_registrar.png"))); // NOI18N
        btn_registrarcontraseña.setBorder(null);
        btn_registrarcontraseña.setBorderPainted(false);
        btn_registrarcontraseña.setContentAreaFilled(false);
        btn_registrarcontraseña.setFocusPainted(false);
        btn_registrarcontraseña.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_registrar_select.png"))); // NOI18N
        jPanel1.add(btn_registrarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 468, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recuperar_contraseña/ventana_recuperar_contraseña.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txt_idusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

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
            java.util.logging.Logger.getLogger(popmenu_RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                popmenu_RecuperarContraseña dialog = new popmenu_RecuperarContraseña(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_cerrar;
    public javax.swing.JButton btn_registrarcontraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txt_confirmarcontraseña;
    public javax.swing.JPasswordField txt_contraseña;
    public javax.swing.JLabel txt_idusuario;
    // End of variables declaration//GEN-END:variables
}
