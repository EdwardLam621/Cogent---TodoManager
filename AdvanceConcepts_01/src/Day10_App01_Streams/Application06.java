/**
 * 
 */
package Day10_App01_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//serialization and deserialization

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Application06 {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		FileInputStream fis;
		ObjectInputStream ois;
		
		String path = "C:/Users/edward/Desktop/CogentU/emp.ser";
		
		try {
			
			Employee e = new Employee(1001, "Name", 1000);
			
			// serialization
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			
			System.out.println("Employee object serialized Successfully");
			
			//de-serialization
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			Employee emp = (Employee) o;
			System.out.println("Employee ID: " + emp.id);
			System.out.println("Employee Name: " + emp.name);
			System.out.println("Employee Salary: " + emp.salary);
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
