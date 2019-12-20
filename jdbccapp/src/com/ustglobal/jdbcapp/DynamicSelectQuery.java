package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where name  = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step2 get the connection
			con = DriverManager.getConnection(url);
			
			//step 3  Issue sql query
			
			pstmt = con.prepareStatement(sql);
			
			String empname = args[0];
//			int id = Integer.parseInt(empid);
			pstmt.setString(1, empname);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int emp_id1 = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("ID is "+emp_id1);
				System.out.println("Name is "+name);
				System.out.println("Gender is "+gender);
				System.out.println("Salary is "+sal);
				System.out.println("***************");
			}
			
			
			
		}catch (SQLException e) {
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
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
