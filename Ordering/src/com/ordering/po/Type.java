package com.ordering.po;

public class Type {
    private Integer typeid;

    private String typename;

    private Integer shoreId;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getShoreId() {
        return shoreId;
    }

    public void setShoreId(Integer shoreId) {
        this.shoreId = shoreId;
    }
}