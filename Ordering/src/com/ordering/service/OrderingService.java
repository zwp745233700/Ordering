package com.ordering.service;

import java.util.List;

import com.ordering.po.Car;
import com.ordering.po.CarVo;
import com.ordering.po.Orderdetail;
import com.ordering.po.Orders;
import com.ordering.po.OrdersVo;

public interface OrderingService {
	public void sure(Orders orders);

	public void confirm(Orderdetail orderdetail);
	
	public OrdersVo findOrderById(int orderid);
	
	public List<OrdersVo> findOrderByuserId(int userid);
	
	public void addcar(Car car);

	public List<CarVo> selectCarByUserid(int userid);
	
	public CarVo selectCarByCarid(int carid);
	
	public void updateByPrimaryKeySelective(Orders orders);
	
	public Orders selectByPrimaryKey(int orderid);
	
	public List<OrdersVo> findMyOrderByStatu1(int userid);
	
	public List<OrdersVo> findMyOrderByStatu2(int userid);
	
	public List<OrdersVo> findOrderByShoreId(int shoreid);

	public OrdersVo findOrdertailByOrderid(int orderId);
}
