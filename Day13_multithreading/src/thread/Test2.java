/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
public class Test2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args){


		MyClass2 mc = new MyClass2();
		
		mc.start(); //checked
		
		for(int i = 0; i < 10; i++) {
			
			
			try {
				System.out.println("MAIN HERE");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
