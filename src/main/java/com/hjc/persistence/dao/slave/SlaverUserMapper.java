package com.hjc.persistence.dao.slave;

import com.hjc.persistence.entity.PublisherPaymentTransfer;

public interface SlaverUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(PublisherPaymentTransfer record);

    int insertSelective(PublisherPaymentTransfer record);

    PublisherPaymentTransfer selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(PublisherPaymentTransfer record);

    int updateByPrimaryKey(PublisherPaymentTransfer record);
}