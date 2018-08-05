package com.ordering.po;

import java.util.List;

public class OrdersVo extends Orders {
	
	private Orderdetail orderdetail;
	private Shore shore;
	private User user;
	
	public Shore getShore() {
		return shore;
	}
	public void setShore(Shore shore) {
		this.shore = shore;
	}
	public Orderdetail getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(Orderdetail orderdetail) {
		this.orderdetail = orderdetail;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
