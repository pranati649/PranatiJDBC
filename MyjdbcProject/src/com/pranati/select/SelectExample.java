package com.pranati.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // load the driver
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "miki"); // establish
																													// the
																													// connection
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from BplCustomer");
			while (rs.next()) {
				int a = rs.getInt(1); // 1,2,3 is called column index
										// insted of column index you can give
										// column name
				String s = rs.getString(2);
				float c = rs.getFloat(3);
				System.out.println(a + "  " + s + "  " + c);
			}

			st.close();
			rs.close();
			con.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
