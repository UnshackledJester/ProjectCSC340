package Utility;

/**
 *
 * @author riquigley
 */
public class LoginInterface {

    public static final int MANAGER_PANEL = 1;
    public static final int EMPLOYEE_PANEL = 2;
    public static final int ADMIN_PANEL = 3;
    public static final int NONE = 0;

    private final int _thismessage;
       
    public LoginInterface(int message) {
        this._thismessage = message; 
    }
    
    public int getCode() {
        return this._thismessage;
    }

}
