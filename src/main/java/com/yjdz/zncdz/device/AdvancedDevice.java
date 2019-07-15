package com.yjdz.zncdz.device;

import com.yjdz.zncdz.comm.GetBeanTool;
import com.yjdz.zncdz.dao.EquipmentinfoMapper;
import com.yjdz.zncdz.entity.Equipmentinfo;
import com.yjdz.zncdz.entity.EquipmentinfoExample;

import java.util.Date;

public class AdvancedDevice {

    private EquipmentinfoMapper equipmentinfoMapper = GetBeanTool.getBean(EquipmentinfoMapper.class);

    public void upEqipmentsByPortOnPower(String portA, String portB, String powerA, String powerB, String equipId) {

        EquipmentinfoExample example = new EquipmentinfoExample();

        Equipmentinfo equipmentinfo = new Equipmentinfo();
        equipmentinfo.setPortstatus(portA);
        equipmentinfo.setRealpower(Integer.valueOf(powerA));
        equipmentinfo.setLastlandingtime(new Date());
        example.createCriteria().andPortEqualTo((byte) 1).andEquipidEqualTo(equipId);

        equipmentinfoMapper.updateByExampleSelective(equipmentinfo, example);

        EquipmentinfoExample exampleB = new EquipmentinfoExample();
        Equipmentinfo equipmentinfoB = new Equipmentinfo();
        equipmentinfoB.setPortstatus(portB);
        equipmentinfoB.setRealpower(Integer.valueOf(powerB));
        equipmentinfoB.setLastlandingtime(new Date());
        exampleB.createCriteria().andPortEqualTo((byte) 2).andEquipidEqualTo(equipId);
        equipmentinfoMapper.updateByExampleSelective(equipmentinfoB, exampleB);
    }
}
