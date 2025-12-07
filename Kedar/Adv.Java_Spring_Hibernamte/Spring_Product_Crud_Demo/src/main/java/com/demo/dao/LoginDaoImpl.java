package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public MyUser authenticate(String uname, String pass) {

		try {
			MyUser u = jdbctemplate.queryForObject("select * from user where uname = ? and password = ?",
					 new Object[] {uname,pass},BeanPropertyRowMapper.newInstance(MyUser.class));
						System.out.println(u);
						return u;
		} catch (EmptyResultDataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	

}
