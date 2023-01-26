/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */
public class Manager09_ObjectCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee09 e1 = new Employee09();
		Employee09 e2 = new Employee09();
		Employee09 e3 = new Employee09();
		e1.emp_id = 1001;
		e2.emp_name = "HELLO";
		e3.emp_salary = 10000;
	}

}

class Employee09{
	int emp_id;
	String emp_name;
	double emp_salary;
	boolean isMarried;
}