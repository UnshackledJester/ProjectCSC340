package Views;

import static Controllers.LoginController.MakeLogin;
import static Controllers.AdminController.addManager;
import static Controllers.AdminController.findManagerID;
import static Controllers.AdminController.findManagerUser;
import static Controllers.AdminController.modManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminView extends javax.swing.JFrame {

//New AdminView Form
    public AdminView() {
        initComponents();
        //Set initial visibility
        txtID.setVisible(false);
        txtFirstName.setVisible(false);
        txtLastName.setVisible(false);
        txtEmail.setVisible(false);
        txtUsername.setVisible(false);
        txtPassword.setVisible(false);

        lblID.setVisible(false);
        lblFirst.setVisible(false);
        lblLast.setVisible(false);
        lblEmail.setVisible(false);
        lblUsername.setVisible(false);
        lblPass.setVisible(false);
        lblError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblFirst = new javax.swing.JLabel();
        lblLast = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Add New Manager");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnMod.setText("Save Changes");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        txtID.setMinimumSize(new java.awt.Dimension(117, 20));

        lblID.setText("ID");

        lblFirst.setText("First Name");

        lblLast.setText("Last Name");

        lblEmail.setText("Email");

        lblUsername.setText("Username");

        lblPass.setText("Password");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setText("Save New Manager");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblError.setText("Error: Manager not found.");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnFind.setText("Find a Manager");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnSearch)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirst, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPass, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblLast, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtLastName)
                                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.CENTER))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblError)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtFirstName, txtLastName, txtPassword});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblError)
                    .addComponent(btnFind))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirst))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLast))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPass)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUsername)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod)
                        .addGap(58, 58, 58)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        MakeLogin();
        //If logout is clicked, close this out and remake login window
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();//Clear error label
        lblError.setVisible(false);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Make fields visible for use when selecting "Add new manager"
        txtID.setVisible(true);
        txtFirstName.setVisible(true);
        txtLastName.setVisible(true);
        txtEmail.setVisible(true);
        txtUsername.setVisible(true);
        txtPassword.setVisible(true);

        lblID.setVisible(true);
        lblFirst.setVisible(true);
        lblLast.setVisible(true);
        lblEmail.setVisible(true);
        lblUsername.setVisible(true);
        lblPass.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            //Add new manager to textfile
            addManager(txtID.getText(), txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(),
                    txtUsername.getText(), txtPassword.getText());
            clearFields();
        } catch (IOException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
//Try/catch to modify an existing manager based on information within the text fields.
        try {
            modManager(txtID.getText(), txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(),
                    txtUsername.getText(), txtPassword.getText());
            clearFields();
        } catch (IOException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnModActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            //Try catch to get an array with manager variables(Will be reworked for simplicity
            String[] array = findManagerID(txtID.getText());
            setFields(array);

        } catch (IOException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        //Set fields visible for searching for a Manager
        lblID.setVisible(true);
        lblUsername.setVisible(true);
        txtID.setVisible(true);
        txtUsername.setVisible(true);    }//GEN-LAST:event_btnFindActionPerformed

    //default java stuff
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    public void setFields(String[] arrayin) {
        /*Horribly coded section to fill in text fields
        Spent an hour trouble shooting only to find out
        recoding it without changing anything fixed it.
        Java is buggy*/
        txtID.setText(arrayin[0]);
        txtFirstName.setText(arrayin[1]);
        txtLastName.setText(arrayin[2]);
        txtEmail.setText(arrayin[3]);
        txtUsername.setText(arrayin[4]);
        txtPassword.setText(arrayin[5]);
        //Hide ID from access so that the universal(eventually) ID cannot be changed.
        txtID.setVisible(false);
        txtFirstName.setVisible(true);
        txtLastName.setVisible(true);
        txtEmail.setVisible(true);
        txtUsername.setVisible(true);
        txtPassword.setVisible(true);

        lblID.setVisible(true);
        lblFirst.setVisible(true);
        lblLast.setVisible(true);
        lblEmail.setVisible(true);
        lblUsername.setVisible(true);
        lblPass.setVisible(true);
    }

    public void clearFields() {
<<<<<<< HEAD
        txtID.setText(null);
        txtFirstName.setText(null);
        txtLastName.setText(null);
        txtEmail.setText(null);
        txtUsername.setText(null);
        txtPassword.setText(null);
=======
        //Hide text fields and labels
        txtID.setText(" ");
        txtFirstName.setText(" ");
        txtLastName.setText(" ");
        txtEmail.setText(" ");
        txtUsername.setText(" ");
        txtPassword.setText(" ");
>>>>>>> 88d54c32cbcdf39bde690e210cbeb50941dea63e

        txtID.setVisible(false);
        txtFirstName.setVisible(false);
        txtLastName.setVisible(false);
        txtEmail.setVisible(false);
        txtUsername.setVisible(false);
        txtPassword.setVisible(false);

        lblID.setVisible(false);
        lblFirst.setVisible(false);
        lblLast.setVisible(false);
        lblEmail.setVisible(false);
        lblUsername.setVisible(false);
        lblPass.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFirst;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLast;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}