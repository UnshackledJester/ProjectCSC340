package Interfaces;

/*
    Interface for server interaction.
    Last updated 4/26/2018.
 */

//Import models, steam input/output, and arraylist.
import Models.Admin;
import Models.Customer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Public class for interface.
public class ServerInterface {

    //Method to save customer array to file.
    public static void saveCustomer(ArrayList<Customer> arr) throws Exception //writes the array of Customer to a file "Customer.ser"
    {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("customers.txt"));
        os.writeObject(arr);
        os.close();
    }

    //Method to load customer array from file.
    public static ArrayList<Customer> loadCustomer() throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("customers.txt"));
        ArrayList<Customer> arr = (ArrayList<Customer>) oin.readObject();
        oin.close();
        return arr;
    }

    //Getter for customer array.
    public static ArrayList<Customer> getCustomer() throws Exception {
        ArrayList<Customer> Customer = loadCustomer();
        return Customer;

    }

    //Method to save amin array to file.
    public static void saveAdmin(ArrayList<Admin> arr) throws Exception //writes the array of Customer to a file "Customer.ser"
    {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("admins.txt"));
        os.writeObject(arr);
        os.close();
    }

    //Method to load admin array from file.
    public static ArrayList<Admin> loadAdmin() throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("admins.txt"));
        ArrayList<Admin> arr = (ArrayList<Admin>) oin.readObject();
        oin.close();
        return arr;
    }

    //Getter for admin array.
    public static ArrayList<Admin> getAdmin() throws Exception {
        ArrayList<Admin> Admin = loadAdmin();
        return Admin;
    }
}
