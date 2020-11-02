package com.hltx.dianhu.beans;

import java.util.Date;

/**
 * @description: 用户实体类
 * @author: ycj
 * @create: 2020-11-02 13:19
 **/
public class Users {

    private Integer id;

    private String phone;

    private String password;

    private String sn;

    private Integer status;

    private Date addtime;

    private Date endtime;

    private Date startTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        sn = sn;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
