package vista.db_popmenu_opciones_paquete;

import Controlador.Dashboard.Dash_Paquete_VisuController;
import tabla.paquete.Paquete;

public class popmenu_visualizar_paquete extends javax.swing.JDialog {

    private Paquete modelPaquete;
    private Dash_Paquete_VisuController dashPaq_Visucontroller;
    
    public void setController(Paquete modelPaquete, Dash_Paquete_VisuController dashPaq_Visucontroller)
    {
        this.modelPaquete = modelPaquete;
        this.dashPaq_Visucontroller = dashPaq_Visucontroller;
    }
    
    public popmenu_visualizar_paquete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        

        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_precio = new javax.swing.JTextField();
        txt_nombrepaquete = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_busqueda_paquete = new javax.swing.JTextField();
        btn_cancelar_paquete = new javax.swing.JButton();
        btn_visualizar_paquete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_paquete_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 300));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_precio.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_precio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(255, 255, 255));
        txt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_precio.setBorder(null);
        jPanel1.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 141, 220, 30));

        txt_nombrepaquete.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_nombrepaquete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombrepaquete.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombrepaquete.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombrepaquete.setBorder(null);
        jPanel1.add(txt_nombrepaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 84, 220, 30));

        txt_descripcion.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_descripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(255, 255, 255));
        txt_descripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_descripcion.setBorder(null);
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 84, 220, 30));

        txt_busqueda_paquete.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_busqueda_paquete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_busqueda_paquete.setForeground(new java.awt.Color(255, 255, 255));
        txt_busqueda_paquete.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_busqueda_paquete.setBorder(null);
        jPanel1.add(txt_busqueda_paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 215, 298, 50));

        btn_cancelar_paquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar.png"))); // NOI18N
        btn_cancelar_paquete.setBorder(null);
        btn_cancelar_paquete.setBorderPainted(false);
        btn_cancelar_paquete.setContentAreaFilled(false);
        btn_cancelar_paquete.setFocusPainted(false);
        btn_cancelar_paquete.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar_select.png"))); // NOI18N
        jPanel1.add(btn_cancelar_paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 213, 230, 50));

        btn_visualizar_paquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_visualizar.png"))); // NOI18N
        btn_visualizar_paquete.setBorder(null);
        btn_visualizar_paquete.setBorderPainted(false);
        btn_visualizar_paquete.setContentAreaFilled(false);
        btn_visualizar_paquete.setFocusPainted(false);
        btn_visualizar_paquete.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_visualizar_select.png"))); // NOI18N
        jPanel1.add(btn_visualizar_paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 213, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paquete/img_visualizar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txt_paquete_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

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
            java.util.logging.Logger.getLogger(popmenu_visualizar_paquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_visualizar_paquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_visualizar_paquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_visualizar_paquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                popmenu_visualizar_paquete dialog = new popmenu_visualizar_paquete(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_cancelar_paquete;
    public javax.swing.JButton btn_visualizar_paquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_busqueda_paquete;
    public javax.swing.JTextField txt_descripcion;
    public javax.swing.JTextField txt_nombrepaquete;
    public javax.swing.JLabel txt_paquete_id;
    public javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
