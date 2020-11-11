package com.hltx.dianhu.service;

import com.hltx.dianhu.beans.Orders;

import java.util.List;

public interface OrderService {
    int addOrder(Orders orders);
    int getCount();

    List<Orders> getBypage(Integer index, Integer limit);
}
