/**
 * 
 */
package q4;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Printer extends Thread{
	
	Storage s;
	
	@Override
	public void run() {
		{
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + s.getI());
			}
		}
	}

	/**
	 * @param s
	 */
	public Printer(Storage s) {
		super();
		this.s = s;
	}
	
	
}
