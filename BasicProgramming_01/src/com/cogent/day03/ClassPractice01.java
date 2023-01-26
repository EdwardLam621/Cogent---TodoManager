/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class ClassPractice01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product arr[] = new Product[5];
		
		for(int i = 0; i < arr.length; i++) {
			Product temp = new Product();
			temp.setProductID(1000 + i); 
			temp.setProductName("Product #" + (i + 1));
			temp.setProductPrice(100.5 * (i + 1));
			arr[i] = temp;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getProductID() + " " + arr[i].getProductName() + " " + arr[i].getProductPrice()); 
		}

	}
	

}
