package com.hltx.dianhu.service.impl;

import com.hltx.dianhu.beans.Manage;
import com.hltx.dianhu.mapper.ManageMapper;
import com.hltx.dianhu.service.ManageService;
import com.hltx.dianhu.tool.Encription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: ycj
 * @create: 2020-11-10 15:26
 **/
@Service("manageService")
public class ManageServiceImpl implements ManageService {

    @Autowired
    ManageMapper manageMapper;

    @Override
    public int addManageUser(Manage manage) {
        return manageMapper.addManageUser(manage);
    }

    @Override
    public Manage login(String loginName,String pwd) {
        Manage manage= manageMapper.login(loginName);
        if (manage.getPwd().equals(Encription.md5(pwd))){
            return manage;
        }else {
            return null;
        }
    }

    @Override
    public int deleteManage(Integer id) {
        return manageMapper.deleteManage(id);
    }

    @Override
    public int updataManage(Manage manage) {
        return manageMapper.updataManage(manage);
    }
}
