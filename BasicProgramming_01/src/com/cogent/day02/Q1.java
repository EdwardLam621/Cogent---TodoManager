/**
 * 
 */
package com.cogent.day02;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		do{
			System.out.println("What is the number? ");
			n = sc.nextInt();
			findAllEvenNumbersSmallerOrEqualToN(n);
		} while (n > 0);	
	}
	
	private static void findAllEvenNumbersSmallerOrEqualToN(int n) {
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}