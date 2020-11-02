package com.hltx.dianhu.service.impl;

import com.hltx.dianhu.beans.Callphone;
import com.hltx.dianhu.mapper.CallphoneMapper;
import com.hltx.dianhu.service.CallphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 点呼service
 * @author: ycj
 * @create: 2020-11-02 16:07
 **/
@Service("callphoneService")
public class CallphoneServiceImpl implements CallphoneService {

    @Autowired
    CallphoneMapper callphoneMapper;

    @Override
    public int addCallPhone(Callphone callphone) {
        return callphoneMapper.addCallPhone(callphone);
    }

    @Override
    public List<Callphone> getByPage(Integer userid, Integer index, Integer limit) {
        return callphoneMapper.getByPage(userid, index, limit);
    }

    @Override
    public int getCount(Integer userid) {
        return callphoneMapper.getCount(userid);
    }
}
