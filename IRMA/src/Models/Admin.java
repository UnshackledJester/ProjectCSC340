package Models;

import java.io.Serializable;

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
        return (this.getUsername() + "," + this.getPassword()).toLowerCase();
    }

    //Getter and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
