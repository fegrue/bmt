package org.fegrue.bmt;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.fegrue.bmt.HelloApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class PopupController {

    Stage mainStage;

    private Parent root;

    @FXML
    private Text welcomeText;
    @FXML
    private Button go;
    @FXML
    private Spinner<Integer> spinner;
    @FXML
    private ProgressBar progressbar;
    @FXML
    protected void ongo() throws Exception {

        int value = spinner.getValue();
        FXMLLoader main = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));
        root = main.load();
        MainController m = main.getController();
        m.Test(spinner.getValue());
        Stage stage = (Stage) spinner.getScene().getWindow();
        // do what you have to do
        stage.close();



    }
}