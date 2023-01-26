/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class InterThreadCommDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		InterThreadComm_MyThread t = new InterThreadComm_MyThread();
		
		t.start();
		
		synchronized(t) {
			System.out.println("wait");
			t.wait(1000);
			System.out.println("Notified");;
			System.out.println(t.total);
			
		}
	}

}
