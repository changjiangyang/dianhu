package com.hltx.dianhu.controller;

import com.hltx.dianhu.beans.CallList;
import com.hltx.dianhu.service.CallListService;
import com.hltx.dianhu.tool.BackCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @description: 通话记录接口
 * @author: ycj
 * @create: 2020-11-02 17:22
 **/
@RestController
@RequestMapping("callList")
public class CallListController {

    @Autowired
    CallListService callListService;

    @PostMapping(value = "addCallList")
    public Map<String,Object> addCallList(Integer userid,String localphone,String callphone,String calltime){
        CallList callList=new CallList();
        callList.setCallPhone(callphone);
        callList.setLoaclPhone(localphone);
        callList.setStatus(0);
        callList.setUserid(userid);
        callList.setCalltime(calltime);
        int t = callListService.addCallList(callList);
        if (t>0)
            return BackCodeUtils.getSuccess("SUCCESS");
        else
            return BackCodeUtils.getFail();
    }

    @GetMapping(value = "getByPage")
    public Map<String,Object> getByPage(Integer userid,Integer page,Integer limit){
        int t = callListService.getCount(userid);
        if (t<=0)
            return BackCodeUtils.getNan();
        List<CallList> lists = callListService.getByPage(userid, (page-1)*limit, limit);
        return BackCodeUtils.getSuccess(lists,t);
    }
}
