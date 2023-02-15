package com.word.service;

import javax.inject.Inject;
import javax.inject.Named;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {
	
	// @Autowired
	
	// @Inject
	// @Named(value="wordDao1")
	// @Resource
	@Autowired(required = false)
	private WordDao wordDao2;
	
	public WordRegisterService() {
		
	}
	
	
	public WordRegisterService(WordDao wordDao) {
		this.wordDao2 = wordDao;
	}
	
	public void register(WordSet wordSet) {
		String wordKey = wordSet.getWordKey();
		if(verify(wordKey)) {
			wordDao2.insert(wordSet);
		} else {
			System.out.println("The word has already registered.");
		}
	}
	
	public boolean verify(String wordKey){
		WordSet wordSet = wordDao2.select(wordKey);
		return wordSet == null ? true : false;
	}
	
	public void setWordDao(WordDao wordDao) {
		this.wordDao2 = wordDao;
	}
	
}