/**
 * 
 */
package com.cogent.day02;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */
public class Q6 {
	public static void main(String[] args) {
		String s = "";
		// console input
		//Scanner sc = new Scanner(System.in);
		//System.out.println("what is your string?");
		//s = sc.next();
		//if(s.length() > 0) {
		//	displayResult(s);
		//}
		
				
		// command line input
		if(args.length != 1) {
			System.out.println("Invalid input");
		} else {
			s = args[0];
			displayResult(s);
		}
		
		
	}
	
	private static void displayResult(String s) {
		if(s.length() > 0) {
			String result = s.toUpperCase();
			boolean isPalindrome = true;
			for(int i = 0; i < s.length()/2; i++) {
				if(result.charAt(i) != result.charAt(s.length()- 1 - i)) {
					isPalindrome = false;
					break;
				}
			}
			System.out.println("String length: " + result.length() + " Palindrome? " + isPalindrome + "\n");
		} else {
			System.out.println("Empty input");
		}
	}
	
}
