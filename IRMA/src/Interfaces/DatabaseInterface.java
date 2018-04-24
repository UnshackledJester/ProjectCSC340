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
                String id = inFile.nextLine().trim();
                String firstName = inFile.nextLine().trim();
                String lastName = inFile.nextLine().trim();
                String email = inFile.nextLine().trim();
                String username = inFile.nextLine().trim();
                String password = inFile.nextLine().trim();
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
                String id = inFile.nextLine().trim();
                String firstName = inFile.nextLine().trim();
                String lastName = inFile.nextLine().trim();
                String email = inFile.nextLine().trim();
                String username = inFile.nextLine().trim();
                String password = inFile.nextLine().trim();
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

                outFile.println(employeeArray[i].getID().trim());
                outFile.println(employeeArray[i].getFirstname().trim());
                outFile.println(employeeArray[i].getLastname().trim());
                outFile.println(employeeArray[i].getEmail().trim());
                outFile.println(employeeArray[i].getUsername().trim());
                outFile.println(employeeArray[i].getPassword().trim());
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
                outFile.println(managerArray[i].getID().trim());
                outFile.println(managerArray[i].getFirstname().trim());
                outFile.println(managerArray[i].getLastname().trim());
                outFile.println(managerArray[i].getEmail().trim());
                outFile.println(managerArray[i].getUsername().trim());
                outFile.println(managerArray[i].getPassword().trim());
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

