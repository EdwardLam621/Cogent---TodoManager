/**
 * 
 */
package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person) ac.getBean("person");
		Car c = p.getCar();
		System.out.println("Details:");
		System.out.println("Model: " + c.getModel());
		System.out.println("Price: " + c.getPrice());
	}

}
