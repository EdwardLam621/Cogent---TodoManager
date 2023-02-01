/**
 * 
 */
package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */

@ComponentScan("spring")
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/beans.xml");
//		
//		//simple code
//		HelloWorld hw = ctx.getBean("hello", HelloWorld.class);
//		hw.message();
//		
//		//see beans.xml for difference
//		Person p = ctx.getBean("person", Person.class);
//		System.out.println(p.toString());
//		
//		Person p2 = ctx.getBean("person2", Person.class);
//		System.out.println(p2.toString());
//		
////		ApplicationContext ctx2 = new AnnotationConfigApplicationContext("ApplicationBeans.class");
////		Person p3 = ctx2.getBean("person3", Person.class);
////		System.out.println(p3.toString());
////		
//		ApplicationContext ctx3 = new AnnotationConfigApplicationContext("ProductBean.class");
//		Product pd = ctx3.getBean("product", Product.class);
//		System.out.println(pd.toString());

		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
		__ChatService chatService = applicationContext.getBean(__ChatService.class);
		chatService.chat();
		applicationContext.close();
	}

}
