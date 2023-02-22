package com.brms.book.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.book.dao.BookDao;

public class BookRegisterService implements InitializingBean, DisposableBean{

	@Autowired
	private BookDao bookDao;
	
	public BookRegisterService() { }
	
	public void register(Book book) {
		bookDao.insert(book);
	}
	
	public void destroy() throws Exception { // 牢磐其捞胶甫 捞侩窍绰 规过
		System.out.println("后 按眉 家戈");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("后 按眉 积己");
	}
	
}