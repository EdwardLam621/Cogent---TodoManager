/**
 * 
 */
package com.dell;
import com.hp.Calculator;;

/**
 * @author : Edward Lam
 * @date   : 2023-01-14
 */
public class Account {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		Calculator c = new Calculator();
		System.out.println(c.add(i,j));
		System.out.println(c.subtract(i,j));
	}
}
