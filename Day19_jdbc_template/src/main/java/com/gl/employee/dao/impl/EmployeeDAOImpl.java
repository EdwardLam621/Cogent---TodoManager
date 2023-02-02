package com.gl.employee.dao.impl;

import java.util.List;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.gl.employee.dao.EmployeeDAO;
import com.gl.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insert(Employee employee)
	{

		String sql = "INSERT INTO EMPLOYEE "
				+ "(EMPLOYEE_ID, EMP_NAME, AGE,SALARY) VALUES (?, ?, ?,?)";

		jdbcTemplate.update(sql,
				new Object[] { employee.getEmployeeId(),
						employee.getName(), employee.getAge(),
						employee.getSalary() });

	}

	public void update(Employee employee) {
		
		String sql = "UPDATE EMPLOYEE SET EMP_NAME = ?, "
					+"Age = ?, SALARY = ? WHERE EMPLOYEE_ID = ?";
		jdbcTemplate.update(sql,
				new Object[] { 
						employee.getName(), employee.getAge(),
						employee.getSalary(), employee.getEmployeeId() });
		
	}

	public void delete(int employeeID) {
		String sql = "DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID = ?";
		jdbcTemplate.update(sql,
				new Object[] { 
						employeeID
						});
		
	}

	public void read() {
		String sql = "select * from employee;";

		List<Employee> employees = jdbcTemplate.query(sql, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
				Employee e = new Employee(
						rs.getInt("EMPLOYEE_ID"),
						rs.getString("EMP_NAME"),
						rs.getInt("AGE"),
						rs.getInt("SALARY"));
				return e;
			}
		});
		System.out.println("EMPLOYEE RECORDS-------");
		for(Employee e: employees) {
			System.out.println(e);
		}
	}
}
