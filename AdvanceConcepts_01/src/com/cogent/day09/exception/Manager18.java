/**
 * 
 */
package com.cogent.day09.exception;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Manager18 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main starts");
		
		//ClassNotFoundException
		//try - catch block
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //JDBC
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//or throws ClassNotFoundException (out of scope at this point)
		Class.forName("oracle.jdbc.driver.OracleDriver"); //JDBC
		
		
		System.out.println("main ends");
	}
	

}
