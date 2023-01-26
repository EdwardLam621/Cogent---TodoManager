/**
 * 
 */
package q1_printThreadName;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class MyThread implements Runnable{

	int code;
	
	/**
	 * @param i
	 */
	public MyThread(int code) {
		super();
		this.code = code;
	}



	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print("Thread name: " + Thread.currentThread().getName() + "\n");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
