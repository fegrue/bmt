package org.fegrue.bmt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
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
        MultiplicationTable t = new MultiplicationTable(11, 99, 10);

        stage.setTitle("Multiplication Table");

        // Create a VBox to arrange the TextField and Button
        VBox rightPanel = new VBox();

        // Create a TextField for user input
        TextField inputField = new TextField();
        inputField.setPromptText("Enter a number:");


        // Create the main scene
        NumberAxis x = new NumberAxis();
        x.setLabel("Total Number of Students");
        NumberAxis y = new NumberAxis();
        y.setLabel("Students per section");

        LineChart<Number, Number> lc = new LineChart<>(x, y);

        // Create a Button to display the multiplication table for the entered number
        Button displayButton = new Button("Display");
        displayButton.setOnAction((event) -> {
           // int number = Integer.parseInt(inputField.getText());

            XYChart.Series sr = new XYChart.Series();
            ArrayList<Integer> al = t.setGrid(Integer.parseInt(inputField.getText()));

            XYChart.Data data = new XYChart.Data(x,y);

            Rectangle rect = new Rectangle(0, 0);
            rect.setVisible(false);
            data.setNode(rect);

            for (int j : al) {
                sr.getData().add(new XYChart.Data(al.indexOf(j), j));
            }

            lc.getData().setAll(sr);
        });

        rightPanel.getChildren().addAll(inputField, displayButton);



        lc.setTitle("Multiplication Table");

        // Add the main chart to the scene
        Group gp = new Group();
        gp.getChildren().addAll(lc, rightPanel);

        Scene sc = new Scene(gp, 550, 400);

        stage.setScene(sc);
        stage.show();
    }
}