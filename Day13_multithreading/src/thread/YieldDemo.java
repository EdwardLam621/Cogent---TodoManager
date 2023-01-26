/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class YieldDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldDemo_MyThread mt = new YieldDemo_MyThread();
		mt.start();
		for(int i = 0; i <= 10; i++) {
			System.out.println("Main thread");
			
			//yield() will interrupt "this" thread (main in this case) 
			//and yield child thread be executed
			Thread.yield(); 
			
		}
	}

}
