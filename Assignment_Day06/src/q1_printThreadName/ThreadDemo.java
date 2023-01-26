/**
 * 
 */
package q1_printThreadName;

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
		
		
		try {
			System.out.println("Thread name: " + Thread.currentThread().getName());
			mt1.run();
			mt2.run();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}
		

	}

}
