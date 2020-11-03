package com.hltx.dianhu.service.impl;

import com.hltx.dianhu.beans.CallList;
import com.hltx.dianhu.mapper.CallListMapper;
import com.hltx.dianhu.service.CallListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 通话记录
 * @author: ycj
 * @create: 2020-11-02 17:19
 **/
@Service("callListService")
public class CallListServiceimpl implements CallListService {

    @Autowired
    CallListMapper callListMapper;

    @Override
    public int addCallList(CallList callList) {
        return callListMapper.addCallList(callList);
    }

    @Override
    public List<CallList> getByPage(Integer userid, Integer index, Integer limit) {
        return callListMapper.getByPage(userid, index, limit);
    }

    @Override
    public int getCount(Integer userid) {
        return callListMapper.getCount(userid);
    }
}
