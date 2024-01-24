package org.fegrue.bmt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.stage.Popup;
import javafx.stage.Stage;




import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class HelloApplication extends Application implements Observer {
    private static HelloApplication instance;


    public HelloApplication() {
        instance = this;
    }

    Stage popup;

    Stage main;
    // static method to get instance of view
    public static HelloApplication getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage stage) {



        FXMLLoader mainLoader = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));
        try{
            Scene main = new Scene(mainLoader.load(), 800, 600);
            stage.setTitle("Chart");
            stage.setScene(main);
            stage.show();


            FXMLLoader popupLoader = new FXMLLoader(HelloApplication.class.getResource("popup.fxml"));
            final Stage dialog = new Stage();
            Scene dialogScene = new Scene(popupLoader.load(), 400, 150);
            dialog.setScene(dialogScene);
            dialog.show();

            dialog.setOnCloseRequest(event -> {
                System.out.println("Stage is closing");
                stage.close();
            });

        }catch(Exception e){
            if (e.getMessage().equals("worked")){
                popup.close();
            }
            else{
                System.exit(-1);
            }
    }
    }
    public void Test() {
        this.popup.close();
    }


    @Override
    public void LineChartChanged(LineChart<Integer, Integer> rule) {
        ;
    }

    @Override
    public void notifyStage(LineChart<Integer, Integer> r) {
        stage.;
    }
}