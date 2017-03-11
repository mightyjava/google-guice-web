package com.mightyjava.service.impl;

import com.mightyjava.service.UserService;

public class UserServiceImpl implements UserService {

	public String authenticate(String userName, String password) {
		String status = null;
		if(userName.equals("test") && password.equals("test")) {
			status = "Valid";
		} else {
			status = "Invalid";
		}
		return status;
	}

}
