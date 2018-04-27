package Models;

/*
    Model for handeling customer account manipulations
    Last updated 4/26/2018
 */

//Imports.
import Interfaces.ServerInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//Public class for customer modification.
public class CustomerMod {

    //Stubbed constructor.
    private CustomerMod() {
    }

    //Method to add a new customer account.
    public static boolean addCustomer(String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current Customers, and add one more index
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        String test = username;

        //Boolean to check for existing ID's and saving errors.
        boolean save = true;
        for (Customer customer : arr) {
            if (customer.getUsername().contains(test)) {
                System.out.println(" ID already exist");
                save = false;
            }
        }
        //If no such ID exists, save new customer.
        if (save) {
            arr.add(new Customer(firstName, lastName, email, username, password));
            ServerInterface.saveCustomer(arr);
        }
        //Return boolean to show if saved.
        return save;
    }

    //Method to archive customer account.
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

    //Method to find existing customer account.
    public static Customer findCustomerUser(String username) throws IOException, Exception {
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        String test = username;
        for (Customer customer : arr) {
            if (customer.getUsername().equals(test) && !customer.getArchived()) {
                //Returns customer object if found.
                return customer;
            }
        }
        //Returns null if no such customer exists.
        return null;

    }

    //Method to modify existing customer account.
    public static void modCustomer(String firstName, String lastName, String email, String username, String password, String _UUID) throws IOException, Exception {
        Customer modCustomer = new Customer(firstName, lastName, email, username, password, _UUID);
        String test = _UUID;
        //Tests based on UUID
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        for (Customer customer : arr) {
            if (customer.getID().contains(test)) {
                Collections.replaceAll(arr, customer, modCustomer);
                ServerInterface.saveCustomer(arr);
            }
        }

    }
}
