/**
 * 
 */
package com.cogent.day04;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B23 b = new B23();
	}

}

class A23{
	
	// to solve compile error at line 37, you can either implement default constructor
//	A23(){
//		System.out.println("A23");
//	}
	
	A23 (int i) {
		System.out.println("PA23");
	}
	
}

class B23 extends A23{
	
	B23 () {
		
		//or call super constructor
//		super(10);
		
		System.out.println("B23");
	}
	
}
