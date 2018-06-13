package com.DIBySetValue;

public class TextEditor {
	
	public TextEditor() {
		System.out.println("TextEditor constructor." );
	}
	
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("inside SpellChecker by setValue." );
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
	      spellChecker.checkSpelling();
	}
}
