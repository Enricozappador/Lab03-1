package it.polito.tdp.spellchecker.model;

import java.util.List;

public class Model {
	
	private Dictionary dizionario; 
	private List<RichWord> testo; 
	
	public Dictionary loadDictionary(String language) {
		
		dizionario.loadDictionary(language);
		
		return dizionario; 
		
	}
	
	

}
