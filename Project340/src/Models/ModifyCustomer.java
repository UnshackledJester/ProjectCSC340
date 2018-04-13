package Models;

import Models.Customer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mushfau
 */
public class ModifyCustomer extends javax.swing.JFrame {

    boolean isFound = false;

    private void createActionPerformed(java.awt.event.ActionEvent evt) {
        String id = txt_id.getText();
        String firstname = txt_firstname.getText();
        String lastname = txt_lastname.getText();
        String email = txt_email.getText();

        if (id.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "fill all fields");
        } else {
            File file = new File("C:\\User.txt");
            Customer user = new Customer(id, firstname, lastname, email);

            try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
                pw.println(user.toString());
                JOptionPane.showMessageDialog(this, "new user added");
                btn_save.setEnabled(false);
                txt_id.setEnabled(false);
                txt_firstname.setEnabled(false);
                txt_lastname.setEnabled(false);
                txt_email.setEnabled(false);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }


    }

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        txt_id.setText("");
        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_email.setText("");
        
        txt_id.setEnabled(true);
        txt_firstname.setEnabled(true);
        txt_lastname.setEnabled(true);
        txt_email.setEnabled(true);
        
        btn_save.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
    }

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {
        String search_id = txt_id.getText();
        String firstname = txt_firstname.getText();
        String lastname = txt_lastname.getText();
        String email = txt_email.getText();

        ArrayList<Customer> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "enter a valid id and search");
        } else if (search_id.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "fill all fields");
        } else {
            File file = new File("C:\\User.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    Customer tempUser;
                    while ((data = br.readLine()) != null) {
                        tempUser = new Customer(data);
                        if (tempUser.getId().equals(search_id)) {
                            tempUser.setFirstname(firstname);
                            tempUser.setLastname(lastname);
                            tempUser.setEmail(email);
                        }
                        userList.add(tempUser);
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(this, "user updated");
                    btn_update.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }

    private void findActionPerformed(java.awt.event.ActionEvent evt) {

        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_email.setText("");
        isFound = false;
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);

        String search_id = txt_id.getText();

        if (search_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "enter an id to search");
        } else {
            File file = new File("C:\\User.txt");

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data;
                Customer user;

                while ((data = br.readLine()) != null) {
                    user = new Customer(data);
                    if (user.getId().equals(search_id)) {
                        isFound = true;
                        txt_firstname.setText(user.getFirstname());
                        txt_lastname.setText(user.getLastname());
                        txt_email.setText(user.getEmail());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "user not found");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        }

    }

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String delete_id = txt_id.getText();

        ArrayList<Customer> userList = new ArrayList<>();

        if (!isFound) {
            JOptionPane.showMessageDialog(this, "enter a valid id and search");
        } else {
            File file = new File("C:\\User.txt");

            try {
                try (FileReader fr = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(fr);
                    String data;
                    Customer tempUser;

                    while ((data = br.readLine()) != null) {
                        tempUser = new Customer(data);
                        if (!tempUser.getId().equals(delete_id)) {
                            userList.add(tempUser);
                        }                        
                    }
                }

                try (PrintWriter pw = new PrintWriter(new FileWriter(file, false))) {
                    userList.forEach((user) -> {
                        pw.println(user.toString());
                    });
                    JOptionPane.showMessageDialog(this, "user deleted");
                    btn_delete.setEnabled(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lastname;
    // End of variables declaration//GEN-END:variables
}