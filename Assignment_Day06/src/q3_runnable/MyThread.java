/**
 * 
 */
package q3_runnable;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class MyThread extends B implements Runnable{

	int code;
	
	/**
	 * @param i
	 */

	
	

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print("Hi I am thread " + code + "\n");
		}
		
	}

	/**
	 * @param code
	 */
	public MyThread(int code) {
		super();
		this.code = code;
	}

}

class B{
	
}
