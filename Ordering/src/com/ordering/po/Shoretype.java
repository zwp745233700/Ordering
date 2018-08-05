package com.ordering.po;

public class Shoretype {
    private Integer shoretypeid;

    private String shoretypename;

    public Integer getShoretypeid() {
        return shoretypeid;
    }

    public void setShoretypeid(Integer shoretypeid) {
        this.shoretypeid = shoretypeid;
    }

    public String getShoretypename() {
        return shoretypename;
    }

    public void setShoretypename(String shoretypename) {
        this.shoretypename = shoretypename == null ? null : shoretypename.trim();
    }
}