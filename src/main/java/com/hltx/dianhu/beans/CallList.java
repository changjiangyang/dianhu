package com.hltx.dianhu.beans;

/**
 * @description: 呼叫历史
 * @author: ycj
 * @create: 2020-11-02 13:30
 **/
public class CallList {

    private Integer id;

    private Integer userid;

    private String loaclPhone;

    private String callPhone;

    private Integer status;

    private Double length;

    private String calltime;

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

    public String getLoaclPhone() {
        return loaclPhone;
    }

    public void setLoaclPhone(String loaclPhone) {
        this.loaclPhone = loaclPhone;
    }

    public String getCallPhone() {
        return callPhone;
    }

    public void setCallPhone(String callPhone) {
        this.callPhone = callPhone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "CallList{" +
                "id=" + id +
                ", userid=" + userid +
                ", loaclPhone='" + loaclPhone + '\'' +
                ", callPhone='" + callPhone + '\'' +
                ", status=" + status +
                ", length=" + length +
                ", calltime='" + calltime + '\'' +
                '}';
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getCalltime() {
        return calltime;
    }

    public void setCalltime(String calltime) {
        this.calltime = calltime;
    }
}
