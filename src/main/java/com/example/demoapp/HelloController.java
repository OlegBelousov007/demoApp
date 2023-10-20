package com.example.demoapp;

import Users.DataUser;
import Users.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
  private TextField loginTextFild;
    @FXML
    private PasswordField passwordTextfild;
    @FXML
    protected void enterSystemButtonClick(){
        if(checkInputData()){
            //вход в систему
            System.out.println("Добро пожаловать в систему!");
        }else {
            System.out.println("Неверные данные, попробуйте ещё раз");
        }
    }
    public boolean checkInputData(){
        for (User user : DataUser.data){
            if(loginTextFild.getText().equals(user.getLogin())
            && passwordTextfild.getText().equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }
}