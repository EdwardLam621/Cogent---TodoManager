/**
 * 
 */
package q2;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread mt1 = new MyThread(1);
		MyThread mt2 = new MyThread(2);
		
		mt1.run();
		mt2.run();

	}

}
