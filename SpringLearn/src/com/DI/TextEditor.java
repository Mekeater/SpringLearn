package com.DI;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("TextEditor constructor AND inside spellChecker by constructor." );
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
