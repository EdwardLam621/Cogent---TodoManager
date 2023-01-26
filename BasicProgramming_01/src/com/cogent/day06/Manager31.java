/**
 * 
 */
package com.cogent.day06;

/**
 * @author : Edward Lam
 * @date   : 2023-01-16
 */
public class Manager31 {

}

class A31{
	final int i = 10;
	int j = 2;
	int k;
	//final int m; compile error because m needs to be initialized at first place
	void test() {
		j = 200;
		//i = 999;	//compile err bcz i(final) cannot be re-initialized
		
	}
}