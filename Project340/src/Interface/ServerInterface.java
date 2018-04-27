/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Models.Customer;
/**
 *
 * @author Chronos
 */
public class ServerInterface {
    public Customer searchAccount(String id, String name){
        Customer[] customerArray = createCustomerArray();
        Customer currentCustomer=findMatch(customerArray);
        return currentCustomer;
    }
    
    public Customer findMatch(Customer[] x){
        
        return null;
                
    }
    
    public Customer[] createCustomerArray(){
        Customer[] x = new Customer[0];
        
        
        
        return x;
    }
}
