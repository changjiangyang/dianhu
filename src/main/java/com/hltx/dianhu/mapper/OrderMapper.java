package com.hltx.dianhu.mapper;

import com.hltx.dianhu.beans.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    int addOrder(Orders orders);

    int getCount();

    List<Orders> getBypage(@Param("index") Integer index,@Param("limit") Integer limit);
}
