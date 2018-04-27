package Models;

/*
    Model for manipulatin employee accounts.
    Last updated 4/26/2018.
 */
//Imports.
import Interfaces.DatabaseInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//Public class employee mod.
public class EmployeeMod {

    //Stubbed constructor.
    private EmployeeMod() {
    }

    //Method to add new employee account.
    public static boolean addEmployee(String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current Employees, and add one more index
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String test = username;

        //Boolean to test if able to save.
        boolean save = true;
        for (Employee employee : arr) {
            if (employee.getUsername().contains(test)) {
                save = false;
            }
        }
        //If able to be saved, add new account to array and save to file.
        if (save) {
            arr.add(new Employee(firstName, lastName, email, username, password));
            DatabaseInterface.saveEmployee(arr);
        }
        //Return boolean for error if unsaved.
        return save;
    }

    //Method for archiving employee account.
    public static void removeEmployee(String username) throws IOException, Exception {
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String test = username;
        for (Employee employee : arr) {
            if (employee.getUsername().contains(test) && !employee.getArchived()) {
                employee.setArchived(true);
                DatabaseInterface.saveEmployee(arr);
            }
        }
    }

    //Method to find existing account by username.
    public static Employee findEmployeeUser(String username) throws IOException, Exception {
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String test = username;
        //If present, return employee object.
        for (Employee employee : arr) {
            if (employee.getUsername().equals(test) && !employee.getArchived()) {
                return employee;
            }
        }
        //Return null if no account found.
        return null;
    }

    //Method for modifying existing employee account.
    public static void modEmployee(String firstName, String lastName, String email, String username, String password, String _UUID) throws IOException, Exception {
        Employee modEmployee = new Employee(firstName, lastName, email, username, password, _UUID);
        String test = _UUID;
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        for (Employee employee : arr) {
            if (employee.getID().contains(test)) {
                Collections.replaceAll(arr, employee, modEmployee);
                DatabaseInterface.saveEmployee(arr);
            }
        }
    }
}
