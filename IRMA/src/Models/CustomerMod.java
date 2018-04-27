/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interfaces.ServerInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Chronos
 */
public class CustomerMod {

    private CustomerMod() {
    }

    public static boolean addCustomer(String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current Customers, and add one more index
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        String test = username;

        boolean save = true;
        for (Customer customer : arr) {
            if (customer.getUsername().contains(test)) {
                System.out.println(" ID already exist");
                save = false;
            }
            //  arr.add(new Customer(id, firstName, lastName, email, username, password));
//ServerInterface.saveCustomer(arr);

        }
        if (save) {
            arr.add(new Customer(firstName, lastName, email, username, password));
            ServerInterface.saveCustomer(arr);
            System.out.println("WOULD HAVE SAVED");
        }
        return save;
    }

    public static void removeCustomer(String username) throws IOException, Exception {
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        String test = username;
        System.out.println(test);
        for (Customer Customer : arr) {
            if (Customer.getUsername().contains(test)) {
                Customer.setArchived(true);
                ServerInterface.saveCustomer(arr);
            }

        }
      
    }

    public static Customer findCustomerUser(String username) throws IOException, Exception {
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        String test = username;
        for (Customer customer : arr) {
            if (customer.getUsername().equals(test) && !customer.isArchived()) {
                return customer;
            }
        }
        return null;

    }

    public static void modCustomer(String firstName, String lastName, String email, String username, String password,String _UUID) throws IOException, Exception {
        Customer modCustomer = new Customer(firstName, lastName, email, username, password,_UUID);
        String test = _UUID;
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        for (Customer customer : arr) {
            if (customer.getID().contains(test)) {
                Collections.replaceAll(arr, customer, modCustomer);
                ServerInterface.saveCustomer(arr);
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
                addCustomer(fname1, lname1, email1, user1, pass1);
                ArrayList<Customer> Customer1 = ServerInterface.loadCustomer();
                for (Customer p : Customer1) {
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
                //modCustomer(fname22, lname22, email22, user22, pass22);
                ArrayList<Customer> Customer2 = ServerInterface.loadCustomer();
                for (Customer p : Customer2) {
                    System.out.println(p);
                }
                break;
            case 3:
                Scanner id3 = new Scanner(System.in);
                String id33 = id3.nextLine();
                removeCustomer(id33);
                ArrayList<Customer> Customer3 = ServerInterface.getCustomer();

                break;
            case 4:
                Scanner id4 = new Scanner(System.in);
                String id44 = id4.nextLine();
                findCustomerUser(id44);
            default:
                System.out.println("Woops");
                break;

        }

    }

}
