package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Italianbtn;

    @FXML
    private Button englishbtn;

    @FXML
    private TextArea testotxt;

    @FXML
    private Button Checkbtn;

    @FXML
    private TextArea resulttxt;

    @FXML
    private Button Clearnbtn;

    @FXML
    private Label timelbl;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleEnglish(ActionEvent event) {

    }

    @FXML
    void handleItaliano(ActionEvent event) {

    }

    @FXML
    void handlecheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Italianbtn != null : "fx:id=\"Italianbtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert englishbtn != null : "fx:id=\"englishbtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert testotxt != null : "fx:id=\"testotxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Checkbtn != null : "fx:id=\"Checkbtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert resulttxt != null : "fx:id=\"resulttxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Clearnbtn != null : "fx:id=\"Clearnbtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert timelbl != null : "fx:id=\"timelbl\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

