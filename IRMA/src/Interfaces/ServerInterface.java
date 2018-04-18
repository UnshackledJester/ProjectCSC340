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

/**
 *
 * @author Chronos
 */
public class ServerInterface {
public static void saveCustomer(Customer[] arr)throws Exception //writes the array of Customer to a file "Customer.ser"
    {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\User.txt"));
        os.writeObject(arr);
        os.close();
    }
    public static Customer[] loadCustomer()throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("C:\\User.txt"));
        Customer[] arr = (Customer[]) oin.readObject();
        oin.close();
        return arr;
    }
    public static Customer[] getCustomer() throws Exception{
        Customer[] Customer = loadCustomer();
         return Customer;
    
}
    public static void main(String[] args) throws Exception
    {
            System.out.println(getCustomer());
        }
}
