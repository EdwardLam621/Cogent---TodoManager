/**
 * 
 */
package com.cogent.day08.abstractinterface;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Manager04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//A04 a1 = new A04();
		B04 b1 = new B04();

	}

}

abstract class A04{
	void test() {
		System.out.println("test");
	}
}

class B04{
	private B04(){
		super();
	}
}