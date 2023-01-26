/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class InterruptDemo_MyThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println("Interrupt Thread");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.err.println("Got interrupted");
			}
		}
		
	}

}
