/**
 * 
 */
package com.cogent.day08.abstractinterface;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Manager10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface I10{
	void test1();
}

class A10{
	void test2() {
		System.out.println("test2");
	}
}

class C10 extends A10 implements I10{	
	@Override
	public void test1() {
		
	}
}