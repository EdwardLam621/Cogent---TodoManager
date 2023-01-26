/**
 * 
 */
package com.cogent.day05;

/**
 * @author : Edward Lam
 * @date   : 2023-01-14
 */
public class GarbageCollectionDemo {

	int objID;
	
	public GarbageCollectionDemo(int objID){
		this.objID = objID;
		System.out.println("created " + this.objID);
	}
	
	public static void main(String[] args) {
		//new GarbageCollectionDemo(1);
		//new GarbageCollectionDemo(2);
		
//		for(int i = 0; i < 100; i++) {
//			new GarbageCollectionDemo(i);
//			System.gc();
//		}
		
		for(int i = 0; i < 1000000; i++) {
			new GarbageCollectionDemo(i);
		}
	}
	
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Finalized " + objID);
	}
}
