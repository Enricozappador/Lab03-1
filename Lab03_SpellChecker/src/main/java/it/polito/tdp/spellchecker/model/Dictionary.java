package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dictionary {
	

	private List<String> dizionario;
	private String language; 
	
	
	public void loadDictionary(String language) {

		
		if(language == "Italiano") {
			try { 
				FileReader fr = new FileReader("Italian.txt");
					BufferedReader br = new BufferedReader(fr); 
					String word; 
					while((word = br.readLine()) != null) {
						dizionario.add(word);
					}
					br.close();
			} 
			catch (IOException e) {
				System.out.println("Errore nella Lettura del File");
			}
		}
		
		else if (language == "English") {
			try { 
				FileReader fr = new FileReader("English.txt");
					BufferedReader br = new BufferedReader(fr); 
					String word; 
					while((word = br.readLine()) != null) {
						dizionario.add(word);
					}
					br.close();
			} 
			catch (IOException e) {
				System.out.println("Errore nella Lettura del File");
			}
			
		}
		
		//public List<RichWord> spellCheckText(List<String> inputTextList); 
		
		
	
		
	}
	
	public List<RichWord> spellCheckText(List<String> inputTextList){
			List<RichWord> parole = new ArrayList<>(); 
			
			for(String s : inputTextList) {
				RichWord parola = new RichWord(s); 
				
				if(dizionario.contains(parola)) {
					parola.setCorretto(true);
				}
				else {
					parola.setCorretto(false);
				}
				
				parole.add(parola);
			}
			
			return parole; 
			
		}
}
