package com.hltx.dianhu.service;

import com.hltx.dianhu.beans.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsesService {

    int addUsers(Users users);

    Users login(String phone,String password);

    int updateUsers(Users users);

    List<Users> getByPage(Integer index, Integer limit);

    int getCount();

    int deleteUser(Integer id);

    Users getByPhone(String phone);


}
