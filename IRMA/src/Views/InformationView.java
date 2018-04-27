package Views;

/*
    View for information input and output to user.
    Last updated 4/26/2018.
 */
//Imports.
import Controllers.IRMAmainController;
import Interfaces.InformationSelection;
import Models.Customer;
import Models.CustomerMod;
import Models.Employee;
import Models.EmployeeMod;
import Models.Manager;
import Models.ManagerMod;
import java.util.logging.Level;
import java.util.logging.Logger;

//Public class for information view.
public class InformationView extends javax.swing.JFrame {

    //Public boolen to track text field input.
    private static boolean loadedFields = false;

    //Generate new InformationView.
    public InformationView() {
        initComponents();
        //Set UUID label and Error label visible to false.
        lblUUID.setVisible(false);
        lblError.setVisible(false);
    }

    //Method to clear text fields.
    private void clearFields() {
        txtUser.setText(null);
        txtPass.setText(null);
        txtEmail.setText(null);
        txtFirst.setText(null);
        txtLast.setText(null);
    }

    //Method to test if fields are populated or empty.
    private boolean hasInfo() {
        return !txtFirst.getText().isEmpty() && !txtLast.getText().isEmpty() && !txtEmail.getText().isEmpty() && !txtUser.getText().isEmpty() && !txtPass.getText().isEmpty();
    }

