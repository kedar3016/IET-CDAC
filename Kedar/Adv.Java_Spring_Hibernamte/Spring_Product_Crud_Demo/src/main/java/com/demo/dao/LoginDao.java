package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser authenticate(String uname, String pass);

}
