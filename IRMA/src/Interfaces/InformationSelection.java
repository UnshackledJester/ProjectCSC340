/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Chronos
 */
public enum InformationSelection {
    
    ADMINADD(1),ADMINMOD(2),ADMINDEL(3),
    MANAGERADDC(4),MANAGERMODC(5),MANAGERDELC(6),MANAGERADDE(7),MANAGERMODE(8),MANAGERDELE(9),
    EMPLOYEEADD(10),EMPLOYEEMOD(11),EMPLOYEEDEL(12);
    
    private final int choiceValue;
    private InformationSelection(int loginValue){
        this.choiceValue = loginValue;
    }
    public int loginVal(){
        return choiceValue;
    }
}
