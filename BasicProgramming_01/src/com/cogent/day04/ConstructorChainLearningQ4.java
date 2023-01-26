/**
 * 
 */
package com.cogent.day04;

/**
 * @author : Edward Lam
 * @date   : 2023-01-13
 */
public class ConstructorChainLearningQ4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C026 c3 = new C026();
	}

}

 class A026{
	 A026(){
		 this(10);
		 System.out.println("DC=A026");
	 }
	 A026(int i){
		 System.out.println("PC-A026");
	 }
 }
 
 class B026 extends A026{
	 B026(int i){
		 System.out.println("PC-B026");
	 }
 }
 
 class C026 extends B026{
	 C026(){
		 this(10,20);
		 System.out.println("DC-C026");
	 }
	 C026(int i){		
		 //super(10);				//if super constructor wasn't called, it will call default constructor, which is missing in B206,
		 							//either create default constructor or call super constructor to solve the problem
		 
		 System.out.println("PC-C026");
	 }
	 C026(int i , int j){
		 this(10);
		 System.out.println("PC1-C");
	 }
 }
 
 