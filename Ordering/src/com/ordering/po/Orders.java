package com.ordering.po;

import java.util.Date;

public class Orders {
    private Integer orderid;

    private Date createtime;//订单时间

    private Integer number;//商品数量

    private String discuss;//订单评价

    private Integer pay;//是否支付

    private Integer statu;//是否消费完成

    private Integer total;//总价

    private String phone;//联系方式

    private String address;//收货地址

    private String uname;//收货人姓名

    private Integer userId;//用户id

    private Integer shoreId;//商家id

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss == null ? null : discuss.trim();
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShoreId() {
        return shoreId;
    }

    public void setShoreId(Integer shoreId) {
        this.shoreId = shoreId;
    }
}