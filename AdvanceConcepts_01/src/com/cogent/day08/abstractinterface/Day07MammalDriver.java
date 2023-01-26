/**
 * 
 */
package com.cogent.day08.abstractinterface;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Day07MammalDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//down casting
		Day07Animal animal = new Day07Cat();
		Day07Cat cat = (Day07Cat) animal; 
		//cat.meow();
		
		
		// Class Cast Exception
		// Day07Animal animal2 = new Day07Cat();
		// Day07Dog dog = (Day07Dog) animal2;
		
		//up casting
		Day07Dog dog = new Day07Dog();
		Day07Animal animal2 = (Day07Animal) dog;
		
		//all methods can be called from animal2 that is up casted from dog
		animal2.move();
		animal2.sleep();
		animal2.eat();		//this line will call Day07Dog.eat() that was up casted from Day07Dog.eat()
		
		//animal2.bark() is not available because bark() is not available in Day07Animal class
	}

}
