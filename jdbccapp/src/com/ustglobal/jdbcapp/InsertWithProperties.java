package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class InsertWithProperties {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = prop.getProperty("url");
			
			con = DriverManager.getConnection(url,prop);
			
			pstmt = con.prepareStatement(prop.getProperty("insert-query"));
			
			System.out.println("Enter id!!!");
			int id = kb.nextInt();
			
			pstmt.setInt(1, id);
			
			System.out.println("enter ur name !!!");
			String name = kb.next();
			pstmt.setString(2, name);
			
			System.out.println("enter salary!!");
			int sal = kb.nextInt();
			pstmt.setInt(3, sal);
			
			System.out.println("enter gender!!!");
			String gender = kb.next();
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " rows affected");
			
			
			
		}catch(Exception e ) {
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
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
