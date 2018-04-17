package Models;


import static Interfaces.DatabaseInterface.getEmployee;
import static Interfaces.DatabaseInterface.getManager;
import java.io.IOException;

public class Authentication {

//Test if manager Username and Password combination exists.

    public static boolean testForManager(String pass, String user) throws IOException, Exception {
        Manager[] array = getManager();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getUsername().equals(user) && array[i].getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }
    //Test if Employee Username and Password combination exists.

    public static boolean testForEmployees(String pass, String user) throws IOException, Exception {
        Employee[] array = getEmployee();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getUsername().equals(user) && array[i].getPassword().equals(pass)) {
                return true;
            }
        }

        return false;
    }

    public static boolean testForAdmin(String pass, String user) {
        return (user.equals("Admin") && pass.equals("Password"));
    }

}
