package Interfaces;

/*
    Enumeration for menu selection
    Last updated 4/26/2018
 */
//Public enum for menu.
public enum InformationSelection {
    //Enumerations.
    ADMINADD(1), ADMINMOD(2), ADMINDEL(3),
    MANAGERADDC(4), MANAGERMODC(5), MANAGERDELC(6), MANAGERADDE(7), MANAGERMODE(8), MANAGERDELE(9),
    EMPLOYEEADD(10), EMPLOYEEMOD(11), EMPLOYEEDEL(12);
    //Private int to hold enumeration value.
    private final int choiceValue;

    //Constructor to set enumeration.
    private InformationSelection(int _loginValue) {
        this.choiceValue = _loginValue;
    }

    //Getter for enumeration.
    public int loginVal() {
        return choiceValue;
    }
}
