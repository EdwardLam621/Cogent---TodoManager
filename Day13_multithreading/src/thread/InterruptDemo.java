/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class InterruptDemo extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterruptDemo_MyThread mt = new InterruptDemo_MyThread();
		mt.start();
		mt.interrupt();
		System.out.println("End of the main thread");
	}

}
