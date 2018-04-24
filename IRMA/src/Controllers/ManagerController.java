
package Controllers;

import Views.ManagerView;


public class ManagerController {

    public ManagerController() {
    }

    //Generate Manager GUI
    public static void MakeManagerGUI() {
        ManagerView manV = new ManagerView();
        manV.setVisible(true);

    }

}
