package com.ordering.po;

public class Shore {
    private Integer shoreid;

    private String username;

    private String password;

    private String shorename;

    private String address;

    private Integer shoretypeId;

    private String shorepic;

    private String shoremoblie;

    public Integer getShoreid() {
        return shoreid;
    }

    public void setShoreid(Integer shoreid) {
        this.shoreid = shoreid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getShorename() {
        return shorename;
    }

    public void setShorename(String shorename) {
        this.shorename = shorename == null ? null : shorename.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getShoretypeId() {
        return shoretypeId;
    }

    public void setShoretypeId(Integer shoretypeId) {
        this.shoretypeId = shoretypeId;
    }

    public String getShorepic() {
        return shorepic;
    }

    public void setShorepic(String shorepic) {
        this.shorepic = shorepic == null ? null : shorepic.trim();
    }

    public String getShoremoblie() {
        return shoremoblie;
    }

    public void setShoremoblie(String shoremoblie) {
        this.shoremoblie = shoremoblie == null ? null : shoremoblie.trim();
    }
}