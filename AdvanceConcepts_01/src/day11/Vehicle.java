/**
 * 
 */
package day11;

/**
 * @author : Edward Lam
 * @date   : 2023-01-21
 */
public interface Vehicle {

	
	String getBrand();
	String speedUp();
	String slowDown();
	
	// default methods
	default String turnAlarmOn() {
		return "Turning the vehicle alarm on";
	}
	
	default String turnAlarmOff() {
		return "Turning the vehicle alarm off";
	}
}
