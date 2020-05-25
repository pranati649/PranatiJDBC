package com.pranati.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployeeInformation {

	public static void main(String[] args) 
	{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // load the driver
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","miki"); // establish the connection
			Statement st=con.createStatement();
			st.execute("insert into faculty values(1000,'Saswati',200,'poor')");
			st.close();
			con.close();
			System.out.println("inserted successfully");
			
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



// load the driver
