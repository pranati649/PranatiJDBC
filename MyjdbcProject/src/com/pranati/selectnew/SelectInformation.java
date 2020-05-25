package com.pranati.selectnew;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectInformation {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","miki");
			Statement st=con.createStatement();
			st.executeUpdate("delete from  emp  where age=21");
			st.close();
			con.close();
			System.out.println("delete successfully");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		

	}

}
