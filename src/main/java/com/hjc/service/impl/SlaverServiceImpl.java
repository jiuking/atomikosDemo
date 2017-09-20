package com.hjc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjc.persistence.dao.slave.SlaverUserMapper;
import com.hjc.persistence.entity.PublisherPaymentTransfer;
import com.hjc.service.UserService;

@Service("slaverUserService")
public class SlaverServiceImpl implements UserService{

	@Autowired
	private SlaverUserMapper slaverUserMapper;//注入dao

	public void addUser(PublisherPaymentTransfer user) {
		// TODO Auto-generated method stub
		slaverUserMapper.insert(user);
	}

	public PublisherPaymentTransfer getUserById(String userId) {
		// TODO Auto-generated method stub
		return slaverUserMapper.selectByPrimaryKey(userId);
	}
	
}
