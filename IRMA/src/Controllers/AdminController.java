/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import static Interfaces.DatabaseInterface.getManagers;
import static Interfaces.DatabaseInterface.writeFileManagers;
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
    public static void addManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException {
        //Get array of current managers, and add one more index
        Manager[] oldArray = getManagers();
        Manager[] newArray = new Manager[oldArray.length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        //add new manager to end of array and print to file
        newArray[oldArray.length] = new Manager(id, firstName, lastName, email, username, password);
        writeFileManagers(newArray);
    }

    public static Manager findManagerUser(String username) throws IOException {
        Manager[] array = getManagers();
        for (int i = 0; i < array.length; i++) {
            if(array[i].getUsername().equals(username)){
                return array[i];
                     }else{
                return null;
            }
        }
        Manager pete = array[0];
        return pete;
    }
    public static Manager findManagerID(String ID) throws IOException{
        String test = ID;
        String found;
        Manager[] array = getManagers();
        for (int i = 0; i < array.length; i++) {
            found = array[i].getID();
            System.out.println(array[i].getID());
            if(test.equals(found) ){
                System.out.println(array[i].getID());
                Manager manager = new Manager(array[i].getID(),array[i].getFirstname(),array[i].getLastname(),array[i].getEmail(),array[i].getUsername(),array[i].getPassword());
                System.out.println(manager.toString());
                return manager;
            }
            
            
        }
        System.out.println("pooop2");
        return null;
        
    }
    public static void modManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException{
        Manager modManager = new Manager( id, firstName, lastName, email, username, password);
        Manager[] array = getManagers();
        for(int i =0; i<array.length;i++){
            if(array[i].getID().equals(modManager.getID())){
                array[i]=modManager;
            }
        }
        writeFileManagers(array);
        
    }

}
