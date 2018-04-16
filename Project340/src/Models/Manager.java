package Models;
//Extension class for managers

public class Manager extends Employee {

    //constructor
    public Manager(String id, String firstName, String lastName, String email, String username, String password) {
        //Super use of extention class
        super(id, firstName, lastName, email, username, password);
    }

    //Override to string for testing purposes.
    @Override
    public String toString() {
        return (this.getID() + "," + this.getFirstname() + "," + this.getLastname() + "," + this.getEmail() + "," + this.getUsername() + "," + this.getPassword()).toLowerCase();
    }

}
