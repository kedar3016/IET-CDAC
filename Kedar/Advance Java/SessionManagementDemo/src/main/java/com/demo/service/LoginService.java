package com.demo.service;

import com.demo.bean.MyUser;
import com.demo.bean.NewUser;

public interface LoginService {

	MyUser validateUser(String uname, String password);

	Boolean addNewUser(NewUser user);

}
