package Test;

public class User {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public User() {
    }

    public User(String id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    User(String data) {
        String[] dataArr = data.split(",");
        this.id = dataArr[0];
        this.firstname = dataArr[1];
        this.lastname = dataArr[2];
        this.email = dataArr[3];
        this.password = dataArr[4];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return (this.id + "," + this.firstname + "," + this.lastname + "," + this.email+ "," + this.password).toLowerCase();
    }

}