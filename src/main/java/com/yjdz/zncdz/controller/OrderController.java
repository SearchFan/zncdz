package com.yjdz.zncdz.controller;

import com.yjdz.zncdz.dao.EquipmentinfoMapper;
import com.yjdz.zncdz.dao.OrderinfoMapper;
import com.yjdz.zncdz.entity.Orderinfo;
import com.yjdz.zncdz.entity.OrderinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "render")
public class OrderController{

    @Autowired
    private OrderinfoMapper orderinfoMapper;
    @Autowired
    private EquipmentinfoMapper equipmentinfoMapper;

    @PostMapping(value = "searchOrderList")
    @ResponseBody
    Map<String, Object> searchOrderList(@RequestBody Map<String, String> param) {

        String userid = param.get("id");//获取用户id
        Map<String, Object> call = new HashMap<>();

        OrderinfoExample orderinfoExample = new OrderinfoExample();
        orderinfoExample.createCriteria().andUseridEqualTo(Integer.valueOf(userid));

        List<Orderinfo> orderinfoListOrder = orderinfoMapper.selectByExample(orderinfoExample);

        call.put("result","success");
        call.put("data",orderinfoListOrder);

        return call;
    }

    @PostMapping(value = "searchOrderDetail")
    @ResponseBody
    Map<String,Object> searchOrder(@RequestBody Map<String, String> param){

        Integer id = Integer.valueOf(param.get("id"));//获取订单id
        Map<String, Object> call = new HashMap<>();

        OrderinfoExample orderinfoExample = new OrderinfoExample();
        orderinfoExample.createCriteria().andIdEqualTo(id);

        Orderinfo orderinfo = orderinfoMapper.selectByPrimaryKey(id);

        call.put("result","success");
        call.put("data",orderinfo);
        return call;
    }
}
