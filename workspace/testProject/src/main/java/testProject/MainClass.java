package testProject;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
//		TransportationWalk tW = new TransportationWalk();
//		tW.move();
//		기존 자바 코드로 사용하던 방식
//		클래스를 만들어 놓고 클래스를 사용하기 위해 new로 생성자 호출 -> 동적으로 메모리 로드 -> 레퍼런스를 이용해 속성에 접근
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// 컨테이너 생성됨
		
		TransportationWalk tw = ctx.getBean("tWalk", TransportationWalk.class);
		// 객체를 가져옴
		
		tw.move();
		
		ctx.close();
		// resource 반환
		
		// xml 파일을 이용해서 객채를 생성함. 이 파일을 스프링 설정파일이라고 한다.
		// 컨테이너 안에 생성된 객체를 bean이라고 한다.
	}
}
