package Views;

/*
    View for employee accounts.
    Last updated 4/26/2018.
 */

//Imports.
import Controllers.IRMAmainController;
import Interfaces.InformationSelection;

//Public class for employee view.
public class EmployeeView extends javax.swing.JFrame {

    //Create new employee view.
    public EmployeeView() {
        initComponents();
        //Hide error label.
        lblError.setVisible(false);
    }

    //Generated code.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Add New Customer");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnMod.setText("Modify Customer");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnDel.setText("Delete Customer");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnLogout.setForeground(new java.awt.Color(255, 0, 0));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnLogout)
                    .addComponent(lblError))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnMod)
                .addGap(18, 18, 18)
                .addComponent(btnDel)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(33, 33, 33)
                .addComponent(lblError)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        //Upon exit via exit button, dispose of current window and generate new login view. 
        LoginView logv = new LoginView();
        logv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Button selection enumerated and sent to main controller for employee 
        //adding new customer.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.EMPLOYEEADD);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        //Button selection enumerated and sent to main controller for employee 
        //amodifying customer.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.EMPLOYEEMOD);
    }//GEN-LAST:event_btnModActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        //Button selection enumerated and sent to main controller for employee 
        //archiving customer.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.EMPLOYEEDEL);
    }//GEN-LAST:event_btnDelActionPerformed

    //Generated code.
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Make new employee view visible.
                new EmployeeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMod;
    private javax.swing.JLabel lblError;
    // End of variables declaration//GEN-END:variables
}
