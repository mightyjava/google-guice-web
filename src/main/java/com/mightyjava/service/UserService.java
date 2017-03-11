package com.mightyjava.service;

import com.google.inject.ImplementedBy;
import com.mightyjava.service.impl.UserServiceImpl;

@ImplementedBy(UserServiceImpl.class)
public interface UserService {
	String authenticate(String userName, String password);
}
