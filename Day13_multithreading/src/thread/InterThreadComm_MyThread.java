/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class InterThreadComm_MyThread extends Thread{

	int total;
	
	@Override
	public void run() {
		System.out.println("Child thread is calculating the sum:");
		
		synchronized(this) {
			for(int i = 1; i < 100; i++) {
				total += i;
			}
			notify();
		}
		
		
	}
}
