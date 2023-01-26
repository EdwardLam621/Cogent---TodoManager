/**
 * 
 */
package com.cogent.day05;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student25 s1 = new Student25();
		Student25 s2 = new Student25("Matt", "ABC", "ABC@goc.com", "USA");

	}

}

class Student25{
	String fname, lname, email, country;

	/**
	 * @param fname
	 * @param lname
	 * @param email
	 * @param country
	 */
	public Student25(String fname, String lname, String email, String country) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.country = country;
	}

	/**
	 *  Auto generate - right click, source, select constructor you need
	 */
	public Student25() {
		super();  //its super class is Object class
		// TODO Auto-generated constructor stub
	}
}