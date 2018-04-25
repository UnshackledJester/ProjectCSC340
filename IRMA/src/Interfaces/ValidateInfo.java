/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.IOException;

/**
 *
 * @author Chronos
 */
public class ValidateInfo {
      
    public static LoginEnum validateInput(String pass, String user) throws IOException {
        boolean manager = testForManager(pass, user);
        boolean employee = testForEmployee(pass, user);
        boolean admin = testForAdmin(pass, user);

        if (true == manager) {
            return LoginEnum.MANAGER;
        } else if (true == employee) {
            return LoginEnum.EMPLOYEE;
        } else if (true == admin) {
            return LoginEnum.ADMIN;
        } else {
            return LoginEnum.NOMATCH;
        }
    }
    private static boolean testForManager(String pass, String user){
        return false;
    }
    private static boolean testForEmployee(String pass, String user){
        return false;
    }
    private static boolean testForAdmin(String pass, String user){
        return false;
    }
}
