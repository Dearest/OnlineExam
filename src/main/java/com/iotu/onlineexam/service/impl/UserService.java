package com.iotu.onlineexam.service.impl;

import com.iotu.onlineexam.dao.IUserDAO;
import com.iotu.onlineexam.service.IUserService;

public class UserService implements IUserService{
	private IUserDAO userDAO;
	
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
