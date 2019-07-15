package com.yjdz.zncdz.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table accountinfo
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Accountinfo implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户id外键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     * Database Column Remarks:
     *   总赠送金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.gifttotalamount
     *
     * @mbg.generated
     */
    private BigDecimal gifttotalamount;

    /**
     * Database Column Remarks:
     *   总充值金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.rechargetotalamount
     *
     * @mbg.generated
     */
    private BigDecimal rechargetotalamount;

    /**
     * Database Column Remarks:
     *   余额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   可提现金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.withdrawamount
     *
     * @mbg.generated
     */
    private BigDecimal withdrawamount;

    /**
     * Database Column Remarks:
     *   是否包月1是0否
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.ismonthly
     *
     * @mbg.generated
     */
    private Boolean ismonthly;

    /**
     * Database Column Remarks:
     *   包月截止日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.endtime
     *
     * @mbg.generated
     */
    private Date endtime;

    /**
     * Database Column Remarks:
     *   账户状态1默认0禁用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accountinfo.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table accountinfo
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.id
     *
     * @return the value of accountinfo.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.id
     *
     * @param id the value for accountinfo.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.userid
     *
     * @return the value of accountinfo.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.userid
     *
     * @param userid the value for accountinfo.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.gifttotalamount
     *
     * @return the value of accountinfo.gifttotalamount
     *
     * @mbg.generated
     */
    public BigDecimal getGifttotalamount() {
        return gifttotalamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.gifttotalamount
     *
     * @param gifttotalamount the value for accountinfo.gifttotalamount
     *
     * @mbg.generated
     */
    public void setGifttotalamount(BigDecimal gifttotalamount) {
        this.gifttotalamount = gifttotalamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.rechargetotalamount
     *
     * @return the value of accountinfo.rechargetotalamount
     *
     * @mbg.generated
     */
    public BigDecimal getRechargetotalamount() {
        return rechargetotalamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.rechargetotalamount
     *
     * @param rechargetotalamount the value for accountinfo.rechargetotalamount
     *
     * @mbg.generated
     */
    public void setRechargetotalamount(BigDecimal rechargetotalamount) {
        this.rechargetotalamount = rechargetotalamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.amount
     *
     * @return the value of accountinfo.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.amount
     *
     * @param amount the value for accountinfo.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.withdrawamount
     *
     * @return the value of accountinfo.withdrawamount
     *
     * @mbg.generated
     */
    public BigDecimal getWithdrawamount() {
        return withdrawamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.withdrawamount
     *
     * @param withdrawamount the value for accountinfo.withdrawamount
     *
     * @mbg.generated
     */
    public void setWithdrawamount(BigDecimal withdrawamount) {
        this.withdrawamount = withdrawamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.ismonthly
     *
     * @return the value of accountinfo.ismonthly
     *
     * @mbg.generated
     */
    public Boolean getIsmonthly() {
        return ismonthly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.ismonthly
     *
     * @param ismonthly the value for accountinfo.ismonthly
     *
     * @mbg.generated
     */
    public void setIsmonthly(Boolean ismonthly) {
        this.ismonthly = ismonthly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.endtime
     *
     * @return the value of accountinfo.endtime
     *
     * @mbg.generated
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.endtime
     *
     * @param endtime the value for accountinfo.endtime
     *
     * @mbg.generated
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accountinfo.status
     *
     * @return the value of accountinfo.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accountinfo.status
     *
     * @param status the value for accountinfo.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}