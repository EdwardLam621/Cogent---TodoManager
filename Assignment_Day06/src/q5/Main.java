/**
 * 
 */
package q5;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Storage s = new Storage();
		Counter c = new Counter(s);
		Printer p = new Printer(s);
		
		new Thread(p).start();
		new Thread(c).start();
	}

}
