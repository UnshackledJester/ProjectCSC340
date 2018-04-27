package Models;

/*
    Model for manipulating manager accounts.
    Last updated 4/26/2018.

 */
//Imports.
import Interfaces.DatabaseInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//Public class for manager mod.
public class ManagerMod {

    //Stubbed constructor.
    private ManagerMod() {
    }

    //Method to add a new manager account.
    public static boolean addManager(String _firstName, String _lastName, String _email, String _username, String _password) throws IOException, Exception {
        //Get array of current managers, and add one more index
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String test = _username;
        //Boolean used for testing if ID already exists.
        boolean save = true;
        for (Manager manager : arr) {
            if (manager.getUsername().contains(test)) {
                save = false;

            }
        }
        //If id doesn't exist, make a new manager account, add it to the manager array, and save it to file.
        if (save) {
            Manager manager = new Manager(_firstName, _lastName, _email, _username, _password);
            manager.setID();
            arr.add(manager);
            DatabaseInterface.saveManager(arr);
        }
        //Return save boolean for error detecting.
        return save;
    }

    //Method to archive existing manager accounts.
    public static void removeManager(String _username) throws IOException, Exception {
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String testUser = _username;
        for (Manager manager : arr) {
            if (manager.getUsername().contains(testUser)) {
                manager.setArchived(true);
                DatabaseInterface.saveManager(arr);
            }
        }
    }

    //Method to find existing manager accounts.
    public static Manager findManagerUser(String _username) throws IOException, Exception {
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String testUser = _username;
        for (Manager manager : arr) {
            if (manager.getUsername().equals(testUser) && !manager.getArchived()) {
                return manager;
            }
        }
        //Return null if no such account exists.
        return null;
    }

    //Method to modify existin manager accounts.
    public static void modManager(String _firstName, String _lastName, String _email, String _username, String _password, String _UUID) throws IOException, Exception {
        Manager modManager = new Manager(_firstName, _lastName, _email, _username, _password, _UUID);
        String testUser = _UUID;
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        for (Manager manager : arr) {
            if (manager.getID().contains(testUser)) {
                Collections.replaceAll(arr, manager, modManager);
                DatabaseInterface.saveManager(arr);
            }
        }
    }
}
