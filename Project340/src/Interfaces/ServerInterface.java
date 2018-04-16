/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Chronos
 */
public class ServerInterface {

    public static boolean testForAdmin(String pass, String user) {
        return (user.equals("Admin") && pass.equals("Password"));
    }
}
