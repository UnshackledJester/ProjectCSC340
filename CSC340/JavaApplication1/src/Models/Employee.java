package Models;




public class Employee 

{



    //initialises variables

    public String username;
    public String password;




    public Employee(String username, String password) 
    {
        //sets constructors

        this.username = username;
        this.password = password;
        

    }

    //sets the getters and setters
  

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPassword()
    {
        return password;
    }
    public void setPassword (String password)
    {
        this.password = password;
    }


    //when printing employee list method it sets the input to display as below
    public String toString() 
    {
        return "Username: " + this.username
        + " / " + "password: " + this.password ;
    }

}