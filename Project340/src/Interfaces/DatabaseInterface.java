package Interfaces;

import java.io.FileNotFoundException;
import java.io.FileReader;
import Models.Manager;
import Models.Employee;
import java.util.Scanner;
import java.io.*;

//Class to act as interface for simulated database(textfile used)
public class DatabaseInterface {

    //Method to get Manager array
    public static Manager[] getManagers() throws FileNotFoundException, IOException {
        //For use with a future interface
        String file = Utility.Config.getFileDatabase("Managers");
        //Sends for method to read file
        Manager[] managerArray = readFileManagers(file);
        return managerArray;
    }

    //Read text file, assign variables, create Manager objects from variables, and return array of Managers.
    public static Manager[] readFileManagers(String fileLocation) throws FileNotFoundException, IOException {
        String file = fileLocation;
        int total = getTotal(file);
        Manager[] managerArray = new Manager[total];
        try (Scanner inFile = new Scanner(new File(file))) {
            int i = 0;
            while (inFile.hasNextLine()) {
                String id = inFile.nextLine();
                String firstName = inFile.nextLine();
                String lastName = inFile.nextLine();
                String email = inFile.nextLine();
                String username = inFile.nextLine();
                String password = inFile.nextLine();
                Manager manager = new Manager(id, firstName, lastName, email, username, password);
                managerArray[i] = manager;
                i++;
            }
            inFile.close();
        }
        return managerArray;
    }

    //Method to get Employee array
    public static Employee[] getEmployees() throws FileNotFoundException, IOException {
        //for use with a future interface
        String file = Utility.Config.getFileDatabase("employees");
        //Sends for method to read file
        Employee[] employeeArray = readFileEmployees(file);
        return employeeArray;
    }

    //Read text file, assign variables, create Manager objects from variables, and return array of Employees.
    public static Employee[] readFileEmployees(String fileLocation) throws FileNotFoundException, IOException {
        String file = fileLocation;
        int total = getTotal(file);
        Employee[] employeeArray = new Employee[total];
        try (Scanner inFile = new Scanner(new File(file))) {
            int i = 0;
            while (inFile.hasNextLine()) {
                String id = inFile.nextLine();
                String firstName = inFile.nextLine();
                String lastName = inFile.nextLine();
                String email = inFile.nextLine();
                String username = inFile.nextLine();
                String password = inFile.nextLine();
                Employee employee;
                employee = new Manager(id, firstName, lastName, email, username, password);
                employeeArray[i] = employee;
                i++;
            }
            inFile.close();
        }
        return employeeArray;
    }

    //Take array of Employee objects and print line by line to textfile
    public static void writeFileEmployees(Employee[] eArray) throws IOException {
        String file = Utility.Config.getFileDatabase("employees");

        Employee[] employeeArray = eArray;
        try (PrintWriter outFile = new PrintWriter(file)) {
            for (int i = 0; i < employeeArray.length; i++) {

                outFile.println(employeeArray[i].getID());
                outFile.println(employeeArray[i].getFirstname());
                outFile.println(employeeArray[i].getLastname());
                outFile.println(employeeArray[i].getEmail());
                outFile.println(employeeArray[i].getUsername());
                outFile.println(employeeArray[i].getPassword());
            }
            outFile.close();
        }
    }

    //Take array of Managers objects and print line by line to textfile
    public static void writeFileManagers(Manager[] eArray) throws IOException {
        String file = Utility.Config.getFileDatabase("Managers");
        Manager[] managerArray = eArray;
        try (PrintWriter outFile = new PrintWriter(file)) {
            for (int i = 0; i < managerArray.length; i++) {
                outFile.println(managerArray[i].getID());
                outFile.println(managerArray[i].getFirstname());
                outFile.println(managerArray[i].getLastname());
                outFile.println(managerArray[i].getEmail());
                outFile.println(managerArray[i].getUsername());
                outFile.println(managerArray[i].getPassword());
            }
            outFile.close();
        }
    }

    //Method to test file for number of objects to be constructed.
    public static int getTotal(String fileLocation) throws FileNotFoundException, IOException {
        String file = fileLocation;
        int total = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int lines = 0;
            while (reader.readLine() != null) {
                total++;
            }
            reader.close();

        }
        //Total lines divided by number of variables per object
        return total / 6;
    }
    //Test if manager Username and Password combination exists.
     public static boolean testForManager(String pass, String user) throws IOException{
        Manager[] array = getManagers();
        for(int i =0; i<array.length; i++){
             if (array[i].getUsername().equals(user)&& array[i].getPassword().equals(pass)){
                 return true;
             }
        }
        return false;
    }
     //Test if Employee Username and Password combination exists.
     public static boolean testForEmployees(String pass, String user) throws IOException{
         Employee[] array = getEmployees();
         for(int i =0; i<array.length; i++){
             if (array[i].getUsername().equals(user)&& array[i].getPassword().equals(pass)){
                 return true;
             }
        }
        
        return false;
     }
     
     
        
    
}


