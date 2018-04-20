/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import static Interfaces.DatabaseInterface.getManager;
import static Interfaces.DatabaseInterface.saveManager;
import Models.Manager;
import Views.AdminView;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Chronos
 */
public class AdminControllerTest {

    private AdminControllerTest() {
    }

    //Generate Admin HUI
    public static void MakeAdminGUI() {
        AdminView adminV = new AdminView();
        adminV.setVisible(true);

    }

    //Method to add new managers for Admin
    public static void addManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current managers, and add one more index
        ArrayList<Manager> arr = getManager();
        String test = id;
        System.out.println(test);
           for(Manager manager : arr) {
        if(manager.getID().equals(test)) {
            System.out.println(" ID already exist"); 
            }
        else{
        arr.add(new Manager(id, firstName, lastName, email, username, password));
        }
        saveManager(arr); // save

    }
    }
    public static Manager removeManagerUser(String ID) throws IOException, Exception {
        ArrayList<Manager> arr = getManager();   
        String test = ID;
        System.out.println(test);
           for(Manager manager : arr) {
        if(manager.getID().equals(test)) {
        arr.remove(manager);
        }
        saveManager(arr); 
        
    }
    return null;
}

    public static Manager findManagerUser(String username) throws IOException, Exception {
        ArrayList<Manager> arr = getManager();   
        String test = username;
        System.out.println(test);
           for(Manager manager : arr) {
        if(manager.getUsername().equals(test)) {
            return manager;
        }
    }
    return null;
}
    

    public static Manager findManagerID(String ID) throws IOException, Exception {
        ArrayList<Manager> arr = getManager();   
        String test = ID;
        System.out.println(test);
           for(Manager manager : arr) {
        if(manager.getID().equals(test)) {
            return manager;
        }
    }
    return null;

    }

    public static void modManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        Manager modManager = new Manager(id, firstName, lastName, email, username, password);
        ArrayList<Manager> arr = getManager(); 
        for(Manager manager : arr) {
        if(manager.getID().equals(modManager.getID())) {
            manager = modManager;
            }
        }
        saveManager(arr);
      

    }

}
