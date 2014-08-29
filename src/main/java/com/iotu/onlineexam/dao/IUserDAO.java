package com.iotu.onlineexam.dao;

import com.iotu.onlineexam.entity.User;

/**
 * 用户层操作接口
 * 
 * @author 603_02
 *
 */
public interface IUserDAO {
	
	/**
	 * 通过用户名和密码查询用户
	 * @param user 用户对象
	 * @return 用户存在则返回用户对象，不存在则返回null
	 * @throws Exception
	 */
	public User selectUserByNameAndPwd(User user) throws Exception;
}
