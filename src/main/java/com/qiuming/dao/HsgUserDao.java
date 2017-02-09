package com.qiuming.dao;

import com.qiuming.entity.HsgUser;

public interface HsgUserDao {
    int deleteByPrimaryKey(Long id);

    int insert(HsgUser record);

    int insertSelective(HsgUser record);

    HsgUser get(Long id);

    int updateByPrimaryKeySelective(HsgUser record);

    int updateByPrimaryKey(HsgUser record);
}