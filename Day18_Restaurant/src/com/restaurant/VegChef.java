/**
 * 
 */
package com.restaurant;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class VegChef extends Chef{

	public void vegSection(Order order, int orderItem) {
		System.out.println("Veg chef is preparing order Item #" + orderItem);
		this.prepareOrder(order, "Non-Veg");
	}
}
