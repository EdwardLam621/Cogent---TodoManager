package q1.com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import q1.com.example.demo.entity.Employee;

@SpringBootApplication
public class SpringBootAssessmentApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee e =(Employee) context.getBean("employee"),
				e2 = (Employee) context.getBean("employee2");
		
		System.out.println("Employee ID: " + e.getEmpId());
		System.out.println("Employee Name: " + e.getEmpName());
		System.out.println("Employee Salary: " + e.getEmpSal());
		
		System.out.println();
		
		System.out.println("Employee ID: " + e2.getEmpId());
		System.out.println("Employee Name: " + e2.getEmpName());
		System.out.println("Employee Salary: " + e2.getEmpSal());
	}

}
