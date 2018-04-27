package Controller;

import Models.Employee;
import View.EmployeeView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yiheng JIang
 */
public class EmployeeController {

    private final Employee model;
    private  EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getUsername() {
        return model.username;
    }

    public void setUsername(String username) {

        model.setUsername(username);
    }

    public String getPassword() {
        return model.password;
    }

    public void setPassword(String password) {
        model.setPassword(password);
    }

}
