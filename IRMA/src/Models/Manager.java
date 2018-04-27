package Models;
/*
    Model for manager accounts.
    Last updated 4/26/2018.
*/
//Imports.
import java.io.Serializable;

//Public class for manager accounts.
public class Manager extends Employee implements Serializable  {

    //constructor for new manager account
    public Manager(String firstName, String lastName, String email, String username, String password) {
        //Super use of extention class
        super(firstName, lastName, email, username, password);
    }
    
    //Constructor for existing manager account.
    public Manager(String firstName, String lastName, String email, String username, String password, String _UUID){
        super(firstName,lastName,email,username,password,_UUID);
    }


    //Override to string for testing purposes.
    @Override
    public String toString() {
        return (this.getID() + "," + this.getFirstname() + "," + this.getLastname() + "," + this.getEmail() + "," + this.getUsername() + "," + this.getPassword());
    }

}
