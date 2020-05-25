package com.pranati.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployeeInformation {


	public static void main(String[] args) {
		try {
					Class.forName("oracle.jdbc.driver.OracleDriver"); // load the driver
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","miki"); // establish the connection
					Statement st=con.createStatement();
					st.execute("delete from faculty where name='priyansh'");

					st.close();
					con.close();
					System.out.println("deleted successfully");
					
				} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
	}

}
