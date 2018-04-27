package Models;

/*
    Model for employee accounts.
    Last updated 4/26/2018.

 */

import Utility.HashPassword;
import java.io.Serializable;
import Utility.UUIdentifier;

public class Employee implements Serializable {

    //initialises variables
    private String UUID;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;
    private boolean Archived;

    //Constructor for new employee.
    public Employee(String _firstName, String _lastName, String _email, String _username, String _password) {
        this.firstname = _firstName;
        this.lastname = _lastName;
        this.email = _email;
        this.username = _username;
        this.password = _password;
        this.Archived = false;
    }

    //Constructor for existing employee.
    public Employee(String _firstName, String _lastName, String _email, String _username, String _password, String _UUID) {
        this.firstname = _firstName;
        this.lastname = _lastName;
        this.email = _email;
        this.username = _username;
        this.password = _password;
        this.Archived = false;
        this.UUID = _UUID;
    }

    //Override to string for printing and testing purposes
    @Override
    public String toString() {
        return (this.getID() + "," + this.getFirstname() + "," + this.getLastname() + "," + this.getEmail() + "," + this.getUsername() + "," + this.getPassword());
    }

    //Getters and setters    
    public boolean getArchived() {
        return Archived;
    }

    public void setArchived(boolean _Archived) {
        this.Archived = _Archived;
    }

    public String getID() {
        return UUID;
    }

    public void setID() {
        this.UUID = UUIdentifier.getUUID();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String _firstname) {
        this.firstname = _firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String _lastname) {
        this.lastname = _lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getPassword() {
        return HashPassword.Hashed(password);
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String _username) {
        this.username = _username;
    }

}
