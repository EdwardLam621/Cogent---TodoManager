/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */
public class Manager10_StaticContext {

	/**
	 * @param args
	 */
	
	int i = 100;
	static int j = 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager10_StaticContext m1 = new Manager10_StaticContext();
		
		System.out.println(m1.i);	//this is how you can access the non static variables in a class
		
		System.out.println(j);
		
		test1();					//OK
		//test2();					//failed
		m1.test2();					//OK

	}
	
	static void test1() {
		
	}

	void test2() {
		
	}
}
