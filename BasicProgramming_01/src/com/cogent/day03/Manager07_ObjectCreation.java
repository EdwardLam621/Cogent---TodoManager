/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */

class Student07{
	int sid;
	String sname;
}

class Employee07{
	int eid;
	String ename;
	//static String address;
	//static variable will not go to the heap memory 
}

public class Manager07_ObjectCreation {
	public static void main(String[] args) {
		Student07 s1 = new Student07();
		Employee07 e1 = new Employee07();
		//s1 and e1 will be stored at stack memory - main method memory section
	}
}
