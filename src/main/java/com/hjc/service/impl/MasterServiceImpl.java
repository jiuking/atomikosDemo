package com.hjc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjc.persistence.dao.master.MasterUserMapper;
import com.hjc.persistence.entity.PublisherPaymentTransfer;
import com.hjc.service.UserService;

@Service("masterUserService")
public class MasterServiceImpl implements UserService{
	
	@Autowired
	private MasterUserMapper masterUserMapper;//注入dao

	public void addUser(PublisherPaymentTransfer user) {
		// TODO Auto-generated method stub
		masterUserMapper.insert(user);
	}

	public PublisherPaymentTransfer getUserById(String userId) {
		// TODO Auto-generated method stub
		return masterUserMapper.selectByPrimaryKey(userId);
	}

}
