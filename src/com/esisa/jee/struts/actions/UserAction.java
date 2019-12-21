package com.esisa.jee.struts.actions;

import java.util.List;

import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.esisa.jee.struts.business.UserService;
import com.esisa.jee.struts.business.UserServiceDefault;
import com.esisa.jee.struts.models.User;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction implements ModelDriven<User>{
	private UserService userService;
	private User user;
	private String error;
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}

	public UserAction() {
		userService=UserServiceDefault.getDefaultUserService();
		user = new User();
	}
	
	public String add() {
		System.out.println(">> addUser() : " + user);
		boolean result=userService.add(user);
		if(result==false) {
			error="Ajout d'user impossible (id déjà existant)";
			return "error";
		}
		else {
			return "ok";
		}
	}

	public String list() {
		users=userService.list();
		
		return "ok";
	}
	
	public User getModel() {
		return user;
	}

}
