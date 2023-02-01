/**
 * 
 */
package com.restaurant;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class Order{
	static int orderNum;
	int items[][] =  {{100, 0}, {150, 0}, {50, 0}, {100, 0}, {50, 0}, {50,0}, {200, 0}, {200, 0}, {100, 0}, {150, 0}};
	int noOfItems;
	
	public Order() {
		orderNum++;
	}
	
}