package com.word.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {
	
	// property나 method에 autowired를 쓰려면 반드시 디폴트 생성자를 명시해줘야한다.
	// resource는 생성자에 사용할 수 없다. 
	
	@Autowired
	@Qualifier("usedDao")
	private WordDao wordDao;
	
	public WordRegisterService() {
		
	}
	
	@Autowired // 생성자는 상관없다.
	public WordRegisterService(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public void register(WordSet wordSet) {
		String wordKey = wordSet.getWordKey();
		if(verify(wordKey)) {
			wordDao.insert(wordSet);
		} else {
			System.out.println("The word has already registered.");
		}
	}
	
	public boolean verify(String wordKey){
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet == null ? true : false;
	}
	
	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
}