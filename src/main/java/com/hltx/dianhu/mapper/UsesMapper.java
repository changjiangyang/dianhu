package com.hltx.dianhu.mapper;

import com.hltx.dianhu.beans.Users;
import org.apache.ibatis.annotations.Param;

public interface UsesMapper {

    int addUsers(Users users);

    Users login(@Param("phone") String phone);

    int updateUsers(Users users);
}
