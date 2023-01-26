/**
 * 
 */
package com.cogent.day02;
import java.util.Scanner;


/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */
public class Manager01 {
	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturdayday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Not a valid day");
		}
		
	}*/
	
	
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

