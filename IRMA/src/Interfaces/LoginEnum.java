package Interfaces;

/*
    Enumeration for login selection
    Last updated 4/26/2018
 */

//Public enumeration
public enum LoginEnum {
    //Enumerations
    ADMIN(1),MANAGER(2),EMPLOYEE(3),NOMATCH(0);
    //Private integer to hold the value;
    private final int loginValue;
    
    //Constructor to hold enumeration.
    private LoginEnum(int _loginValue){
        this.loginValue = _loginValue;
    }
    
    //Getter for enumeration value.
    public int getLoginVal(){
        return loginValue;
    }

    
}
