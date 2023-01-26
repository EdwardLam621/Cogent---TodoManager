/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-25
 */
class MyClass extends B implements Runnable{

	@Override
	public void run() {

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

class B{
	
}
