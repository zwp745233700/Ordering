package com.ordering.po;

public class Menu {
    private Integer menuid;

    private String menuname;

    private String menupic;

    private Integer menuprice;

    private String menedetail;

    private Integer shoreId;

    private Integer typeId;
    
    private Shore shore;

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenupic() {
        return menupic;
    }

    public void setMenupic(String menupic) {
        this.menupic = menupic == null ? null : menupic.trim();
    }

    public Integer getMenuprice() {
        return menuprice;
    }

    public void setMenuprice(Integer menuprice) {
        this.menuprice = menuprice;
    }

    public String getMenedetail() {
        return menedetail;
    }

    public void setMenedetail(String menedetail) {
        this.menedetail = menedetail == null ? null : menedetail.trim();
    }

    public Integer getShoreId() {
        return shoreId;
    }

    public void setShoreId(Integer shoreId) {
        this.shoreId = shoreId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

	public Shore getShore() {
		return shore;
	}

	public void setShore(Shore shore) {
		this.shore = shore;
	}
}