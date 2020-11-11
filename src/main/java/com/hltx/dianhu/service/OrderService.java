package com.hltx.dianhu.service;

import com.hltx.dianhu.beans.Orders;

import java.util.List;
import java.util.Map;

public interface OrderService {
    int addOrder(Orders orders);
    int getCount();

    List<Map<String,String>> getBypage(Integer index, Integer limit);
}
