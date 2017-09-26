package com.qianfeng.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/9/25.
 */
public class UserInvestment implements Serializable{
    private BigDecimal P_ID;
    //当前期（账户资金日志表）
    private BigDecimal A_CURRENT_PERIOD;
    //提前赎回利率
    private Float P_ADV_REDEMPTION;
    //金额
    private Float P_AMOUNT;
    //可用余额
    private Float P_AVA_BAL;
    //加入日期
    private Timestamp P_BEGIN_DATE;
    //当前期（用户购买产品记录表）
    private BigDecimal P_CURRENT_MONTH;
    private Float P_CUR_REAL_TOT_MON;//当前期实回总本息
    private Timestamp P_DATE;//系统时间
    private Timestamp P_DAYS;
    private BigDecimal P_DEADLINE;//投资期限
    private BigDecimal P_DEADLINE_AS_DAY;//投资天数
    private BigDecimal P_DEADLINE_COUNT;//统计
    private BigDecimal P_DEADLINES;//选择期限
    private Float P_DEDUCT_INTEREST;//扣去利息
    private Float P_EARNED_INTER;//已赚取利息
    private Float P_EARNINGS;//收益率
    private BigDecimal P_EAR_IS_FINISHED;//收益是否完成
    private BigDecimal P_EARNINGS_TYPE;//收益率类型
    private Float P_END_INV_TOT_MON;//到期应回总本息
    private Float P_EXP_ANNUAL_INCOME;//预期年化收益
    private Float P_FROZEN_MONEY;//冻结金额
    private Timestamp P_INTEREST_END_DATE;//结束计息时间
    private Timestamp P_INTEREST_START_DATE;//开始计息时间
    private Timestamp P_MATCH_DATE;//匹配日期
    private Float P_MAY_TAKE;//月取
    private BigDecimal P_MAY_TAKE_COUNT;//月取笔数
    private Float P_MONTH_INTEREST;//每月盈取利息
    private Float P_MONTHLY_DEPOSIT;//月存
    private BigDecimal P_MONTHLY_DEPOSIT_COUNT;//月存笔数
    private Float P_MONTHLY_EXT_INTEREST;//每月提取利息
    private Float P_NOT_INV_MON;//未投资金额
    private String P_PRODUCT_NAME;//产品名称
    private BigDecimal P_PRO_TYPE;//产品类型
    private Float P_PRO_EARNINGS;//预期收益
    private Timestamp P_REDEEM_DATE;//赎回日期
    private String P_REMARK;//备注
    private String P_SERIAL_NO;//投资编号
    private BigDecimal P_STATUS;//状态
    private BigDecimal P_SYS_PAY_DATE;//每月回款日
    private Float P_TAKE_MONTH;//月乘
    private BigDecimal P_TAKE_MONTH_COUNT;//月乘笔数
    private BigDecimal P_TOTAL;//总计
    private BigDecimal P_TOTAL_AS_DAY;//总天数
    private BigDecimal P_U_ID;//用户id
    private BigDecimal SUM_AVABAL_FROZENMONEY;//SUM(可用余额+冻结金额)
    private String U_USER_NAME;//用户名
    private BigDecimal P_PRODUCT_ID;//产品id
    private Timestamp P_END_DATE;//到期日期
    private Float INVESTTOTAL;
    private BigDecimal P_IS_REPEAT_INVEST;
    private Integer types;//自定义属性



    public BigDecimal getP_ID() {
        return P_ID;
    }

    public void setP_ID(BigDecimal p_ID) {
        P_ID = p_ID;
    }

    public BigDecimal getA_CURRENT_PERIOD() {
        return A_CURRENT_PERIOD;
    }

    public void setA_CURRENT_PERIOD(BigDecimal a_CURRENT_PERIOD) {
        A_CURRENT_PERIOD = a_CURRENT_PERIOD;
    }

    public Float getP_ADV_REDEMPTION() {
        return P_ADV_REDEMPTION;
    }

    public void setP_ADV_REDEMPTION(Float p_ADV_REDEMPTION) {
        P_ADV_REDEMPTION = p_ADV_REDEMPTION;
    }

    public Float getP_AMOUNT() {
        return P_AMOUNT;
    }

