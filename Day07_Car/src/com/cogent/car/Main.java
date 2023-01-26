/**
 * 
 */
package com.cogent.car;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//professor code
		//Car c = new Car();
		//c.setEngine(new Engine("Type - ABC"));
		
		//for easier explanation, car should have a constructor car(Engine e)
		// to explain engine object is a must for a car;
		Car c = new Car(new Engine("Type - ABC"));
		
		MusicSystem ms = new MusicSystem();
		ms.setId(1000);
		ms.setType("BOSE");
		
		c.setMusicSystem(ms);
		
		c.start();
		c.showMusicSystem();
		c.stop();

	}

}
