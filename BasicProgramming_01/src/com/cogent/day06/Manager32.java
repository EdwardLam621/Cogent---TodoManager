/**
 * 
 */
package com.cogent.day06;

/**
 * @author : Edward Lam
 * @date   : 2023-01-16
 */
public class Manager32 {

}

class A32{
	void test1() {
		System.out.println("I am from test1");
	}
	final void test2() {
		System.out.println("I am from test2");
	}
}

class B32 extends A32{
	void test1() {
		System.out.println("I am overrided in B32");
	}
	
//	void test2() {
//		cannot be overridden 	
//	}
}
