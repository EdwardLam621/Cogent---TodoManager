/**
 * 
 */
package com.cogent.day09.exception;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Manager14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String age = args[0];
			System.out.println(age);
			
			int newAge = Integer.parseInt(age);
			System.out.println(newAge);
			
			int bonus = newAge/(newAge - 10);
			System.out.println(bonus);
			
			
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException occured & handled");
		} catch (NumberFormatException e2) {
			System.out.println("NumberFormatException occured & handled");
		} catch (ArithmeticException e3) {
			System.out.println("ArithmeticException occured & handled");
		} catch(Exception e4) {
			System.out.println(e4.getMessage());
		} finally {
			System.out.println("HELLO HERE");
		}
		
		System.out.println("Program executed successfully");

	}

}
