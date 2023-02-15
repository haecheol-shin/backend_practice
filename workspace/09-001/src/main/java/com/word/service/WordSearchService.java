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
	// autowired�� ��ü�� Ÿ���� ��ġ�ϴ��� �Ǵ��Ͽ� �����Ѵ�.
	
	// @Resource
	// resource�� ��ü�� �̸��� ��ġ�ϴ��� �Ǵ��Ͽ� �����Ѵ�.
	// resource�� �����ڿ� ����� �� ����.
	
	// autowired�� �� �Ϲ������� ���� ���ȴ�.
	
	//@Qualifier("usedDao") // ������ ��ü�� �ΰ� �̻��� ��쿡 ����Ѵ�.
	// ���� ����� �ƴ����� qualifier�� ��������ʰ� ���ԵǴ� ��ü�� �̸��� bean id�� ��ġ�ϸ� qualifier�� ������� �ʾƵ� �ȴ�.
	
	//@Inject
	//@Named(value="wordDao1") // Autowired�� Inject�� �������� Autowired������ required����� �����Ѵٴ� �� �̿ܿ��� ������ �Ϲ������� Autowired�� �� ���� ����Ѵ�.
	
	// @Autowired(required = false) ������ �����̳ʿ��� �� ��ü�� ������ �ʾҴµ� �����Ϸ��� �ϴ°�� exception�� �߻��ϴµ�, exception�߻��� ���� ���ؼ� required�� ����Ѵ�.
	// ���ǾȾ��̴� �˾Ƹ� ����.
	
	private WordDao wordDao;
	
	public WordSearchService() {} 	// property�� method�� autowired�� ������ �ݵ�� ����Ʈ �����ڸ� ���������Ѵ�.
	
	
	// @Autowired // �����ڴ� �������.
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