/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interfaces.DatabaseInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Chronos
 */
public class EmployeeMod {

    private EmployeeMod() {
    }

    public static boolean addEmployee(String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current Employees, and add one more index
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String test = username;

        boolean save = true;
        for (Employee employee : arr) {
            if (employee.getUsername().contains(test)) {
                System.out.println(" ID already exist");
                save = false;
            }
            //  arr.add(new Employee(id, firstName, lastName, email, username, password));
//DatabaseInterface.saveEmployee(arr);

        }
        if (save) {
            arr.add(new Employee(firstName, lastName, email, username, password));
            DatabaseInterface.saveEmployee(arr);
            System.out.println("WOULD HAVE SAVED");
        }
        return save;
    }

    public static void removeEmployee(String username) throws IOException, Exception {
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String test = username;
        System.out.println(test);
        for (Employee employee : arr) {
            if (employee.getUsername().contains(test) && !employee.isArchived()) {
                employee.setArchived(true);
                DatabaseInterface.saveEmployee(arr);
            }

        }
        
    }

    public static Employee findEmployeeUser(String username) throws IOException, Exception {
        ArrayList<Employee> arr = DatabaseInterface.getEmployee();
        String test = username;
        System.out.println(test);
        System.out.println("proof");
        for (Employee employee : arr) {
            if (employee.getUsername().equals(test) && !employee.isArchived()) {
                System.out.println("ARCHIVED BITCH");
                return employee;
            }
        }
        return null;

    }

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

    public static void main(String[] args) throws Exception {

        System.out.println("Enter 1 for add, enter 2 for mod enter 3 for deleten");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {
            case 1:

                Scanner firstname = new Scanner(System.in);
                String fname1 = firstname.nextLine();
                Scanner lastname = new Scanner(System.in);
                String lname1 = lastname.nextLine();
                Scanner email = new Scanner(System.in);
                String email1 = email.nextLine();
                Scanner username = new Scanner(System.in);
                String user1 = username.nextLine();
                Scanner password = new Scanner(System.in);
                String pass1 = password.nextLine();
                addEmployee(fname1, lname1, email1, user1, pass1);
                ArrayList<Employee> Employee1 = DatabaseInterface.loadEmployee();
                for (Employee p : Employee1) {
                    System.out.println(p);
                }
                break;
            case 2:

                Scanner firstname2 = new Scanner(System.in);
                String fname22 = firstname2.nextLine();
                Scanner lastname2 = new Scanner(System.in);
                String lname22 = lastname2.nextLine();
                Scanner email2 = new Scanner(System.in);
                String email22 = email2.nextLine();
                Scanner username2 = new Scanner(System.in);
                String user22 = username2.nextLine();
                Scanner password2 = new Scanner(System.in);
                String pass22 = password2.nextLine();
                //modEmployee(fname22, lname22, email22, user22, pass22);
                ArrayList<Employee> Employee2 = DatabaseInterface.loadEmployee();
                for (Employee p : Employee2) {
                    System.out.println(p);
                }
                break;
            case 3:
                Scanner id3 = new Scanner(System.in);
                String id33 = id3.nextLine();
                removeEmployee(id33);
                ArrayList<Employee> Employee3 = DatabaseInterface.getEmployee();

                break;
            case 4:
                Scanner id4 = new Scanner(System.in);
                String id44 = id4.nextLine();
                findEmployeeUser(id44);
            default:
                System.out.println("Woops");
                break;

        }

    }

}
