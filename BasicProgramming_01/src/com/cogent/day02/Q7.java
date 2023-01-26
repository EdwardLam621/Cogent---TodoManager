/**
 * 
 */
package com.cogent.day02;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */
public class Q7 {
	public static void main(String[] args) {
		int first, second;
		//console input
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("what is your first number?"); first = sc.nextInt();
		 * System.out.println("what is your second number?"); second = sc.nextInt();
		 */
		
		//command line input
		first = Integer.parseInt(args[0]);
		second = Integer.parseInt(args[1]);
		
		//display
		System.out.print(first + " " + second + " ");
		for( int i = 0 ; i < 13; i++ ) {
			int temp = first + second;
			System.out.print(temp + " ");
			first = second;
			second = temp;
		}
	}
	
}
