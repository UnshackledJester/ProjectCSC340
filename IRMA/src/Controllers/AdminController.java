/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import static Interfaces.DatabaseInterface.getManager;
import Models.Manager;
import Views.AdminView;
import java.io.IOException;

/**
 *
 * @author Chronos
 */
public class AdminController {

    private AdminController() {
    }

    //Generate Admin HUI
    public static void MakeAdminGUI() {
        AdminView adminV = new AdminView();
        adminV.setVisible(true);

    }

    //Method to add new managers for Admin
    public static void addManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current managers, and add one more index
        Manager[] oldArray = getManager();
        Manager[] newArray = new Manager[oldArray.length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        //add new manager to end of array and print to file
        newArray[oldArray.length] = new Manager(id, firstName, lastName, email, username, password);
// writeFileManagers(array);
    }

    public static String[] findManagerUser(String username) throws IOException, Exception {
         String test = username;
        System.out.println(test);
        String found;
        Manager[] arrayM = getManager();
        for (int i = 0; i < arrayM.length; i++) {
            found = arrayM[i].getUsername();
            System.out.println(arrayM[i].getUsername());
            if (test.equals(found)) {
                String[] arrayFound = new String[6];

                arrayFound[0]=arrayM[i].getID();
                arrayFound[1]=arrayM[i].getFirstname();
                arrayFound[2]=arrayM[i].getLastname();
                arrayFound[3]=arrayM[i].getEmail();
                arrayFound[4]=arrayM[i].getUsername();
                arrayFound[5]=arrayM[i].getPassword();
            
                return arrayFound;
            }
        }
        return null;

    }

    public static String[] findManagerID(String ID) throws IOException, Exception {
        String test = ID;
        System.out.println(test);
        String found;
        Manager[] arrayM = getManager();
        for (int i = 0; i < arrayM.length; i++) {
            found = arrayM[i].getID();
            System.out.println(arrayM[i].getID());
            if (test.equals(found)) {
                String[] arrayFound = new String[6];

                arrayFound[0]=arrayM[i].getID();
                arrayFound[1]=arrayM[i].getFirstname();
                arrayFound[2]=arrayM[i].getLastname();
                arrayFound[3]=arrayM[i].getEmail();
                arrayFound[4]=arrayM[i].getUsername();
                arrayFound[5]=arrayM[i].getPassword();
            
                return arrayFound;
            }
        }
        return null;

    }

    public static void modManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        Manager modManager = new Manager(id, firstName, lastName, email, username, password);
        Manager[] array = getManager();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getID().equals(modManager.getID())) {
                array[i] = modManager;
            }
        }
       // writeFileManagers(array);

    }

}
