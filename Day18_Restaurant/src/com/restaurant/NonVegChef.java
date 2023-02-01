/**
 * 
 */
package com.restaurant;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class NonVegChef extends Chef{

	public void nonVegSection(Order order, int orderItem) {
		System.out.println("Non-veg chef is preparing order item #" + orderItem);
		this.prepareOrder(order, "Veg");
	}
}
