package com.bitcamp.semiproject.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
	private SqlSession session;
	private final String namespace = "com.bitcamp.semiproject.UserMapper.";
	
	public int count(){
		System.out.print("´Ù¿À");
		return session.selectOne(namespace+"count");
	}
}
