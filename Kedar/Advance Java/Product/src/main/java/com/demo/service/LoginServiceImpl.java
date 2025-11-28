package com.demo.service;

import com.demo.bean.MyUser;
import com.demo.dao.*;

public class LoginServiceImpl implements LoginService {
	LoginDao ldao = new LoginDaoImpl();
	@Override
	public MyUser validateUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return ldao.checkUser(uname,pass);
	}

}
