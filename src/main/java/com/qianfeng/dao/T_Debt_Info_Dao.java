package com.qianfeng.dao;

import com.qianfeng.entity.T_Debt_Info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/25.fanzy
 */
@Repository
@Mapper
public interface T_Debt_Info_Dao {
     List<T_Debt_Info>  findAllT_Debt_Info();
}
