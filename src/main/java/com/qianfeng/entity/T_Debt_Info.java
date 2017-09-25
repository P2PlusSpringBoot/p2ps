package com.qianfeng.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/9/25.fanzy
 * 债权信息表实体类
 * 对应数据库表名：T_DEBT_INFO
 */
public class T_Debt_Info implements Serializable{
    private BigDecimal d_id;//主键
    private float d_availble_money;//可用余额
    private BigDecimal d_availble_period;//可用期限
    private BigDecimal d_borrower_id;//借款人ID
    private String d_contract_no;//合同编号
    private String d_creditor;//债权人
    private float d_debt_money;//债权金额
    private float d_debt_month_rate;//债权月利率
    private String d_debt_no;//债权编号
    private Timestamp d_debt_ransfer_out_date;//债权转出日期
    private BigDecimal d_debt_status;//债权状态
    private String d_debt_status_name;//债权状态名字
    private String d_debt_transferred_date;//债权转入日期
    private float d_debt_transferred_money;//债权转入金额
    private BigDecimal d_debt_transferred_period;//债权转入期限
    private String d_debt_type;//标的类型
    private String d_debt_type_name;//标的类型名称
    private String d_debt_year_rate;//债权年化利率
    private String d_debtors_id;//债务人身份证号
    private String d_debtors_name;//债务人名称
    private Timestamp d_loan_end_date;//原始借款到期日期
    private BigDecimal d_loan_period;//原始借款期限
    private String d_loan_purpose;//借款用途
    private Timestamp d_loan_start_date;//原始借款开始日期
    private String d_loan_type;//借款类型
    private float d_matched_money;//已匹配金额
    private BigDecimal d_matched_status;//匹配状态
    private String d_matched_status_name;//匹配状态名称
    private String d_repaymen_date;//还款日
    private float d_repaymen_money;//还款金额
    private BigDecimal d_repayment_style;//还款方式
    private String d_repayment_style_name;//还款方式名称

    public T_Debt_Info(BigDecimal d_id, float d_availble_money, BigDecimal d_availble_period, BigDecimal d_borrower_id, String d_contract_no, String d_creditor, float d_debt_money, float d_debt_month_rate, String d_debt_no, Timestamp d_debt_ransfer_out_date, BigDecimal d_debt_status, String d_debt_status_name, String d_debt_transferred_date, float d_debt_transferred_money, BigDecimal d_debt_transferred_period, String d_debt_type, String d_debt_type_name, String d_debt_year_rate, String d_debtors_id, String d_debtors_name, Timestamp d_loan_end_date, BigDecimal d_loan_period, String d_loan_purpose, Timestamp d_loan_start_date, String d_loan_type, float d_matched_money, BigDecimal d_matched_status, String d_matched_status_name, String d_repaymen_date, float d_repaymen_money, BigDecimal d_repayment_style, String d_repayment_style_name) {
        this.d_id = d_id;
        this.d_availble_money = d_availble_money;
        this.d_availble_period = d_availble_period;
        this.d_borrower_id = d_borrower_id;
        this.d_contract_no = d_contract_no;
        this.d_creditor = d_creditor;
        this.d_debt_money = d_debt_money;
        this.d_debt_month_rate = d_debt_month_rate;
        this.d_debt_no = d_debt_no;
        this.d_debt_ransfer_out_date = d_debt_ransfer_out_date;
        this.d_debt_status = d_debt_status;
        this.d_debt_status_name = d_debt_status_name;
        this.d_debt_transferred_date = d_debt_transferred_date;
        this.d_debt_transferred_money = d_debt_transferred_money;
        this.d_debt_transferred_period = d_debt_transferred_period;
        this.d_debt_type = d_debt_type;
        this.d_debt_type_name = d_debt_type_name;
        this.d_debt_year_rate = d_debt_year_rate;
        this.d_debtors_id = d_debtors_id;
        this.d_debtors_name = d_debtors_name;
        this.d_loan_end_date = d_loan_end_date;
        this.d_loan_period = d_loan_period;
        this.d_loan_purpose = d_loan_purpose;
        this.d_loan_start_date = d_loan_start_date;
        this.d_loan_type = d_loan_type;
        this.d_matched_money = d_matched_money;
        this.d_matched_status = d_matched_status;
        this.d_matched_status_name = d_matched_status_name;
        this.d_repaymen_date = d_repaymen_date;
        this.d_repaymen_money = d_repaymen_money;
        this.d_repayment_style = d_repayment_style;
        this.d_repayment_style_name = d_repayment_style_name;
    }

