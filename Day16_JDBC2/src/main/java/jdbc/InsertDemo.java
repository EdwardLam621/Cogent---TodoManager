/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-30
 */
public class InsertDemo {

	private static String Insert_Employee_SQL = "insert into employee" + "(id,name,salary) values" + "(?,?,?);";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InsertDemo demo = new InsertDemo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee ID: ");
		int eid = sc.nextInt();
		System.out.println("Employee Name: ");
		String eName = sc.next();
		System.out.println("Employee Salary: ");
		int sal = sc.nextInt();
		
		demo.insertRecord(eid, eName, sal);
		sc.close();

	}
	
	
	public void insertRecord(int empNo, String empName, int empSal) {
		try  {
			Connection connection = JDBCUtils.getConnection();
			System.out.println(Insert_Employee_SQL);
			PreparedStatement ps = connection.prepareStatement(Insert_Employee_SQL);
			
			ps.setInt(1, empNo);
			ps.setString(2, empName);
			ps.setInt(3, empSal);
			int count = ps.executeUpdate();
			
			if(count > 0) {
				System.out.println("New record created");
			} else {
				System.out.println("Failed");
			}
			
			connection.close();
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
