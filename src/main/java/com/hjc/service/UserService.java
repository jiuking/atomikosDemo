package com.hjc.service;

import com.hjc.persistence.entity.PublisherPaymentTransfer;

public interface UserService {

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	void addUser(PublisherPaymentTransfer user);

	/**
	 * 根据用户id获取用户
	 * 
	 * @param userId
	 * @return
	 */
	PublisherPaymentTransfer getUserById(String userId);
}
