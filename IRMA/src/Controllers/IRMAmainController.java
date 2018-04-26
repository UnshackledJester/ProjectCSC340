/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.LoginController;
import Interfaces.InformationSelection;
import Views.InformationView;
import java.io.IOException;

/**
 *
 * @author Chronos
 */
public class IRMAmainController {

    public static Interfaces.InformationSelection choice;
    public static boolean infoWindowOpen;

    public static void setChoice(InformationSelection newChoice) {
        choice = newChoice;
    }

    public static InformationSelection getChoice() {
        return choice;
    }
    public static void setWindowStatus(boolean status){
        infoWindowOpen = status;
    }

    public static void MakeInfoView() {
        if (!infoWindowOpen) {
            infoWindowOpen = true;
            InformationView infoV = new InformationView();
            infoV.setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        LoginController.MakeLogin();

    }

}
