/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Models.Manager;
import Models.Employee;
import Utility.Config;
import java.util.Scanner;
import java.io.*;


/**
 * 
 *
 * @author Chronos
 */
public class DatabaseInterface {
 
    public Manager[] getManagers() throws FileNotFoundException{
        String file = Utility.Config.getFile("Managers");
        Manager[] managerArray = readFileManagers(file);

        return managerArray;
    }
    public Manager[] readFileManagers(String fileLocation) throws FileNotFoundException{
        String file = fileLocation;
        Manager[] managerArray = null;
        FileReader inputFile = new FileReader(file);
        System.out.println("Works");
        return managerArray;
    }
    
    
    
    
}
