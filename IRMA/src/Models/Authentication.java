package Models;

import Interfaces.DatabaseInterface;
import Interfaces.LoginEnum;
import Interfaces.ServerInterface;
import java.io.IOException;
import java.util.ArrayList;

public class Authentication {

    public static LoginEnum validateInput(String pass, String user) throws IOException, Exception {
        boolean manager = testForManager(pass, user);
        boolean employee = testForEmployee(pass, user);
        boolean admin = testForAdmin(pass, user);

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
//Test if manager Username and Password combination exists.

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

    //Test if Employee Username and Password combination exists.
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

    public static boolean testForAdmin(String pass, String user) throws Exception {
        ArrayList<Admin> arr = ServerInterface.getAdmin();
        for (Admin admin : arr) {
            if (admin.getUsername().equals(user) && admin.getPassword().equals(pass)) {
                
                    return true;
                
            }
        }

        return false;

    }

    public static boolean testForCustomer(String pass, String user) throws Exception {
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        for (Customer customer : arr) {
            if (customer.getUsername().equals(user) && customer.getPassword().equals(pass)) {
                if(!customer.isArchived()){
                return true;
                }
            }
        }
        return false;

    }
}
