package com.qianfeng.controller;

import com.qianfeng.dao.T_Debt_Info_Dao;
import com.qianfeng.entity.T_Debt_Info;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/26.fanzy
 */
@Controller("/T_Debt_Info")
public class T_Debt_InfoController {
    @Resource
    private T_Debt_Info_Dao debt_info_Dao;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<T_Debt_Info> findAlLDebtInfo(){
        return debt_info_Dao.findAllT_Debt_Info();
    }
}
