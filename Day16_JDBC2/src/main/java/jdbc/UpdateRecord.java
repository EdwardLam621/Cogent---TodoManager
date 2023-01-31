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
public class UpdateRecord {

	/**
	 * @param args
	 */
	
	private static String Update_Employee_SQL = "update employee set name = ? where id = ?;";
	public static void main(String[] args) {
		UpdateRecord demo = new UpdateRecord();		

		Scanner sc = new Scanner(System.in);
		System.out.println("Employee ID: ");
		int eid = sc.nextInt();
		System.out.println("Employee Name: ");
		String eName = sc.next();
		demo.updateRecord(eid,eName);
		sc.close();

	}
	
	public void updateRecord(int empNo, String empName) {
		try  {
			Connection connection = JDBCUtils.getConnection();
			System.out.println(Update_Employee_SQL);
			PreparedStatement ps = connection.prepareStatement(Update_Employee_SQL);
			
			ps.setString(1, empName);
			ps.setInt(2, empNo);
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
