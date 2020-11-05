package com.hltx.dianhu.beans;

import java.util.Date;

/**
 * @description: 订单
 * @author: ycj
 * @create: 2020-11-02 13:32
 **/
public class Orders {

    private String id;

    private Integer userid;

    private String pro;

    private String otherPayID;

    private Date addTime;

    private Date payTime;

    private Double money;

    private Double price;

    private Integer paystyle;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getOtherPayID() {
        return otherPayID;
    }

    public void setOtherPayID(String otherPayID) {
        this.otherPayID = otherPayID;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPaystyle() {
        return paystyle;
    }

    public void setPaystyle(Integer paystyle) {
        this.paystyle = paystyle;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userid=" + userid +
                ", pro='" + pro + '\'' +
                ", otherPayID='" + otherPayID + '\'' +
                ", addTime=" + addTime +
                ", payTime=" + payTime +
                ", money=" + money +
                ", price=" + price +
                ", paystyle=" + paystyle +
                ", status=" + status +
                '}';
    }
}
