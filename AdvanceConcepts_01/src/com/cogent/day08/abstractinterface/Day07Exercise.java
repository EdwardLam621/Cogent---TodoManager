/**
 * 
 */
package com.cogent.day08.abstractinterface;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Day07Exercise {

}

interface A01{
	int i = 10;
	void test();
}

abstract interface B01{
	
}

abstract class C01{
	int i;
	{
		i = 20;
	}
}

class D01 extends C01 implements A01{
	public void test() {
		System.out.println(A01.i);
		//System.out.println(C01.i);	//compile error
		//System.out.println(i);      	//ambigious
		System.out.println(super.i);	
	}
}

