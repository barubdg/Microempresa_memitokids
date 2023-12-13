
package vista.olvidaste_contraseña;

import Controlador.Dashboard.Dash_OlvidasteContraseña_Controller;
import modelo.dashboard.DashboardDAO;
import modelo.dashboard.DashboardDAOImpl;
import tabla.empleado.Empleado;


public class popmenu_OlvidasteContraseña extends javax.swing.JDialog {


    private Empleado modelEmpleado;
    private Dash_OlvidasteContraseña_Controller dashOlvEm_Regcontroller;

    public void setController(Empleado modelEmpleado, Dash_OlvidasteContraseña_Controller dashOlvEm_Regcontroller) {
        this.modelEmpleado = modelEmpleado;
        this.dashOlvEm_Regcontroller = dashOlvEm_Regcontroller;
    }

    
    public popmenu_OlvidasteContraseña(java.awt.Frame parent, boolean modal) {
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
        btn_cerrar = new javax.swing.JButton();
        btn_verificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(920, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(920, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(920, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombres.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_nombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombres.setBorder(null);
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 268, 220, 30));

        txt_apellido.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido.setBorder(null);
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 310, 220, 30));

        txt_fechanacimiento.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_fechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_fechanacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txt_fechanacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fechanacimiento.setBorder(null);
        jPanel1.add(txt_fechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 353, 220, 30));

        txt_dni.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_dni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(255, 255, 255));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(null);
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 268, 220, 30));

        txt_email.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(null);
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 310, 220, 30));

        txt_telefono.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(null);
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 353, 220, 30));

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cerrar.png"))); // NOI18N
        btn_cerrar.setBorder(null);
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setFocusPainted(false);
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 13, 14, 11));

        btn_verificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/olvidate_contraseña/btn_verificar.png"))); // NOI18N
        btn_verificar.setBorder(null);
        btn_verificar.setBorderPainted(false);
        btn_verificar.setContentAreaFilled(false);
        btn_verificar.setFocusPainted(false);
        btn_verificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/olvidate_contraseña/btn_verificar_select.png"))); // NOI18N
        jPanel1.add(btn_verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 435, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/olvidate_contraseña/ventana_olvidaste_contraseña.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(popmenu_OlvidasteContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_OlvidasteContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_OlvidasteContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_OlvidasteContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                popmenu_OlvidasteContraseña dialog = new popmenu_OlvidasteContraseña(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_dni;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_fechanacimiento;
    public javax.swing.JTextField txt_nombres;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
