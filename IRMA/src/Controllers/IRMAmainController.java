package Controllers;

/*
    Main controller for IRMA.
    Last updated 4/26/2018
 */
//Import interfaces, views, and I/O handeling.
import Interfaces.InformationSelection;
import Views.InformationView;
import java.io.IOException;

//Public class for controller.
public class IRMAmainController {

    //Enumeration for menu selection.
    public static Interfaces.InformationSelection choice;
    //Boolean to control information window generation.
    public static boolean infoWindowOpen;

    //setter for choice enumeration for menu selection.
    public static void setChoice(InformationSelection newChoice) {
        choice = newChoice;
    }

    //Getter for choice enumeration for menu selection.
    public static InformationSelection getChoice() {
        return choice;
    }

    //Setter for information view status.
    public static void setWindowStatus(boolean _status) {
        infoWindowOpen = _status;
    }

    //Method for opening new information view.
    public static void MakeInfoView() {
        //Test for currently open information view.
        if (!infoWindowOpen) {
            infoWindowOpen = true;
            //If no information view open, open new information view.
            InformationView infoV = new InformationView();
            infoV.setVisible(true);
        }
    }

    //Main method to run IRMA.
    public static void main(String[] args) throws IOException {
        //Initialize login controller and make login view.
        LoginController.MakeLogin();

    }

}
