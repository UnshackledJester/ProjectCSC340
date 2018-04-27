package Models;
/*
    Model for manager accounts.
    Last updated 4/26/2018.
*/
//Imports.
import Utility.HashPassword;
import java.io.Serializable;

//Public class for manager accounts.
public class Manager extends Employee implements Serializable  {

    //constructor for new manager account
    public Manager(String _firstName, String _lastName, String _email, String _username, String _password) {
        //Super use of extention class
        super(_firstName, _lastName, _email, _username, _password);
    }
    
    //Constructor for existing manager account.
    public Manager(String _firstName, String _lastName, String _email, String _username, String _password, String _UUID){
        super(_firstName,_lastName,_email,_username,_password,_UUID);
    }
    
    @Override
        public String getPassword() {
        return HashPassword.Hashed(password);
    }



    //Override to string for testing purposes.
    @Override
    public String toString() {
        return (this.getID() + "," + this.getFirstname() + "," + this.getLastname() + "," + this.getEmail() + "," + this.getUsername() + "," + this.getPassword());
    }

}
