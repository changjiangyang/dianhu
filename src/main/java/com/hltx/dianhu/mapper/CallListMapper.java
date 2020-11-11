package com.hltx.dianhu.mapper;

import com.hltx.dianhu.beans.CallList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CallListMapper {

    int addCallList(CallList callList);

    List<CallList> getByPage(@Param("userid") String userid, @Param("index") Integer index,@Param("limit") Integer limit);

    int getCount(@Param("userid") String userid);

    int getTodayCount(@Param("userid") String userid,@Param("time") String time);
}
