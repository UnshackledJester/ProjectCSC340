package Models;

/*
    Model for manipulating manager accounts.
    Last updated 4/26/2018.

 */
//Imports.
import Interfaces.DatabaseInterface;
import static Interfaces.DatabaseInterface.loadManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Public class for manager mod.
public class ManagerMod {

    //Stubbed constructor.
    private ManagerMod() {
    }

    //Method to add a new manager account.
    public static boolean addManager(String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current managers, and add one more index
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String test = username;
        //Boolean used for testing if ID already exists.
        boolean save = true;
        for (Manager manager : arr) {
            if (manager.getUsername().contains(test)) {
                save = false;

            }
        }
        //If id doesn't exist, make a new manager account, add it to the manager array, and save it to file.
        if (save) {
            Manager manager = new Manager(firstName, lastName, email, username, password);
            manager.setID();
            arr.add(manager);
            DatabaseInterface.saveManager(arr);
        }
        //Return save boolean for error detecting.
        return save;
    }

    //Method to archive existing manager accounts.
    public static void removeManager(String username) throws IOException, Exception {
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String test = username;
        System.out.println(test);
        for (Manager manager : arr) {
            if (manager.getUsername().contains(test)) {
                manager.setArchived(true);
                DatabaseInterface.saveManager(arr);
            }
        }
    }

    //Method to find existing manager accounts.
    public static Manager findManagerUser(String username) throws IOException, Exception {
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String test = username;
        for (Manager manager : arr) {
            if (manager.getUsername().equals(test) && !manager.getArchived()) {
                return manager;
            }
        }
        //Return null if no such account exists.
        return null;
    }

    //Method to modify existin manager accounts.
    public static void modManager(String firstName, String lastName, String email, String username, String password, String _UUID) throws IOException, Exception {
        Manager modManager = new Manager(firstName, lastName, email, username, password, _UUID);
        String test = _UUID;
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        for (Manager manager : arr) {
            if (manager.getID().contains(test)) {
                Collections.replaceAll(arr, manager, modManager);
                DatabaseInterface.saveManager(arr);
            }
        }
    }
}
