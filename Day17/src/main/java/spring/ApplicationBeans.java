/**
 * 
 */
package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */

@Configuration
public class ApplicationBeans {

	@Bean (name = "person3")
	public Person getPerson() {
		Person  person = new Person();
		person.setPersonID(1001);
		person.setPersonName("HOHO");
		person.setPersonAge(20);
		return person;
	}
}
