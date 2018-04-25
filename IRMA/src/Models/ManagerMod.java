/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interfaces.DatabaseInterface;
import static Interfaces.DatabaseInterface.loadManager;
import Models.Manager;
import Views.AdminView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Chronos
 */
public class ManagerMod{

    private ManagerMod() {
    }

    public static void addManager( String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        //Get array of current managers, and add one more index
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String test = username;

        boolean save = true;
        for (Manager manager : arr) {
            if (manager.getUsername().contains(test)) {
                System.out.println(" ID already exist");
                save = false;
            }
            //  arr.add(new Manager(id, firstName, lastName, email, username, password));
//DatabaseInterface.saveManager(arr);

        }
        if (save) {
            arr.add(new Manager(firstName, lastName, email, username, password));
            DatabaseInterface.saveManager(arr);
            System.out.println("WOULD HAVE SAVED");
        }
    }

    public static Manager removeManager(String username) throws IOException, Exception {
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String test = username;
        System.out.println(test);
        for (Manager manager : arr) {
            if (manager.getUsername().contains(test)) {
                manager.setArchived(true);
                DatabaseInterface.saveManager(arr);
            }
            

        }
        return null;
    }

   

    public static Manager findManagerUser(String username) throws IOException, Exception {
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        String test = username;
        System.out.println(test);
        System.out.println("proof");
        for (Manager manager : arr) {
            if (manager.getUsername().equals(test)&& manager.isArchived()) {
                System.out.println("ARCHIVED BITCH");
                return manager;
            }
        }
        return null;

    }

    public static void modManager(String firstName, String lastName, String email, String username, String password) throws IOException, Exception {
        Manager modManager = new Manager(firstName, lastName, email, username, password);
        String test = username;
        ArrayList<Manager> arr = DatabaseInterface.getManager();
        for (Manager manager : arr) {
            if (manager.getID().contains(test)) {
                Collections.replaceAll(arr, manager, modManager);
                DatabaseInterface.saveManager(arr);
            }
        }

    }

    public static void main(String[] args) throws Exception {

        System.out.println("Enter 1 for add, enter 2 for mod enter 3 for deleten");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {
            case 1:
                
                Scanner firstname = new Scanner(System.in);
                String fname1 = firstname.nextLine();
                Scanner lastname = new Scanner(System.in);
                String lname1 = lastname.nextLine();
                Scanner email = new Scanner(System.in);
                String email1 = email.nextLine();
                Scanner username = new Scanner(System.in);
                String user1 = username.nextLine();
                Scanner password = new Scanner(System.in);
                String pass1 = password.nextLine();
                addManager( fname1, lname1, email1, user1, pass1);
                ArrayList<Manager> Manager1 = loadManager();
                for (Manager p : Manager1) {
                    System.out.println(p);
                }
                break;
            case 2:
               
                Scanner firstname2 = new Scanner(System.in);
                String fname22 = firstname2.nextLine();
                Scanner lastname2 = new Scanner(System.in);
                String lname22 = lastname2.nextLine();
                Scanner email2 = new Scanner(System.in);
                String email22 = email2.nextLine();
                Scanner username2 = new Scanner(System.in);
                String user22 = username2.nextLine();
                Scanner password2 = new Scanner(System.in);
                String pass22 = password2.nextLine();
                modManager(fname22, lname22, email22, user22, pass22);
                ArrayList<Manager> Manager2 = loadManager();
                for (Manager p : Manager2) {
                    System.out.println(p);
                }
                break;
            case 3:
                Scanner id3 = new Scanner(System.in);
                String id33 = id3.nextLine();
                removeManager(id33);
                ArrayList<Manager> Manager3 = DatabaseInterface.getManager();
               
                break;
            case 4:
                Scanner id4 = new Scanner(System.in);
                String id44 = id4.nextLine();
                findManagerUser(id44);
                default:
        System.out.println("Woops");
                break;

                }
         
        
        }

    }


