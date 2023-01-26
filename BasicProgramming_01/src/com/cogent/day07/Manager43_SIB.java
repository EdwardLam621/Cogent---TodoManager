/**
 * 
 */
package com.cogent.day07;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Manager43_SIB {

	static {
		System.out.println("SIB-Manager"); //0. before calling method, initialize the SIB from main
	}
	
	public static void main(String[] args) {
		System.out.println("main starts");
		B43 b1 = new B43();
		A43 a1 = new A43();
		System.out.println("main ends");

	}

}

class A43{
	static {
		System.out.println("SIB-A43");		//1.super class SIB first

	}
	
	public A43() {
		super();
		System.out.println("DC-A43");		//4. super class constructor
											//8. class constructor
	}
	
	{
		System.out.println("IIB-A43");		//3. super class IIB
											//7. class IIB
	}
	
}

class B43 extends A43{
	static {
		System.out.println("SIB-B43");		//2.sub class SIB
	}
	
	public B43() {
		super();
		System.out.println("DC-B43");		//6. sub class constructor
	}
	
	{
		System.out.println("IIB-B43");		//5. sub class IIB
	}
}
