package com.yjdz.zncdz.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table monthlyuser
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Monthlyuser implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthlyuser.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户id外键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthlyuser.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     * Database Column Remarks:
     *   包月收费表外键id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthlyuser.monthlyid
     *
     * @mbg.generated
     */
    private Integer monthlyid;

    /**
     * Database Column Remarks:
     *   包月购买日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthlyuser.buytime
     *
     * @mbg.generated
     */
    private Date buytime;

    /**
     * Database Column Remarks:
     *   包月状态1启用0禁止
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthlyuser.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthlyuser.id
     *
     * @return the value of monthlyuser.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthlyuser.id
     *
     * @param id the value for monthlyuser.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthlyuser.userid
     *
     * @return the value of monthlyuser.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthlyuser.userid
     *
     * @param userid the value for monthlyuser.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthlyuser.monthlyid
     *
     * @return the value of monthlyuser.monthlyid
     *
     * @mbg.generated
     */
    public Integer getMonthlyid() {
        return monthlyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthlyuser.monthlyid
     *
     * @param monthlyid the value for monthlyuser.monthlyid
     *
     * @mbg.generated
     */
    public void setMonthlyid(Integer monthlyid) {
        this.monthlyid = monthlyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthlyuser.buytime
     *
     * @return the value of monthlyuser.buytime
     *
     * @mbg.generated
     */
    public Date getBuytime() {
        return buytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthlyuser.buytime
     *
     * @param buytime the value for monthlyuser.buytime
     *
     * @mbg.generated
     */
    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthlyuser.status
     *
     * @return the value of monthlyuser.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthlyuser.status
     *
     * @param status the value for monthlyuser.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}