
package vista.db_popmenu_opciones_asistencia;

import Controlador.Dashboard.Dash_Asistencia_ActController;
import tabla.asistencia.Asistencia;

public class popmenu_actualizar_asistencia extends javax.swing.JDialog {

    private Asistencia modelAsistencia;
    private Dash_Asistencia_ActController dashEvAs_Actcontroller;

    public void setController(Asistencia modelAsistencia, Dash_Asistencia_ActController dashEvAs_Actcontroller) {
        this.modelAsistencia = modelAsistencia;
        this.dashEvAs_Actcontroller = dashEvAs_Actcontroller;
    }    
    
    public popmenu_actualizar_asistencia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbx_evento = new javax.swing.JComboBox<>();
        cbx_equipo = new javax.swing.JComboBox<>();
        cbx_empleado = new javax.swing.JComboBox<>();
        btn_actualizar_asistencia = new javax.swing.JButton();
        btn_cancelar_asistencia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_idevento = new javax.swing.JLabel();
        txt_idequipo = new javax.swing.JLabel();
        txt_idempleado = new javax.swing.JLabel();
        txt_idasistencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 300));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cbx_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 101, 560, 30));

        jPanel1.add(cbx_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 148, 220, 30));

        jPanel1.add(cbx_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 148, 220, 30));

        btn_actualizar_asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_actualizar.png"))); // NOI18N
        btn_actualizar_asistencia.setBorder(null);
        btn_actualizar_asistencia.setBorderPainted(false);
        btn_actualizar_asistencia.setContentAreaFilled(false);
        btn_actualizar_asistencia.setFocusPainted(false);
        btn_actualizar_asistencia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_actualizar_select.png"))); // NOI18N
        jPanel1.add(btn_actualizar_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 213, 230, 50));

        btn_cancelar_asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar.png"))); // NOI18N
        btn_cancelar_asistencia.setBorder(null);
        btn_cancelar_asistencia.setBorderPainted(false);
        btn_cancelar_asistencia.setContentAreaFilled(false);
        btn_cancelar_asistencia.setFocusPainted(false);
        btn_cancelar_asistencia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones_opciones_generales/btn_cancelar_select.png"))); // NOI18N
        jPanel1.add(btn_cancelar_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 213, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistencia/opciones_asistencia.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txt_idevento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));
        jPanel1.add(txt_idequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));
        jPanel1.add(txt_idempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txt_idasistencia.setText("jLabel2");
        jPanel1.add(txt_idasistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

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
            java.util.logging.Logger.getLogger(popmenu_actualizar_asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popmenu_actualizar_asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popmenu_actualizar_asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popmenu_actualizar_asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                popmenu_actualizar_asistencia dialog = new popmenu_actualizar_asistencia(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btn_actualizar_asistencia;
    public javax.swing.JButton btn_cancelar_asistencia;
    public javax.swing.JComboBox<String> cbx_empleado;
    public javax.swing.JComboBox<String> cbx_equipo;
    public javax.swing.JComboBox<String> cbx_evento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel txt_idasistencia;
    public javax.swing.JLabel txt_idempleado;
    public javax.swing.JLabel txt_idequipo;
    public javax.swing.JLabel txt_idevento;
    // End of variables declaration//GEN-END:variables
}