    public void setP_AMOUNT(Float p_AMOUNT) {
        P_AMOUNT = p_AMOUNT;
    }

    public Float getP_AVA_BAL() {
        return P_AVA_BAL;
    }

    public void setP_AVA_BAL(Float p_AVA_BAL) {
        P_AVA_BAL = p_AVA_BAL;
    }

    public Timestamp getP_BEGIN_DATE() {
        return P_BEGIN_DATE;
    }

    public void setP_BEGIN_DATE(Timestamp p_BEGIN_DATE) {
        P_BEGIN_DATE = p_BEGIN_DATE;
    }

    public BigDecimal getP_CURRENT_MONTH() {
        return P_CURRENT_MONTH;
    }

    public void setP_CURRENT_MONTH(BigDecimal p_CURRENT_MONTH) {
        P_CURRENT_MONTH = p_CURRENT_MONTH;
    }

    public Float getP_CUR_REAL_TOT_MON() {
        return P_CUR_REAL_TOT_MON;
    }

    public void setP_CUR_REAL_TOT_MON(Float p_CUR_REAL_TOT_MON) {
        P_CUR_REAL_TOT_MON = p_CUR_REAL_TOT_MON;
    }

    public Timestamp getP_DATE() {
        return P_DATE;
    }

    public void setP_DATE(Timestamp p_DATE) {
        P_DATE = p_DATE;
    }

    public Timestamp getP_DAYS() {
        return P_DAYS;
    }

    public void setP_DAYS(Timestamp p_DAYS) {
        P_DAYS = p_DAYS;
    }

    public BigDecimal getP_DEADLINE() {
        return P_DEADLINE;
    }

    public void setP_DEADLINE(BigDecimal p_DEADLINE) {
        P_DEADLINE = p_DEADLINE;
    }

    public BigDecimal getP_DEADLINE_AS_DAY() {
        return P_DEADLINE_AS_DAY;
    }

    public void setP_DEADLINE_AS_DAY(BigDecimal p_DEADLINE_AS_DAY) {
        P_DEADLINE_AS_DAY = p_DEADLINE_AS_DAY;
    }

    public BigDecimal getP_DEADLINE_COUNT() {
        return P_DEADLINE_COUNT;
    }

    public void setP_DEADLINE_COUNT(BigDecimal p_DEADLINE_COUNT) {
        P_DEADLINE_COUNT = p_DEADLINE_COUNT;
    }

    public BigDecimal getP_DEADLINES() {
        return P_DEADLINES;
    }

    public void setP_DEADLINES(BigDecimal p_DEADLINES) {
        P_DEADLINES = p_DEADLINES;
    }

    public Float getP_DEDUCT_INTEREST() {
        return P_DEDUCT_INTEREST;
    }

    public void setP_DEDUCT_INTEREST(Float p_DEDUCT_INTEREST) {
        P_DEDUCT_INTEREST = p_DEDUCT_INTEREST;
    }

    public Float getP_EARNED_INTER() {
        return P_EARNED_INTER;
    }

    public void setP_EARNED_INTER(Float p_EARNED_INTER) {
        P_EARNED_INTER = p_EARNED_INTER;
    }

    public Float getP_EARNINGS() {
        return P_EARNINGS;
    }

    public void setP_EARNINGS(Float p_EARNINGS) {
        P_EARNINGS = p_EARNINGS;
    }

    public BigDecimal getP_EAR_IS_FINISHED() {
        return P_EAR_IS_FINISHED;
    }

    public void setP_EAR_IS_FINISHED(BigDecimal p_EAR_IS_FINISHED) {
        P_EAR_IS_FINISHED = p_EAR_IS_FINISHED;
    }

    public BigDecimal getP_EARNINGS_TYPE() {
        return P_EARNINGS_TYPE;
    }

    public void setP_EARNINGS_TYPE(BigDecimal p_EARNINGS_TYPE) {
        P_EARNINGS_TYPE = p_EARNINGS_TYPE;
    }

    public Float getP_END_INV_TOT_MON() {
        return P_END_INV_TOT_MON;
    }

    public void setP_END_INV_TOT_MON(Float p_END_INV_TOT_MON) {
        P_END_INV_TOT_MON = p_END_INV_TOT_MON;
    }

