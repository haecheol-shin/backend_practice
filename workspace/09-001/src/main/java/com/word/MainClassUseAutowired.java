package com.word;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.word.service.WordRegisterService;
import com.word.service.WordSearchService;

public class MainClassUseAutowired {

	public static void main(String[] args) {
		
		String[] keyWords = {"c", "c++", "java", "jsp",  "spring"};
		String[] values = {"C언어 입니다.", "c++입니다.", "java입니다.", "jsp입니다.", "spring입니다."};
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:appCtxUseAutowired.xml");
		
		WordRegisterService registerService = 
				ctx.getBean("registerService", WordRegisterService.class);
		for (int i = 0; i < values.length; i++) {
			WordSet wordSet = new WordSet(keyWords[i], values[i]);
			registerService.register(wordSet);
		}
		
		WordSearchService searchService = 
				ctx.getBean("searchService", WordSearchService.class);
		
		System.out.println("\n\n------------------------------------");
		for (int i = 0; i < keyWords.length; i++) {
			WordSet wordSet = searchService.searchWord(keyWords[i]);
			System.out.print(wordSet.getWordKey() + "\t: ");
			System.out.println(wordSet.getWordValue());
			System.out.println("[(https://www.wikipedia.org/)]");
			System.out.println("------------------------------------");
		}
		System.out.println("\n\n");
		
		ctx.close();
		
	}
	
}
