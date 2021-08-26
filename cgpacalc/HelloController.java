package com.example.gpacalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField tf1, tf2;
    @FXML
    private Button btn_1, btn_2;
    @FXML
    private Label maksat;

    double mark=0.0, total_cred=0.0, cred=0.0;
    double pointer=0.0, summation=0.0;
    double cgpa=0.0;

    public void reset(ActionEvent evt){
        maksat.setText("cgpa="+cgpa);
        tf1.setText("");
        tf2.setText("");
    }

    public void addmore(ActionEvent evt) {
        mark = Integer.parseInt(tf1.getText());
        if(mark>=90.0){
            pointer=10.0;
        }
        else if(mark>=80&&mark<90.0){
            pointer=9.0;
        }
        else if(mark>=70.0&&mark<80.0){
            pointer=8.0;
        }
        else if(mark>=60.0&&mark<70.0){
            pointer=7.0;
        }
        else if(mark>=50.0&&mark<60.0){
            pointer=6.0;
        }
        else if(mark>=40.0&&mark<50.0){
            pointer=5.0;
        }
        else if(mark<40.0){
            pointer=0.0;
        }
        else {
            maksat.setText("wrong entry");
        }
        double cred=Integer.parseInt(tf2.getText());
        total_cred+=cred;
        summation=summation+(cred*pointer);
        tf1.setText("");
        tf2.setText("");
        System.out.println("credits:"+cred);
        System.out.println(summation);

        cgpa=(summation/total_cred);
        maksat.setText(String.valueOf("cgpa="+String.format("%.2f",cgpa)));
    }
}
