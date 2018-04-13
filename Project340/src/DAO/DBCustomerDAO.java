package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Models.Customer;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class DBCustomerDAO implements CustomerDAO {

  private PreparedStatement saveStmt;
  private PreparedStatement loadStmt;

  public DBCustomerDAO(String username,String password) throws SQLException {
    Connection con = DriverManager.getConnection(username, password);
    saveStmt = con.prepareStatement("INSERT INTO Customers(username, password) "
                                   +"VALUES (?, ?)");
    loadStmt = con.prepareStatement("SELECT username, password FROM customers "
                                   +"WHERE Username = ?");
  }

  public Customer loadCustomer(String ID)  {
      try {
          Customer b = new Customer();
          loadStmt.setString(1, ID);
          ResultSet result = loadStmt.executeQuery();
          if (!result.next()) return null;
          
          b.setID(result.getString("ID"));
          b.setFirstname(result.getString("username"));
          b.setLastname(result.getString("password"));
          
      } catch (SQLException ex) {
          Logger.getLogger(DBCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
  
  }

  public void saveCustomer(Customer b) {
      try {
          saveStmt.setString(1, b.getFirstname());
          saveStmt.setString(2, b.getLastname());
          saveStmt.executeUpdate();
      } catch (SQLException ex) {
          Logger.getLogger(DBCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}