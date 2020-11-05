package com.hltx.dianhu.mapper;

import com.hltx.dianhu.beans.CallList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CallListMapper {

    int addCallList(CallList callList);

    List<CallList> getByPage(@Param("userid") Integer userid, @Param("index") Integer index,@Param("limit") Integer limit);

    int getCount(@Param("userid") Integer userid);

    int getTodayCount(@Param("userid") Integer userid,@Param("time") String time);
}
