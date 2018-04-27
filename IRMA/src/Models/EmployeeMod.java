package Models;

/*
    Model for manipulatin employee accounts.
    Last updated 4/26/2018.
 */
//Imports.
import Interfaces.DatabaseInterface;
import Utility.Res;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//Public class employee mod.
public class EmployeeMod {

    //Stubbed constructor.
    private EmployeeMod() {
    }

    //Method to add new employee account.
    public static boolean addEmployee(String _firstName, String _lastName, String _email, String _username, String _password) throws IOException, Exception {
        //Get array of current Employees, and add one more index
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String testUser = _username;

        //Boolean to test if able to save.
        boolean save = true;
        for (Employee employee : arr) {
            if (!employee.getUsername().contains(testUser)|| !(Res.hasLength(testUser)) || !(Res.hasUpperCase(testUser)) || !(Res.hasLowerCase(testUser)) || !(Res.hasSymbol(testUser))) {
                save = false;
            }
        }
        //If able to be saved, add new account to array and save to file.
        if (save) {
            arr.add(new Employee(_firstName, _lastName, _email, _username, _password));
            DatabaseInterface.saveEmployee(arr);
        }
        //Return boolean for error if unsaved.
        return save;
    }

    //Method for archiving employee account.
    public static void removeEmployee(String _username) throws IOException, Exception {
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String testUser = _username;
        for (Employee employee : arr) {
            if (employee.getUsername().contains(testUser) && !employee.getArchived()) {
                employee.setArchived(true);
                DatabaseInterface.saveEmployee(arr);
            }
        }
    }

    //Method to find existing account by username.
    public static Employee findEmployeeUser(String _username) throws IOException, Exception {
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String testUser = _username;
        //If present, return employee object.
        for (Employee employee : arr) {
            if (employee.getUsername().equals(testUser) && !employee.getArchived()) {
                return employee;
            }
        }
        //Return null if no account found.
        return null;
    }

    //Method for modifying existing employee account.
    public static void modEmployee(String _firstName, String _lastName, String _email, String _username, String _password, String _UUID) throws IOException, Exception {
        Employee modEmployee = new Employee(_firstName, _lastName, _email, _username, _password, _UUID);
        String testID = _UUID;
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        for (Employee employee : arr) {
            if (employee.getID().contains(testID)) {
                Collections.replaceAll(arr, employee, modEmployee);
                DatabaseInterface.saveEmployee(arr);
            }
        }
    }
}
