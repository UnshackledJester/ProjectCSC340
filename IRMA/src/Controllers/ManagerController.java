package Controllers;
/*
    Controller for the manager view.
    Last updated 4/26/2018
*/

//Import the manager view.
import Views.ManagerView;

//Public class for controller.
public class ManagerController {
    
//Stubbed constructor.
    public ManagerController() {
    }

    //Generate Manager GUI
    public static void MakeManagerGUI() {
        //Declare new view.
        ManagerView manV = new ManagerView();
        //Make new view visible. 
        manV.setVisible(true);

    }

}
