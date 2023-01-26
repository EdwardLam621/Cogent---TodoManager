/**
 * 
 */
package com.cogent.day04;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A21 a1 = new A21();
		A21 a2 = new A21(9);
		
	}

}

class A21{
	A21(){
		System.out.println("Default Constructor A21");
	}
	A21(int a){
		System.out.println("Parameter Constructor A21");
	}
}