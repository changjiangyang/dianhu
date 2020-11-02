package com.hltx.dianhu.service;

import com.hltx.dianhu.beans.Users;
import org.apache.ibatis.annotations.Param;

public interface UsesService {

    int addUsers(Users users);

    Users login(String phone,String password);

    int updateUsers(Users users);
}
