package com.ordering.service;

import java.util.List;

import com.ordering.po.User;
import com.ordering.po.UserExample;

public interface UserService {
	void insert(User user);

	boolean check(String username);
	
	public User selectByExample(User user);
}
