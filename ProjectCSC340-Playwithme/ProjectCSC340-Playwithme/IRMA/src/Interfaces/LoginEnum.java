package Interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Chronos
 */
public enum LoginEnum {
    ADMIN(1),MANAGER(2),EMPLOYEE(3),NOMATCH(0);
    private final int loginValue;
    private LoginEnum(int loginValue){
        this.loginValue = loginValue;
    }
    public int loginVal(){
        return loginValue;
    }

    
}
