package com.esisa.jee.struts.business;

import java.util.List;
import java.util.Vector;

import com.esisa.jee.struts.models.User;

public class UserServiceDefault implements UserService{
	private List<User> users;
	private static UserService userService = new UserServiceDefault();
	
	public UserServiceDefault() {
		users=new Vector<>();
	}

	public boolean add(User user) {
		users.add(user);
		return true;
	}

	public List<User> list() {
		return users;
	}

	public static UserService getDefaultUserService() {
		return userService;
	}

	
}
