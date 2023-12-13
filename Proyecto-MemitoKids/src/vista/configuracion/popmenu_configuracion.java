
package vista.configuracion;

import Controlador.Dashboard.Dash_Configuracion_Controller;
import tabla.usuarios.Usuarios;

public class popmenu_configuracion extends javax.swing.JDialog {

    
    private Dash_Configuracion_Controller dashConf_Controller;
    private Usuarios modelUsuario;
    private String traerIdUsuario;
    
    public void setController(Dash_Configuracion_Controller dashConf_Controller, Usuarios modelUsuario) {
        this.dashConf_Controller = dashConf_Controller;
        this.modelUsuario = modelUsuario;
    }

    public void setTraerIdUsuario(String traerIdUsuario) {
        this.traerIdUsuario = traerIdUsuario;
        txt_idUsuario.setText(traerIdUsuario);
    }

    
    
    
    public popmenu_configuracion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        btn_recuperarbd = new javax.swing.JButton();
        btn_crearrespaldo = new javax.swing.JButton();
        btn_cambiarcontraseña = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_idUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard/btn_salir_select.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setFocusPainted(false);
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 45, 18, 19));

        btn_recuperarbd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion/botones_configuracion/btn_recuperarbd.png"))); // NOI18N
        btn_recuperarbd.setBorder(null);
        btn_recuperarbd.setBorderPainted(false);
        btn_recuperarbd.setContentAreaFilled(false);
        btn_recuperarbd.setFocusPainted(false);
        btn_recuperarbd.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion/botones_configuracion/btn_recuperarbd_select.png"))); // NOI18N
        jPanel1.add(btn_recuperarbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 106, 214, 138));

        btn_crearrespaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion/botones_configuracion/btn_crearrespaldo.png"))); // NOI18N
        btn_crearrespaldo.setBorder(null);
        btn_crearrespaldo.setBorderPainted(false);
        btn_crearrespaldo.setContentAreaFilled(false);
        btn_crearrespaldo.setFocusPainted(false);
        btn_crearrespaldo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion/botones_configuracion/btn_crearrespaldo_select.png"))); // NOI18N
        jPanel1.add(btn_crearrespaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 106, 214, 138));

        btn_cambiarcontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion/botones_configuracion/btn_cambiarcontraseña.png"))); // NOI18N
        btn_cambiarcontraseña.setBorder(null);
        btn_cambiarcontraseña.setBorderPainted(false);
        btn_cambiarcontraseña.setContentAreaFilled(false);
        btn_cambiarcontraseña.setFocusPainted(false);
        btn_cambiarcontraseña.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion/botones_configuracion/btn_cambiarcontraseña_select.png"))); // NOI18N
        jPanel1.add(btn_cambiarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 106, 214, 138));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion/Ventana_configuracion.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 300));

        txt_idUsuario.setText("jLabel2");
        jPanel1.add(txt_idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

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
            java.util.logging.Logger.getLogger(popmenu_configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                popmenu_configuracion dialog = new popmenu_configuracion(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_cambiarcontraseña;
    public javax.swing.JButton btn_crearrespaldo;
    public javax.swing.JButton btn_recuperarbd;
    public javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel txt_idUsuario;
    // End of variables declaration//GEN-END:variables
}
