/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import static Interfaces.DatabaseInterface.getManagers;
import static Interfaces.DatabaseInterface.writeFileManagers;
import Models.Manager;
import Views.AdminView;
import java.io.IOException;

/**
 *
 * @author Chronos
 */
public class AdminController {

    private AdminController() {
    }

    //Generate Admin HUI
    public static void MakeAdminGUI() {
        AdminView adminV = new AdminView();
        adminV.setVisible(true);

    }
    public static void addManager(String id, String firstName, String lastName, String email, String username, String password) throws IOException{
        Manager[] oldArray = getManagers();
        Manager[] newArray = new Manager[oldArray.length+1];
        writeFileManagers(newArray);
    }
    public static Manager findManager(String username) throws IOException{
        Manager[] array = getManagers();
        for (int i = 0; i<array.length;i++){
            
        }
        Manager pete = array[0];
        return pete;
    }

}
