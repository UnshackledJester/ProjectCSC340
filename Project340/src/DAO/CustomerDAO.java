package DAO;
import Models.Customer;
import java.util.List;

public interface CustomerDAO {
  List<Customer> findByUsername();
  public void saveCustomer(Customer b);
  public Customer loadCustomer(String ID);

}