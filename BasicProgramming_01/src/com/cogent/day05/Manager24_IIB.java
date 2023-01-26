/**
 * 
 */
package com.cogent.day05;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager24_IIB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person24 p1 = new Person24();
		System.out.println("Name:" + p1.name + " Age:" + p1.age + " weight: " + p1.weight);
		p1.name = "MAX";
		p1.age = 20;
		p1.weight = 59.5;
		System.out.println("Name:" + p1.name + " Age:" + p1.age + " weight: " + p1.weight);
		Person24 p2 = new Person24("ABC", 99, 40.99);
		System.out.println("Name:" + p2.name + " Age:" + p2.age + " weight: " + p2.weight);
		
	}

}

class Person24{
	String name;
	int age;
	double weight;
	
	Person24(){
		
	}
	
	Person24(String n, int a, double w){
		this.name = n;
		this.age = a;
		this.weight = w;
	}
}
