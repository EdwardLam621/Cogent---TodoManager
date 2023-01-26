package classwork;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Classwork extends Thread {

	/**
	 * @param args
	 */
	
	static double radius = 0;
	static double area = 0;
	
	// write a program to calculate and print the area of circle using the thread
	// Apply the join method to complete this coding challenge
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();

		System.out.println("Calculate area of circle");
		System.out.println("Enter radius");
		Scanner sc = new Scanner(System.in);
		Classwork.radius = sc.nextDouble();
		
		Classwork cw = new Classwork();
		cw.start();
		
		try {
			cw.join();
		} catch(InterruptedException e) {
			
		}

		System.out.println("Circle Area of " + Classwork.radius + " is: " + Classwork.area);
		long end = System.currentTimeMillis();
		System.out.println("Total time taken is " + (end - start)/1000 + "s");
		
		
	}
	
	
	public void run() {
		Classwork.area = (Classwork.radius * Classwork.radius * Math.PI);

	}

}
