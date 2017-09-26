package com.qianfeng.controller;

import com.qianfeng.dao.UserInvestmentDao;
import com.qianfeng.entity.UserInvestment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */
@Controller
public class UserInvestmentController {
    @Resource
    private UserInvestmentDao ud;

    @RequestMapping("findAllUd.do")
    @ResponseBody
    public List<UserInvestment> findUserInvestementByTime(){
        return ud.findUserInvestementByTime();
    }
}
