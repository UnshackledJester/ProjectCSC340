package Models;

/*
    Model for handeling customer account manipulations
    Last updated 4/26/2018
 */
//Imports.

import Interfaces.ServerInterface;
import Utility.Restriction;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//Public class for customer modification.
public class CustomerMod {

    //Stubbed constructor.
    private CustomerMod() {
    }

    //Method to add a new customer account.
    public static boolean addCustomer(String _firstName, String _lastName, String _email, String _username, String _password) throws IOException, Exception {
        //Get array of current Customers, and add one more index
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        String testUser = _username;

        //Boolean to check for existing ID's and saving errors.
        boolean save = true;
        for (Customer customer : arr) {
            if (customer.getUsername().contains(testUser)|| !(Restriction.hasLength(testUser)) || !(Restriction.hasUpperCase(testUser)) || !(Restriction.hasLowerCase(testUser))) {
                save = false;
            }
        }
        //If no such ID exists, save new customer.
        if (save) {
            arr.add(new Customer(_firstName, _lastName, _email, _username, _password));
            ServerInterface.saveCustomer(arr);
        }
        //Return boolean to show if saved.
        return save;
    }

    //Method to archive customer account.
    public static void removeCustomer(String _username) throws IOException, Exception {
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        String testUser = _username;
        for (Customer Customer : arr) {
            if (Customer.getUsername().contains(testUser)) {
                Customer.setArchived(true);
                ServerInterface.saveCustomer(arr);
            }

        }

    }

    //Method to find existing customer account.
    public static Customer findCustomerUser(String _username) throws IOException, Exception {
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        String testUser = _username;
        for (Customer customer : arr) {
            if (customer.getUsername().equals(testUser) && !customer.getArchived()) {
                //Returns customer object if found.
                return customer;
            }
        }
        //Returns null if no such customer exists.
        return null;

    }

    //Method to modify existing customer account.
    public static void modCustomer(String _firstName, String _lastName, String _email, String _username, String _password, String _UUID) throws IOException, Exception {
        Customer modCustomer = new Customer(_firstName, _lastName, _email, _username, _password, _UUID);
        String testID = _UUID;
        //Tests based on UUID
        ArrayList<Customer> arr = ServerInterface.getCustomer();
        for (Customer customer : arr) {
            if (customer.getID().contains(testID)) {
                Collections.replaceAll(arr, customer, modCustomer);
                ServerInterface.saveCustomer(arr);
            }
        }

    }
}
