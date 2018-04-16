package Interface;

import Models.Customer;
import java.io.*;

public class SerializeArray 
{
    public static void saveArray(Customer[] arr)throws Exception //writes the array of Customer to a file "Customer.ser"
    {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\User.txt"));
        os.writeObject(arr);
        os.close();
    }
    public static Customer[] loadArray()throws Exception //Reads the array of Customer back from file.
    {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("C:\\User.txt"));
        Customer[] arr = (Customer[]) oin.readObject();
        oin.close();
        return arr;
    }
    public static void main(String[] args) throws Exception
    {
        Customer[] arr= new Customer[3];
       
        arr[0] = new Customer("123", "Hieu", "Vo", "Hvvo@ucng.edu", "hvvo", "1");
        arr[1] = new Customer("789", "Hieu", "Vo", "Hvvo@ucng.edu", "hvvo", "2");
        arr[2] = new Customer("456", "Hieu", "Vo", "Hvvo@ucng.edu", "hvvo", "3");
        
        System.out.println("Saving array to file");
        saveArray(arr);
        System.out.println("Reading array back from file");
        Customer[] Customer = loadArray();
        for (Customer p : Customer)
        {
            System.out.println(p);
        }
    }
}