/**
 * 
 */
package com.cogent.day08.abstractinterface;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Day07Animal implements Day07Mammal {

	@Override
	public void eat() {
		System.out.println("Eating");
	}
	
	@Override
	public void move() {
		System.out.println("Moving");
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleep");
	}
	
	String name = "Animal";
}
