package com.yjdz.zncdz.dao;

import com.yjdz.zncdz.entity.Monthlyuser;
import com.yjdz.zncdz.entity.MonthlyuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthlyuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    long countByExample(MonthlyuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    int deleteByExample(MonthlyuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    int insert(Monthlyuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    int insertSelective(Monthlyuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    List<Monthlyuser> selectByExample(MonthlyuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    Monthlyuser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Monthlyuser record, @Param("example") MonthlyuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Monthlyuser record, @Param("example") MonthlyuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Monthlyuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monthlyuser
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Monthlyuser record);
}