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
	
	public void initMethod() { // �޼ҵ带 �̿��ϴ� ���, ctx���Ͽ��� ������ �޼ҵ� �̸��� ���ƾ� �Ѵ�.
		System.out.println("initMethod ����");
	}
	
	public void destroyMethod() {
		System.out.println("destroyMethod ����");
	}
}
