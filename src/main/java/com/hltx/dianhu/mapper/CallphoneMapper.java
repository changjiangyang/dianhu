package com.hltx.dianhu.mapper;

import com.hltx.dianhu.beans.Callphone;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CallphoneMapper {

    int addCallPhone(Callphone callphone);

    List<Callphone> getByPage(@Param("userid") Integer userid,@Param("index") Integer index, @Param("limit") Integer limit);

    int getCount(@Param("userid") Integer userid);
}
