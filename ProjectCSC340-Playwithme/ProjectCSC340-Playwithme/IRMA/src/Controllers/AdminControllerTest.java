/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
public class AdminControllerTest {

    private AdminControllerTest() {
    }

    //Generate Admin HUI
    public static void MakeAdminGUI() {
        AdminView adminV = new AdminView();
        adminV.setVisible(true);

    }

    }


