package com.qianfeng.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/25.
 */
//用户投资记录表
public class T_undertaker implements Serializable{
    private double T_ID;
    private String T_COST;
    private double T_TYPE;
    private double T_UNDERTAKER;

    public T_undertaker(double t_ID, String t_COST, double t_TYPE, double t_UNDERTAKER) {
        T_ID = t_ID;
        T_COST = t_COST;
        T_TYPE = t_TYPE;
        T_UNDERTAKER = t_UNDERTAKER;
    }

    public T_undertaker() {
    }

    public double getT_ID() {
        return T_ID;
    }

    public void setT_ID(double t_ID) {
        T_ID = t_ID;
    }

    public String getT_COST() {
        return T_COST;
    }

    public void setT_COST(String t_COST) {
        T_COST = t_COST;
    }

    public double getT_TYPE() {
        return T_TYPE;
    }

    public void setT_TYPE(double t_TYPE) {
        T_TYPE = t_TYPE;
    }

    public double getT_UNDERTAKER() {
        return T_UNDERTAKER;
    }

    public void setT_UNDERTAKER(double t_UNDERTAKER) {
        T_UNDERTAKER = t_UNDERTAKER;
    }
}
