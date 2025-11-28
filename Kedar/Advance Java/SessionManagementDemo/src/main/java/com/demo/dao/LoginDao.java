package com.demo.dao;

import com.demo.bean.MyUser;
import com.demo.bean.NewUser;

public interface LoginDao {

	MyUser checkUser(String uname, String password);

	Boolean saveUser(NewUser user);

}