    public Float getP_EXP_ANNUAL_INCOME() {
        return P_EXP_ANNUAL_INCOME;
    }

    public void setP_EXP_ANNUAL_INCOME(Float p_EXP_ANNUAL_INCOME) {
        P_EXP_ANNUAL_INCOME = p_EXP_ANNUAL_INCOME;
    }

    public Float getP_FROZEN_MONEY() {
        return P_FROZEN_MONEY;
    }

    public void setP_FROZEN_MONEY(Float p_FROZEN_MONEY) {
        P_FROZEN_MONEY = p_FROZEN_MONEY;
    }

    public Timestamp getP_INTEREST_END_DATE() {
        return P_INTEREST_END_DATE;
    }

    public void setP_INTEREST_END_DATE(Timestamp p_INTEREST_END_DATE) {
        P_INTEREST_END_DATE = p_INTEREST_END_DATE;
    }

    public Timestamp getP_INTEREST_START_DATE() {
        return P_INTEREST_START_DATE;
    }

    public void setP_INTEREST_START_DATE(Timestamp p_INTEREST_START_DATE) {
        P_INTEREST_START_DATE = p_INTEREST_START_DATE;
    }

    public Timestamp getP_MATCH_DATE() {
        return P_MATCH_DATE;
    }

    public void setP_MATCH_DATE(Timestamp p_MATCH_DATE) {
        P_MATCH_DATE = p_MATCH_DATE;
    }

    public Float getP_MAY_TAKE() {
        return P_MAY_TAKE;
    }

    public void setP_MAY_TAKE(Float p_MAY_TAKE) {
        P_MAY_TAKE = p_MAY_TAKE;
    }

    public BigDecimal getP_MAY_TAKE_COUNT() {
        return P_MAY_TAKE_COUNT;
    }

    public void setP_MAY_TAKE_COUNT(BigDecimal p_MAY_TAKE_COUNT) {
        P_MAY_TAKE_COUNT = p_MAY_TAKE_COUNT;
    }

    public Float getP_MONTH_INTEREST() {
        return P_MONTH_INTEREST;
    }

    public void setP_MONTH_INTEREST(Float p_MONTH_INTEREST) {
        P_MONTH_INTEREST = p_MONTH_INTEREST;
    }

    public Float getP_MONTHLY_DEPOSIT() {
        return P_MONTHLY_DEPOSIT;
    }

    public void setP_MONTHLY_DEPOSIT(Float p_MONTHLY_DEPOSIT) {
        P_MONTHLY_DEPOSIT = p_MONTHLY_DEPOSIT;
    }

    public BigDecimal getP_MONTHLY_DEPOSIT_COUNT() {
        return P_MONTHLY_DEPOSIT_COUNT;
    }

    public void setP_MONTHLY_DEPOSIT_COUNT(BigDecimal p_MONTHLY_DEPOSIT_COUNT) {
        P_MONTHLY_DEPOSIT_COUNT = p_MONTHLY_DEPOSIT_COUNT;
    }

    public Float getP_MONTHLY_EXT_INTEREST() {
        return P_MONTHLY_EXT_INTEREST;
    }

    public void setP_MONTHLY_EXT_INTEREST(Float p_MONTHLY_EXT_INTEREST) {
        P_MONTHLY_EXT_INTEREST = p_MONTHLY_EXT_INTEREST;
    }

    public Float getP_NOT_INV_MON() {
        return P_NOT_INV_MON;
    }

    public void setP_NOT_INV_MON(Float p_NOT_INV_MON) {
        P_NOT_INV_MON = p_NOT_INV_MON;
    }

    public String getP_PRODUCT_NAME() {
        return P_PRODUCT_NAME;
    }

    public void setP_PRODUCT_NAME(String p_PRODUCT_NAME) {
        P_PRODUCT_NAME = p_PRODUCT_NAME;
    }

    public BigDecimal getP_PRO_TYPE() {
        return P_PRO_TYPE;
    }

    public void setP_PRO_TYPE(BigDecimal p_PRO_TYPE) {
        P_PRO_TYPE = p_PRO_TYPE;
    }

    public Float getP_PRO_EARNINGS() {
        return P_PRO_EARNINGS;
    }

