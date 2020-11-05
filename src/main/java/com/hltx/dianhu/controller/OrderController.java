package com.hltx.dianhu.controller;

import com.hltx.dianhu.beans.Orders;
import com.hltx.dianhu.service.OrderService;
import com.hltx.dianhu.tool.BackCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * @description: 订单接口
 * @author: ycj
 * @create: 2020-11-05 16:34
 **/
@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("addOrder")
    public Map<String,Object> addOrder(Orders orders){
        String id=String.valueOf(System.currentTimeMillis());
        orders.setId(id);
        orders.setAddTime(new Date());
        orders.setStatus(0);
        int t=orderService.addOrder(orders);
        if (t>0)
            return BackCodeUtils.getSuccess(orders);
        else
            return BackCodeUtils.getFail();
    }

}
