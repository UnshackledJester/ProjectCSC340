
package Controllers;

import Views.EmployeeView;


public class EmployeeController {

    public EmployeeController() {
    }

    //Generate Employee GUI
    public static void MakeEmployeeGUI() {
        EmployeeView empV = new EmployeeView();
        empV.setVisible(true);

    }
}
