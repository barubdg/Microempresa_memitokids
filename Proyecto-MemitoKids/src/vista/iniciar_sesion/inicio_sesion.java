
package vista.iniciar_sesion;

import Controlador.Usuario.InicioSesionController;

public class inicio_sesion extends javax.swing.JFrame {


    public inicio_sesion() {
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_correo = new javax.swing.JTextField();
        txt_contrasena = new javax.swing.JPasswordField();
        btn_olvidastecontraseña = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_registrarse = new javax.swing.JButton();
        btn_iniciar_sesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(440, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(440, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(440, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_correo.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_correo.setBorder(null);
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 50));

        txt_contrasena.setBackground(new java.awt.Color(0,0,0,1));
        txt_contrasena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_contrasena.setForeground(new java.awt.Color(255, 255, 255));
        txt_contrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contrasena.setBorder(null);
        jPanel1.add(txt_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 382, 300, 50));

        btn_olvidastecontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btn_olvidastecontraseña.png"))); // NOI18N
        btn_olvidastecontraseña.setBorder(null);
        btn_olvidastecontraseña.setBorderPainted(false);
        btn_olvidastecontraseña.setContentAreaFilled(false);
        btn_olvidastecontraseña.setFocusPainted(false);
        jPanel1.add(btn_olvidastecontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 533, 155, 12));

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cerrar.png"))); // NOI18N
        btn_cerrar.setBorder(null);
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setFocusPainted(false);
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 13, 14, 11));

        btn_registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/Registrarse.png"))); // NOI18N
        btn_registrarse.setBorder(null);
        btn_registrarse.setBorderPainted(false);
        btn_registrarse.setContentAreaFilled(false);
        btn_registrarse.setFocusPainted(false);
        jPanel1.add(btn_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 533, 65, 12));

        btn_iniciar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btn_ini_ses.png"))); // NOI18N
        btn_iniciar_sesion.setBorder(null);
        btn_iniciar_sesion.setBorderPainted(false);
        btn_iniciar_sesion.setContentAreaFilled(false);
        btn_iniciar_sesion.setFocusPainted(false);
        jPanel1.add(btn_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 468, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/iniciar_sesion.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 600));

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
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                                // Crear la interfaz y sus componentes
                inicio_sesion ini = new inicio_sesion();
                // Crear una instancia del controlador y pasarlo a los componentes
                InicioSesionController controller = new InicioSesionController(ini.txt_correo, ini.txt_contrasena, ini.btn_iniciar_sesion, ini);
                ini.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_cerrar;
    public javax.swing.JButton btn_iniciar_sesion;
    public javax.swing.JButton btn_olvidastecontraseña;
    public javax.swing.JButton btn_registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txt_contrasena;
    public javax.swing.JTextField txt_correo;
    // End of variables declaration//GEN-END:variables
}
