/**
 * 
 */
package com.cogent.day06;

/**
 * @author : Edward Lam
 * @date   : 2023-01-16
 */
public class Manager34 {

}

class A34{		// final variable can be initialized w different values under different constructor
	final int i;
	
	A34(){
		i = 100;
	}
	
	A34(String s){
		this.i = 50;
	}
	
	A34(int i){
		this.i = i;
	}
	
	
	void test() {
		
	}
}
