/**
 * 
 */
package com.cogent.day04;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class ConstructorChainLearningQ3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C(10,20);
		System.out.println();
		C c2 = new C(10);
		System.out.println();
		C c3 = new C();
	}

}

class A{
	A(){
		this(10);
		System.out.println("DC-A");
	}
	A(int i){
		System.out.println("PC-A");
	}
}

class B extends A{
	B(){
		this(10);
		System.out.println("DC-B");
	}
	B(int i){
		System.out.println("PC-B");
	}
}

class C extends B{
	C(){
		this(10,20);
		System.out.println("DC-C");
	}
	C(int i){
		super(10);
		System.out.println("PC-C");
	}
	C(int i, int j){
		this(10);
		System.out.println("PC1-B");
	}
}
