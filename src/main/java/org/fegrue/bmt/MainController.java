package org.fegrue.bmt;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
    protected void onRefresh() throws Exception {
        Test(15);
        }
    public void Test(int value) throws Exception {
        MultiplicationTable m = new MultiplicationTable(10, 100, value);
        linec.setTitle("Multiplication Table");
        XYChart.Series<Integer, Integer> sr = new XYChart.Series<Integer, Integer>();
        ArrayList<Integer> al = m.getA();
        for (int j : al ){
            sr.getData().add(new XYChart.Data<Integer, Integer>(al.indexOf(j), j));
        }
        linec.getData().add(sr);

        }
    }

