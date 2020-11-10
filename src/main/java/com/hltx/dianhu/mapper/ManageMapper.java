package com.hltx.dianhu.mapper;

import com.hltx.dianhu.beans.Manage;

/**
 * @description:
 * @author: ycj
 * @create: 2020-11-10 14:49
 **/
public interface ManageMapper {

    int addManageUser(Manage manage);

    Manage login(String loginName);

    int deleteManage(Integer id);

    int updataManage(Manage manage);
}
