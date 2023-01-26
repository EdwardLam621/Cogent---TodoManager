/**
 * 
 */
package com.cogent.day06;

/**
 * @author : Edward Lam
 * @date   : 2023-01-16
 */
public class Manager38_static {
	int i = 10;
	static int j = 20;
	
	public static void main(String[] args) {
		System.out.println(new Manager38_static().i);
		System.out.println(j);
		A38 a = new A38();
		System.out.println(a.x);
		System.out.println(A38.y);
	}
	
	void test() {
		System.out.println(i);
		System.out.println(j);
	}
}

class A38{
	int x = 10;			//non static member, need to create object
	static int y = 20;	//static member can be accessed directly by calling class name, object initiated is not necessary
}

