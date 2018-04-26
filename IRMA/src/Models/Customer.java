package Models;

import Utility.UUIdentifier;
import java.io.Serializable;

public class Customer implements Serializable  {
    //Variables for Customers
    private String UUID;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;
    private boolean Archived;
    //Constructor
    public Customer(String firstName, String lastName, String email, String username, String password) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.Archived = false;
    }
    public Customer(String firstName, String lastName, String email, String username, String password, String _UUID) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.Archived = false;
        this.UUID = _UUID;
    }
     public String getID() {
        return UUID;
    }

    public void setID(){
        this.UUID =UUIdentifier.getUUID();;
    }

    public boolean isArchived() {
        return Archived;
    }

    public void setArchived(boolean Archived) {
        this.Archived = Archived;
    }

  //Getters and setters
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;    
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
//To String override for testing purposes
    @Override
    public String toString() {
        return (this.UUID + "," +this.firstname + "," + this.lastname + "," + this.email + "," + this.username + "," + this.password).toLowerCase();
    }

}