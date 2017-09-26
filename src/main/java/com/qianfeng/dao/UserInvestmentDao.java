package com.qianfeng.dao;

import com.qianfeng.entity.UserInvestment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/25.
 */
@Repository
@Mapper
public interface UserInvestmentDao {
    List<UserInvestment> findUserInvestementByTime();
}
