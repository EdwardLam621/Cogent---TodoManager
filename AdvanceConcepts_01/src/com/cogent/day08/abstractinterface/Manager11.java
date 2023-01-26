/**
 * 
 */
package com.cogent.day08.abstractinterface;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Manager11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A11 a = new C11();
		a.test1();
		a.test2();
		a.test3();	// method from super class cannot be directly called
					// in order to call method in B, it is necessary to add
					// new method at interface
	}

}

interface A11{
	void test1();
	void test2();
	void test3();
}

class B11{
	public void test1() {
		System.out.println("test2");
	}
	
	public void test3() {
		System.out.println("test3");
	}
}

class C11 extends B11 implements A11{	// no implementation conflict, so it is compilable
	@Override
	public void test1() {				// and method can be overridden
		
	}
	
	public void test2() {
		
	}
	
}

abstract class D11{
	abstract void test4();
	void test5() {
		System.out.println("D11 Test 5");
	}
}

class E11 extends D11 implements A11{
	public void test1() {
		
	}
	public void test2() {
			
		}
	public void test3() {
		
	}
	public void test4() {					//abstract method from abstract class needs to be implemented
		System.out.println("E11 Test 4");
	}
	
	public void test5() {					//implemented method from super abstract class can be overridden
		System.out.println("E11 Test 5");
	}

}