/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class MultiThreaded extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreaded mt = new MultiThreaded();
		mt.setPriority(MAX_PRIORITY);
		
		mt.start();
		
		MultiThreaded mt2 = new MultiThreaded();
		mt2.setPriority(MIN_PRIORITY);
		
		mt2.start();

	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Thread name: " + Thread.currentThread().getName() + " " + i);
		}
		
	}

}