    public T_Debt_Info() {

    }

    public BigDecimal getD_id() {
        return d_id;
    }

    public void setD_id(BigDecimal d_id) {
        this.d_id = d_id;
    }

    public float getD_availble_money() {
        return d_availble_money;
    }

    public void setD_availble_money(float d_availble_money) {
        this.d_availble_money = d_availble_money;
    }

    public BigDecimal getD_availble_period() {
        return d_availble_period;
    }

    public void setD_availble_period(BigDecimal d_availble_period) {
        this.d_availble_period = d_availble_period;
    }

    public BigDecimal getD_borrower_id() {
        return d_borrower_id;
    }

    public void setD_borrower_id(BigDecimal d_borrower_id) {
        this.d_borrower_id = d_borrower_id;
    }

    public String getD_contract_no() {
        return d_contract_no;
    }

    public void setD_contract_no(String d_contract_no) {
        this.d_contract_no = d_contract_no;
    }

    public String getD_creditor() {
        return d_creditor;
    }

    public void setD_creditor(String d_creditor) {
        this.d_creditor = d_creditor;
    }

    public float getD_debt_money() {
        return d_debt_money;
    }

    public void setD_debt_money(float d_debt_money) {
        this.d_debt_money = d_debt_money;
    }

    public float getD_debt_month_rate() {
        return d_debt_month_rate;
    }

    public void setD_debt_month_rate(float d_debt_month_rate) {
        this.d_debt_month_rate = d_debt_month_rate;
    }

    public String getD_debt_no() {
        return d_debt_no;
    }

    public void setD_debt_no(String d_debt_no) {
        this.d_debt_no = d_debt_no;
    }

    public Timestamp getD_debt_ransfer_out_date() {
        return d_debt_ransfer_out_date;
    }

    public void setD_debt_ransfer_out_date(Timestamp d_debt_ransfer_out_date) {
        this.d_debt_ransfer_out_date = d_debt_ransfer_out_date;
    }

    public BigDecimal getD_debt_status() {
        return d_debt_status;
    }

    public void setD_debt_status(BigDecimal d_debt_status) {
        this.d_debt_status = d_debt_status;
    }

    public String getD_debt_status_name() {
        return d_debt_status_name;
    }

    public void setD_debt_status_name(String d_debt_status_name) {
        this.d_debt_status_name = d_debt_status_name;
    }

    public String getD_debt_transferred_date() {
        return d_debt_transferred_date;
    }

    public void setD_debt_transferred_date(String d_debt_transferred_date) {
        this.d_debt_transferred_date = d_debt_transferred_date;
    }

    public float getD_debt_transferred_money() {
        return d_debt_transferred_money;
    }

    public void setD_debt_transferred_money(float d_debt_transferred_money) {
        this.d_debt_transferred_money = d_debt_transferred_money;
    }

    public BigDecimal getD_debt_transferred_period() {
        return d_debt_transferred_period;
    }

    public void setD_debt_transferred_period(BigDecimal d_debt_transferred_period) {
        this.d_debt_transferred_period = d_debt_transferred_period;
    }

    public String getD_debt_type() {
        return d_debt_type;
    }

    public void setD_debt_type(String d_debt_type) {
        this.d_debt_type = d_debt_type;
    }

