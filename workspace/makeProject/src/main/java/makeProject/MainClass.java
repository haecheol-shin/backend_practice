package makeProject;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		IPhone iPhone = ctx.getBean("iPhone", IPhone.class);
		
		System.out.println(iPhone.getAcc());
		ctx.close();
	}
}
