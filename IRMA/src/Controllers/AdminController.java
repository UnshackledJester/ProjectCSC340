package Controllers;

import static Interfaces.DatabaseInterface.getManagers;
import static Interfaces.DatabaseInterface.writeFileManagers;
import Models.Manager;
import Views.AdminView;
import java.io.IOException;

public class AdminController {

    private AdminController() {
    }

    //Generate Admin GUI
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
    //ugly function for testing purposes while back end is tidied.
    public static String[] findManagerUser(String username) throws IOException {
        String test = username;
        System.out.println(test);
        String found;
        Manager[] arrayM = getManagers();
        for (int i = 0; i < arrayM.length; i++) {
            found = arrayM[i].getUsername();
            if (test.equals(found)) {
                String[] arrayFound = new String[6];

                arrayFound[0] = arrayM[i].getID();
                arrayFound[1] = arrayM[i].getFirstname();
                arrayFound[2] = arrayM[i].getLastname();
                arrayFound[3] = arrayM[i].getEmail();
                arrayFound[4] = arrayM[i].getUsername();
                arrayFound[5] = arrayM[i].getPassword();

                return arrayFound;
            }
        }
        return null;

    }
    //Same as above, temporary use
    public static String[] findManagerID(String ID) throws IOException {
        String test = ID;
        String found;
        Manager[] arrayM = getManagers();
        for (int i = 0; i < arrayM.length; i++) {
            found = arrayM[i].getID();
            System.out.println(arrayM[i].getID());
            if (test.equals(found)) {
                String[] arrayFound = new String[6];

                arrayFound[0] = arrayM[i].getID();
                arrayFound[1] = arrayM[i].getFirstname();
                arrayFound[2] = arrayM[i].getLastname();
                arrayFound[3] = arrayM[i].getEmail();
                arrayFound[4] = arrayM[i].getUsername();
                arrayFound[5] = arrayM[i].getPassword();

                return arrayFound;
            }
        }
        return null;

    }
    //Basic function to save modifications made to Manager accounts to file.
    public static void modManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException {
        Manager modManager = new Manager(id, firstName, lastName, email, username, password);
        Manager[] array = getManagers();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getID().equals(modManager.getID())) {
                array[i] = modManager;
            }
        }
        writeFileManagers(array);

    }

}