    public String getD_debt_type_name() {
        return d_debt_type_name;
    }

    public void setD_debt_type_name(String d_debt_type_name) {
        this.d_debt_type_name = d_debt_type_name;
    }

    public String getD_debt_year_rate() {
        return d_debt_year_rate;
    }

    public void setD_debt_year_rate(String d_debt_year_rate) {
        this.d_debt_year_rate = d_debt_year_rate;
    }

    public String getD_debtors_id() {
        return d_debtors_id;
    }

    public void setD_debtors_id(String d_debtors_id) {
        this.d_debtors_id = d_debtors_id;
    }

    public String getD_debtors_name() {
        return d_debtors_name;
    }

    public void setD_debtors_name(String d_debtors_name) {
        this.d_debtors_name = d_debtors_name;
    }

    public Timestamp getD_loan_end_date() {
        return d_loan_end_date;
    }

    public void setD_loan_end_date(Timestamp d_loan_end_date) {
        this.d_loan_end_date = d_loan_end_date;
    }

    public BigDecimal getD_loan_period() {
        return d_loan_period;
    }

    public void setD_loan_period(BigDecimal d_loan_period) {
        this.d_loan_period = d_loan_period;
    }

    public String getD_loan_purpose() {
        return d_loan_purpose;
    }

    public void setD_loan_purpose(String d_loan_purpose) {
        this.d_loan_purpose = d_loan_purpose;
    }

    public Timestamp getD_loan_start_date() {
        return d_loan_start_date;
    }

    public void setD_loan_start_date(Timestamp d_loan_start_date) {
        this.d_loan_start_date = d_loan_start_date;
    }

    public String getD_loan_type() {
        return d_loan_type;
    }

    public void setD_loan_type(String d_loan_type) {
        this.d_loan_type = d_loan_type;
    }

    public float getD_matched_money() {
        return d_matched_money;
    }

    public void setD_matched_money(float d_matched_money) {
        this.d_matched_money = d_matched_money;
    }

    public BigDecimal getD_matched_status() {
        return d_matched_status;
    }

    public void setD_matched_status(BigDecimal d_matched_status) {
        this.d_matched_status = d_matched_status;
    }

    public String getD_matched_status_name() {
        return d_matched_status_name;
    }

    public void setD_matched_status_name(String d_matched_status_name) {
        this.d_matched_status_name = d_matched_status_name;
    }

    public String getD_repaymen_date() {
        return d_repaymen_date;
    }

    public void setD_repaymen_date(String d_repaymen_date) {
        this.d_repaymen_date = d_repaymen_date;
    }

    public float getD_repaymen_money() {
        return d_repaymen_money;
    }

    public void setD_repaymen_money(float d_repaymen_money) {
        this.d_repaymen_money = d_repaymen_money;
    }

    public BigDecimal getD_repayment_style() {
        return d_repayment_style;
    }

    public void setD_repayment_style(BigDecimal d_repayment_style) {
        this.d_repayment_style = d_repayment_style;
    }

    public String getD_repayment_style_name() {
        return d_repayment_style_name;
    }

    public void setD_repayment_style_name(String d_repayment_style_name) {
        this.d_repayment_style_name = d_repayment_style_name;
    }

