/**
 * 
 */
package com.restaurant;

/**
 * @author : Edward Lam
 * @date   : 2023-02-02
 */
public class Restaurant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Restaurant r = new Restaurant();
		Customer c = new Customer("Aaron");
		Waiter w = new Waiter();
		Order o = w.takeOrder(c);
		c.eat();
		r.generateBill(c, w, o);
		

	}
	
	
	public void generateBill(Customer c, Waiter w, Order o) {
		System.out.println("Dear customer " + c.getCustomerName() + ", your bill:");
		System.out.println("INVOICE");
		System.out.println("-----------------------------");
		System.out.printf("%-10s     %-5s %-5s\n", "Item", "Quant", "Bill");
		int[][] list = o.items;
		int total = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i][1] > 0) {
				System.out.printf("%-10s     %-5d %-5d\n", w.listItems[i], list[i][1], list[i][0] * list[i][1]);
				total += list[i][0] * list[i][1];
			}
		}
		System.out.println("-----------------------------");
		System.out.printf("%-10s            %-10d", "Total", total);
	}

}
