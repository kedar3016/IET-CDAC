package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
//import java.sql.*;

public class TestCreateStatement {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.117:3306/dac32?useSSL = false";
			conn = DriverManager.getConnection(url,"dac32","welcome");
			
			if(conn != null) {
				System.out.println("Connection done");
			}else {
				System.out.println("Connection not done");
			}
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from ord");
			
			while(rs.next()) {
				System.out.println("==============Order Details=============");
				System.out.println("Order Id : "+rs.getInt(1));
				System.out.println("Order Date : "+rs.getDate(2));
				System.out.println("Commision Plan : "+rs.getString(3));
				System.out.println("Customer Id : "+rs.getInt(4));
				System.out.println("Ship Date : "+rs.getDate(5));
				System.out.println("Actual Ship Date : "+rs.getDate(6));
				System.out.println("Status Date : "+rs.getDate(7));
				System.out.println("Status : "+rs.getString(8));
				System.out.println("Total : "+rs.getFloat(9));
				System.out.println("========================================\n\n");
			}
			
			
			int ordId = 101;
			LocalDate ordDate = LocalDate.now();
			String oDate = ordDate.toString();
			String comm = "A";
			int custId = 21;
			String shipDate = "2025-11-25";
//			String actualSDate = "2025-11-22";
//			String statusDate = "2025-11-25";
			String status = "shiped";
			double total = 69.69;
			
			
			
			
			
			String query = "insert into ord1 values("+ordId+",'"+oDate+"','"+comm+"',"+custId+",'"+shipDate+"','"+status+"',"+total+")";
			System.out.println(query);
			int n = st.executeUpdate(query);
			
			if(n>0) {
				System.out.println("Insertation Done");
				
			}
			else {
				System.out.println("Error!!");
			}
			
			
			
			
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
