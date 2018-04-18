package Models;

import java.io.Serializable;

public class Customer implements Serializable  {
    //Variables for Customers
    private String ID;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;

    //Stub for future use
    //Constructor
    public Customer(String id, String firstname, String lastname, String email, String username, String password) {
        this.ID = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.username = username;
        
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
        return (this.ID + "," + this.firstname + "," + this.lastname + "," + this.email + "," + this.username + "," + this.password).toLowerCase();
    }

}