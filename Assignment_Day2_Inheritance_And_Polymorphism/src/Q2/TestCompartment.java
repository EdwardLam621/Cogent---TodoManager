/**
 * 
 */
package Q2;

import java.util.Random;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class TestCompartment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Compartment[] arr = new Compartment[10];
		Random r = new Random();
		
		// randomly generate compartment classes
		for(int i = 0; i < 10; i++) {
			switch(r.nextInt(4)) {
			case 0:
				arr[i] = new FirstClass();
				break;
			case 1:
				arr[i] = new General();
				break;
			case 2:
				arr[i] = new Ladies();
				break;
			case 3:
				arr[i] = new Luggage();
				break;
			}
		}
		
		
		//print polymorphic behavior
		for(Compartment c : arr) {
			c.notice();
		}

	}

}
