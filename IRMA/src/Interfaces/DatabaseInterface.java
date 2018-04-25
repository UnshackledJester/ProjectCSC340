package Interfaces;

import Models.Manager;
import Models.Employee;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Class to act as interface for simulated database(textfile used)
public class DatabaseInterface {

    //Method to get Manager array
     public static ArrayList<Manager> loadManager()throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("managers.txt"));
        ArrayList<Manager> managerArray = (ArrayList<Manager>) oin.readObject();
        oin.close();
        return managerArray;
    }
     public static void saveManager(ArrayList<Manager> managerArray)throws Exception //writes the array of Customer to a file "Customer.ser"
    {   
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("managers.txt"));
        os.writeObject(managerArray);
        os.close();
    }
     public static ArrayList<Employee> loadEmployee()throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("employees.txt"));
        ArrayList<Employee> employeeArray = (ArrayList<Employee>) oin.readObject();
        oin.close();
        return employeeArray;
    }
     public static void saveEmployee(ArrayList<Employee> employeeArray)throws Exception //writes the array of Customer to a file "Customer.ser"
    {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("employees.txt"));
        os.writeObject(employeeArray);
        os.close();
    }
    public static ArrayList<Manager> getManager() throws Exception{
        ArrayList<Manager> Manager = loadManager();
        for (Manager p : Manager)
        {
            System.out.println(p);
            System.out.println("LOADED MANAGERS");
        }
         return Manager;
    }
    public static ArrayList<Employee> getEmployee() throws Exception{
        ArrayList<Employee> Employee = loadEmployee();
        
         for (Employee p : Employee)
        {
            System.out.println(p);
        }
         return Employee;
    } /*
     public static void main(String[] args) throws Exception
    {
        
       ArrayList<Manager> arr= new  ArrayList<Manager>();
       Manager manager = new Manager("Jerry", "Spencer", "Jspencer@ucng.edu", "jerspec", "Pandas");
       manager.setID();
       arr.add(manager);
       Manager manager1 = new Manager("Hieu", "Vo", "Hvvo@ucng.edu", "hvvo", "1");
       manager1.setID();
       arr.add(manager1);
       Manager manager2 = new Manager("KAren", "Ooblong", "KOblong@ucng.edu", "Kbaby", "Koalas");
       manager2.setID();;
       arr.add(manager2);
       
       

        
        System.out.println("Saving array to file");
        saveManager(arr);
        System.out.println("Reading array back from file");
        ArrayList<Manager> Manager = loadManager();
        for (Manager p : Manager)
        {
            System.out.println(p);
        }
         
        
    } */
}