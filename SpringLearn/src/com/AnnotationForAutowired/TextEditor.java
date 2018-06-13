package com.AnnotationForAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	// @Autowired注释方法一、在Setter方法中的用@Autowired注释
	/*
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}*/
	
	// @Autowired注释方法二、在属性中中使用 @Autowired注释,可以省去setter，getter方法
	 
	@Autowired
	private SpellChecker spellChecker;
	public void spellCheck() {
		spellChecker.checkSpelling();
	} 
	
	// @Autowired注释方法三、在构造函数中使用 @Autowired注释
	
	/*private SpellChecker spellChecker;
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor." );
		this.spellChecker = spellChecker;
	}
	 public void spellCheck(){
	      spellChecker.checkSpelling();
	   }*/
	
}
