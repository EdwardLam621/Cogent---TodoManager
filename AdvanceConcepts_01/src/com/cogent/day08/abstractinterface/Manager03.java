/**
 * 
 */
package com.cogent.day08.abstractinterface;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Manager03 {
	public static void main(String[] args) {
		//Animal03 a1 = new Animal03();		// constructor cannot be created by abstract class object
											// because it should be always be inherited by sub classes
											// so it should always be constructed by sub class constructor
		Animal03 a2 = new Cow03();
		Animal03 a3 = new Cow03();
	}
}

abstract class Animal03 {
	void drink() {
		System.out.println("drink water");
	}
	abstract void eat();
}

class Cow03 extends Animal03 {	
	@Override								// or override method
	void eat() {
		System.out.println("Eat Grass");
	}	
}

class Lion03 extends Animal03 {	
	@Override								// or override method
	void eat() {
		System.out.println("Eat Meat");
	}	
}