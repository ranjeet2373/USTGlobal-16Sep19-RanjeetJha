package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MyFirstJDBC {
	
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			con =DriverManager.getConnection(url);
			stmt = con.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("*******************");
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
