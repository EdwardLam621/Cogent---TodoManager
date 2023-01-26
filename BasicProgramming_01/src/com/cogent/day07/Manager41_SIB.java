/**
 * 
 */
package com.cogent.day07;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Manager41_SIB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main starts");
		A41 a1 =  new A41();
		System.out.println("main ends");

	}

}


class A41{
	
//	So always the sequence of execution is
//	1) SIB
//	2) IIB
//	3) constructor
	
	public A41() {
		super();
		System.out.println("DC-A41");
	}
	
	{
		System.out.println("IIB-A41");
	}
	
	static {
		System.out.println("SIB-A41");
	}
}