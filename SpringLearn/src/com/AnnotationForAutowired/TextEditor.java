package com.AnnotationForAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	// @Autowiredע�ͷ���һ����Setter�����е���@Autowiredע��
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
	
	// @Autowiredע�ͷ�����������������ʹ�� @Autowiredע��,����ʡȥsetter��getter����
	 
	@Autowired
	private SpellChecker spellChecker;
	public void spellCheck() {
		spellChecker.checkSpelling();
	} 
	
	// @Autowiredע�ͷ��������ڹ��캯����ʹ�� @Autowiredע��
	
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
