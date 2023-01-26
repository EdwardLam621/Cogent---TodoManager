/**
 * 
 */
package com.cogent.day03;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class EmployeeDAO {
	static Scanner sc = new Scanner(System.in);
	
	public static void create(Employee emp[], int size) {
		
		for(int i = 0; i < emp.length; i++) {
			System.out.println("Employee ID: ");
			int empID = sc.nextInt();
			System.out.println("Employee name: ");
			String empName = sc.next();
			System.out.println("Employee Salary: ");
			double empSalary = sc.nextDouble(); 
			Employee temp = new Employee();
			temp.setEmployeeName(empName);
			temp.setEmployeeNo(empID);
			temp.setEmployeeSalary(empSalary);
			emp[i] = temp;
		}
		System.out.println("Succeed!");
	}
	
	public static void read(Employee emp[]) {
		if(emp == null) {
			System.out.println("no record");
		}
		else {
			for(int i = 0; i < emp.length; i++) {
				System.out.println(emp[i].toString());
			}
			System.out.println();
		}
	}
	
	public static void update(Employee[] emp) {
		
		//find by index
//		System.out.println("Index no to update? ");
//		int no = sc.nextInt();
		
		//find by ID or name
		int index = search(emp);
		
		System.out.println("Employee ID: ");
		int empID = sc.nextInt();
		System.out.println("Employee name: ");
		String empName = sc.next();
		System.out.println("Employee Salary: ");
		double empSalary = sc.nextDouble(); 
		Employee temp = new Employee();
		temp.setEmployeeName(empName);
		temp.setEmployeeNo(empID);
		temp.setEmployeeSalary(empSalary);
		emp[index] = temp;
		System.out.println("updated");
		
	}
	
	public static void delete(Employee[] emp) {

		// simply find by index
//		System.out.println("Index no to delete? ");
//		int no = sc.nextInt();
//		emp[no] = null;
//		System.out.println("Index " + no + " has been deleted");
		
		//search method
		int index = search(emp);
		emp[index] = null;
		System.out.println("deleted");
		
	}
	
	private static int search(Employee[] emp) {
		
		System.out.println("How do you like to find employee?\n"
							+ "1 - employee ID\n"
							+ "2 - employee name\n");
		int choice = sc.nextInt();
		if(choice == 1  || choice == 2) {
			switch(choice) {
			case 1:
				System.out.println("What is the ID?");
				int id = sc.nextInt();
				for(int i = 0; i < emp.length; i++) {
					if(id == emp[i].employeeNo) {
						System.out.println("ID found");
						return i;
					}
				}
				System.out.println("not found");
				break;
			
			case 2:
				System.out.println("What is the Name?");
				String name = sc.next();
				for(int i = 0; i < emp.length; i++) {
					if(name.equals(emp[i].employeeName)) {
						System.out.println("Name found");
						return i;
					}
				}
				System.out.println("not found");
				break;
			
			default: System.out.println("try again");
			break;
			}
		}
		return 0;	//never reached
	}
}
