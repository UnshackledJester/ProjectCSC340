package Test;

import View.CustomerView;
import Controller.CustomerController;
import Models.Customer;

public class TestMVC {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Customer model  = retriveCustomerFromDatabase();

      //Create a view : to write student details on console
      CustomerView view = new CustomerView();

      CustomerController controller = new CustomerController(model, view);

   }

   private static Customer retriveCustomerFromDatabase(){
      Customer Customer = new Customer();
      Customer.setName("Robert");
      Customer.setID(123456);
      return Customer;
   }
}