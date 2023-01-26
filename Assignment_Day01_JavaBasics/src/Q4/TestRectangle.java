/**
 * 
 */
package Q4;

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
		
		//test setter validation, variables of object r6 should not be changed at this point
		r6.setLength(21);
		r6.setLength(0);
		r6.setWidth(20);
		r6.setWidth(-100);
		
		//validate r6 again
		System.out.println(r6.toString());
		
		//test setter of r6 again, r6 should have width of 19.99 and length of 0.01
		r6.setLength(0.01);
		r6.setWidth(19.99);
		
		//validate r6 again
		System.out.println(r6.toString());
	}

}
