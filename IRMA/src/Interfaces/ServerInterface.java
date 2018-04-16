
package Interfaces;
//Not worked on yet, since backend refining is going on.
public class ServerInterface {
//Stub
    public static boolean testForAdmin(String pass, String user) {
        return (user.equals("Admin") && pass.equals("Password"));
    }
}
