/**
 * 
 */
package com.cogent.day09.exception;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Manager17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Main Starts");
		
		try {
			
			System.out.println("Try Starts");
			int i = 10/0;
			System.out.println("Try Ends");
			
		} catch(NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		// if below lines are below (Exception e), 
		// it is unreachable exception
//		catch(ArithmeticException e2) {
//			
//			e2.printStackTrace();
//			
//		}
		
		finally {
			System.out.println("Mandatory Task Starts");
			System.out.println("Mandatory Task Ends");
			
		}
		System.out.println("Main Ends");

	}

}
