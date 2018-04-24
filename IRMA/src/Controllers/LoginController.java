/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import  Interfaces.DatabaseInterface;
import  Interfaces.ServerInterface;
import Views.LoginView;
import java.io.IOException;

public class LoginController {

    public LoginController() {
    }

    
    //Validation function that calls database interface.
    public static int validateInput(String pass, String user) throws IOException {
        boolean manager = Interfaces.DatabaseInterface.testForManager(pass, user);
        boolean employee = Interfaces.DatabaseInterface.testForEmployee(pass, user);
        boolean admin = Interfaces.ServerInterface.testForAdmin(pass, user);

        if (true == manager) {
            return 1;
        } else if (true == employee) {
            return 2;
        } else if (true == admin) {
            return 3;
        } else {
            return 0;
        }
    }//Make view for LoginView.
    public static void MakeLogin(){
    LoginView logv = new LoginView();
      logv.setVisible(true);
    }
    
}
