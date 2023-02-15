package com.word.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.word.WordSet;
import com.word.dao.WordDao;
import javax.annotation.Resource;
public class WordSearchService {
	
	// @Autowired 	
	// autowired는 객체의 타입이 일치하는지 판단하여 주입한다.
	
	// @Resource
	// resource는 객체의 이름이 일치하는지 판단하여 주입한다.
	// resource는 생성자에 사용할 수 없다.
	
	// autowired가 더 일반적으로 많이 사용된다.
	
	//@Qualifier("usedDao") // 동일한 객체가 두개 이상일 경우에 사용한다.
	// 좋은 방법은 아니지만 qualifier를 사용하지않고 주입되는 객체의 이름과 bean id가 일치하면 qualifier를 사용하지 않아도 된다.
	
	//@Inject
	//@Named(value="wordDao1") // Autowired와 Inject의 차이점은 Autowired에서만 required기능을 제공한다는 것 이외에는 없지만 일반적으로 Autowired를 더 많이 사용한다.
	
	// @Autowired(required = false) 스프링 컨테이너에서 빈 객체를 만들지 않았는데 주입하려고 하는경우 exception이 발생하는데, exception발생을 막기 위해서 required를 사용한다.
	// 거의안쓰이니 알아만 두자.
	
	private WordDao wordDao;
	
	public WordSearchService() {} 	// property나 method에 autowired를 쓰려면 반드시 디폴트 생성자를 명시해줘야한다.
	
	
	// @Autowired // 생성자는 상관없다.
	public WordSearchService(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public WordSet searchWord(String wordKey) {
		if(verify(wordKey)) {
			return wordDao.select(wordKey);
		} else {
			System.out.println("WordKey information is available.");
		}
		
		return null;
	}
	
	public boolean verify(String wordKey){
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet != null ? true : false;
	}
	
	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
}