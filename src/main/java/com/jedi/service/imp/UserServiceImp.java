package com.jedi.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jedi.bean.User;
import com.jedi.dao.IUserDao;
import com.jedi.service.IUserService;


@Service("userService ")
public class UserServiceImp implements IUserService {

	@Resource    
    private IUserDao userDao;

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}
	
	
}
