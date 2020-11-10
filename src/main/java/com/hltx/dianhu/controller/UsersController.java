package com.hltx.dianhu.controller;

import com.hltx.dianhu.beans.Users;
import com.hltx.dianhu.service.UsesService;
import com.hltx.dianhu.tool.BackCodeUtils;
import com.hltx.dianhu.tool.Encription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @description: 用户接口
 * @author: ycj
 * @create: 2020-11-02 14:10
 **/
@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    UsesService usesService;

    @PostMapping(value = "login")
    public Map<String,Object> login(String phone,String password){
        Users users = usesService.login(phone,password);
        if (users == null){
            return BackCodeUtils.getOtherFail("登录失败");
        }else
            return BackCodeUtils.getSuccess(users);
    }

    @PostMapping("addusers")
    public Map<String,Object> addUsers(String phone,String name,String sn,String pwd){
        Users users=new Users();
        users.setAddtime(new Date());
        users.setPassword(Encription.md5(pwd));
        users.setPhone(phone);
        users.setSn(sn);
        users.setName(name);
        users.setStatus(0);
        int t = usesService.addUsers(users);
        if (t>0)
            return BackCodeUtils.getSuccess("SUCCESS");
        else
            return BackCodeUtils.getFail();
    }

    @PostMapping(value = "changePwd")
    public Map<String,Object> changePwd(Integer id,String pwd){
        Users users=new Users();
        users.setId(id);
        users.setPassword(Encription.md5(pwd));
        int t= usesService.updateUsers(users);
        if (t>0)
            return BackCodeUtils.getSuccess("SUCCESS");
        else
            return BackCodeUtils.getFail();
    }

    @PostMapping("changeName")
    public Map<String,Object> changeName(Integer userid,String name){
        Users users=new Users();
        users.setId(userid);
        users.setName(name);
        int t= usesService.updateUsers(users);
        if (t>0)
            return BackCodeUtils.getSuccess("SUCCESS");
        else
            return BackCodeUtils.getFail();
    }

    @GetMapping(value = "getByPage")
    public Map<String,Object> getByPage(Integer page,Integer limit){
        List<Users> users = usesService.getByPage((page-1)*limit,limit);
        int t= usesService.getCount();
        return BackCodeUtils.getSuccess(users,t);
    }

    @GetMapping(value = "delUser")
    public Map<String,Object> delUser(Integer id){
        int t= usesService.deleteUser(id);
        if (t>0)
            return BackCodeUtils.getSuccess("SUCCESS");
        else
            return BackCodeUtils.getFail();
    }

}
