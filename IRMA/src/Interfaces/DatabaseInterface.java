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
/*
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
   */ 



