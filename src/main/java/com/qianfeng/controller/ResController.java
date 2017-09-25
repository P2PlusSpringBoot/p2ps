package com.qianfeng.controller;

import com.qianfeng.dao.ResDao;
import com.qianfeng.entity.Res;
import com.qianfeng.service.ResService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Controller
@RequestMapping("/res")
public class ResController {
    @Resource
    private ResService rs;

    @RequestMapping(value = "/findAllRes.do")
    @ResponseBody
    public List<Res> findAllres(){
        List<Res> allRes = rs.findAllRes();
        return allRes;
    }

}
