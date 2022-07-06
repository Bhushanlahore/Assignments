package com.vowel;

import java.util.List;

public class VowelDemo {

	public List<String> words;

	public VowelDemo() {
		
	}
	
	public VowelDemo(List<String> words) {
		super();
		this.words = words;
	}

	public List<String> getWords() {
		return words;
	}

	public void setWords(List<String> words) {
		this.words = words;
	}

	@Override
	public String toString() {
		return "VowelDemo [words=" + words + "]";
	}
	
	
	
}
