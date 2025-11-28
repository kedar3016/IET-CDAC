package com.demo.service;

import com.demo.bean.MyUser;

public interface LoginService {

	MyUser validateUser(String uname, String pass);

}
