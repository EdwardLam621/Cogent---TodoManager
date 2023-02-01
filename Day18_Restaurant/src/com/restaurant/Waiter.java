/**
 * 
 */
package com.restaurant;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class Waiter {

	String listItems[] = {"A(Vegan) - 100", 
							"B - 15" , 
							"C - 50", 
							"D(Vegan) - 100", 
							"E(Vegan) - 50", 
							"F(Vegan) - 50", 
							"G - 50", 
							"H - 50", 
							"I - 500 ", 
							"J(Vegan) - 50"};
	
	public void menu() {
		System.out.println("Here is the menu");
		for(int i = 0; i < listItems.length; i++) {
			System.out.println(listItems[i]);
		}
	}
	
	public Order takeOrder(Customer c) {
		menu();
		Order o = c.orderingItems();
		placeOrderToChef(o);
		return o;
	}
	
	public void placeOrderToChef(Order Order) {
		System.out.println("waiter finished taking order, sending to chefs");
		VegChef vc = new VegChef();
		NonVegChef nvc = new NonVegChef();
		for(int i = 0; i < listItems.length; i ++) {
			if(listItems[i].contains("(Vegan)") && Order.items[i][1] > 0) {
				System.out.println(listItems[i] + " reached veg chef");
				vc.vegSection(Order, i);
			} else if(!listItems[i].contains("(Vegan)") && Order.items[i][1] > 0) {
				System.out.println(listItems[i] + " reached Non-veg chef");
				nvc.nonVegSection(Order, i);
			}
		}
	}
}
