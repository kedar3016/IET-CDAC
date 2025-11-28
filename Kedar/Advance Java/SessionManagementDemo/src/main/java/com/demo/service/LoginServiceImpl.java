package com.demo.service;

import com.demo.bean.MyUser;
import com.demo.bean.NewUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	LoginDao ldao;
	
	
	public LoginServiceImpl() {
		super();
			
		ldao = new LoginDaoImpl();
	}


	@Override
	public MyUser validateUser(String uname, String password) {
		// TODO Auto-generated method stub
		return ldao.checkUser(uname,password);
	}


	@Override
	public Boolean addNewUser(NewUser user) {
		// TODO Auto-generated method stub
		return ldao.saveUser(user);
	}

}
