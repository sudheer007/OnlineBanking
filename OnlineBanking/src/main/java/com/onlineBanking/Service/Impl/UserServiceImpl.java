package com.onlineBanking.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlineBanking.Dao.UserDao;
import com.onlineBanking.Service.UserService;
import com.onlineBanking.entity.UserDetails;

@Component("userService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao UserDao;
	
	
	public void insertUserDetails(UserDetails userDetails) {
		UserDao.insertUserDetails(userDetails);
	}

}
