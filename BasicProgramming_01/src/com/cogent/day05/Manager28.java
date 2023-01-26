/**
 * 
 */
package com.cogent.day05;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A28 a1 = new A28();
		B28 b1 = new B28();

	}

}

class A28{
	public A28() {
		super();
		System.out.println("DC-A28");
	}
	
	//instance initialization block of A28
	{
		System.out.println("IIB-A28");
	}
}

class B28 extends A28{
	public B28() {
		super();
		System.out.println("DC-B28");
	}
	
	//instance initialization block of B28
	{
		System.out.println("IIB-B28");
	}
}
