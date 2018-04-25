/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import  Interfaces.DatabaseInterface;
import  Interfaces.LoginEnum;
import  Interfaces.ServerInterface;
import Views.LoginView;
import Interfaces.ValidateInfo;
import java.io.IOException;

public class LoginController {

    public LoginController() {
    }

    
    //Validation function that calls database interface.
    
    LoginEnum testInfo = Interfaces.ValidateInfo.validateInput(pass, user);
    //Make view for LoginView.
    public static void MakeLogin(){
    LoginView logv = new LoginView();
      logv.setVisible(true);
    }
    
}