    public void setP_PRO_EARNINGS(Float p_PRO_EARNINGS) {
        P_PRO_EARNINGS = p_PRO_EARNINGS;
    }

    public Timestamp getP_REDEEM_DATE() {
        return P_REDEEM_DATE;
    }

    public void setP_REDEEM_DATE(Timestamp p_REDEEM_DATE) {
        P_REDEEM_DATE = p_REDEEM_DATE;
    }

    public String getP_REMARK() {
        return P_REMARK;
    }

    public void setP_REMARK(String p_REMARK) {
        P_REMARK = p_REMARK;
    }

    public String getP_SERIAL_NO() {
        return P_SERIAL_NO;
    }

    public void setP_SERIAL_NO(String p_SERIAL_NO) {
        P_SERIAL_NO = p_SERIAL_NO;
    }

    public BigDecimal getP_STATUS() {
        return P_STATUS;
    }

    public void setP_STATUS(BigDecimal p_STATUS) {
        P_STATUS = p_STATUS;
    }

    public BigDecimal getP_SYS_PAY_DATE() {
        return P_SYS_PAY_DATE;
    }

    public void setP_SYS_PAY_DATE(BigDecimal p_SYS_PAY_DATE) {
        P_SYS_PAY_DATE = p_SYS_PAY_DATE;
    }

    public Float getP_TAKE_MONTH() {
        return P_TAKE_MONTH;
    }

    public void setP_TAKE_MONTH(Float p_TAKE_MONTH) {
        P_TAKE_MONTH = p_TAKE_MONTH;
    }

    public BigDecimal getP_TAKE_MONTH_COUNT() {
        return P_TAKE_MONTH_COUNT;
    }

    public void setP_TAKE_MONTH_COUNT(BigDecimal p_TAKE_MONTH_COUNT) {
        P_TAKE_MONTH_COUNT = p_TAKE_MONTH_COUNT;
    }

    public BigDecimal getP_TOTAL() {
        return P_TOTAL;
    }

    public void setP_TOTAL(BigDecimal p_TOTAL) {
        P_TOTAL = p_TOTAL;
    }

    public BigDecimal getP_TOTAL_AS_DAY() {
        return P_TOTAL_AS_DAY;
    }

    public void setP_TOTAL_AS_DAY(BigDecimal p_TOTAL_AS_DAY) {
        P_TOTAL_AS_DAY = p_TOTAL_AS_DAY;
    }

    public BigDecimal getP_U_ID() {
        return P_U_ID;
    }

    public void setP_U_ID(BigDecimal p_U_ID) {
        P_U_ID = p_U_ID;
    }

    public BigDecimal getSUM_AVABAL_FROZENMONEY() {
        return SUM_AVABAL_FROZENMONEY;
    }

    public void setSUM_AVABAL_FROZENMONEY(BigDecimal SUM_AVABAL_FROZENMONEY) {
        this.SUM_AVABAL_FROZENMONEY = SUM_AVABAL_FROZENMONEY;
    }

    public String getU_USER_NAME() {
        return U_USER_NAME;
    }

    public void setU_USER_NAME(String u_USER_NAME) {
        U_USER_NAME = u_USER_NAME;
    }

    public BigDecimal getP_PRODUCT_ID() {
        return P_PRODUCT_ID;
    }

    public void setP_PRODUCT_ID(BigDecimal p_PRODUCT_ID) {
        P_PRODUCT_ID = p_PRODUCT_ID;
    }

    public Timestamp getP_END_DATE() {
        return P_END_DATE;
    }

    public void setP_END_DATE(Timestamp p_END_DATE) {
        P_END_DATE = p_END_DATE;
    }

    public Float getINVESTTOTAL() {
        return INVESTTOTAL;
    }

    public void setINVESTTOTAL(Float INVESTTOTAL) {
        this.INVESTTOTAL = INVESTTOTAL;
    }

    public BigDecimal getP_IS_REPEAT_INVEST() {
        return P_IS_REPEAT_INVEST;
    }

    public void setP_IS_REPEAT_INVEST(BigDecimal p_IS_REPEAT_INVEST) {
        P_IS_REPEAT_INVEST = p_IS_REPEAT_INVEST;
    }

    public Integer getTypes() {
        return types;
    }

    public void setTypes(Integer types) {
        this.types = types;
    }
}
