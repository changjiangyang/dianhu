package com.hltx.dianhu.mapper;

import com.hltx.dianhu.beans.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsesMapper {

    int addUsers(Users users);

    Users login(@Param("phone") String phone);

    int updateUsers(Users users);

    List<Users> getByPage(@Param("index") Integer index,@Param("limit") Integer limit);

    int getCount();

    int deleteUser(Integer id);

    Users getByid(String id);
}
