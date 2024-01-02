package org.fegrue.bmt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Collections;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage stage) {
        calculate c = new calculate( 11, 100);
        c.createArray();
        table t = new table(c.l, 50);

        stage.setTitle("Multiplication table");
        // x-axis representation
        NumberAxis x = new NumberAxis();
        x.setLabel("Total Number of ");

        // y axis representation
        NumberAxis y = new NumberAxis();
        y.setLabel("Students per section");

        LineChart<Number,Number> lc = new LineChart<Number,Number>(x, y);

        lc.setTitle("Multiplication Table");

        XYChart.Series sr = new XYChart.Series();
        ArrayList<Integer> al = t.getA();
        for (int j : al ){
            sr.getData().add(new XYChart.Data(al.indexOf(j), j));
        }


        Group gp = new Group();
        gp.getChildren().add(lc);

        Scene sc = new Scene(gp, 550, 400);
        lc.getData().add(sr);
        stage.setScene(sc);
        stage.show();
    }

}