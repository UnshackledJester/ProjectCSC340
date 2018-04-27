package Models;

/*
    Model for authentication of login combination
    Last updated 4/26/2018.
 */

//Imports for i/o handling and interfaces.
import Utility.HashPassword;
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
    public static boolean testForManager(String _pass, String _user) throws Exception {
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        for (Manager manager : arr) {
            if (manager.getUsername().equals(_user) && HashPassword.deHashed(manager.getPassword()).equals(_pass)) {
                if (!manager.getArchived()) {
                    return true;
                }
            }
        }
        return false;
    }

    //Test if employee username and password combination exists.
    public static boolean testForEmployee(String _pass, String _user) throws Exception {
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        for (Employee employee : arr) {
            if (employee.getUsername().equals(_user) && HashPassword.deHashed(employee.getPassword()).equals(_pass)) {
                if (!employee.getArchived()) {
                    return true;
                }
            }
        }
        return false;

    }

    //Test if amin username and password combination exists.
    public static boolean testForAdmin(String _pass, String _user) throws Exception {
        ArrayList<Admin> arr = ServerInterface.getAdmin();
        for (Admin admin : arr) {
            if (admin.getUsername().equals(_user) && admin.getPassword().equals(_pass)) {

                return true;

            }
        }

        return false;

    }

    //Test if customer username and password combination exists.
    public static boolean testForCustomer(String _pass, String _user) throws Exception {
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        for (Customer customer : arr) {
            if (customer.getUsername().equals(_user) && customer.getPassword().equals(_pass)) {
                if (!customer.getArchived()) {
                    return true;
                }
            }
        }
        return false;

    }
}
