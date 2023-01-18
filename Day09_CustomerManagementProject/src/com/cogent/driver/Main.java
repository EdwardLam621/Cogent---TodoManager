package com.cogent.driver;

import com.cogent.controller.*;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		CustomerController cc = new CustomerController();
		
		do {
			System.out.println("1- Add record");
			System.out.println("2- Read records");
			System.out.println("3- Update record");
			System.out.println("4- Delete record");
			System.out.println("5- Find Youngest Customer");
			System.out.println("6- Find Customer by ID");
			System.out.println("7- Exit");
			
			System.out.println("Please choose action: ");
			choice = sc.nextInt();
			cc.accept(choice);
		} while (choice != 7);
		
		sc.close();

	}

}
