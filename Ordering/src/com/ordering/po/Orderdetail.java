package com.ordering.po;

public class Orderdetail {
    private Integer detailid;

    private Integer orderId;

    private Integer menuId;

    private Integer menuNum;
    
    private Menu menu;

    public Integer getDetailid() {
        return detailid;
    }

    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(Integer menuNum) {
        this.menuNum = menuNum;
    }

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}