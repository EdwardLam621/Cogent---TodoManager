/**
 * 
 */
package q3;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2(1);
		mt1.setPriority(Thread.MIN_PRIORITY);
		mt1.start();
		
		MyThread2 mt2 = new MyThread2(2);
		mt2.setPriority(Thread.MAX_PRIORITY);
		mt2.start();

	}
	

}
