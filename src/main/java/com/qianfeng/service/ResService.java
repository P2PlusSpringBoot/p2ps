package com.qianfeng.service;

import com.qianfeng.dao.ResDao;
import com.qianfeng.entity.Res;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Service
public class ResService {
    @Resource
    private ResDao rd;
    public List<Res> findAllRes(){
        List<Res> allRes = rd.findAllRes();
        List<Res> allRes1=new ArrayList<>();
        List<Res> allRes2=new ArrayList<>();
        allRes1.addAll(allRes);
        allRes2.addAll(allRes);
        List<Res> list=new ArrayList<>();
        for(Res res:allRes){
            if(res.getLevel()==1&&res.getPid()==0){
                list.add(res);
            }
            for(Res res1:allRes1){
                if(res1.getPid()==res.getId()&&res1.getLevel()==2){
                    res.getChildren().add(res1);
                }
                for(Res res2:allRes2){
                    if(res2.getPid()==res1.getId()&&res2.getLevel()==3){
                        res1.getChildren().add(res2);
                    }
                }
            }
        }
        return list;
    }
}
