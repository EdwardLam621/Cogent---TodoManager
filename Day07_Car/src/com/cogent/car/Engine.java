/**
 * 
 */
package com.cogent.car;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Engine {
	
	private String engineModel;
	
	/**
	 * @return the engineModel
	 */
	public String getEngineModel() {
		return engineModel;
	}

	/**
	 * @param engineModel the engineModel to set
	 */
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}

	Engine(String engineModel){
		this.engineModel = engineModel;
	}
	
	public void start(){
		System.out.println("Engine " + engineModel + " started");
	}
	
	public void stop(){
		System.out.println("Engine " + engineModel + " stopped");
	}
}
