package com.bitcamp.semiproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.semiproject.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	public int getCount() {
		System.out.print("¼­ºñ½º");
		return userDao.count();
	}
}
