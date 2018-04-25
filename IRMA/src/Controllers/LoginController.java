package Controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Interfaces.LoginEnum;
import Views.AdminView;
import Views.EmployeeView;
import Views.LoginView;
import Views.ManagerView;
import java.io.IOException;

public class LoginController {

    public LoginController() {
    }

    public static void UserInput(String user,String pass) throws IOException, Exception{
        LoginEnum validate = Models.Authentication.validateInput(pass, user);
        validate.loginVal();
    switch(validate){
        case  ADMIN:{
            AdminView adminV = new AdminView();
            adminV.setVisible(true);
            break;
        }
        case MANAGER:{
            ManagerView managerV = new ManagerView();
            managerV.setVisible(true);
            
            break;
        }
        case EMPLOYEE:{
            EmployeeView employeeV = new EmployeeView();
            employeeV.setVisible(true);
            break;
        }default:{
            System.out.println("Error");
        
        break;
        }
    
}
    }
    //Validation function that calls database interface.
    
   
    public static void MakeLogin(){
    LoginView logv = new LoginView();
      logv.setVisible(true);
    }
    
}
