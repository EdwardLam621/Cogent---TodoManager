/**
 * 
 */
package Q2;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class TestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();					//default constructor
		Rectangle r2 = new Rectangle(0,0);				//both 0 parameters
		Rectangle r3 = new Rectangle(-10.1, 10.2);		// negative length
		Rectangle r4 = new Rectangle(20.48,-10.77);		// negative breadth
		Rectangle r5 = new Rectangle(30.9, 30.7);		// positive length and breadth
		Rectangle r6 = new Rectangle(-100.22, -50.087);	// negative length and breadth
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		System.out.println(r5.toString());
		System.out.println(r6.toString());
	}

}
