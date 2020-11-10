package com.hltx.dianhu.controller;

import com.hltx.dianhu.beans.Manage;
import com.hltx.dianhu.service.ManageService;
import com.hltx.dianhu.tool.BackCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description:
 * @author: ycj
 * @create: 2020-11-10 15:33
 **/
@RestController
@RequestMapping("manage")
public class ManageController {

    @Autowired
    ManageService manageService;

    @PostMapping(value = "login")
    public Map<String,Object> login(String name,String pwd){
        Manage manage=manageService.login(name, pwd);
        if (manage==null)
            return BackCodeUtils.getOtherFail("账号或密码错误");
        else
            return BackCodeUtils.getSuccess(manage);
    }

    @PostMapping(value = "addManage")
    public Map<String,Object> addManage(Manage manage){
        int t= manageService.addManageUser(manage);
        if (t>0)
            return BackCodeUtils.getSuccess("SUCCESS");
        else
            return BackCodeUtils.getFail();
    }

}
