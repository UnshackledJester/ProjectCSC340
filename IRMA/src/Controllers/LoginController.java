/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import static Interfaces.DatabaseInterface.testForEmployees;
import static Interfaces.DatabaseInterface.testForManager;
import static Interfaces.ServerInterface.testForAdmin;
import Views.LoginView;
import java.io.IOException;
/**
 *
 * @author Chronos
 */
public class LoginController {

    public LoginController() {
    }

    
    
    public static int validateInput(String pass, String user) throws IOException {
        boolean manager = testForManager(pass, user);
        boolean employee = testForEmployees(pass, user);
        boolean admin = testForAdmin(pass, user);

        if (true == manager) {
            return 1;
        } else if (true == employee) {
            return 2;
        } else if (true == admin) {
            return 3;
        } else {
            return 0;
        }
    }
    public static void MakeLogin(){
    LoginView logv = new LoginView();
      logv.setVisible(true);
    }
    
}
