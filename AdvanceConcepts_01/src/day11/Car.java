/**
 * 
 */
package day11;

/**
 * @author : Edward Lam
 * @date   : 2023-01-21
 */
public class Car implements Vehicle {

	String brand;

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Speeding up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Slowing down";
	}

	/**
	 * @param brand
	 */
	public Car(String brand) {
		super();
		this.brand = brand;
		
	}
	
	public String turnAlarmOn() {
		return brand;
		
	}
	
	
	public static void main(String[] args) {
		Vehicle car = new Car("BMW");
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlarmOff());
		System.out.println(car.turnAlarmOn());
	}
	
	
	
}
