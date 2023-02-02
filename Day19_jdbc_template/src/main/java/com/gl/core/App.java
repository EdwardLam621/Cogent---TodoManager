package com.gl.core;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.employee.dao.EmployeeDAO;
import com.gl.employee.model.Employee;

public class App
{
	static int EmployeeID = 0;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		App app = new App();
		int choice = 0;
		do {
			app.menu();
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				app.createEmployee();
				break;
			case 2:
				app.updateEmployee();
				break;
			case 3:
				app.deleteEmployee();
				break;
			case 4:
				app.showAllEmployee();
				break;			
			}
		}while(choice != 5);
		
		
	}
	
	
	public void menu() {
		System.out.println("Menu:");
		System.out.println("1-Create Employee");
		System.out.println("2-Update Employee");
		System.out.println("3-Delete Employee");
		System.out.println("4-Show All Employee");
		System.out.println("5-Exit;");
	}
	
	
	private void createEmployee() {
		System.out.println("Enter Employee Name");
		String EmpName = sc.next();
		System.out.println("Enter Employee Age");
		int EmpAge = sc.nextInt();
		System.out.println("Enter Employee Salary");
		int EmpSalary = sc.nextInt();
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context
				.getBean("employeeDAO");
		Employee employee = new Employee(EmployeeID + 1, EmpName, EmpAge, EmpSalary);
		employeeDAO.insert(employee);
		System.out.println("Employee record inserted successfully.");
	}
	
	private void updateEmployee() {
		System.out.println("Enter Employee ID");
		int EmpID = sc.nextInt();
		System.out.println("Enter Name to be updated:");
		String newEmpName = sc.next();
		System.out.println("Enter Age to be updated:");
		int newEmpAge = sc.nextInt();
		System.out.println("Enter Salary to be updated:");
		int newEmpSalary = sc.nextInt();
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context
				.getBean("employeeDAO");
		Employee employee = new Employee(EmpID, newEmpName, newEmpAge, newEmpSalary);
		employeeDAO.update(employee);
		System.out.println("Employee record updated Successfully.");
		

		
	}
	
	private void deleteEmployee() {
		System.out.println("Enter Employee ID");
		int EmpID = sc.nextInt();
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context
				.getBean("employeeDAO");
		
		employeeDAO.delete(EmpID);
	
	}
	
	private void showAllEmployee(){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context
				.getBean("employeeDAO");
		
		employeeDAO.read();
	}
}
