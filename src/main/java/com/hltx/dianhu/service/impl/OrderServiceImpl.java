package com.hltx.dianhu.service.impl;

import com.hltx.dianhu.beans.Orders;
import com.hltx.dianhu.mapper.OrderMapper;
import com.hltx.dianhu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 订单服务
 * @author: ycj
 * @create: 2020-11-05 16:45
 **/
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public int addOrder(Orders orders) {
        return orderMapper.addOrder(orders);
    }
}
