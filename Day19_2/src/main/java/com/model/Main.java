/**
 * 
 */
package com.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Edward Lam
 * @date   : 2023-02-03
 */

@Configuration
@ComponentScan(basePackages = {"com.model"})
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
		
		FooService service = ctx.getBean(FooService.class);
		String response = service.message();
		System.out.println(response);
	}
}
