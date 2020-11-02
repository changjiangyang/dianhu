package com.hltx.dianhu.controller;

import com.hltx.dianhu.beans.Callphone;
import com.hltx.dianhu.service.CallphoneService;
import com.hltx.dianhu.tool.BackCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @description: 点呼接口
 * @author: ycj
 * @create: 2020-11-02 16:09
 **/
@RestController
@RequestMapping("callphone")
public class CallphoneController {

    @Autowired
    CallphoneService callphoneService;

    @PostMapping(value = "addCallPhone")
    public Map<String,Object> addCallPhone(String phone,Integer useid){
        Callphone callphone=new Callphone();
        callphone.setAddtime(new Date());
        callphone.setIsShow(1);
        callphone.setPhone(phone);
        callphone.setStatus(0);
        callphone.setUserid(useid);
        int t=callphoneService.addCallPhone(callphone);
        if (t>0){
            return BackCodeUtils.getSuccess("SUCCESS");
        }else {
            return BackCodeUtils.getFail();
        }
    }

    @PostMapping(value = "getBypage")
    public Map<String,Object> getBypage(Integer userid,Integer page,Integer limit){
        int count=callphoneService.getCount(userid);
        if (count<=0){
            return BackCodeUtils.getNan();
        }
        List<Callphone> list=callphoneService.getByPage(userid, (page-1)*limit, limit);
        return BackCodeUtils.getSuccess(list,count);
    }
}
