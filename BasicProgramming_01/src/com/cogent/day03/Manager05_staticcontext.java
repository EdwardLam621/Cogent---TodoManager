/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */
public class Manager05_staticcontext {

	/**
	 * @param args
	 * 
	 * to study global variable
	 */
	
	static int i = 10;
	
	//int i = 10 (X)
	//not gonna work at main() because static context cannot access no static member
	
	int j = 10;
	
	public static void main(String[] args) {
		System.out.print(i);

	}
	
	void test1() {
		System.out.println(j);
	}

}
