package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.MyUser;
import com.demo.bean.NewUser;

public class LoginDaoImpl implements LoginDao{
	
	static Connection conn = null;
	
	static {
		conn = DBUtil.getMyConnection();
	}

	@Override
	public MyUser checkUser(String uname, String password) {
		try {
			PreparedStatement selUser = conn.prepareStatement("select uname,email,role from user where uname = ? and password = ?");
			selUser.setString(1, uname);
			selUser.setString(2, password);
			ResultSet rs = selUser.executeQuery();
			
			if(rs.next()) {
				MyUser u = new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
				return u;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Boolean saveUser(NewUser u) {
		try {
			PreparedStatement insUser = conn.prepareStatement("INSERT INTO user (uname, email, role, password, address, DOB, Hobbies, location, gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
			insUser.setString(1,u.getUname());
			insUser.setString(2, u.getEmail());
	        insUser.setString(3, u.getRole());
	        insUser.setString(4, u.getPass());
	        insUser.setString(5, u.getAddress());
	        insUser.setDate(6, u.getDob() != null ? java.sql.Date.valueOf(u.getDob()) : null);
	        insUser.setString(7, u.getHobbies());
	        insUser.setString(8, u.getLocations());
	        insUser.setString(9, u.getGender());
	        
	       
	        
	        
	        int n = insUser.executeUpdate();
	        if(n>0) {
	        	return true;
	        }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	

}
