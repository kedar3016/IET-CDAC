package com.demo.service;

import com.demo.beans.MyUser;

public interface LoginService {

	MyUser ValidateUser(String uname, String pass);

}
