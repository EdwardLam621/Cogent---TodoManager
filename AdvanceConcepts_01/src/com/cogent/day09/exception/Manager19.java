/**
 * 
 */
package com.cogent.day09.exception;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Manager19 {	//throws
	
	public static void main(String[] args) throws ClassNotFoundException {
		new Manager19().test3();
	}
	
	void test3() throws ClassNotFoundException {
		A19.test2();
	}

}

class A19{
	void test1() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //JDBC
	}
	
	static void test2() throws ClassNotFoundException{
		A19.test2();
	}
}
