/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-11
 */
public class Manager11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test11 a = new Test11();
		System.out.println(a.i);
		
		//System.out.println(a.j);		//works but it will throw warning
		System.out.println(Test11.j);
		
		a.test1();
		//a.test2();					//works but it will throw warning
		Test11.test2();
		
		System.out.println("main2");
		//main2();						//static context cannot access non-static member 
	}
	
	void main2() {
		Test11 a = new Test11();
		System.out.println(a.i);
		//System.out.println(a.j);		//works but it will throw warning
		System.out.println(Test11.j);
		
		a.test1();
		//a.test2();					//works but it will throw warning
		Test11.test2();
		
		//warning above means that static method/variables should be accessed in static ways
	}

}

class Test11{
	int i = 10;
	static int j = 20;
	void test1() {
		System.out.println("from test 1");
	}
	static void test2() {
		System.out.println("from test 2");
	}
}