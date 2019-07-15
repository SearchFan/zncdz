package com.yjdz.zncdz.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cellinfo
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Cellinfo implements Serializable {
    /**
     * Database Column Remarks:
     *   小区id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   小区名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   小区地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * Database Column Remarks:
     *   代理商id(外键)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.agentid
     *
     * @mbg.generated
     */
    private Integer agentid;

    /**
     * Database Column Remarks:
     *   小区创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   纬度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.latitude
     *
     * @mbg.generated
     */
    private Double latitude;

    /**
     * Database Column Remarks:
     *   经度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.longitude
     *
     * @mbg.generated
     */
    private Double longitude;

    /**
     * Database Column Remarks:
     *   小区基本电费/度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.electricityfee
     *
     * @mbg.generated
     */
    private BigDecimal electricityfee;

    /**
     * Database Column Remarks:
     *   小区最大充电时长/时
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.maxchargingtime
     *
     * @mbg.generated
     */
    private Integer maxchargingtime;

    /**
     * Database Column Remarks:
     *   最大充电功率/瓦特
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.maxpower
     *
     * @mbg.generated
     */
    private Integer maxpower;

    /**
     * Database Column Remarks:
     *   状态1默认0禁用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cellinfo.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.id
     *
     * @return the value of cellinfo.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.id
     *
     * @param id the value for cellinfo.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.name
     *
     * @return the value of cellinfo.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.name
     *
     * @param name the value for cellinfo.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.address
     *
     * @return the value of cellinfo.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.address
     *
     * @param address the value for cellinfo.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.agentid
     *
     * @return the value of cellinfo.agentid
     *
     * @mbg.generated
     */
    public Integer getAgentid() {
        return agentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.agentid
     *
     * @param agentid the value for cellinfo.agentid
     *
     * @mbg.generated
     */
    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.createtime
     *
     * @return the value of cellinfo.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.createtime
     *
     * @param createtime the value for cellinfo.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.latitude
     *
     * @return the value of cellinfo.latitude
     *
     * @mbg.generated
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.latitude
     *
     * @param latitude the value for cellinfo.latitude
     *
     * @mbg.generated
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.longitude
     *
     * @return the value of cellinfo.longitude
     *
     * @mbg.generated
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.longitude
     *
     * @param longitude the value for cellinfo.longitude
     *
     * @mbg.generated
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.electricityfee
     *
     * @return the value of cellinfo.electricityfee
     *
     * @mbg.generated
     */
    public BigDecimal getElectricityfee() {
        return electricityfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.electricityfee
     *
     * @param electricityfee the value for cellinfo.electricityfee
     *
     * @mbg.generated
     */
    public void setElectricityfee(BigDecimal electricityfee) {
        this.electricityfee = electricityfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.maxchargingtime
     *
     * @return the value of cellinfo.maxchargingtime
     *
     * @mbg.generated
     */
    public Integer getMaxchargingtime() {
        return maxchargingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.maxchargingtime
     *
     * @param maxchargingtime the value for cellinfo.maxchargingtime
     *
     * @mbg.generated
     */
    public void setMaxchargingtime(Integer maxchargingtime) {
        this.maxchargingtime = maxchargingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.maxpower
     *
     * @return the value of cellinfo.maxpower
     *
     * @mbg.generated
     */
    public Integer getMaxpower() {
        return maxpower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.maxpower
     *
     * @param maxpower the value for cellinfo.maxpower
     *
     * @mbg.generated
     */
    public void setMaxpower(Integer maxpower) {
        this.maxpower = maxpower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cellinfo.status
     *
     * @return the value of cellinfo.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cellinfo.status
     *
     * @param status the value for cellinfo.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}