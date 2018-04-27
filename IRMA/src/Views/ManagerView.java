package Views;

/*
    View for manager.
    Last updated 4/26/2018.
*/
//Imports.
import Controllers.IRMAmainController;
import Controllers.LoginController;
import Interfaces.InformationSelection;

//Public class for manager view.
public class ManagerView extends javax.swing.JFrame {

    //Create new manager view.
    public ManagerView() {
        initComponents();
        lblError.setVisible(false);
    }

    //Generated code.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddC = new javax.swing.JButton();
        btnModC = new javax.swing.JButton();
        btnDelC = new javax.swing.JButton();
        btnAddE = new javax.swing.JButton();
        btnModE = new javax.swing.JButton();
        btnDelE = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddC.setText("Add New Customer");
        btnAddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCActionPerformed(evt);
            }
        });

        btnModC.setText("Modify Customer");
        btnModC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModCActionPerformed(evt);
            }
        });

        btnDelC.setText("Delete Customer");
        btnDelC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCActionPerformed(evt);
            }
        });

        btnAddE.setText("Add New Employee");
        btnAddE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEActionPerformed(evt);
            }
        });

        btnModE.setText("Modify Employee");
        btnModE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModEActionPerformed(evt);
            }
        });

        btnDelE.setText("Delete Employee");
        btnDelE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelEActionPerformed(evt);
            }
        });

        btnLogout.setForeground(new java.awt.Color(204, 0, 0));
        btnLogout.setText("Log out");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addComponent(lblError))
                    .addComponent(btnLogout))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddC)
                .addGap(18, 18, 18)
                .addComponent(btnModC)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDelC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblError)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddE)
                .addGap(18, 18, 18)
                .addComponent(btnModE)
                .addGap(18, 18, 18)
                .addComponent(btnDelE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        //Exit system when exit button is pressed.
        LoginView logv = new LoginView();
        logv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCActionPerformed
        //Button selection enumerated and sent to main controller for manager 
        //adding new customer.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.MANAGERADDC);
    }//GEN-LAST:event_btnAddCActionPerformed

    private void btnModCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModCActionPerformed
        //Button selection enumerated and sent to main controller for manager 
        //modifying a customer.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.MANAGERMODC);
    }//GEN-LAST:event_btnModCActionPerformed

    private void btnDelCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCActionPerformed
        //Button selection enumerated and sent to main controller for manager 
        //archiving a customer.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.MANAGERDELC);
    }//GEN-LAST:event_btnDelCActionPerformed

    private void btnAddEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEActionPerformed
        //Button selection enumerated and sent to main controller for manager 
        //adding a new employee.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.MANAGERADDE);
    }//GEN-LAST:event_btnAddEActionPerformed

    private void btnModEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModEActionPerformed
        //Button selection enumerated and sent to main controller for manager 
        //modifying an employee.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.MANAGERMODE);
    }//GEN-LAST:event_btnModEActionPerformed

    private void btnDelEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelEActionPerformed
        //Button selection enumerated and sent to main controller for manager 
        //archiving an employee.
        Controllers.IRMAmainController.MakeInfoView();
        IRMAmainController.setChoice(InformationSelection.MANAGERDELE);
    }//GEN-LAST:event_btnDelEActionPerformed

    //Generated code.
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Make new manager view visible.
                new ManagerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddC;
    private javax.swing.JButton btnAddE;
    private javax.swing.JButton btnDelC;
    private javax.swing.JButton btnDelE;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModC;
    private javax.swing.JButton btnModE;
    private javax.swing.JLabel lblError;
    // End of variables declaration//GEN-END:variables
}
