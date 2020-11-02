package com.hltx.dianhu.beans;

import java.util.Date;

/**
 * @description: 点呼列表
 * @author: ycj
 * @create: 2020-11-02 13:28
 **/
public class Callphone {

    private Integer id;

    private Integer userid;

    private String phone;

    private Integer status;

    private Date addtime;

    private Integer isShow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "Callphone{" +
                "id=" + id +
                ", userid=" + userid +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", addtime=" + addtime +
                ", isShow=" + isShow +
                '}';
    }
}
