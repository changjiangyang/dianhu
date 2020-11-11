package com.hltx.dianhu.controller;

import com.hltx.dianhu.beans.Orders;
import com.hltx.dianhu.beans.Users;
import com.hltx.dianhu.service.OrderService;
import com.hltx.dianhu.service.UsesService;
import com.hltx.dianhu.tool.BackCodeUtils;
import com.hltx.dianhu.tool.Encription;
import com.hltx.dianhu.tool.TimeTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
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
    @Autowired
    UsesService usesService;

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

    @PostMapping(value = "insertOrder")
    public Map<String,Object> insertOrder(String phone,String price,Integer proid,Integer status){
        String id=String.valueOf(System.currentTimeMillis());
        Users users =usesService.getByPhone(phone);
        if (users == null){
            users=new Users();

        }
        users.setName(phone);
        users.setPhone(phone);
        users.setAddtime(new Date());
        if (proid == 0)
            users.setEndtime(TimeTool.addDate(new Date(),1));
        if (proid == 1)
            users.setEndtime(TimeTool.addDate(new Date(),3));
        if (proid == 2)
            users.setEndtime(TimeTool.addDate(new Date(),6));
        if (proid == 3)
            users.setEndtime(TimeTool.addDate(new Date(),12));
        users.setPassword(Encription.md5("123456"));
        users.setStatus(1);
        users.setId(id);
        usesService.addUsers(users);
        Orders orders=new Orders();
        id=String.valueOf(System.currentTimeMillis());
        orders.setId(id);
        orders.setStatus(status);
        orders.setUserid(id);
        orders.setAddTime(new Date());
        orders.setMoney(Double.valueOf(price));
        orders.setProid(proid);
        int t = orderService.addOrder(orders);
        if (t>0)
            return BackCodeUtils.getSuccess(orders);
        else
            return BackCodeUtils.getFail();
    }

    @GetMapping(value = "getBypage")
    public Map<String,Object> getBypage(Integer page,Integer limit){
        int count = orderService.getCount();
        List<Map<String,String>> orders=orderService.getBypage((page-1)*limit,limit);
        return BackCodeUtils.getSuccess(orders,count);
    }
}