    @Override
    public String toString() {
        return "T_Debt_Info{" +
                "d_id=" + d_id +
                ", d_availble_money=" + d_availble_money +
                ", d_availble_period=" + d_availble_period +
                ", d_borrower_id=" + d_borrower_id +
                ", d_contract_no='" + d_contract_no + '\'' +
                ", d_creditor='" + d_creditor + '\'' +
                ", d_debt_money=" + d_debt_money +
                ", d_debt_month_rate=" + d_debt_month_rate +
                ", d_debt_no='" + d_debt_no + '\'' +
                ", d_debt_ransfer_out_date=" + d_debt_ransfer_out_date +
                ", d_debt_status=" + d_debt_status +
                ", d_debt_status_name='" + d_debt_status_name + '\'' +
                ", d_debt_transferred_date='" + d_debt_transferred_date + '\'' +
                ", d_debt_transferred_money=" + d_debt_transferred_money +
                ", d_debt_transferred_period=" + d_debt_transferred_period +
                ", d_debt_type='" + d_debt_type + '\'' +
                ", d_debt_type_name='" + d_debt_type_name + '\'' +
                ", d_debt_year_rate='" + d_debt_year_rate + '\'' +
                ", d_debtors_id='" + d_debtors_id + '\'' +
                ", d_debtors_name='" + d_debtors_name + '\'' +
                ", d_loan_end_date=" + d_loan_end_date +
                ", d_loan_period=" + d_loan_period +
                ", d_loan_purpose='" + d_loan_purpose + '\'' +
                ", d_loan_start_date=" + d_loan_start_date +
                ", d_loan_type='" + d_loan_type + '\'' +
                ", d_matched_money=" + d_matched_money +
                ", d_matched_status=" + d_matched_status +
                ", d_matched_status_name='" + d_matched_status_name + '\'' +
                ", d_repaymen_date='" + d_repaymen_date + '\'' +
                ", d_repaymen_money=" + d_repaymen_money +
                ", d_repayment_style=" + d_repayment_style +
                ", d_repayment_style_name='" + d_repayment_style_name + '\'' +
                '}';
    }
}
/* BigDecimal  String  String
   D_ID                 numeric(10,0) not null comment '主键',
   D_AVAILABLE_MONEY    float comment '可用金额',
   D_AVAILABLE_PERIOD   numeric(10,0) comment '可用期限',
   D_BORROWER_ID        numeric(10,0) comment '借款人ID',
   D_CONTRACT_NO        varchar(255) comment '合同编号',
   D_CREDITOR           varchar(255) comment '债权人',
   D_DEBT_MONEY         float comment '债权金额',
   D_DEBT_MONTH_RATE    float comment '债权月利率',
   D_DEBT_NO            varchar(255) comment '债权编号',
   D_DEBT_RANSFER_OUT_DATE Timestamptamp comment '债权转出日期',
   D_DEBT_STATUS        numeric(10,0) comment '债权状态',
   D_DEBT_STATUS_NAME   varchar(255) comment '债权状态名字',
   D_DEBT_TRANSFERRED_DATE Timestamptamp comment '债权转入日期',
   D_DEBT_TRANSFERRED_MONEY float comment '债权转入金额',
   D_DEBT_TRANSFERRED_PERIOD numeric(10,0) comment '债权转入期限',
   D_DEBT_TYPE          varchar(255) comment '标的类型',
   D_DEBT_TYPE_NAME     varchar(255) comment '标的类型名称',
   D_DEBT_YEAR_RATE     float comment '债权年化利率',
   D_DEBTORS_ID         varchar(255) comment '债务人身份证号',
   D_DEBTORS_NAME       varchar(255) comment '债务人名称',
   D_LOAN_END_DATE      Timestamptamp comment '原始借款到期日期',
   D_LOAN_PERIOD        numeric(10,0) comment '原始借款期限',
   D_LOAN_PURPOSE       varchar(255) comment '借款用途',
   D_LOAN_START_DATE    Timestamptamp comment '原始借款开始日期',
   D_LOAN_TYPE          varchar(255) comment '借款类型',
   D_MATCHED_MONEY      float comment '已匹配金额',
   D_MATCHED_STATUS     numeric(10,0) comment '匹配状态',
   D_MATCHED_STATUS_NAME varchar(255) comment '匹配状态名称',
   D_REPAYMEN_DATE      varchar(255) comment '还款日',
   D_REPAYMEN_MONEY     float comment '还款金额',
   D_REPAYMENT_STYLE    numeric(10,0) comment '还款方式',
   D_REPAYMENT_STYLE_NAME varchar(255) comment '还款方式名称',
   primary key (D_ID)
 */