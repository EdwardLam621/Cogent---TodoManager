/**
 * 
 */
package com.cogent.day05;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		A27 a4 = new A27(11, 11.23);

	}

}

class A27{
	int i;
	double j;
	{
		//iib = instance initialization block
		System.out.println("From IIB");
	}
	/**
	 * @param i
	 * @param j
	 */
	public A27(int i, double j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	public A27(double j) {
		super();
		this.j = j;
	}
	
	public A27(int i) {
		super();
		this.i = i;
	}
	
	public A27() {
		super();
	}
	
	
}