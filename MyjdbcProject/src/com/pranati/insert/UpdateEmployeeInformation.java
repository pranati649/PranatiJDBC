package com.pranati.insert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmployeeInformation {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // load the driver
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "miki"); // establish
																													// the
																													// connection
			Statement st = con.createStatement();
			st.execute("update faculty set name='prakash' where faculty_id=11");

			st.close();
			con.close();
			System.out.println("updated successfully");
		} 
		catch (Exception  ex)
		{
			ex.printStackTrace();
		}
		

	}

}
