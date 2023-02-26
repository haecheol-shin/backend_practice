package ems.member.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ems.member.DataBaseConnectionInfo;
// �ʿ���� import ������ ctrl+shift+O�� ���� �� �ִ�.


@Configuration
public class MemberConfig2 {

//	<bean id="dataBaseConnectionInfoDev" class="ems.member.DataBaseConnectionInfo">
//		<property name="jdbcUrl" value="jdbc:oracle:thin:@localhost:1521:xe" />
//		<property name="userId" value="scott" />
//		<property name="userPw" value="tiger" />
//	</bean>
	
	@Bean
	public DataBaseConnectionInfo dataBaseConnectionInfoDev() {
		DataBaseConnectionInfo infoDev = new DataBaseConnectionInfo();
		infoDev.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		infoDev.setUserId("scott");
		infoDev.setUserPw("tiger");
		
		return infoDev;
	}
	
	@Bean
	public DataBaseConnectionInfo dataBaseConnectionInfoReal() {
		DataBaseConnectionInfo infoDev = new DataBaseConnectionInfo();
		infoDev.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
		infoDev.setUserId("masterid");
		infoDev.setUserPw("masterpw");
		
		return infoDev;
	}
	
}
