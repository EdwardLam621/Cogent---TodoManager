/**
 * 
 */
package com.cogent.day05;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A29 a = new A29();
	}

}

class A29{

	/**
	 * 
	 */
	public A29() {
		super();  //if super is called, it will call constructor first and then IIB
		System.out.println("DC-A29");
	}
	{
		System.out.println("IIB-1-29");
	}
	{
		System.out.println("IIB-2-29");
	}
}
