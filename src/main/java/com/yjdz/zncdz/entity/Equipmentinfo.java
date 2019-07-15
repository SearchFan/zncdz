package com.yjdz.zncdz.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table equipmentinfo
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Equipmentinfo implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   设备id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.equipid
     *
     * @mbg.generated
     */
    private String equipid;

    /**
     * Database Column Remarks:
     *   主机id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.hostid
     *
     * @mbg.generated
     */
    private Integer hostid;

    /**
     * Database Column Remarks:
     *   插座号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.port
     *
     * @mbg.generated
     */
    private Byte port;

    /**
     * Database Column Remarks:
     *   端口状态  0未插入1充电中2插入未充电3充满占用4新插入准备充电5浮充
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.portstatus
     *
     * @mbg.generated
     */
    private String portstatus;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   最后更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.lastlandingtime
     *
     * @mbg.generated
     */
    private Date lastlandingtime;

    /**
     * Database Column Remarks:
     *   设备实时功率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.realpower
     *
     * @mbg.generated
     */
    private Integer realpower;

    /**
     * Database Column Remarks:
     *   设备状态1默认0禁用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipmentinfo.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.id
     *
     * @return the value of equipmentinfo.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.id
     *
     * @param id the value for equipmentinfo.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.equipid
     *
     * @return the value of equipmentinfo.equipid
     *
     * @mbg.generated
     */
    public String getEquipid() {
        return equipid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.equipid
     *
     * @param equipid the value for equipmentinfo.equipid
     *
     * @mbg.generated
     */
    public void setEquipid(String equipid) {
        this.equipid = equipid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.hostid
     *
     * @return the value of equipmentinfo.hostid
     *
     * @mbg.generated
     */
    public Integer getHostid() {
        return hostid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.hostid
     *
     * @param hostid the value for equipmentinfo.hostid
     *
     * @mbg.generated
     */
    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.port
     *
     * @return the value of equipmentinfo.port
     *
     * @mbg.generated
     */
    public Byte getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.port
     *
     * @param port the value for equipmentinfo.port
     *
     * @mbg.generated
     */
    public void setPort(Byte port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.portstatus
     *
     * @return the value of equipmentinfo.portstatus
     *
     * @mbg.generated
     */
    public String getPortstatus() {
        return portstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.portstatus
     *
     * @param portstatus the value for equipmentinfo.portstatus
     *
     * @mbg.generated
     */
    public void setPortstatus(String portstatus) {
        this.portstatus = portstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.createtime
     *
     * @return the value of equipmentinfo.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.createtime
     *
     * @param createtime the value for equipmentinfo.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.lastlandingtime
     *
     * @return the value of equipmentinfo.lastlandingtime
     *
     * @mbg.generated
     */
    public Date getLastlandingtime() {
        return lastlandingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.lastlandingtime
     *
     * @param lastlandingtime the value for equipmentinfo.lastlandingtime
     *
     * @mbg.generated
     */
    public void setLastlandingtime(Date lastlandingtime) {
        this.lastlandingtime = lastlandingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.realpower
     *
     * @return the value of equipmentinfo.realpower
     *
     * @mbg.generated
     */
    public Integer getRealpower() {
        return realpower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.realpower
     *
     * @param realpower the value for equipmentinfo.realpower
     *
     * @mbg.generated
     */
    public void setRealpower(Integer realpower) {
        this.realpower = realpower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipmentinfo.status
     *
     * @return the value of equipmentinfo.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipmentinfo.status
     *
     * @param status the value for equipmentinfo.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}