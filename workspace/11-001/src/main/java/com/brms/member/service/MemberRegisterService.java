package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberRegisterService() { }
	
	public void register(Member member) {
		memberDao.insert(member);
	}
	
	public void initMethod() { // 메소드를 이용하는 방법
		System.out.println("initMethod 실행");
	}
	
	public void destroyMethod() {
		System.out.println("destroyMethod 실행");
	}
}
