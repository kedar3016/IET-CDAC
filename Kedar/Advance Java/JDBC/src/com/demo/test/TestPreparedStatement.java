package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPreparedStatement {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			
			String url = "jdbc:mysql://192.168.10.117:3306/dac32?useSSL = false";
			conn = DriverManager.getConnection(url,"dac32","welcome");
			
			if(conn != null) {
				System.out.println("Connection Done");	
			}
			else {
				System.out.println("Connection Not Done");	
			}
			
			
			PreparedStatement pst = conn.prepareStatement("select * from ord1");
			
			ResultSet rs = pst.executeQuery(); 
			
			while(rs.next()) {
				System.out.println("==============Order Details=============");
				System.out.println("Order Id : "+rs.getInt(1));
				System.out.println("Order Date : "+rs.getDate(2));
				System.out.println("Commision Plan : "+rs.getString(3));
				System.out.println("Customer Id : "+rs.getInt(4));
				System.out.println("Ship Date : "+rs.getDate(5));
				System.out.println("Status : "+rs.getString(6));
				System.out.println("Total : "+rs.getFloat(7));
				System.out.println("========================================\n\n");
			}
			
			
			PreparedStatement pst1 = conn.prepareStatement("insert into ord1 values(?,?,?,?,?,?,?)");
			
			int ordId = 102;
			LocalDate ordDate = LocalDate.now();
			String oDate = ordDate.toString();
			String comm = "A";
			int custId = 21;
			String shipDate = "2025-11-21";
//			String actualSDate = "2025-11-22";
//			String statusDate = "2025-11-25";
			String status = "shiped";
			double total = 450.89;
			
			pst1.setInt(1, ordId);
			pst1.setDate(2, java.sql.Date.valueOf(ordDate));
			pst1.setString(3,comm);
			pst1.setInt(4, custId);
			pst1.setString(5,shipDate);
			pst1.setString(6,status);
			pst1.setDouble(7, total);
			
			pst1.executeUpdate();
			

			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		

	}

}
