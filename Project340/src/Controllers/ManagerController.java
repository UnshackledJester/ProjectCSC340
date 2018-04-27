/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.ManagerView;

/**
 *
 * @author Chronos
 */
public class ManagerController {

    public ManagerController() {
    }

    //Generate Manager GUI
    public static void MakeManagerGUI() {
        ManagerView manV = new ManagerView();
        manV.setVisible(true);

    }

}
