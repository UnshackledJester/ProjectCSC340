package Controller;

import Models.Admin;
import View.AdminView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yiheng JIang
 */
public class AdminController {

    private final Admin model;
    private  AdminView view;

    public AdminController(Admin model, AdminView view) {
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
