/**
 * 
 */
package com.cogent.day09.exception;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Manager12 {
	public static void main(String[] args) {
		System.out.println("main starts");
		
		//int i = 10/0; //Arithmatic exception
		
		try {
			int i = 10/0;
		}catch(Exception e) {
			System.out.println("Arithmetic Exception Occured and Handled");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
		
		System.out.println("main ends");
	}
}
