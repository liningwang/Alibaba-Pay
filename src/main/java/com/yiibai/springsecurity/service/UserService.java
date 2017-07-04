package com.yiibai.springsecurity.service;

import com.yiibai.springsecurity.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}