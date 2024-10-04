
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class HOME extends javax.swing.JFrame {

    Object jLabel1;

    /**
     * Creates new form HOME
     */
    public HOME() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        listMember = new javax.swing.JLabel();
        updateMember = new javax.swing.JLabel();
        newMember = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        exit.setForeground(new java.awt.Color(153, 153, 153));
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 40, -1, -1));

        payment.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        payment.setForeground(new java.awt.Color(153, 153, 153));
        payment.setText("Payment");
        payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentMouseClicked(evt);
            }
        });
        jPanel1.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        listMember.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        listMember.setForeground(new java.awt.Color(153, 153, 153));
        listMember.setText("List Member");
        listMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMemberMouseClicked(evt);
            }
        });
        jPanel1.add(listMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        updateMember.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        updateMember.setForeground(new java.awt.Color(153, 153, 153));
        updateMember.setText("Update Member");
        updateMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMemberMouseClicked(evt);
            }
        });
        jPanel1.add(updateMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 210, 30));

        newMember.setBackground(new java.awt.Color(204, 204, 204));
        newMember.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        newMember.setForeground(new java.awt.Color(153, 153, 153));
        newMember.setText("New Member");
        newMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newMemberMouseClicked(evt);
            }
        });
        jPanel1.add(newMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\OneDrive\\Documents\\0. SIMBOL\\dashboard.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void newMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newMemberMouseClicked
        // TODO add your handling code here:
        new Member().setVisible(true);
    }//GEN-LAST:event_newMemberMouseClicked

    private void updateMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMemberMouseClicked
        // TODO add your handling code here:
        new updateMember().setVisible(true);
    }//GEN-LAST:event_updateMemberMouseClicked

    private void listMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMemberMouseClicked
        // TODO add your handling code here:
        new listMember().setVisible(true);
    }//GEN-LAST:event_listMemberMouseClicked

    private void paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentMouseClicked
        // TODO add your handling code here:
        new payment().setVisible(true);
    }//GEN-LAST:event_paymentMouseClicked

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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel listMember;
    private javax.swing.JLabel newMember;
    private javax.swing.JLabel payment;
    private javax.swing.JLabel updateMember;
    // End of variables declaration//GEN-END:variables

    class jLabel2 {

        public jLabel2() {
        }
    }
}