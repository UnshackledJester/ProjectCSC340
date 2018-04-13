package Models;

import java.util.ArrayList;






public class Customer 

{


    public Customer() 
    {

    }
    //initialises variables
    public String name;
    public String street;
    public String town;
    public String postcode;
    public int ID;
    public String username;
    public String password;
    

  

    public Customer(String name, String street, String town, String postcode, int ID, String username, String password) 
    {
        //sets constructors
        this.name = name;
        this.street = street;
        this.town = town;
        this.postcode = postcode;
        this.ID = ID;
        this.username = username;
        this.password = password;
      

    }

    //sets the getters and setters
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street) 
    {
        this.street = street;
    }

    public String getTown() 
    {
        return town;
    }

    public void setTown(String town) 
    {
        this.town = town;
    }

    public String getPostcode() 
    {
        return postcode;
    }

    public void setPostcode(String postcode) 
    {
        this.postcode = postcode;
    }

    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }

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
        return "Name: " + this.name + " / "  + "Street: " + this.street + " / "

        + "Town: " + this.town + " / " + "Postcode: " + this.postcode + " / " + "ID: " + this.ID + " / " +  "Username: " + this.username
        + " / " + "password: " + this.password;
    }

}