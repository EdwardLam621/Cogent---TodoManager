/**
 * 
 */
package q3_runnable;

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
		
		Thread t1 = new Thread(mt1);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		Thread t2 = new Thread(mt2);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		mt1.run();
		mt2.run();

	}

}
