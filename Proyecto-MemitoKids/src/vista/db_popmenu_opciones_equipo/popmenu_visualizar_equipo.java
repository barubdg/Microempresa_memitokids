
package vista.db_popmenu_opciones_equipo;

import Controlador.Dashboard.Dash_Equipo_VisuController;
import tabla.equipo_organizacion.Equipo_Organizacion;

public class popmenu_visualizar_equipo extends javax.swing.JDialog {

    private Equipo_Organizacion modelEquipo;
    private Dash_Equipo_VisuController dashEvEq_Visucontroller;

    public void setController(Equipo_Organizacion modelEquipo, Dash_Equipo_VisuController dashEvEq_Visucontroller) {
        this.modelEquipo = modelEquipo;
        this.dashEvEq_Visucontroller = dashEvEq_Visucontroller;
    }
    
    
    public popmenu_visualizar_equipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_equipo = new javax.swing.JTextField();
        btn_cancelar_equipo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_idequipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 300));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_equipo.setBackground(new java.awt.Color(0,0,0,1)
        );
        txt_equipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_equipo.setForeground(new java.awt.Color(255, 255, 255));
        txt_equipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_equipo.setBorder(null);
        jPanel1.add(txt_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 124, 340, 30));

        btn_cancelar_equipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar.png"))); // NOI18N
        btn_cancelar_equipo.setBorder(null);
        btn_cancelar_equipo.setBorderPainted(false);
        btn_cancelar_equipo.setContentAreaFilled(false);
        btn_cancelar_equipo.setFocusPainted(false);
        btn_cancelar_equipo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar_select.png"))); // NOI18N
        jPanel1.add(btn_cancelar_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 213, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/equipo/opciones_equipo_organizacion.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt_idequipo.setText("jLabel2");
        jPanel1.add(txt_idequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

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
            java.util.logging.Logger.getLogger(popmenu_visualizar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_visualizar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_visualizar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_visualizar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                popmenu_visualizar_equipo dialog = new popmenu_visualizar_equipo(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_cancelar_equipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_equipo;
    public javax.swing.JLabel txt_idequipo;
    // End of variables declaration//GEN-END:variables
}
