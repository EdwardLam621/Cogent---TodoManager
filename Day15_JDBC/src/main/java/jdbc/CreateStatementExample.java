/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author : Edward Lam
 * @date   : 2023-01-28
 */
public class CreateStatementExample {
	
	private static final String createTableSQL = "create table users(\r\n" + " id int(3) primary key, \r\n"
													+ " name varchar(20),\r\n" + " email varchar(20),\r\n" + " country varchar(20),\r\n"
													+ " password varchar(20)\r\n" + " );";
	
	public static void main(String[] args) {
		CreateStatementExample cse = new CreateStatementExample();
		cse.createTable();
	}
	
	public void createTable() {
		System.out.println(createTableSQL);
		try{
			Connection connection = JDBCUtils.getConnection();
			Statement statement = connection.createStatement();
			statement.execute(createTableSQL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
