/**
 * 
 */
package com.cogent.day04;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class Manager18_Inheritence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal18 animal = new Animal18();
		animal.drink();
		Lion18 lion = new Lion18();
		lion.drink();
	}

}

class Lion18 extends Animal18 {
//	void drink() {
//		System.out.println("");
//	}
	
}


class Animal18{
	void drink() {
		System.out.println("Water");
	}
	
}
