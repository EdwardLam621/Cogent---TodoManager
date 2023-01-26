/**
 * 
 */
package com.cogent.day06;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Manager39_static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student39 s1 = new Student39(1, "ABC", "ABC@def.com", "POKNJ");
		Student39 s2 = new Student39(2, "DPON", "AERCC@def.com", "POKNJ");
		Student39 s3 = new Student39(3, "WOPJCX", "WEDCC@def.com", "POKNJ");
		Student39 s4 = new Student39(3, "WEDCXXEX", "WEPOJX@def.com", "POKNJ");
		
		System.out.println(Student39.college);
	}

}

class Student39{
	int sid;
	/**
	 * @param sid
	 * @param name
	 * @param email
	 * @param college
	 */
	public Student39(int sid, String name, String email, String college) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.college = college;
	}
	String name, email;
	static String college;
}