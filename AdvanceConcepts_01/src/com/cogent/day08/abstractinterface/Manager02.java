/**
 * 
 */
package com.cogent.day08.abstractinterface;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Manager02 {

}

abstract class Animal02 {
	void drink() {
		System.out.println("drink water");
	}
	abstract void eat();
}

abstract class Cow02 extends Animal02 {	//abstract class can be only inherited by abstract subclass
	
}