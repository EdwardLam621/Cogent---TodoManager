/**
 * 
 */
package Q1;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Number? ");
		int n = sc.nextInt();
		for(int i = 2; i <= n; i += 2) {
			System.out.println(i);
		}
	}

}
