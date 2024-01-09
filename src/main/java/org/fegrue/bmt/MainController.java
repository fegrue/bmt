package org.fegrue.bmt;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button refresh;


    @FXML
    private LineChart<Integer, Integer> linec;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    protected void onRefresh(){


        ArrayList<Integer> al = t.getA();
        for (int j : al ){
            linec.getData().add(new XYChart.Data(al.indexOf(j), j));
        }
    }

}