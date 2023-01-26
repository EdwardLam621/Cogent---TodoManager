/**
 * 
 */
package com.cogent.day05;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class Manager26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A26 a4 = new A26(11, 11.23);

	}

}

class A26{
	int i;
	double j;

	/**
	 * @param i
	 * @param j
	 */
	public A26(int i, double j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	public A26(double j) {
		super();
		this.j = j;
	}
	
	public A26(int i) {
		super();
		this.i = i;
	}
	
	public A26() {
		super();
	}
}