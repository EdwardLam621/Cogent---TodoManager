/**
 * 
 */
package Q11;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//default constructor
		Matrix m1 = new Matrix();
		System.out.println(m1.toString());
		
		//overridden constructor
		Matrix m2 = new Matrix(5,5);
		System.out.println(m2.toString());
		
		//set elements
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				m2.setElements(i, j, (i * 2) - j + 3 - 2*(i * j));
			}
		}
		System.out.println(m2.toString());
		
		// transpose
		Matrix m3 = m2.transpose();
		System.out.println(m3.toString());
		
	}

}
