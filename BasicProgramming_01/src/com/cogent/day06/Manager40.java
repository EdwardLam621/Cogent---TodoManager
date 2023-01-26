/**
 * 
 */
package com.cogent.day06;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Manager40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee40 e1 = new Employee40("Issa","20", "UK");		//all country values will not be stored at Employee40
		Employee40 e2 = new Employee40("Issb", "39", "AUS");	// because static member "country" itself is stored in heap memory, while
		Employee40 e3 = new Employee40("Issc", " 11", "CN");	// other class members are stored as objects in heap memory
		Employee40 e4 = new Employee40("Issd", "124", "AFG");
		e4.country = "US";	//it will change the static member value of the class, which is public accessible at heap memory "country"
		
		System.out.println(e1.country); 
		System.out.println(e2.country);
		System.out.println(e3.country);
		System.out.println(e4.country);

	}

}

class Employee40{
	String name, age;
	/**
	 * @param name
	 * @param age
	 */
	public Employee40(String name, String age, String Country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}
	static String country;
}