package com.iotu.onlineexam.dao.impl;

import org.hibernate.SessionFactory;

import com.iotu.onlineexam.dao.IUserDAO;
import com.iotu.onlineexam.entity.User;

/**
 * 用户层访问接口实现类
 * @author 603_02
 *
 */
public class UserDAOImpl implements IUserDAO {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public User selectUserByNameAndPwd(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
