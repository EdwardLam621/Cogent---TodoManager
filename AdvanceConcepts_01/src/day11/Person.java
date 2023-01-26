/**
 * 
 */
package day11;

/**
 * @author : Edward Lam
 * @date   : 2023-01-21
 */
public class Person implements Drawable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.draw();
		p.drawInQuotes();
		

	}
	
	public void draw() {
		
		//call super class method
		Drawable.super.draw();
		
		
		System.out.println("The person's class draw method");
	}
	
	public boolean hasBeenDrawn() {
		return true;
	}

}
