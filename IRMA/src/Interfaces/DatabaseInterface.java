package Interfaces;

/*
    Interface for the database.
    Last updated 4/26/2018.
 */
import Models.Manager;
import Models.Employee;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Class to act as interface for simulated database(textfile used)
public class DatabaseInterface {

    //Method to get Manager array from file.
    public static ArrayList<Manager> loadManager() throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("managers.txt"));
        ArrayList<Manager> managerArray = (ArrayList<Manager>) oin.readObject();
        oin.close();
        return managerArray;
    }

    //Method to save manager array to file.
    public static void saveManager(ArrayList<Manager> managerArray) throws Exception //writes the array of Customer to a file "Customer.ser"
    {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("managers.txt"));
        os.writeObject(managerArray);
        os.close();
    }

    //Method to load employee array from file.
    public static ArrayList<Employee> loadEmployee() throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("employees.txt"));
        ArrayList<Employee> employeeArray = (ArrayList<Employee>) oin.readObject();
        oin.close();
        return employeeArray;
    }

    //Method to save employee array to file.
    public static void saveEmployee(ArrayList<Employee> employeeArray) throws Exception //writes the array of Customer to a file "Customer.ser"
    {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("employees.txt"));
        os.writeObject(employeeArray);
        os.close();
    }

    //Method to load manager array from file.
    public static ArrayList<Manager> getManager() throws Exception {
        ArrayList<Manager> Manager = loadManager();
        for (Manager p : Manager) {
        }
        return Manager;
    }

    //Method to load employee array from file.
    public static ArrayList<Employee> getEmployee() throws Exception {
        ArrayList<Employee> Employee = loadEmployee();

        for (Employee p : Employee) {
        }
        return Employee;
    }
}
