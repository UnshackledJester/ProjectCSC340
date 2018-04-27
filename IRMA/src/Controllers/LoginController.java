package Controllers;

/*
    Controller for login view.
    Last updated 4/26/2018
 */
//Import views, enumuerations, and I/O handeling.
import Interfaces.LoginEnum;
import Views.AdminView;
import Views.EmployeeView;
import Views.LoginView;
import Views.ManagerView;
import java.io.IOException;

//Public class for controller.
public class LoginController {

//Stubbed constructor.
    public LoginController() {
    }

    //Boolean method to validate password and username combination.
    public static boolean UserInput(String user, String pass) throws IOException, Exception {
        //Calls authentication method and recieves enumeration based on pass/fail.
        LoginEnum validate = Models.Authentication.validateInput(pass, user);

        //Switch case to control which view is used based on valid login information.
        switch (validate) {
            //Generate Admin view.
            case ADMIN: {
                AdminView adminV = new AdminView();
                adminV.setVisible(true);
                return true;

            }
            //Generate Mannager view.
            case MANAGER: {
                ManagerView managerV = new ManagerView();
                managerV.setVisible(true);
                return true;

            }//Generate Employee view.
            case EMPLOYEE: {
                EmployeeView employeeV = new EmployeeView();
                employeeV.setVisible(true);
                return true;
            }//Default returned false information: Error displayed.
            default: {
                System.out.println("Error");
                return false;

            }

        }
    }
    //Method to generate new login view.
    public static void MakeLogin() {
        //Creates new login view.
        LoginView logv = new LoginView();
        //Make new login view visible.
        logv.setVisible(true);
    }

}
