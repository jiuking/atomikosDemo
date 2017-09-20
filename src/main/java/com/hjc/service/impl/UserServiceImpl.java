package com.hjc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjc.persistence.dao.PublisherPaymentTransferMapper;
import com.hjc.persistence.entity.PublisherPaymentTransfer;
import com.hjc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private PublisherPaymentTransferMapper userMapper;//注入dao

	public void addUser(PublisherPaymentTransfer user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	public PublisherPaymentTransfer getUserById(String userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}
}
