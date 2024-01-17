package org.fegrue.bmt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;




import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class HelloApplication extends Application {
    private static HelloApplication instance;


    public HelloApplication() {
        instance = this;
    }

    Stage popup;
    // static method to get instance of view
    public static HelloApplication getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage stage) {
        FXMLLoader mainLoader = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));

        Scene main = new Scene(mainLoader.load(), 800, 600);
        stage.setTitle("Chart");
        stage.setScene(main);
        stage.show();
        FXMLLoader popupLoader = new FXMLLoader(HelloApplication.class.getResource("popup.fxml"));

        Scene popup = new Scene(popupLoader.load(), 396, 152);
        Stage popupstage = new Stage();
        popupstage.setTitle("Settings");
        popupstage.setScene(popup);
        popupstage.setOnCloseRequest(event -> {
            System.out.println("Stage is closing");
            stage.close();
        });

        popupstage.show();

    }

    public void Test(){
        this.popup.close();
    }



}