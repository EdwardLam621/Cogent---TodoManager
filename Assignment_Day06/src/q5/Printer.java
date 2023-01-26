/**
 * 
 */
package q5;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Printer implements Runnable{
	
	Storage s;
	
	public Printer(Storage s) {
		this.s = s;
		new Thread(this, "Printer").start();
	}

	@Override
	public void run() {
		int counter = 0;
		synchronized (s) {
			while (counter < 9) {
				try {
					s.wait();
				} catch (InterruptedException ie) {
					System.err.println("Interrupted - " + ie.getMessage());
				}
				System.out.println(Thread.currentThread().getName() + " " + (counter = s.getI()));
				s.notify();
			}
		}
	}
	
	
}
