/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.view;

import javax.swing.JButton;

/**
 *
 * @author Anne Gitau
 */
public class schoolMenuView extends javax.swing.JDialog {

    /**
     * Creates new form schoolMenuView
     */
    public schoolMenuView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
 public JButton getGeneralInfoButton(){
        return generalInfoButton;
    }
  public JButton getGradeManagamentButton(){
        return gradeManagementButton;
    }
   public JButton getFeePaymentButton(){
        return feePaymentButton;
    }
    public JButton getReportsButton(){
        return reportsButton;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        generalInfoButton = new javax.swing.JButton();
        gradeManagementButton = new javax.swing.JButton();
        feePaymentButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("SCHOOL MENU");

        generalInfoButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        generalInfoButton.setText("GENERAL INFORMATION");

        gradeManagementButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gradeManagementButton.setText("GRADE MANAGEMENT");

        feePaymentButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        feePaymentButton.setText("FEE PAYMENT");

        reportsButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reportsButton.setText("REPORTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(reportsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gradeManagementButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(feePaymentButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(generalInfoButton)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(generalInfoButton)
                .addGap(28, 28, 28)
                .addComponent(gradeManagementButton)
                .addGap(33, 33, 33)
                .addComponent(feePaymentButton)
                .addGap(37, 37, 37)
                .addComponent(reportsButton)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
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
            java.util.logging.Logger.getLogger(schoolMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(schoolMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(schoolMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(schoolMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                schoolMenuView dialog = new schoolMenuView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton feePaymentButton;
    private javax.swing.JButton generalInfoButton;
    private javax.swing.JButton gradeManagementButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reportsButton;
    // End of variables declaration//GEN-END:variables
}
