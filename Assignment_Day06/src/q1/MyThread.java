/**
 * 
 */
package q1;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class MyThread extends Thread{

	int code;
	
	/**
	 * @param i
	 */

	
	

	@Override
	public void start() {
		for(int i = 0; i < 10; i++) {
			System.out.print("Hi I am thread " + code + "\n");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
