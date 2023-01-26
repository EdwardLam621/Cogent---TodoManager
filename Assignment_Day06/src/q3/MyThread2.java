/**
 * 
 */
package q3;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class MyThread2 extends Thread{

	int code;
	
	/**
	 * @param i
	 */

	
	

	@Override
	public void start() {
		for(int i = 0; i < 100; i++) {
			System.out.print("Hi I am thread " + code + "\n");
		}
		
	}

	/**
	 * @param code
	 */
	public MyThread2(int code) {
		super();
		this.code = code;
	}
}
