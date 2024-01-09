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


    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));


        calculate c = new calculate( 11, 100);
        c.createArray();
        table t = new table(c.l, 50);

        linec.Series sr = new XYChart.Series();
        ArrayList<Integer> al = t.getA();
        for (int j : al ){
            sr.getData().add(new XYChart.Data(al.indexOf(j), j));
        }


        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}