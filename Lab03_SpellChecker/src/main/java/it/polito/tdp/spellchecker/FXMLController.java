package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import it.polito.tdp.spellchecker.model.Dictionary;
import it.polito.tdp.spellchecker.model.Model;
import it.polito.tdp.spellchecker.model.RichWord;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {
	
	private Model model  = new Model(); 
	
	private Dictionary dizionario;
	private List<String> inputTextList;
	private ObservableList<String> lingue = FXCollections.observableArrayList();
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> Languagebtn;

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
//    	Languagebtn.setOnShown(null);

    }

    @FXML
    void handlecheck(ActionEvent event) {
    	resulttxt.clear();
    	inputTextList = new LinkedList<String>(); 
    
    	if(Languagebtn.getValue() == null){
    		resulttxt.appendText("Devi specificare una lingua!");
    	}
    	
    	//else {
    		//dizionario = model.loadDictionary(Languagebtn.getValue()); 
    		
    	 String inputText = testotxt.getText(); 
    	 
    		if (inputText.isEmpty()) {
    			resulttxt.setText("Inserire un testo da correggere!");
    			return;
    		}
    		
    		inputText = inputText.replaceAll("\n", " ");
    		inputText = inputText.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]]", "");
    		StringTokenizer st = new StringTokenizer(inputText, " ");
    		while (st.hasMoreTokens()) {
    			inputTextList.add(st.nextToken());}
    		
    		

    		
    		List<RichWord> outputTextList;
    		outputTextList = dizionario.spellCheckText(inputTextList);
    		
    		if(outputTextList == null) {
    			resulttxt.appendText("la frase è corretta");
    		}
    		
    		StringBuilder richText = new StringBuilder();
    		
    		for (RichWord r : outputTextList) {
    			if (!r.isCorretto()) {
//    				numErrori++;
    				richText.append(r.getParola() + "\n");
    			}
    		}
    		
    		
//    	}
    	
    	
    		resulttxt.setText(richText.toString());
    }

    @FXML
    void handlelanguage(ActionEvent event) {
//scegliere lingua
    }

    @FXML
    void initialize() {
        assert Languagebtn != null : "fx:id=\"Languagebtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert testotxt != null : "fx:id=\"testotxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Checkbtn != null : "fx:id=\"Checkbtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert resulttxt != null : "fx:id=\"resulttxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Clearnbtn != null : "fx:id=\"Clearnbtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert timelbl != null : "fx:id=\"timelbl\" was not injected: check your FXML file 'Scene.fxml'.";
        
        lingue.add("Italiano");
        lingue.add("English"); 
        
        Languagebtn.setItems(lingue);
        

    }
}
