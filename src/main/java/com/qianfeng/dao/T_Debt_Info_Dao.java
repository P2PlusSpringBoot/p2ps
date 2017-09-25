package com.qianfeng.dao;

import com.qianfeng.entity.T_Debt_Info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/9/25.fanzy
 */
@Repository
@Mapper
public interface T_Debt_Info_Dao {
    public T_Debt_Info findT_Debt_Info();
}
