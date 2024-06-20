/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelgui;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author aiden
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        setTitle("Staff MainMenu");
        initComponents();
        setCustomIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBook = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnAudit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBook.setIcon(new javax.swing.ImageIcon("C:\\programming files\\Java\\HotelGUI\\src\\img\\bookRoom.png")); // NOI18N
        btnBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 180, 130));

        btnManage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnManage.setIcon(new javax.swing.ImageIcon("C:\\programming files\\Java\\HotelGUI\\src\\img\\manageRoom.png")); // NOI18N
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        getContentPane().add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 180, 130));

        btnCheckOut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCheckOut.setIcon(new javax.swing.ImageIcon("C:\\programming files\\Java\\HotelGUI\\src\\img\\checkOut.png")); // NOI18N
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 180, 140));

        btnSignOut.setIcon(new javax.swing.ImageIcon("C:\\programming files\\Java\\HotelGUI\\src\\img\\signOut.png")); // NOI18N
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 240, 70));

        btnRegister.setIcon(new javax.swing.ImageIcon("C:\\programming files\\Java\\HotelGUI\\src\\img\\staffRegistration.png")); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 180, 130));

        btnAudit.setIcon(new javax.swing.ImageIcon("C:\\programming files\\Java\\HotelGUI\\src\\img\\auditLog.png")); // NOI18N
        btnAudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuditActionPerformed(evt);
            }
        });
        getContentPane().add(btnAudit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 250, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Staff Dashboard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 470, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\programming files\\Java\\HotelGUI\\src\\img\\PaikiaHotel.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 950, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        ManageRoom a =new ManageRoom();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Registration a =new Registration();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Sign Out", JOptionPane.YES_NO_OPTION);
        if (n==JOptionPane.YES_OPTION){
            auditLog log = new auditLog();
            log.auditLog("Staff logged out");
            log.auditLog("=".repeat(50));
            Login a =new Login();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        BookRoom a =new BookRoom();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        ViewReceipt a =new ViewReceipt();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnAuditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuditActionPerformed
        ActivityLog a =new ActivityLog();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAuditActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    private void setCustomIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("hotelLogo3.0.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAudit;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
