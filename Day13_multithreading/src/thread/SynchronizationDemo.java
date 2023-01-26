/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class SynchronizationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Synchronization_DisplayMessage dm = new Synchronization_DisplayMessage();
		
		Synchronization_MyThread t1 = new Synchronization_MyThread(dm, "Start t1");
		Synchronization_MyThread t2 = new Synchronization_MyThread(dm, "start t2");
		
		t1.start();
		t2.start();

	}

}
