package com.yjdz.zncdz.dao;

import com.yjdz.zncdz.entity.Cellinfo;
import com.yjdz.zncdz.entity.CellinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CellinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    long countByExample(CellinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    int deleteByExample(CellinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    int insert(Cellinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    int insertSelective(Cellinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    List<Cellinfo> selectByExample(CellinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    Cellinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Cellinfo record, @Param("example") CellinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Cellinfo record, @Param("example") CellinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Cellinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cellinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Cellinfo record);
}