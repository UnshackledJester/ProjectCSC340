package Models;

public class Customer {

    public String ID;
    public String firstname;
    public String lastname;
    public String email;
    public String password;
    public String username;
            

    public Customer() {
    }

    public Customer(String id, String firstname, String lastname, String email, String username, String password) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.username = username;
        
    }

    Customer(String data) {
        String[] dataArr = data.split(",");
        this.ID = dataArr[0];
        this.firstname = dataArr[1];
        this.lastname = dataArr[2];
        this.email = dataArr[3];
        this.password =dataArr[4];
        this.username = dataArr[5];
    }

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

    @Override
    public String toString() {
        return (this.ID + "," + this.firstname + "," + this.lastname + "," + this.email + "," + this.username + "," + this.password).toLowerCase();
    }

}