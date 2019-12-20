package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDeleteExecution {
	public static void main(String[] args) throws Exception {
		
		Scanner kb = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			con = DriverManager.getConnection(url);
			
			String sql = "delete from employee_info where id = ?";
			
			pstmt  = con.prepareStatement(sql);
			
			System.out.println("Enter id !!!");
			int id = kb.nextInt();
			
			pstmt.setInt(1,id);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " row(s) affected");
		}catch(SQLException e) {
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
			}catch(SQLException e ) {
				e.printStackTrace();
			}
		}
	}

}
