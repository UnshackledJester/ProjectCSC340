package Models;

import java.io.Serializable;
import Utility.UUIdentifier;
public class Employee implements Serializable  {
    //initialises variables

    private String UUID;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;
    private boolean Archived;
    //Constructor
    public Employee(String firstName, String lastName, String email, String username, String password) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.Archived = false;
        

    }

    public boolean isArchived() {
        return Archived;
    }

    public void setArchived(boolean Archived) {
        this.Archived = Archived;
    }

    //Override to string for testing purposes
    @Override
    public String toString() {
        return (this.getID() + "," + this.getFirstname() + "," + this.getLastname() + "," + this.getEmail() + "," + this.getUsername() + "," + this.getPassword()).toLowerCase();
    }

    //Getters and setters
    public String getID() {
        return UUID;
    }

    public void setID(){
        this.UUID = UUIdentifier.getUUID();
    }
   

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
