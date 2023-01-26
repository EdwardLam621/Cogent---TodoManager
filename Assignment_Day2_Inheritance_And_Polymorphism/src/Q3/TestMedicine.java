/**
 * 
 */
package Q3;

import java.util.Random;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class TestMedicine {
	
	public static void main(String[] args) {
		Medicine[] arr = new Medicine[10];
		Random r = new Random();
		
		// randomly generate compartment classes
		for(int i = 0; i < 10; i++) {
			switch(r.nextInt(3)) {
			case 0:
				arr[i] = new Tablet();
				break;
			case 1:
				arr[i] = new Syrup();
				break;
			case 2:
				arr[i] = new Ointment();
				break;
			}
		}
		
		
		//print polymorphic behavior
		for(Medicine m : arr) {
			m.displayLabel();
		}
	}
	
}
