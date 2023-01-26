/**
 * 
 */
package q4;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Counter extends Thread{

	Storage s;
	
	public void run() {
		{
			for(int i = 0; i < 10; i++) {
				s.setI(i);
	
			}
		}

	}

	/**
	 * @param s
	 */
	public Counter(Storage s) {
		super();
		this.s = s;
	}
	
	
	
	
}

