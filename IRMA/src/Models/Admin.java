package Models;

/*
    Model for Admin.
    Last updated 4/26/2018.
 */
//Imports
import java.io.Serializable;

//Public class for admin.
public class Admin implements Serializable {

    //Variables
    private String username;
    private String password;

    //Constructor
    public Admin(String username, String password) {
        //sets constructors

        this.username = username;
        this.password = password;

    }

    //Override to String for testing purposes
    @Override
    public String toString() {
        return (this.getUsername() + "," + this.getPassword());
    }

    //Getter and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String _username) {
        this.username = _username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }
    

}
