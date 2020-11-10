package com.hltx.dianhu.service;

import com.hltx.dianhu.beans.Manage;

public interface ManageService {

    int addManageUser(Manage manage);

    Manage login(String loginName,String pwd);

    int deleteManage(Integer id);

    int updataManage(Manage manage);

}
