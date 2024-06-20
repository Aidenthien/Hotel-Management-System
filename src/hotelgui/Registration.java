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
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        setTitle("Registration Page");
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

        grpGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        cmbDate = new javax.swing.JComboBox<>();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        checkShowPass = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(600, 445));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setText("Staff Registration Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 31, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 122, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Gender:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 159, 62, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("DOB:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 203, 37, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Username:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 247, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 291, -1, -1));

        txtName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 119, 201, -1));

        txtUsername.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 244, 201, -1));

        txtPassword.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 288, 201, -1));

        radMale.setBackground(new java.awt.Color(255, 255, 255));
        grpGender.add(radMale);
        radMale.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        radMale.setText("Male");
        radMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMaleActionPerformed(evt);
            }
        });
        getContentPane().add(radMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 157, 98, -1));

        radFemale.setBackground(new java.awt.Color(255, 255, 255));
        grpGender.add(radFemale);
        radFemale.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        radFemale.setText("Female");
        getContentPane().add(radFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 157, 98, -1));

        cmbDate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        cmbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Date-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(cmbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 200, -1, -1));

        cmbMonth.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Month-", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        getContentPane().add(cmbMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        cmbYear.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Year-", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        getContentPane().add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 200, -1, -1));

        btnRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 356, -1, -1));

        btnReset.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 356, -1, -1));

        btnExit.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnExit.setText("Back");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 356, -1, -1));

        checkShowPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkShowPass.setText("Show Password");
        checkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkShowPassActionPerformed(evt);
            }
        });
        getContentPane().add(checkShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 290, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 300, 10));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void radMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radMaleActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String n, g=null,dt,mt,yr,dob,u,p;
        
        n=txtName.getText();
        if(n.trim().equals("")) {
        JOptionPane.showMessageDialog(null,"Please fill in your name!","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        if(!n.matches("[a-zA-Z\\s]+")) {
        JOptionPane.showMessageDialog(null,"Name should contain only letters and spaces","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if(radMale.isSelected()){
            g=radMale.getText(); //g="Male";
        }else if(radFemale.isSelected()){
            g=radFemale.getText(); //g="Female";
        }else{
            JOptionPane.showMessageDialog(null,"Please choose your Gender!","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        dt=String.valueOf(cmbDate.getSelectedItem());
        mt=String.valueOf(cmbMonth.getSelectedItem());
        yr=String.valueOf(cmbYear.getSelectedItem());
        if (cmbDate.getSelectedItem().equals("-Date-") || cmbMonth.getSelectedItem().equals("-Month-")|| cmbYear.getSelectedItem().equals("-Year-")){
            JOptionPane.showMessageDialog(null, "Please select valid dates!","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        dob=dt+"/"+mt+"/"+yr;
        
        u=txtUsername.getText();
        if(u.trim().equals("")) {
        JOptionPane.showMessageDialog(null,"Please fill in your username!","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        if(!u.matches("[a-zA-Z\\s]+")) {
        JOptionPane.showMessageDialog(null,"Username should contain only letters and spaces","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        p=String.valueOf(txtPassword.getPassword());
        if (p.length() < 8 || !p.matches(".*\\d.*")) { //check whether the string value is more than 8 or have any numeric value in the string
            JOptionPane.showMessageDialog(null, "Password must have at least 8 characters with at least one number",
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
}
        
        User obj1 = new User(n,g,dob,u,p);
        String res=obj1.writeRecord();
        if(res== "Success"){
            JOptionPane.showMessageDialog(null,"Registration completed.","Success",JOptionPane.INFORMATION_MESSAGE);
            auditLog log = new auditLog();
            log.auditLog("New staff account has been registered under username "+u);
            txtName.setText("");
            grpGender.clearSelection();
            cmbDate.setSelectedIndex(0);
            cmbMonth.setSelectedIndex(0);
            cmbYear.setSelectedIndex(0);
            txtUsername.setText("");
            txtPassword.setText("*****");
            MainMenu a =new MainMenu();
            a.setVisible(true);
            this.setVisible(false);
        }else{            
            JOptionPane.showMessageDialog(null, "Could not write into file due to "+res,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtName.setText("");
        grpGender.clearSelection();
        cmbDate.setSelectedIndex(0);
        cmbMonth.setSelectedIndex(0);
        cmbYear.setSelectedIndex(0);
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you don't want to register?", "Go Back", JOptionPane.YES_NO_OPTION);
        if (n==JOptionPane.YES_OPTION){
            MainMenu a =new MainMenu();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void checkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkShowPassActionPerformed
        if (checkShowPass.isSelected()){
            txtPassword.setEchoChar((char)0);
        }else{
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkShowPassActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }
    
    private void setCustomIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("hotelLogo3.0.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox checkShowPass;
    private javax.swing.JComboBox<String> cmbDate;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.ButtonGroup grpGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
