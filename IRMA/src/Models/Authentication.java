package Models;

import static Interfaces.DatabaseInterface.getEmployee;
import static Interfaces.DatabaseInterface.getManager;
import java.io.IOException;
import java.util.ArrayList;

public class Authentication {

//Test if manager Username and Password combination exists.
    public static boolean testForManager(String pass, String user) throws IOException, Exception {
        ArrayList<Manager> arr = new ArrayList<Manager>();
        for (Manager manager : arr) {
            if (manager.getUsername().equals(user) && manager.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }
    //Test if Employee Username and Password combination exists.
 public static boolean testForEmployee(String pass, String user) {
        return (user.equals("Employee") && pass.equals("Password"));
    }
 

    public static boolean testForAdmin(String pass, String user) {
        return (user.equals("Admin") && pass.equals("Password"));
    }

}
