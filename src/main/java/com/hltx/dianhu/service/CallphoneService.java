package com.hltx.dianhu.service;

import com.hltx.dianhu.beans.Callphone;

import java.util.List;

public interface CallphoneService {

    int addCallPhone(Callphone callphone);

    List<Callphone> getByPage(Integer userid, Integer index, Integer limit);

    int getCount(Integer userid);
}
