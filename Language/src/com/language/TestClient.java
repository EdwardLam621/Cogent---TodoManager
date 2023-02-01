/**
 * 
 */
package com.language;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */
public class TestClient extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			CLang c = new CLang();
			JavaLang j = new JavaLang();
			System.out.println("Thread names are:");
			System.out.println(c.getName());
			System.out.println(j.getName());
			c.start();
			j.start();
			
		}
	}

}
