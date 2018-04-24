package Controllers;

import  Interfaces.DatabaseInterface;
import Models.Manager;
import Views.AdminView;
import java.io.IOException;
import java.util.ArrayList;

public class AdminController {

    private AdminController() {
    }

    //Generate Admin GUI
    public static void MakeAdminGUI() {
        AdminView adminV = new AdminView();
        adminV.setVisible(true);

    }

    //Method to add new managers for Admin
    public static void addManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current managers, and add one more index
        ArrayList<Manager> array = Interfaces.DatabaseInterface.getManager();
        Manager manager = new Manager(id,firstName,lastName,email,username,password);
        array.add(manager);
        Interfaces.DatabaseInterface.saveManager(array);
        
            }
    //ugly function for testing purposes while back end is tidied.
    public static Manager findManagerUser(String username) throws IOException, Exception {
        String test = username;
        System.out.println(test);
        ArrayList<Manager> arrayM = Interfaces.DatabaseInterface.getManager();
        int length = arrayM.size();
         for (int i = 0; i < length; i++){
             if(arrayM.get(i).getUsername().contains(test)){
                 return arrayM.get(i);
             }
         }
        
        return null;
    }
    //Same as above, temporary use
    public static Manager findManagerID(String ID) throws IOException, Exception {
          String test = ID;
        System.out.println(test);
        ArrayList<Manager> arrayManagers = Interfaces.DatabaseInterface.getManager();
        int length = arrayManagers.size();
         for (int i = 0; i < length; i++){
             if(arrayManagers.get(i).getUsername().contains(ID)){
                 return arrayManagers.get(i);
             }
         }
        
        return null;
    }
    
    public static int findManagerIndex(String ID) throws Exception{
         String test = ID;
        System.out.println(test);
        ArrayList<Manager> arrayManagers = Interfaces.DatabaseInterface.getManager();
        int length = arrayManagers.size();
        int index = 0;
         for (int i = 0; i < length; i++){
             if(arrayManagers.get(i).getUsername().contains(ID)){
                 index = i;
             }
         }
        return index;
    }
    
    
    
    
    //Basic function to save modifications made to Manager accounts to file.
    public static void modManager(Manager manager,String ID) throws IOException, Exception {
       ArrayList<Manager> arrayM = Interfaces.DatabaseInterface.getManager();
       int index = findManagerIndex(ID);
       arrayM.set(index, manager);
       Interfaces.DatabaseInterface.saveManager(arrayM);

    }

}
