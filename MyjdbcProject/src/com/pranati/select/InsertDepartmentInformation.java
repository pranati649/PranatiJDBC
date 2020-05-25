package com.pranati.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDepartmentInformation {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // load the driver
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "miki"); // establish
																													// the
																													// connection
			Statement st = con.createStatement();
			st.execute("insert into BplCustomer values(4,'siki',28)");

			st.close();
			con.close();
			System.out.println("inserted successfully");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
