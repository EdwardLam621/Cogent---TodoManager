/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class Manager12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1(); cannot directly call methods, need to create object
		Manager12 m = new Manager12();
		new Manager12().test1(); //object is not named so it cannot be used again
		m.test1();
		m.test2();
		
	}
	int x = 200;
	void test1() {
		int i = 100;
		System.out.println(i);
		System.out.println(x);
	}
	
	void test2() {
		System.out.println(x);
	}
}

