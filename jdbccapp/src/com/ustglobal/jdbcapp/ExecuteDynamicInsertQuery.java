package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteDynamicInsertQuery {
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			con = DriverManager.getConnection(url);
			String sql = "insert into employee_info values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String sal = args[2];
			int empsal = Integer.parseInt(sal);
			pstmt.setInt(3, empsal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			System.out.println(count +" row affected");
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
