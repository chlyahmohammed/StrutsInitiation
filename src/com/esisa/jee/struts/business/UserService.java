package com.esisa.jee.struts.business;

import java.util.List;

import com.esisa.jee.struts.models.User;

public interface UserService {
	public boolean add(User user);
	public List<User> list();
	
}
