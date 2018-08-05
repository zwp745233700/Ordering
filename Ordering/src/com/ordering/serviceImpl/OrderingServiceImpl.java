package com.ordering.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ordering.mapper.CarMapper;
import com.ordering.mapper.OrderdetailMapper;
import com.ordering.mapper.OrdersMapper;
import com.ordering.po.Car;
import com.ordering.po.CarVo;
import com.ordering.po.Orderdetail;
import com.ordering.po.Orders;
import com.ordering.po.OrdersVo;
import com.ordering.service.OrderingService;

@Service
@Transactional
public class OrderingServiceImpl implements OrderingService {
	@Resource
	public  OrdersMapper ordersMapper;
	@Resource
	public OrderdetailMapper orderdetailMapper;
	@Resource
	public CarMapper carMapper;
	
	//提交订单：
	public void sure(Orders orders){
		ordersMapper.insertSelective(orders);
	}

	//提交订单详情：
	public void confirm(Orderdetail orderdetail) {
		orderdetailMapper.insertSelective(orderdetail);
	}
	
	//根据订单id进行多表查询
	public OrdersVo findOrderById(int orderid){
		return ordersMapper.findOrderById(orderid);
	}
	
	//加入购物车
	public void addcar(Car car){
		carMapper.insert(car);
	}

	public List<CarVo> selectCarByUserid(int userid) {
		List<CarVo> carVoList = carMapper.selectCarByUserid(userid);
		return carVoList;
	}
	
	public CarVo selectCarByCarid(int carid) {
		CarVo carvo= carMapper.selectCarByCarid(carid);
		return carvo;
	}

	public void updateByPrimaryKeySelective(Orders orders) {
		ordersMapper.updateByPrimaryKeySelective(orders);
	}

	public List<OrdersVo> findOrderByuserId(int userid) {
		return ordersMapper.findOrderByuserId(userid);
	}
	
	public Orders selectByPrimaryKey(int orderid)
	{
		return ordersMapper.selectByPrimaryKey(orderid);
	}
	
	public List<OrdersVo> findMyOrderByStatu1(int statu) {
		return ordersMapper.findMyOrderByStatu1(statu);
	}
	
	public List<OrdersVo> findMyOrderByStatu2(int statu) {
		return ordersMapper.findMyOrderByStatu2(statu);
	}
	
	public List<OrdersVo> findOrderByShoreId(int shoreid) {
		return ordersMapper.findOrderByShoreId(shoreid);
	}

	@Override
	public OrdersVo findOrdertailByOrderid(int orderId) {
		List<OrdersVo> list=ordersMapper.findOrdertailByOrderid(orderId);
		OrdersVo orderVo=list.get(0);
		return orderVo;
	}
	
}
