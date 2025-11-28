package com.demo.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.*;

import com.demo.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	static Connection conn;
	static PreparedStatement insEmp;
	static PreparedStatement disEmp,findById,delById;
	static {
		try {
			conn = DBUtil.getMyConnection();
			insEmp = conn.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			disEmp = conn.prepareStatement("select * from employee");
			findById = conn.prepareStatement("select * from employee where empno = ?");
			delById = conn.prepareStatement("delete from employee where empno = ?");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public boolean save(Employee e) {
		
		try {
			insEmp.setInt(1, e.getEmpno());
			insEmp.setString(2, e.getEname());
			insEmp.setString(3, e.getGender());
			insEmp.setString(4,e.getJob());
			insEmp.setDate(5, java.sql.Date.valueOf(e.getHdate()));
			insEmp.setDouble(6, e.getSal());
			int n = insEmp.executeUpdate();
			return n>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
		
		
	}


	@Override
	public List<Employee> showEmployee() {
		
		List<Employee> emp = new ArrayList<>();
		
		try {
			ResultSet rs = disEmp.executeQuery();
			
			while(rs.next()){
				emp.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5).toLocalDate(),rs.getDouble(6)));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(emp.size()>0) {
			return emp;
		}
		else {
			return null;
		}
		
	}


	@Override
	public Employee searchById(int empId) {
		Employee e = null;
		try {
			findById.setInt(1, empId);
			ResultSet rs = findById.executeQuery();
			
			if(rs.next()) {
				e = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5).toLocalDate(),rs.getDouble(6));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
		
	}


	@Override
	public boolean removeById(int empId) {
		int n;
		try {
			delById.setInt(1, empId);
			
			 n = delById.executeUpdate();
			 if(n>0) {
					return true;
				}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return false;
		
		
	}


	@Override
	public boolean updateById(int empNo, String ename, double sal) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
