package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import it.polito.tdp.spellchecker.model.*;

public class FXMLController {
	
	private List<String> inputTextList;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton Languagebtn;

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
    	testotxt.clear();
    	resulttxt.clear();

    }

    @FXML
    void handlecheck(ActionEvent event) {
    	//resulttxt.appendText(testotxt.getText());
    	
    	

    }

    @FXML
    void initialize() {
        assert Languagebtn != null : "fx:id=\"Languagebtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert testotxt != null : "fx:id=\"testotxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Checkbtn != null : "fx:id=\"Checkbtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert resulttxt != null : "fx:id=\"resulttxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Clearnbtn != null : "fx:id=\"Clearnbtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert timelbl != null : "fx:id=\"timelbl\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

