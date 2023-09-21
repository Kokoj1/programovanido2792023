package com.example.programovanido2792023;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {
Random ran = new Random();
    @FXML
    private Label welcomeText;
    @FXML
    private TextField myTextField;

    int num;
    int num2 = ran.nextInt(10)+1;
    public void submit(){
        num = Integer.parseInt(myTextField.getText());
        if(num == num2){
            welcomeText.setText("Uhodl jsi správně");
        }
        else{
            welcomeText.setText("Uhodl jsi špatně");
        }
    }

}