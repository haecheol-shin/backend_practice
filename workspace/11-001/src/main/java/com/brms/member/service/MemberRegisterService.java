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
	
	public void initMethod() { // 메소드를 이용하는 방법, ctx파일에서 설정한 메소드 이름과 같아야 한다.
		System.out.println("initMethod 실행");
	}
	
	public void destroyMethod() {
		System.out.println("destroyMethod 실행");
	}
}
