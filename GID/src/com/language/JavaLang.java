/**
 * 
 */
package com.language;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */
public class JavaLang extends Thread implements Language {

	@Override
	public void showMessage() {
		System.out.println("Java Language @ " + this.getName() + " is running");
		
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			showMessage();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
