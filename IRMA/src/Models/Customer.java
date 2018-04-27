package Models;

/*
    Model for customer accounts.
    Last updated 4/26/2018.
 */

//Imports.
import Utility.HashPassword;
import Utility.UUIdentifier;
import java.io.Serializable;

//Public class for employee.
public class Customer implements Serializable {

    //Variables for Customers
    private String UUID;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;
    private boolean Archived;

    //Constructor for saving new accounts.
    public Customer(String _firstName, String _lastName, String _email, String _username, String _password) {
        this.firstname = _firstName;
        this.lastname = _lastName;
        this.email = _email;
        this.username = _username;
        this.password = _password;
        this.Archived = false;
    }

    //Second constructor for saving existing accounts.
    public Customer(String _firstName, String _lastName, String _email, String _username, String _password, String _UUID) {
        this.firstname = _firstName;
        this.lastname = _lastName;
        this.email = _email;
        this.username = _username;
        this.password = _password;
        this.Archived = false;
        this.UUID = _UUID;
    }

    //Getters and setters.
    public String getID() {
        return UUID;
    }

    public void setID() {
        this.UUID = UUIdentifier.getUUID();;
    }

    public boolean getArchived() {
        return Archived;
    }

    public void setArchived(boolean _Archived) {
        this.Archived = _Archived;
    }

    public void setUsername(String _username) {
        this.username = _username;
    }

    public String getUsername() {
        return username;
    }

   
    public void setPassword(String _password) {
        this.password = _password;
    }
    public String getPassword() {
        return HashPassword.Hashed(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        this.email = _email;
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
    
    
//To String override for testing purposes
    @Override
    public String toString() {
        return (this.UUID + "," + this.firstname + "," + this.lastname + "," + this.email + "," + this.username + "," + this.password);
    }

}
