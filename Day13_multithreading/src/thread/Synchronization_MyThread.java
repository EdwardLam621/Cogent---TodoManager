/**
 * 
 */
package thread;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Synchronization_MyThread extends Thread {
	
	
	Synchronization_DisplayMessage dm;
	String name;
	Synchronization_MyThread(Synchronization_DisplayMessage dm, String name){
		this.dm = dm;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		dm.sayHello(name);
		
	}

}
