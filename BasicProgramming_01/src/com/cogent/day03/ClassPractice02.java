/**
 * 
 */
package com.cogent.day03;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class ClassPractice02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee[] emp = null;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1 - create\n"
					+ "2 - read\n"
					+ "3 - update\n"
					+ "4 - delete\n"
					+ "5 - exit\n");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("How many records you want to create?");
				int size = sc.nextInt();
				emp = new Employee[size];
				EmployeeDAO.create(emp, size);
				break;
			
			case 2:
				EmployeeDAO.read(emp);
				break;
				
			case 3:
				EmployeeDAO.update(emp);
				break;
				
			case 4:
				EmployeeDAO.delete(emp);
				break;
				
			default: System.out.println("invalid input");
			}

		} while(choice != 5);
		
	}

}
