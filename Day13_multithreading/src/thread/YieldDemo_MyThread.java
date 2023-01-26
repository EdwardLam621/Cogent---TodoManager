/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class YieldDemo_MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

}
