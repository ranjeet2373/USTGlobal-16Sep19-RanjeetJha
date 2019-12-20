package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con =DriverManager.getConnection(url);
			
			String sql = "update employee_info set name=?,gender = ?,sal =? where id =?";
			pstmt = con.prepareStatement(sql);
			
			String id = args[0];
			int empid = Integer.parseInt(id);
			
			String name = args[1];
			
			String sal =args[2];
			int emp_sal = Integer.parseInt(sal);
			
			String gender = args[3];
			
			pstmt.setInt(4, empid);
			pstmt.setString(1, name);
			pstmt.setString(2, gender);
			pstmt.setInt(3, emp_sal);
 			
			int count = pstmt.executeUpdate();
			System.out.println(count + " row(S) effected");
			
			
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
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