    //Method to set fields for a customer account.
    private void customerSetfields() {
        try {
            //Try catch: Send string from text field to customer account lookup
            //Populate fiellds with results
            String user = txtUser.getText();
            Customer customer = CustomerMod.findCustomerUser(user);
            //Set fields.
            txtUser.setText(customer.getUsername());
            txtPass.setText(customer.getPassword());
            txtEmail.setText(customer.getEmail());
            txtFirst.setText(customer.getFirstname());
            txtLast.setText(customer.getLastname());
            lblUUID.setText(customer.getID());
            //Set boolean to true, indicating fields are populated.
            loadedFields = true;
            //Hide Error label.
            lblError.setVisible(false);

        } catch (Exception ex) {
            //Catch error: Make Error label visible.
            lblError.setVisible(true);
            Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Method to set fields for a manager account.
    private void managerSetFields() {
        try {
            //Try catch: Send string from text field to customer account lookup
            //Populate fiellds with results
            String _user = txtUser.getText();
            Manager manager = ManagerMod.findManagerUser(_user);
            //Set fields
            txtUser.setText(manager.getUsername());
            txtPass.setText(manager.getPassword());
            txtEmail.setText(manager.getEmail());
            txtFirst.setText(manager.getFirstname());
            txtLast.setText(manager.getLastname());
            lblUUID.setText(manager.getID());
            //Set boolean to true, indicating fields are populated.
            loadedFields = true;
            //Hide Error label.
            lblError.setVisible(false);
            //Change enter button text to "Save" to prevent confusion.
            btnEnter.setText("Save");

        } catch (Exception ex) {
            //Catch error: Make Error label visible.
            lblError.setVisible(true);
            lblError.setText("No such user ID exists:");
            Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Public method to 
    private void employeeSetFields() {
        try {
            //Try catch: Send string from text field to employee account lookup
            //Populate fiellds with results
            String _user = txtUser.getText();
            Employee employee = EmployeeMod.findEmployeeUser(_user);
            //Set fields.
            txtUser.setText(employee.getUsername());
            txtPass.setText(employee.getPassword());
            txtEmail.setText(employee.getEmail());
            txtFirst.setText(employee.getFirstname());
            txtLast.setText(employee.getLastname());
            //Set boolean to true, indicating fields are populated.
            loadedFields = true;
            lblUUID.setText(employee.getID());
            //Change enter button text to "Save" to prevent confusion.
            btnEnter.setText("Save");
            //Hide Error label.
            lblError.setVisible(false);

        } catch (Exception ex) {
            //Catch error: Make Error label visible.
            lblError.setVisible(true);
            lblError.setText("No such user ID exists:");
            Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Generated code.
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
        lblUUID = new javax.swing.JLabel();

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
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnCancel.setText("Close");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblError.setText("Error: Generic Error");

        lblUUID.setText("UUID:");

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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblUUID)
                        .addComponent(lblError)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUUID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        //Whene exiting, reset boolean for window control to false, and dispose of current view.
        IRMAmainController.setWindowStatus(false);
        loadedFields = false;
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        //Get enumeration from main controller
        InformationSelection _choice = IRMAmainController.getChoice();

        //Switch case controls which methods are accessed by the enumeration returned.
        switch (_choice) {
            //Admin account adding a new manager
            case ADMINADD: {
                try {
                    //Check for fields having information.
                    if (hasInfo()) {
                        //Send text fields to manager mod and return confirmation.
                        boolean saved = ManagerMod.addManager(txtFirst.getText(), txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
                        if (!saved) {
                            //If not confirmed, make Error label match error and make visible.
                            lblError.setText("User ID already exists.");
                            lblError.setVisible(true);
                        }
                        //No information in fields, set error and make visible.
                    } else {
                        lblError.setText("User information missing:");
                        lblError.setVisible(true);
                    }

                } catch (Exception ex) {
                    Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            //Admin account modifying a manager account.
            case ADMINMOD:
                //If fields have been loaded, proceed with modifying the account.
                if (loadedFields) {
                    {
                        try {
                            //Send text fields to module for saving.
                            ManagerMod.modManager(txtFirst.getText(), txtLast.getText(),
                                    txtEmail.getText(), txtUser.getText(), txtPass.getText(), lblUUID.getText());
                        } catch (Exception ex) {
                            //If failed, show Error label and update Error label text/
                            lblError.setText("User ID already exists.");
                            lblError.setVisible(true);
                            Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    //If fields have not been set, set fields.
                    managerSetFields();
                }
                break;
            //Admiun account archiving a manager account.
            case ADMINDEL:
                //If fields have been loaded, proceed.
                if (loadedFields) {
                    {
                        try {
                            //Send user name of account to be archived.
                            ManagerMod.removeManager(txtUser.getText());
                        } catch (Exception ex) {
                            //Error handeling, user name not found.
                            lblError.setText("No such user.");
                            lblError.setVisible(true);
                            Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    //If fields are not set, set fields.
                    managerSetFields();
                }
                break;

            //Manager account adding an employee account.
            case MANAGERADDE: {
                try {
                    //If fields are not empty, try to save account.
                    if (hasInfo()) {
                        boolean saved = EmployeeMod.addEmployee(txtFirst.getText(), txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
                        if (!saved) {
                            //Failed to save, user already exists.
                            lblError.setText("User ID already exists.");
                            lblError.setVisible(true);
                        }
                    } else {
                        //Fields are not all set, set Error to visible and update text.
                        lblError.setText("User information missing:");
                        lblError.setVisible(true);
                    }

                } catch (Exception ex) {
                    Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            //Manager account modifying employee account.
            case MANAGERMODE:
                //If the fields have been loaded proceed.
                if (loadedFields) {
                    {
                        try {
                            //Send field information to method to modify employee accounts.
                            EmployeeMod.modEmployee(txtFirst.getText(), txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText(), lblUUID.getText());

                        } catch (Exception ex) {
                            //Returned error, user does not exists.
                            lblError.setText("User ID does not exists.");
                            lblError.setVisible(true);
                            Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    //If fields are not loaded, load fields.
                    employeeSetFields();

                }
                break;

            //Manager archiving an employee account.
            case MANAGERDELE:
                //If fields are loaded proceed.
                if (loadedFields) {
                    {
                        try {
                            //Sent user information to method for archiving accounts.
                            EmployeeMod.removeEmployee(txtUser.getText());
                        } catch (Exception ex) {
                            //Error returned, user does not exist.
                            lblError.setText("User ID does not exist.");
                            lblError.setVisible(true);
                            Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    //If fields are not set, set fields.
                    employeeSetFields();
                }
                break;

            //Method for both manager and employee adding a new customer account.
            case MANAGERADDC:
            case EMPLOYEEADD: {
                try {
                    //Check to see if the fields are not empty.
                    if (hasInfo()) {
                        //Send fields to method to add a new customer account.
                        boolean saved = CustomerMod.addCustomer(txtFirst.getText(), txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText());
                        if (!saved) {
                            //Error saving, user already exists.
                            lblError.setText("User ID already exists.");
                            lblError.setVisible(true);

                        }
                    } else {
                        //Fields were empty, error message.
                        lblError.setText("User information missing:");
                        lblError.setVisible(true);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            //Manager and Employee accounts modifying customer account.
            case MANAGERMODC:
            case EMPLOYEEMOD:
                //If the fields are loaded, proceed.
                if (loadedFields) {
                    try {
                        //Send field information to method to modify customer account.
                        CustomerMod.modCustomer(txtFirst.getText(), txtLast.getText(), txtEmail.getText(), txtUser.getText(), txtPass.getText(), lblUUID.getText());
                    } catch (Exception ex) {
                        //Error, user already exists.
                        lblError.setText("User ID already exists.");
                        lblError.setVisible(true);
                        Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //If fields are not loaded, load fields.
                } else {
                    customerSetfields();
                }
                break;

            //Manager and employee accounts archiving customer account.
            case MANAGERDELC:
            case EMPLOYEEDEL:
                //If fields are loaded, proceed.
                if (loadedFields) {
                    try {
                        //Send field information to method to archive account.
                        CustomerMod.removeCustomer(txtUser.getText());
                    } catch (Exception ex) {
                        //Error returned, user does not exist.
                        lblError.setText("User ID does not exist.");
                        lblError.setVisible(true);
                        Logger.getLogger(InformationView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    //If fields are not loaded, load fields.
                    customerSetfields();
                }
                break;
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //Clear text fields, reset fields loaded boolean, and hide Error label. 
        clearFields();
        loadedFields = false;
        lblError.setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

    //Generated code.
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Make new view visible.
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
    private javax.swing.JLabel lblUUID;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lnlEmail;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
