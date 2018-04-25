package Utility;

import static Interfaces.DatabaseInterface.loadEmployee;
import static Interfaces.DatabaseInterface.loadManager;
import static Interfaces.DatabaseInterface.saveEmployee;
import static Interfaces.DatabaseInterface.saveManager;
import static Interfaces.ServerInterface.loadAdmin;
import static Interfaces.ServerInterface.loadCustomer;
import static Interfaces.ServerInterface.saveAdmin;
import static Interfaces.ServerInterface.saveCustomer;
import Models.Admin;
import Models.Customer;
import Models.Manager;
import Models.Employee;
import java.util.ArrayList;

public class Initialize {

    public static void main(String[] args) throws Exception {

        ArrayList<Manager> arr = new ArrayList<Manager>();
        Manager manager1 = new Manager("Jerry", "Spencer", "Jspencer@ucng.edu", "Manager1", "Password");
        manager1.setID();
        arr.add(manager1);
        Manager manager2 = new Manager("Hieu", "Vo", "Hvvo@ucng.edu", "Manager2", "Password");
        manager2.setID();
        arr.add(manager2);
        Manager manager3 = new Manager("KAren", "Ooblong", "KOblong@ucng.edu", "Manager3", "Password");
        manager3.setID();;
        arr.add(manager3);

        System.out.println("Saving array to file");
        saveManager(arr);
        System.out.println("Reading array back from file");
        ArrayList<Manager> Manager = loadManager();
        for (Manager p : Manager) {
            System.out.println(p);
        }
        
        ArrayList<Employee> arr1 = new ArrayList<Employee>();
        Employee employee1 = new Employee("Jerry11", "Spencer", "Jspencer@ucng.edu", "Employee1", "Password");
        employee1.setID();
        arr1.add(employee1);
        Employee employee2 = new Employee("Hieu11", "Vo", "Hvvo@ucng.edu", "Employee2", "Password");
        employee2.setID();
        arr1.add(employee2);
        Employee employee3 = new Employee("KAren11", "Ooblong", "KOblong@ucng.edu", "Employee3", "Password");
        employee3.setID();;
        arr1.add(employee3);

        System.out.println("Saving array to file");
        saveEmployee(arr1);
        System.out.println("Reading array back from file");
        ArrayList<Employee> Employee = loadEmployee();
        for (Employee p : Employee) {
            System.out.println(p);
        }
        
        ArrayList<Customer> arr2 = new ArrayList<Customer>();
        Customer customer1 = new Customer("Jerry22", "Spencer", "Jspencer@ucng.edu", "Customer1", "Password");
        customer1.setID();
        arr2.add(customer1);
        Customer customer2 = new Customer("Hieu22", "Vo", "Hvvo@ucng.edu", "Customer2", "Password");
        customer2.setID();
        arr2.add(customer2);
        Customer customer3 = new Customer("KAren22", "Ooblong", "KOblong@ucng.edu", "Customer3", "Password");
        customer3.setID();
        arr2.add(customer3);

        System.out.println("Saving array to file");
        saveCustomer(arr2);
        System.out.println("Reading array back from file");
        ArrayList<Customer> Customer = loadCustomer();
        for (Customer p : Customer) {
            System.out.println(p);
        }
        
        ArrayList<Admin> arr3 = new ArrayList<Admin>();
        Admin admin1 = new Admin("Admin1", "Password");
        arr3.add(admin1);
        Admin admin2 = new Admin("Admin2", "Password");
        arr3.add(admin2);
        

        System.out.println("Saving array to file");
        saveAdmin(arr3);
        System.out.println("Reading array back from file");
        ArrayList<Admin> Admin = loadAdmin();
        for (Admin p : Admin) {
            System.out.println(p);
        }

    }
}
