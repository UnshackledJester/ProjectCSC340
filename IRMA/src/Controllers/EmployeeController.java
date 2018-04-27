package Controllers;

/*
    Controller for the employee view.
    Last updated 4/26/2018
 */
//Import the employee view.
import Views.EmployeeView;

//Public class for controller.
public class EmployeeController {

//Stubbed constructor.
    public EmployeeController() {
    }

    //Generate Employee GUI.
    public static void MakeEmployeeGUI() {
        //Declare new view.
        EmployeeView empV = new EmployeeView();
        //Make new view visible.
        empV.setVisible(true);

    }
}
