/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		MyClass mc = new MyClass();
		
		Thread th = new Thread(mc);
		
		for(int i = 0; i < 10; i++) {
			th.start();
			System.out.println("MAIN HERE");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
