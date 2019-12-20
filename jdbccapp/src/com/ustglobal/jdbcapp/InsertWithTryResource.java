package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class InsertWithTryResource {
	
	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url =prop.getProperty("url");
			String sql = prop.getProperty("insert-query");
			try(Connection con = DriverManager.getConnection(url,prop);
					PreparedStatement pstmt =con.prepareStatement(sql);
					Scanner sc = new Scanner(System.in)){
				System.out.println("Enter id!!");
				int id = sc.nextInt();
				pstmt.setInt(1, id);
				
				System.out.println("Enter ur name!! ");
				String name = sc.next();
				pstmt.setString(2, name);
				
				System.out.println("Enter ur salary!!!");
				int sal = sc.nextInt();
				pstmt.setInt(3, sal);
				System.out.println("Enter ur gender!!!");
				String gender = sc.next();
				pstmt.setString(4, gender);
				
				int count = pstmt.executeUpdate();
				System.out.println(count + " Row(s) affected");
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
