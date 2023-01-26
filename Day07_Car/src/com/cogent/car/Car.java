/**
 * 
 */
package com.cogent.car;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Car {
	private Engine engine;
	private MusicSystem musicSystem;
	
	public Car(Engine e) {
		this.engine = e;
	}
	
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	/**
	 * @return the musicSystem
	 */
	public MusicSystem getMusicSystem() {
		return musicSystem;
	}
	/**
	 * @param musicSystem the musicSystem to set
	 */
	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}
	
	public void showMusicSystem() {
		System.out.println("Music System ID: " + musicSystem.getId());
		System.out.println("Music System Manufacturer: " + musicSystem.getType());
	}
	
	
	public void start() {
		System.out.println("Starting car..");
		engine.start();
	}
	
	public void stop() {
		System.out.println("Stopping car..");
		engine.stop();
	}
	
}
