package com.demo.service;

import com.demo.dao.*;

public class ForgotPassServiceImpl implements ForgotPassService{
		LoginDao fsdao = new LoginDaoImpl();
		

	@Override
	public void changePass(String newPass, String email) {
		fsdao.editPass(newPass,email);
		
	}

}
