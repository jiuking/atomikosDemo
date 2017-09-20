package com.hjc.persistence.dao;

import com.hjc.persistence.entity.PublisherPaymentTransfer;

public interface PublisherPaymentTransferMapper {
    int deleteByPrimaryKey(String userId);

    int insert(PublisherPaymentTransfer record);

    int insertSelective(PublisherPaymentTransfer record);

    PublisherPaymentTransfer selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(PublisherPaymentTransfer record);

    int updateByPrimaryKey(PublisherPaymentTransfer record);
}