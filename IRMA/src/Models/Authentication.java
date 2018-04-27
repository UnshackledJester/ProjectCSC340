package Models;
/*
    Model for authentication of login combination
    Last updated 4/26/2018.
*/

//Imports for i/o handling and interfaces.
import Interfaces.DatabaseInterface;
import Interfaces.LoginEnum;
import Interfaces.ServerInterface;
import java.io.IOException;
import java.util.ArrayList;

//Public class for Authentication
public class Authentication {

    //Login to begin testing results and return an enumeration.
    public static LoginEnum validateInput(String pass, String user) throws IOException, Exception {
        //Boolean methods test for correct username and password combination.
        boolean manager = testForManager(pass, user);
        boolean employee = testForEmployee(pass, user);
        boolean admin = testForAdmin(pass, user);

        //Enumeration returned.
        if (true == manager) {
            return LoginEnum.MANAGER;
        } else if (true == employee) {
            return LoginEnum.EMPLOYEE;
        } else if (true == admin) {
            return LoginEnum.ADMIN;
        } else {
            return LoginEnum.NOMATCH;
        }
    }
    
//Test if manager username and password combination exists.
    public static boolean testForManager(String pass, String user) throws IOException, Exception {
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        for (Manager manager : arr) {
            if (manager.getUsername().equals(user) && manager.getPassword().equals(pass)) {
                if(!manager.isArchived()){
                return true;
                }
            }
        }
        return false;
    }

    //Test if employee username and password combination exists.
    public static boolean testForEmployee(String pass, String user) throws Exception {
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        for (Employee employee : arr) {
            if (employee.getUsername().equals(user) && employee.getPassword().equals(pass)) {
                if (!employee.isArchived()) {
                    return true;
                }
            }
        }
        return false;

    }

    //Test if amin username and password combination exists.
    public static boolean testForAdmin(String pass, String user) throws Exception {
        ArrayList<Admin> arr = ServerInterface.getAdmin();
        for (Admin admin : arr) {
            if (admin.getUsername().equals(user) && admin.getPassword().equals(pass)) {
                
                    return true;
                
            }
        }

        return false;

    }

    //Test if customer username and password combination exists.
    public static boolean testForCustomer(String pass, String user) throws Exception {
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        for (Customer customer : arr) {
            if (customer.getUsername().equals(user) && customer.getPassword().equals(pass)) {
                if(!customer.getArchived()){
                return true;
                }
            }
        }
        return false;

    }
}
