/**
 * 
 */
package com.restaurant;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class Chef {

	public void prepareOrder(Order order, String vegRnonVeg) {
		System.out.println(vegRnonVeg + " has prepared order ");
		
		callWaiters(vegRnonVeg);
	}
	
	public void callWaiters(String vegRnonVeg) {
		System.out.println(vegRnonVeg + " to waiter: you can new deliver items to customer");
		System.out.println("----------------");
	}
}
