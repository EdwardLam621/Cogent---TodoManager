/**
 * 
 */
package Q10;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Driver {

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		
		// hardcode
		p1.setTerm(3, -9);			//negative exponent
		p1.setTerm(2, 6);
		p1.setTerm(2, 6);			//duplicate exponent
		p1.setTerm(4, 7);
		p1.setTerm(3, 2);
		p1.setTerm(3, 1);			//array size exceeded, will not be stored
		
		p1.print();
		
		// command line arguments
		
		for(int i = 0; i < args.length; i+=2) {
			int c = Integer.parseInt(args[i]);
			int e = Integer.parseInt(args[i + 1]);
			p2.setTerm(c, e);
		}
		
		p2.print();
	}
}
