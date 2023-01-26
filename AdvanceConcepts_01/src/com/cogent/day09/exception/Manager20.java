/**
 * 
 */
package com.cogent.day09.exception;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Manager20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account acc = new Account(123, "Bentley", 500);
		acc.withdraw(2100); // more than 500 will trigger Arithmetic Exception

	}

}

class Account{
	private int accNo;
	private String accHolderName;
	private float balance;
	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the accHolderName
	 */
	public String getAccHolderName() {
		return accHolderName;
	}
	/**
	 * @param accHolderName the accHolderName to set
	 */
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}
	/**
	 * @param accNo
	 * @param accHolderName
	 * @param balance
	 */
	public Account(int accNo, String accHolderName, float balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	
	public float withdraw(float amt) {
		if(amt <= balance) {
			System.out.println("Please collect cash");
			return amt;
		}
		else {
			//throw new ArithmeticException("Good try");
			throw new InsufficientBalanceException("Good try");
		}
	}
}