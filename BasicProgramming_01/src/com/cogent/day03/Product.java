/**
 * 
 */
package com.cogent.day03;

/**
 * @author : Edward Lam
 * @date   : 2023-01-12
 */
public class Product {

	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}
	/**
	 * @param d the productPrice to set
	 */
	public void setProductPrice(double d) {
		this.productPrice = d;
	}
	int productID;
	String productName;
	double productPrice;

}
