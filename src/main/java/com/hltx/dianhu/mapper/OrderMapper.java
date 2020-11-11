package com.hltx.dianhu.mapper;

import com.hltx.dianhu.beans.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderMapper {

    int addOrder(Orders orders);

    int getCount();

    List<Map<String,String>> getBypage(@Param("index") Integer index, @Param("limit") Integer limit);
}
