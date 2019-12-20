package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateWithProperty {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("update-query");

			con = DriverManager.getConnection(url,prop);

			pstmt = con.prepareStatement(sql);

			String emp_id = args[0];
			int id = Integer.parseInt(emp_id);


			String name = args[1];


			String emp_sal = args[2];
			int sal = Integer.parseInt(emp_sal);


			String gender = args[3];

			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);

			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(S) affected");



		}catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
