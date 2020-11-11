package com.hltx.dianhu.service.impl;

import com.hltx.dianhu.beans.Orders;
import com.hltx.dianhu.beans.Users;
import com.hltx.dianhu.mapper.OrderMapper;
import com.hltx.dianhu.mapper.UsesMapper;
import com.hltx.dianhu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @description: 订单服务
 * @author: ycj
 * @create: 2020-11-05 16:45
 **/
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;
    @Autowired
    UsesMapper usesMapper;

    @Override
    public int addOrder(Orders orders) {
        switch (orders.getProid()){
            case 0:
                orders.setPro("1个月会员");
                break;
            case 2:
                orders.setPro("3个月会员");
                break;
            case 3:
                orders.setPro("4个月会员");
                break;
            case 4:
                orders.setPro("1年会员");
                break;
        }

        return orderMapper.addOrder(orders);
    }

    @Override
    public int getCount() {
        return orderMapper.getCount();
    }

    @Override
    public List<Map<String,String>> getBypage(Integer index, Integer limit) {
        return orderMapper.getBypage(index, limit);
    }
}
