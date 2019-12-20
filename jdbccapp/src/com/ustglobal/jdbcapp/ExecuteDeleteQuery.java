package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			
			String sql = "delete from employee_info where id = 1";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count +" Row(s) effected");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
				
			}
		}
	}
}
	


