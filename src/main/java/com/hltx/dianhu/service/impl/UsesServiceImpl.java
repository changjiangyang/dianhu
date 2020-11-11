package com.hltx.dianhu.service.impl;

import com.hltx.dianhu.beans.Users;
import com.hltx.dianhu.mapper.UsesMapper;
import com.hltx.dianhu.service.UsesService;
import com.hltx.dianhu.tool.Encription;
import com.hltx.dianhu.tool.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 用户Sevice
 * @author: ycj
 * @create: 2020-11-02 14:06
 **/

@Service("usesService")
public class UsesServiceImpl implements UsesService {

    @Autowired
    UsesMapper usesMapper;
    @Autowired
    RedisUtils redisUtils;

    @Override
    public int addUsers(Users users) {
        return usesMapper.addUsers(users);
    }

    @Override
    public Users login(String phone,String password) {
        Users users=null;
        users = (Users) redisUtils.get("users"+phone);
        if (users == null)
            users = usesMapper.login(phone);
        else {
            if (users.getPassword().equals(Encription.md5(password))){
                redisUtils.set("users"+phone,users);
                return users;
            }else {
                return null;
            }
        }
        if (users == null)
            return null;
        if (users.getPassword().equals(Encription.md5(password))){
            redisUtils.set("users"+phone,users);
            return users;
        }else {
            return null;
        }
    }


    @Override
    public int updateUsers(Users users) {
        return usesMapper.updateUsers(users);
    }

    @Override
    public List<Users> getByPage(Integer index, Integer limit) {
        return usesMapper.getByPage(index, limit);
    }

    @Override
    public int getCount() {
        return usesMapper.getCount();
    }

    @Override
    public int deleteUser(Integer id) {
        return usesMapper.deleteUser(id);
    }

    @Override
    public Users getByPhone(String phone) {
        return usesMapper.login(phone);
    }
}
