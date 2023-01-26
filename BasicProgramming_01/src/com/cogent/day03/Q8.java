/**
 * 
 */
package com.cogent.day03;

import java.util.Random;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class Q8 {

	/**
	 * @param args
	 * write a program that accepts two numbers in the range from 1 to 40 from the Command Line. It then compares these
	 * numbers against a single dimension array of five integer elements ranging in value from 1 to 40. The program 
	 * displays the message bingo if the two inputted values are found in the array elements. For example
	 * 
	 * input java prob 3 3 29
	 * oupt your first numbr was 3
	 * your second number was 29
	 * its bingo!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bingo = 0;
		
		System.out.println("Your first number was " + args[0]);
		System.out.println("Your second number was " + args[1]);
		
		//store number
		int[] arr = new int[5];
		
		//generate random numbers
//		Random r = new Random();
//		for(int i = 0; i < 5; i++) {
//			int temp = r.nextInt(40) + 1;
//			for(int j = 0; j < i; i++){
//				
//			}
//		}
		
//		for(int i : arr) {
//			System.out.print(i + " ");
//		}
		
		//hardcoding number for test
		
		arr[0] = 10; 
		arr[1] = 15; 
		arr[2] = 8; 
		arr[3] = 39; 
		arr[4] = 27;
		
		
		//check number
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == Integer.parseInt(args[0]) || arr[i] == Integer.parseInt(args[1])){
				bingo++;
				if(bingo == 2) {
					System.out.println("its bingo");
				}
			}
		}
		

	}

}
