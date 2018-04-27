package Controllers;

/*
    Controller for the admin view.
    Last updated 4/26/2018
 */
//Import the admin view.
import Views.AdminView;

//Public class for controller.
public class AdminController {

//Stubbed constructor.
    private AdminController() {
    }

    //Generate Admin GUI.
    public static void MakeAdminGUI() {
        //Declare new view.
        AdminView adminV = new AdminView();
        //Make new view visible.
        adminV.setVisible(true);

    }

}
