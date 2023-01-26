/**
 * 
 */
package q5;

/**
 * @author : Edward Lam
 * @date   : 2023-01-26
 */
public class Storage {

	int i;

	public synchronized void setI(int i) {
		this.i = i;
	}

	public synchronized int getI() {
		return this.i;
	}	
	
}
