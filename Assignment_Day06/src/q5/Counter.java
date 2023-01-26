/**
 * 
 */
package q5;


/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Counter implements Runnable{

	Storage s;
	
	public Counter(Storage store) {
		s = store;
		new Thread(this, "Counter").start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (s) {
				s.setI(i);
				s.notify();
				try {
					s.wait();
				} catch (InterruptedException ie) {
					System.err.println("Interrupted - " + ie.getMessage());
				}
			}
		}

	}
	
	
	
	
}

