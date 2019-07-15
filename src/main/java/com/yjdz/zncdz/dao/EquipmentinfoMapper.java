package com.yjdz.zncdz.dao;

import com.yjdz.zncdz.entity.Equipmentinfo;
import com.yjdz.zncdz.entity.EquipmentinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EquipmentinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    long countByExample(EquipmentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    int deleteByExample(EquipmentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    int insert(Equipmentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    int insertSelective(Equipmentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    List<Equipmentinfo> selectByExample(EquipmentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    Equipmentinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Equipmentinfo record, @Param("example") EquipmentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Equipmentinfo record, @Param("example") EquipmentinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Equipmentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Equipmentinfo record);
}