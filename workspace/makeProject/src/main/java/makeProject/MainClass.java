package makeProject;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Phone phone = ctx.getBean("phone", Phone.class);
		
		phone.info();
		
		ctx.close();
	}
}
