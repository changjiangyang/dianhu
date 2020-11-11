package com.hltx.dianhu.service;

import com.hltx.dianhu.beans.CallList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CallListService {
    int addCallList(CallList callList);

    List<CallList> getByPage(String userid,Integer index,Integer limit);

    int getCount(String userid);
    int getTodayCount(String userid, String time);
}
