/**
 * 
 */
package thread;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class JoinDemo extends Thread {
	
	static int n, sum = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		System.out.println("Sum of first 'n' numbers");
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		
		try {
			jd.join();
		} catch(InterruptedException e) {
			
		}

		System.out.println("Sum of first " + JoinDemo.n + " Number is: " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("Total time taken is " + (end - start)/1000 + "s");
		
		sc.close();
	}
	
	public void run() {
		for(int i = 1; i <JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}

}
