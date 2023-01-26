/**
 * 
 */
package Q1;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Instrument[] arr = new Instrument[10];
		
		arr[0] = new Piano();
		arr[1] = new Guitar();
		arr[2] = new Flute();
		arr[3] = new Flute();
		arr[4] = new Piano();
		arr[5] = new Guitar();
		arr[6] = new Piano();
		arr[7] = new Guitar();
		arr[8] = new Flute();
		arr[9] = new Piano();
		
		//polymorphic behavior
		for(int i = 0; i < arr.length; i++) {
			arr[i].play();
		}
		
		
		// instance of operator
		String p = "Piano: ";
		String f = "Flute; ";
		String g = "Guitar: ";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Piano) {
				p += i + " ";
			} else if (arr[i] instanceof Flute) {
				f += i + " ";
			} else {
				g += i + " ";
			}
		}
		
		System.out.println(p);
		System.out.println(f);
		System.out.println(g);
	}

}
