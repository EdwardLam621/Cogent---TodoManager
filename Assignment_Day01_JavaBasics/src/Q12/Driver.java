/**
 * 
 */
package Q12;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Driver {
	
	public static void main(String[] args) {
	
		complex c1 = new complex(1,-4);
		complex c2 = new complex(2,-3);
		
		complex c3 = c1.addition(c2);
		System.out.println(c3.toString());
		
		complex c4 = c3.subtraction(new complex());
		System.out.println(c4);
	}
	
}
