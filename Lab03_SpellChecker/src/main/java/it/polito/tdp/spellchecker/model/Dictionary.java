package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
	
	public void loadDictionary(String language) {
		
		if(language == "Italiano") {
			try { 
				FileReader fr = new FileReader("Italian.txt");
					BufferedReader br = new BufferedReader(fr); 
					String word; 
					while((word = br.readLine()) != null) {
						//aggiungere
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
						//aggiungere
					}
					br.close();
			} 
			catch (IOException e) {
				System.out.println("Errore nella Lettura del File");
			}
			
		}
		
		//public List<RichWord> spellCheckText(List<String> inputTextList); 
		
	}
}
