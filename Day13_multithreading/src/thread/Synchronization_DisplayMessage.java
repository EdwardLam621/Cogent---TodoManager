/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Synchronization_DisplayMessage {

	/**
	 * @param name
	 */
	public synchronized void sayHello(String name) {
		for(int i = 1; i <= 10; i ++) {
			System.out.println("HELLO " + name);			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
