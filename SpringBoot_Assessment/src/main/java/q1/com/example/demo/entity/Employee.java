/**
 * 
 */
package q1.com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Edward Lam
 * @date   : 2023-02-09
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {

	@Id
	String empId, empName, empSal;
	
	
}
