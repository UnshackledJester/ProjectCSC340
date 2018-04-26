/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.IRMAmainController;
import Interfaces.InformationSelection;
import Models.CustomerMod;
import Models.EmployeeMod;
import Models.ManagerMod;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chronos
 */



/*
        txtUser.getText();
        txtPass.getText();
        txtEmail.getText();
        txtFirst.getText();
        txtLast.getText();
*/
public class InformationView extends javax.swing.JFrame {

    /**
     * Creates new form InformationView
     * @param choice
     */
    public InformationView() {
        initComponents();
    }
    public void clearFields(){
        txtUser.setText(null);
        txtPass.setText(null);
        txtEmail.setText(null);
        txtFirst.setText(null);
        txtLast.setText(null);
        }
    public void setFields(String user, String pass, String firstName, String lastName, String email){
        txtUser.setText(user);
        txtPass.setText(pass);
        txtEmail.setText(email);
        txtFirst.setText(firstName);
        txtLast.setText(lastName);
        }
    
    public String getUser(){
        String user = txtUser.getText();
        return user;
        }
    public String getPass(){
        String pass = txtPass.getText();    
        return pass;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblFirst = new javax.swing.JLabel();
        lblLast = new javax.swing.JLabel();
        lnlEmail = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtFirst = new javax.swing.JTextField();
        txtLast = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUser.setText("Username");

        lblPass.setText("Password");

        lblFirst.setText("First Name");

        lblLast.setText("Last Name");

        lnlEmail.setText("Email");

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");

        btnCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblError.setText("Error: Generic Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPass)
                            .addComponent(lblUser)
                            .addComponent(lblFirst)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lnlEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtLast)
                            .addComponent(txtFirst)
                            .addComponent(txtPass)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnter)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addComponent(lblError))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancel, btnClear, btnEnter});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirst)
                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLast)
                    .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnlEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblError)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnter)
                    .addComponent(btnClear)
                    .addComponent(btnCancel))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        IRMAmainController.setWindowStatus(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
       
        // TODO add your handling code here:
        InformationSelection choice = IRMAmainController.getChoice();
        
        
        switch(choice){
            case ADMINADD: System.out.println("Worked Admin add");
        {
            try {
                ManagerMod.addManager(txtFirst.getText(),txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            
            case ADMINMOD: System.out.println("Worked Admin mod");
        {
            try {
                ManagerMod.modManager(txtFirst.getText(),txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            case ADMINDEL: System.out.println("Worked Admin del");
        {
            try {
                ManagerMod.removeManager(txtUser.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            case MANAGERADDE: System.out.println("Worked managerAddE");
        {
            try {
                EmployeeMod.addEmployee(txtFirst.getText(),txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            case MANAGERMODE: System.out.println("Worked manager modE");
        {
            try {
                EmployeeMod.modEmployee(txtFirst.getText(),txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            case MANAGERDELE: System.out.println("Worked manager delE");
        {
            try {
                EmployeeMod.removeEmployee(txtUser.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            
            case MANAGERADDC: System.out.println("Worked manager addC");
            case EMPLOYEEADD: System.out.println("Worked Employee add");
        {
            try {
                CustomerMod.addCustomer(txtFirst.getText(),txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            case MANAGERMODC: System.out.println("Worked manager modC");
            case EMPLOYEEMOD: System.out.println("Worked, employee mod");
        {
            try {
                CustomerMod.modCustomer(txtFirst.getText(),txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            case MANAGERDELC: System.out.println("Worked managerDelC");
            case EMPLOYEEDEL: System.out.println("Worked, employee del");
        {
            try {
                CustomerMod.removeCustomer(txtUser.getText());
            } catch (Exception ex) {
                Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            default:
                System.out.println("Error");
                break;
            
        }
    }//GEN-LAST:event_btnEnterActionPerformed

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
            java.util.logging.Logger.getLogger(InformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationView().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFirst;
    private javax.swing.JLabel lblLast;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lnlEmail;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
