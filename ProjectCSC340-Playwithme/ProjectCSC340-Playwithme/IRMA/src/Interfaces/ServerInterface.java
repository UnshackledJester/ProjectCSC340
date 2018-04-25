/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Models.Customer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Chronos
 */
public class ServerInterface {
public static void saveCustomer(ArrayList<Customer> arr)throws Exception //writes the array of Customer to a file "Customer.ser"
    {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("customers.txt"));
        os.writeObject(arr);
        os.close();
    }
    public static ArrayList<Customer> loadCustomer()throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("customers.txt"));
        ArrayList<Customer> arr = (ArrayList<Customer>) oin.readObject();
        oin.close();
        return arr;
    }
    public static ArrayList<Customer> getCustomer() throws Exception{
        ArrayList<Customer> Customer = loadCustomer();
         return Customer;
    
}
    public static void main(String[] args) throws Exception
    {
            System.out.println(getCustomer());
        }
}
