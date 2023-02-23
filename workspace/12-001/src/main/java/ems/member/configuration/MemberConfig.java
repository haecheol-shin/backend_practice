package ems.member.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ems.member.dao.StudentDao;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentDeleteService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

@Configuration
public class MemberConfig {

	// <bean id="studentDao" class="ems.member.dao.StudentDao" ></bean>
	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	} // 메소드의 이름은 빈 태그의 id값, 반환형은 객체

//	<bean id="registerService" class="ems.member.service.StudentRegisterService">
//		<constructor-arg ref="studentDao" ></constructor-arg>
//	</bean>
	
	@Bean
	public StudentRegisterService registerService() {
		return new StudentRegisterService(studentDao());
	}
	
	@Bean
	public StudentModifyService modifyService() {
		return new StudentModifyService(studentDao());
	}
	
	@Bean
	public StudentDeleteService deleteService() {
		return new StudentDeleteService(studentDao());
	}
	
	@Bean
	public StudentSelectService selectService() {
		return new StudentSelectService(studentDao());
	}
	
	@Bean
	public StudentAllSelectService allSelectService() {
		return new StudentAllSelectService(studentDao());
	}
	
//	<bean id="dataBaseConnectionInfoDev" class="ems.member.DataBaseConnectionInfo">
//		<property name="jdbcUrl" value="jdbc:oracle:thin:@localhost:1521:xe" />
//		<property name="userId" value="scott" />
//		<property name="userPw" value="tiger" />
//	</bean>
	
	
}
