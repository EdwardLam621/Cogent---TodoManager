/**
 * 
 */
package com.cogent.day04;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class Manager20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.drive();

	}

}

class Father20{
	
	void drive() {
		System.out.println("Love scooter");
	}
	
}

class Son extends Father20{
	
	@Override	//annotation - meta data
	void drive() {
		System.out.println("Love bike");
	}
	
}