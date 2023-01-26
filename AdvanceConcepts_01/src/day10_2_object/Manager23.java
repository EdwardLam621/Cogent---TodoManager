/**
 * 
 */
package day10_2_object;

import java.util.Objects;

/**
 * @author : Edward Lam
 * @date   : 2023-01-20
 */
public class Manager23 {
	
	
	public static void main(String[] args) {
		
		int i = 10, j = 10;
		
		Person23 p1 = new Person23("ABC",10);
		Person23 p2 = new Person23("ABC",10);
		
		System.out.println(i == j);
		System.out.println(p1 == p2);
	}
	
}

class Person23{
	String name;
	int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person23(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person23 other = (Person23) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}