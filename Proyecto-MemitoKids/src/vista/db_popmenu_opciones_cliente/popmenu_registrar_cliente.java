
package vista.db_popmenu_opciones_cliente;

import Controlador.Dashboard.Dash_Cliente_RegController;
import tabla.cliente.Cliente;



public class popmenu_registrar_cliente extends javax.swing.JDialog {


    private Cliente modelCliente;
    private Dash_Cliente_RegController dashCli_Regcontroller;
    
    public void setController(Dash_Cliente_RegController dashCli_Regcontroller, Cliente modelCliente) {
        this.dashCli_Regcontroller = dashCli_Regcontroller;
        this.modelCliente = modelCliente;
    }
    
    public popmenu_registrar_cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        btn_cancelar_cliente = new javax.swing.JButton();
        btn_registrar_cliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();

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
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 218, 550, 30));

        txt_apellidos.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_apellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellidos.setBorder(null);
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 261, 550, 30));

        txt_dni.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_dni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(255, 255, 255));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(null);
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 305, 220, 30));

        txt_direccion.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_direccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.setBorder(null);
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 305, 220, 30));

        txt_telefono.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(null);
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 350, 550, 30));

        btn_cancelar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar.png"))); // NOI18N
        btn_cancelar_cliente.setBorder(null);
        btn_cancelar_cliente.setBorderPainted(false);
        btn_cancelar_cliente.setContentAreaFilled(false);
        btn_cancelar_cliente.setFocusPainted(false);
        btn_cancelar_cliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar_select.png"))); // NOI18N
        jPanel1.add(btn_cancelar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 515, 230, 50));

        btn_registrar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_registrar.png"))); // NOI18N
        btn_registrar_cliente.setBorder(null);
        btn_registrar_cliente.setBorderPainted(false);
        btn_registrar_cliente.setContentAreaFilled(false);
        btn_registrar_cliente.setFocusPainted(false);
        btn_registrar_cliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_registrar_select.png"))); // NOI18N
        jPanel1.add(btn_registrar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 515, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente/img_registrarse.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

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
            java.util.logging.Logger.getLogger(popmenu_registrar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_registrar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_registrar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_registrar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                popmenu_registrar_cliente dialog = new popmenu_registrar_cliente(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_cancelar_cliente;
    public javax.swing.JButton btn_registrar_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel label_id;
    public javax.swing.JTextField txt_apellidos;
    public javax.swing.JTextField txt_direccion;
    public javax.swing.JTextField txt_dni;
    public javax.swing.JTextField txt_nombres;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
