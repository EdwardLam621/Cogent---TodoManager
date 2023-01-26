/**
 * 
 */
package Day10_App01_Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 */
public class Application02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter First name: ");
			String firstName = br.readLine();
			System.out.println("Enter Last name: ");
			String lastName = br.readLine();
			System.out.println("Enter Age: ");
			String age = br.readLine();
			
			System.out.println("Hello " + firstName + " " + lastName + " " + age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
