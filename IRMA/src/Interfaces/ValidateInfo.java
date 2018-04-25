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
        boolean manager = Interfaces.DatabaseInterface.testForManager(pass, user);
        boolean employee = Interfaces.DatabaseInterface.testForEmployee(pass, user);
        boolean admin = Interfaces.ServerInterface.testForAdmin(pass, user);

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
}
