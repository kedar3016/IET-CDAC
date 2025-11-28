package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class TestCallableStatement {
		
	public static void main(String [] arg) {
		
		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url = "jdbc:mysql://192.168.10.117:3306/dac32?useSSL = false";
			
			conn = DriverManager.getConnection(url,"dac32","welcome");
			
			CallableStatement cst = (CallableStatement) conn.prepareCall("call getcnt(?,?)");
			cst.setInt(1, 10);
			
			cst.registerOutParameter(2, java.sql.Types.INTEGER);
			cst.execute();
			
			int cnt = cst.getInt(2);
			System.out.println("count : "+cnt);
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
