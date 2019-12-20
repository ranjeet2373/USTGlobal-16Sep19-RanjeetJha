package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class DeleteWithProperty {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			 reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("delete-query");
			
			con = DriverManager.getConnection(url,prop);
			
			pstmt = con.prepareStatement(sql);
			
			System.out.println("Enter ID which u want to delete !!!");
			int id = kb.nextInt();
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			System.out.println(count +" Row(s) deleted");
			
			
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
