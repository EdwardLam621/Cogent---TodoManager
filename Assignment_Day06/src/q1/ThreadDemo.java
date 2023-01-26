/**
 * 
 */
package q1;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class ThreadDemo {

	MyThread t1, t2;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.t1 = new MyThread(1);
		td.t2 = new MyThread(2);
		
		td.t1.start();
		td.t2.start();
	}

}
