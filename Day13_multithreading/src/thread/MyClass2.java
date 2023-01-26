/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
class MyClass2 extends Thread{

	@Override
	public void start() {

		for(int i = 0; i < 10; i++) {
			System.out.print("Hi I am thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}

