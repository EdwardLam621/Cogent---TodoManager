/**
 * 
 */
package com.cogent.day09.exception;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Manager15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String age = args[0];
			System.out.println(age);
			
			int newAge = Integer.parseInt(age);
			System.out.println(newAge);
			
			int bonus = newAge/(newAge - 10);
			
			
		} catch(Exception e1) {
			//System.out.println(e1.getMessage());
			System.out.println("Exception Occured and Handled");
		}
		
		System.out.println("Program executed successfully");

	}

}
