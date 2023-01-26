/**
 * 
 */
package com.cogent.day04;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B22 B1 = new B22();
	}

}

class A22{
	A22(){	//A22 constructor is B22's super constructor
		System.out.println("DC-A22");
	}
}

class B22 extends A22{
	B22(){
		System.out.println("DC-B22");
	}
}