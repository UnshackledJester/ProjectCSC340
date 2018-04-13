package DAO;

import Models.Customer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCustomerDAO implements CustomerDAO {
        
  private String basePath;

  public FileCustomerDAO(String basePath) {
    this.basePath = basePath;
  }

  public Customer loadCsotmer(String isbn) throws IOException {
    FileReader fr = new FileReader(basePath + ID);
    BufferedReader br = new BufferedReader(fr);
    Customer b = new Customer();
    String rID = br.readLine();
    String rUsername = br.readLine();
    String rPassword = br.readLine();
        
    if (rID.startsWith("ISBN: ")) {
      b.setID(rID.substring("ID: ".length()));
    } else {
      return null;
    }
    if (rUsername.startsWith("Username: ")) {
      b.setUsername(rUsername.substring("Username: ".length()));
    } else {
      return null;
    }
    if (rPassword.startsWith("Password: ")) {
      b.setPassword(rPassword.substring("Password: ".length()));
    } else {
      return null;
    }
    return b;
  }

  public void saveBook(Customer b) throws IOException {
    FileWriter fw = new FileWriter(basePath + b.getID() + ".Customer");
    fw.write("ISBN: " + b.getID());
    fw.write("Username: " + b.getUsername());
    fw.write("Password: " + b.getPassword());
    fw.close();
  }

}   