package Models;
//Extension class for managers

import java.io.Serializable;


public class Manager extends Employee implements Serializable  {

    //constructor
    public Manager(String firstName, String lastName, String email, String username, String password) {
        //Super use of extention class
        super(firstName, lastName, email, username, password);
    }
    public Manager(String firstName, String lastName, String email, String username, String password, String _UUID){
        super(firstName,lastName,email,username,password,_UUID);
    }


    //Override to string for testing purposes.
    @Override
    public String toString() {
        return (this.getID() + "," + this.getFirstname() + "," + this.getLastname() + "," + this.getEmail() + "," + this.getUsername() + "," + this.getPassword());
    }

}
